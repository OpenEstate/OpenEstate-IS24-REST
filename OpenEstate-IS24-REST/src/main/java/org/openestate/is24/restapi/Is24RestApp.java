/*
 * Copyright 2014 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openestate.is24.restapi;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Properties;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileFilter;
import oauth.signpost.exception.OAuthException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.openestate.is24.restapi.utils.Authorization;
import org.openestate.is24.restapi.utils.SSLUtils;
import org.openestate.is24.restapi.utils.Verification;
import org.openestate.is24.restapi.xml.XmlUtils;
import org.openestate.is24.restapi.xml.realestates.RealEstates;

/**
 *
 * @author andy
 */
public class Is24RestApp extends javax.swing.JFrame
{
  private final static String LINE = StringUtils.repeat( "-", 50 );
  private final static String URL_PROPERTY = "webservice.url";
  private final static String CONSUMER_KEY_PROPERTY = "webservice.consumer.key";
  private final static String CONSUMER_SECRET_PROPERTY = "webservice.consumer.secret";
  private final static String ACCESS_TOKEN_PROPERTY = "webservice.access.token";
  private final static String ACCESS_SECRET_PROPERTY = "webservice.access.secret";
  private File currentSettingsFile = null;
  private Verification currentVerification = null;

  private Is24RestApp()
  {
    initComponents();
    setProgressBarDisabled();
    setLocationRelativeTo( null );

    // try to load default settings
    for (String name : new String[]{ "is24rest.properties", "is24rest.xml" })
    {
      File file = new File( SystemUtils.USER_HOME, name );
      if (file.isFile())
      {
        loadSettings( file );
        break;
      }
    }
  }

  private AbstractClient createClient( String url, String consumerKey, String consumerSecret )
  {
    return new DefaultClient( url, consumerKey, consumerSecret );
    //return new HttpComponentsIs24Client( url, consumerKey, consumerSecret );
  }

  private AbstractClient createClient( String url, String consumerKey, String consumerSecret, String accessToken, String accessSecret ) throws OAuthException
  {
    AbstractClient client = createClient( url, consumerKey, consumerSecret );
    client.authorize( accessToken, accessSecret );
    return client;
  }

  private void doAccessRequest( final AbstractClient client, final String callbackUrl )
  {
    setFormEnabled( false );
    setProgressBarEnabled( "Requesting an access token from the webservice." );
    new SwingWorker<Verification, Void>()
    {
      @Override
      protected Verification doInBackground() throws Exception
      {
        //Thread.sleep( 5000 );
        return client.fetchVerification( callbackUrl );
      }

      @Override
      @SuppressFBWarnings(
        value = {"REC_CATCH_EXCEPTION"},
        justification = "There is no need to rethrow an exception, when it is properly processed." )
      protected void done()
      {
        try
        {
          currentVerification = get();

          String msg = "An access token was requested from the webservice.";
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + LINE;
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + "The program is trying to open your web-browser and redirects to a page, "
            + "where you need to grant access to the webservice. If the web-browser does not open automatically, "
            + "please open the web-browser by yourself and enter the following address:";
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + currentVerification.verificationUrl;
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + LINE;
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + "After you've granted access through you web-browser you will "
            + "receive a verification code. Click in the main menu at \""+actionMenu.getText()+" » "+verifyAccessMenuItem.getText()+"\" "
            + "and enter the verification code. Afterwards the program will retrieve the access token / secret from the webservice.";
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + LINE;
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + "Request Token";
          msg += SystemUtils.LINE_SEPARATOR + currentVerification.requestToken;
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + "Request Secret";
          msg += SystemUtils.LINE_SEPARATOR + currentVerification.requestTokenSecret;

          writeToOutputField( msg );

          try
          {
            if (Desktop.isDesktopSupported())
            {
              Desktop.getDesktop().browse( new URI( currentVerification.verificationUrl ) );
            }
          }
          catch (Exception ex)
          {
            String error = "Can't open web-browser!";
            System.err.println( error );
            ex.printStackTrace( System.err );
          }
        }
        catch (Exception ex)
        {
          String error = "Requesting access failed!";
          System.err.println( error );
          ex.printStackTrace( System.err );
          writeExceptionToOutputField( error, ex );
        }
        finally
        {
          setFormEnabled( true );
          setProgressBarDisabled();
        }

      }
    }.execute();
  }

  private void doAccessVerify( final AbstractClient client, final String verificationCode )
  {
    if (currentVerification==null) return;
    setFormEnabled( false );
    setProgressBarEnabled( "Verifying an access token from the webservice." );
    new SwingWorker<Authorization, Void>()
    {
      @Override
      protected Authorization doInBackground() throws Exception
      {
        //Thread.sleep( 5000 );
        return client.authorizeAfterVerification(
          currentVerification.requestToken, currentVerification.requestTokenSecret, verificationCode );
      }

      @Override
      @SuppressFBWarnings(
        value = {"REC_CATCH_EXCEPTION"},
        justification = "There is no need to rethrow an exception, when it is properly processed." )
      protected void done()
      {
        try
        {
          Authorization auth = get();

          String msg = "The access token was successfully verified for the webservice.";
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + LINE;
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + "The received access token / secret was loaded into the webservice settings. "
            + "From now on you can use the access token / secret for querying the webservice.";
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + LINE;
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + "Access Token";
          msg += SystemUtils.LINE_SEPARATOR + auth.accessToken;
          msg += SystemUtils.LINE_SEPARATOR;
          msg += SystemUtils.LINE_SEPARATOR + "Access Secret";
          msg += SystemUtils.LINE_SEPARATOR + auth.accessTokenSecret;
          writeToOutputField( msg );

          currentVerification = null;
          accessTokenField.setText( auth.accessToken );
          accessTokenField.setCaretPosition( 0 );
          accessSecretField.setText( auth.accessTokenSecret );
          accessSecretField.setCaretPosition( 0 );
        }
        catch (Exception ex)
        {
          String error = "Verifying access failed!";
          System.err.println( error );
          ex.printStackTrace( System.err );
          writeExceptionToOutputField( error, ex );
        }
        finally
        {
          setFormEnabled( true );
          setProgressBarDisabled();
        }

      }
    }.execute();
  }

  private void doRealEstatesGetAll( final AbstractClient client )
  {
    setFormEnabled( false );
    setProgressBarEnabled( "Get all real estates from the webservice." );
    new SwingWorker<RealEstates, Void>()
    {
      @Override
      protected RealEstates doInBackground() throws Exception
      {
        //Thread.sleep( 5000 );
        return ImportExport.RealEstateService.getAll( client, null, null, 0, 0, true );
      }

      @Override
      protected void done()
      {
        try
        {
          RealEstates realEstates = get();
          writeToOutputField( XmlUtils.marshal( realEstates, XmlUtils.DEFAULT_ENCODING ) );
        }
        catch (Exception ex)
        {
          String error = "Can't fetch real estates from webservice!";
          System.err.println( error );
          ex.printStackTrace( System.err );
          writeExceptionToOutputField( error, ex );
        }
        finally
        {
          setFormEnabled( true );
          setProgressBarDisabled();
        }

      }
    }.execute();
  }

  private void loadSettings( File propsFile )
  {
    InputStream input = null;
    try
    {
      input = new FileInputStream( propsFile );

      Properties props = new Properties();
      if (propsFile.getName().toLowerCase().endsWith( ".xml" ))
        props.loadFromXML( input );
      else
        props.load( input );

      webserviceUrlField.setSelectedItem( StringUtils.trimToEmpty(
        props.getProperty( URL_PROPERTY ) ) );
      consumerKeyField.setText( StringUtils.trimToEmpty(
        props.getProperty( CONSUMER_KEY_PROPERTY ) ) );
      consumerSecretField.setText( StringUtils.trimToEmpty(
        props.getProperty( CONSUMER_SECRET_PROPERTY ) ) );
      accessTokenField.setText( StringUtils.trimToEmpty(
        props.getProperty( ACCESS_TOKEN_PROPERTY ) ) );
      accessSecretField.setText( StringUtils.trimToEmpty(
        props.getProperty( ACCESS_SECRET_PROPERTY ) ) );

      consumerKeyField.setCaretPosition( 0 );
      consumerSecretField.setCaretPosition( 0 );
      accessTokenField.setCaretPosition( 0 );
      accessSecretField.setCaretPosition( 0 );
      currentSettingsFile = propsFile;
    }
    catch (IOException ex)
    {
      String error = "Can't read webservice settings!";
      System.err.println( error );
      ex.printStackTrace( System.err );
      writeExceptionToOutputField( error, ex );
    }
    finally
    {
      IOUtils.closeQuietly( input );
    }
  }

  private void saveSettings( File propsFile )
  {
    Properties props = new Properties();
    props.setProperty( URL_PROPERTY, StringUtils.trimToEmpty(
      webserviceUrlField.getSelectedItem().toString() ) );
    props.setProperty( CONSUMER_KEY_PROPERTY, StringUtils.trimToEmpty(
      consumerKeyField.getText() ) );
    props.setProperty( CONSUMER_SECRET_PROPERTY, StringUtils.trimToEmpty(
      consumerSecretField.getText() ) );
    props.setProperty( ACCESS_TOKEN_PROPERTY, StringUtils.trimToEmpty(
      accessTokenField.getText() ) );
    props.setProperty( ACCESS_SECRET_PROPERTY, StringUtils.trimToEmpty(
      accessSecretField.getText() ) );

    OutputStream output = null;
    try
    {
      output = new FileOutputStream( propsFile );

      if (propsFile.getName().toLowerCase().endsWith( ".xml" ))
        props.storeToXML(output, "IS24-REST settings" );
      else
        props.store( output, "IS24-REST settings" );

      output.flush();
    }
    catch (IOException ex)
    {
      String error = "Can't save webservice settings!";
      System.err.println( error );
      ex.printStackTrace( System.err );
      writeExceptionToOutputField( error, ex );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  private void setFormEnabled( boolean enabled )
  {
    programMenu.setEnabled( enabled );
    actionMenu.setEnabled( enabled );
    webserviceUrlLabel.setEnabled( enabled );
    webserviceUrlField.setEnabled( enabled );
    consumerKeyLabel.setEnabled( enabled );
    consumerKeyField.setEnabled( enabled );
    consumerSecretLabel.setEnabled( enabled );
    consumerSecretField.setEnabled( enabled );
    accessTokenLabel.setEnabled( enabled );
    accessTokenField.setEnabled( enabled );
    accessSecretLabel.setEnabled( enabled );
    accessSecretField.setEnabled( enabled );
    verifyAccessMenuItem.setEnabled( enabled && currentVerification!=null );
  }

  private void setProgressBarEnabled( String message )
  {
    progressBar.setIndeterminate( true );
    progressBar.setStringPainted( true );
    progressBar.setString( StringUtils.trimToEmpty( message ) );
    progressBar.setVisible( true );
  }

  private void setProgressBarDisabled()
  {
    progressBar.setVisible( false );
  }

  private void writeExceptionToOutputField( String message, Throwable t )
  {
    String msg = StringUtils.trimToNull( message );
    if (msg==null) msg = "An error occured!";
    if (t!=null)
    {
      msg += SystemUtils.LINE_SEPARATOR + LINE;
      msg += SystemUtils.LINE_SEPARATOR + ExceptionUtils.getFullStackTrace( t );
    }
    writeToOutputField( msg );
  }

  private void  writeToOutputField( String msg )
  {
    outputField.setText( StringUtils.trimToEmpty( msg ) );
    outputField.setCaretPosition( 0 );
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings( "unchecked" )
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    settingsPanel = new JPanel();
    accessTokenLabel = new JLabel();
    accessTokenField = new JTextField();
    accessSecretLabel = new JLabel();
    accessSecretField = new JTextField();
    webserviceUrlLabel = new JLabel();
    consumerKeyLabel = new JLabel();
    webserviceUrlField = new JComboBox();
    consumerKeyField = new JTextField();
    consumerSecretLabel = new JLabel();
    consumerSecretField = new JTextField();
    progressBar = new JProgressBar();
    outputPanel = new JPanel();
    outputScroller = new JScrollPane();
    outputField = new JTextArea();
    menuBar = new JMenuBar();
    programMenu = new JMenu();
    loadSettingsMenuItem = new JMenuItem();
    saveSettingsMenuItem = new JMenuItem();
    programMenuSeparator = new JPopupMenu.Separator();
    quitProgramMenuItem = new JMenuItem();
    actionMenu = new JMenu();
    requestAccessMenuItem = new JMenuItem();
    verifyAccessMenuItem = new JMenuItem();
    actionMenuSeparator = new JPopupMenu.Separator();
    importExportApiMenu = new JMenu();
    getAllRealEstatesMenuItem = new JMenuItem();

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setTitle("IS24-REST / Test Application");
    setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    settingsPanel.setBorder(BorderFactory.createTitledBorder("Webservice Settings"));

    accessTokenLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    accessTokenLabel.setLabelFor(accessTokenField);
    accessTokenLabel.setText("Access Token:");

    accessSecretLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    accessSecretLabel.setLabelFor(accessSecretField);
    accessSecretLabel.setText("Access Secret:");

    webserviceUrlLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    webserviceUrlLabel.setLabelFor(webserviceUrlField);
    webserviceUrlLabel.setText("Webservice:");

    consumerKeyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    consumerKeyLabel.setLabelFor(consumerKeyField);
    consumerKeyLabel.setText("Consumer Key:");

    webserviceUrlField.setEditable(true);
    webserviceUrlField.addItem( AbstractClient.LIVE_API );
    webserviceUrlField.addItem( AbstractClient.SANDBOX_API );
    webserviceUrlField.setSelectedItem( AbstractClient.LIVE_API );

    consumerSecretLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    consumerSecretLabel.setLabelFor(consumerSecretField);
    consumerSecretLabel.setText("Consumer Secret:");

    GroupLayout settingsPanelLayout = new GroupLayout(settingsPanel);
    settingsPanel.setLayout(settingsPanelLayout);
    settingsPanelLayout.setHorizontalGroup(
      settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
          .addComponent(webserviceUrlLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(consumerKeyLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(accessTokenLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
          .addComponent(webserviceUrlField, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(settingsPanelLayout.createSequentialGroup()
            .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
              .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(consumerKeyField, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consumerSecretLabel))
              .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(accessTokenField, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accessSecretLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addComponent(consumerSecretField, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
              .addComponent(accessSecretField))))
        .addContainerGap())
    );
    settingsPanelLayout.setVerticalGroup(
      settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
        .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
          .addComponent(webserviceUrlLabel)
          .addComponent(webserviceUrlField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
          .addComponent(consumerKeyLabel)
          .addComponent(consumerKeyField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
          .addComponent(consumerSecretLabel)
          .addComponent(consumerSecretField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
          .addComponent(accessTokenLabel)
          .addComponent(accessTokenField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
          .addComponent(accessSecretLabel)
          .addComponent(accessSecretField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        .addContainerGap(20, Short.MAX_VALUE))
    );

    progressBar.setBorderPainted(false);

    outputPanel.setBorder(BorderFactory.createTitledBorder("Output"));

    outputScroller.setBorder(null);

    outputField.setEditable(false);
    outputField.setColumns(20);
    outputField.setFont(new Font("Monospaced", 0, 12)); // NOI18N
    outputField.setLineWrap(true);
    outputField.setRows(5);
    outputField.setWrapStyleWord(true);
    outputField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    outputField.setOpaque(false);
    outputScroller.setViewportView(outputField);

    GroupLayout outputPanelLayout = new GroupLayout(outputPanel);
    outputPanel.setLayout(outputPanelLayout);
    outputPanelLayout.setHorizontalGroup(
      outputPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(outputScroller)
    );
    outputPanelLayout.setVerticalGroup(
      outputPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(outputScroller, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
    );

    programMenu.setText("Program");

    loadSettingsMenuItem.setText("Load settings");
    loadSettingsMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        loadSettingsMenuItemActionPerformed(evt);
      }
    });
    programMenu.add(loadSettingsMenuItem);

    saveSettingsMenuItem.setText("Save settings");
    saveSettingsMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        saveSettingsMenuItemActionPerformed(evt);
      }
    });
    programMenu.add(saveSettingsMenuItem);
    programMenu.add(programMenuSeparator);

    quitProgramMenuItem.setText("Quit program");
    quitProgramMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        quitProgramMenuItemActionPerformed(evt);
      }
    });
    programMenu.add(quitProgramMenuItem);

    menuBar.add(programMenu);

    actionMenu.setText("Actions");

    requestAccessMenuItem.setText("Request new access token");
    requestAccessMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        requestAccessMenuItemActionPerformed(evt);
      }
    });
    actionMenu.add(requestAccessMenuItem);

    verifyAccessMenuItem.setText("Verfify access token");
    verifyAccessMenuItem.setEnabled(false);
    verifyAccessMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        verifyAccessMenuItemActionPerformed(evt);
      }
    });
    actionMenu.add(verifyAccessMenuItem);
    actionMenu.add(actionMenuSeparator);

    importExportApiMenu.setText("Import/Export-API");

    getAllRealEstatesMenuItem.setText("Get all real estates");
    getAllRealEstatesMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        getAllRealEstatesMenuItemActionPerformed(evt);
      }
    });
    importExportApiMenu.add(getAllRealEstatesMenuItem);

    actionMenu.add(importExportApiMenu);

    menuBar.add(actionMenu);

    setJMenuBar(menuBar);

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(progressBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
          .addComponent(outputPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(settingsPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(settingsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(outputPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  @SuppressFBWarnings(
    value = {"DM_EXIT"},
    justification = "There is no problem with an explicit System.exit() here." )
  private void quitProgramMenuItemActionPerformed(ActionEvent evt)//GEN-FIRST:event_quitProgramMenuItemActionPerformed
  {//GEN-HEADEREND:event_quitProgramMenuItemActionPerformed
    setVisible( false );
    System.exit( 0 );
  }//GEN-LAST:event_quitProgramMenuItemActionPerformed

  private void saveSettingsMenuItemActionPerformed(ActionEvent evt)//GEN-FIRST:event_saveSettingsMenuItemActionPerformed
  {//GEN-HEADEREND:event_saveSettingsMenuItemActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.setFileFilter( new PropertiesFileFilter() );
    chooser.setDialogTitle( "Save server settings." );
    if (currentSettingsFile!=null)
      chooser.setSelectedFile( currentSettingsFile );
    else
      chooser.setSelectedFile( new File( SystemUtils.USER_HOME, "is24rest.xml" ) );
    int res = chooser.showSaveDialog( this );
    if (res!=JFileChooser.APPROVE_OPTION) return;
    saveSettings( chooser.getSelectedFile() );
  }//GEN-LAST:event_saveSettingsMenuItemActionPerformed

  private void loadSettingsMenuItemActionPerformed(ActionEvent evt)//GEN-FIRST:event_loadSettingsMenuItemActionPerformed
  {//GEN-HEADEREND:event_loadSettingsMenuItemActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.setFileFilter( new PropertiesFileFilter() );
    chooser.setDialogTitle( "Load server settings." );
    if (currentSettingsFile!=null)
      chooser.setCurrentDirectory( currentSettingsFile.getParentFile() );
    else
      chooser.setCurrentDirectory( new File( SystemUtils.USER_HOME ) );
    int res = chooser.showOpenDialog(this );
    if (res!=JFileChooser.APPROVE_OPTION) return;
    loadSettings( chooser.getSelectedFile() );
  }//GEN-LAST:event_loadSettingsMenuItemActionPerformed

  private void requestAccessMenuItemActionPerformed(ActionEvent evt)//GEN-FIRST:event_requestAccessMenuItemActionPerformed
  {//GEN-HEADEREND:event_requestAccessMenuItemActionPerformed
    String accessToken = StringUtils.trimToNull( accessTokenField.getText() );
    String accessSecret = StringUtils.trimToNull( accessSecretField.getText() );
    if (accessToken!=null || accessSecret!=null)
    {
      JOptionPane.showMessageDialog( this,
        "You've already specified an access token / secret.",
        "Can't request access token!", JOptionPane.ERROR_MESSAGE );
      return;
    }

    String url = StringUtils.trimToNull( webserviceUrlField.getSelectedItem().toString() );
    String consumerKey = StringUtils.trimToNull( consumerKeyField.getText() );
    String consumerSecret = StringUtils.trimToNull( consumerSecretField.getText() );
    if (url==null || consumerKey==null || consumerSecret==null)
    {
      JOptionPane.showMessageDialog( this,
        "Please specify a webservice and consumer key / secret.",
        "Can't request access token!", JOptionPane.ERROR_MESSAGE );
      return;
    }

    String callbackUrl = StringUtils.trimToNull( JOptionPane.showInputDialog( this,
      "Please enter a callback URL, where the verfication code is sent to.",
      "http://de.openestate.org/is24-rest/callback.php" ) );
    if (callbackUrl==null) return;

    doAccessRequest( createClient( url, consumerKey, consumerSecret ), callbackUrl );
  }//GEN-LAST:event_requestAccessMenuItemActionPerformed

  private void verifyAccessMenuItemActionPerformed(ActionEvent evt)//GEN-FIRST:event_verifyAccessMenuItemActionPerformed
  {//GEN-HEADEREND:event_verifyAccessMenuItemActionPerformed
    if (currentVerification==null) return;

    String url = StringUtils.trimToNull( webserviceUrlField.getSelectedItem().toString() );
    String consumerKey = StringUtils.trimToNull( consumerKeyField.getText() );
    String consumerSecret = StringUtils.trimToNull( consumerSecretField.getText() );
    if (url==null || consumerKey==null || consumerSecret==null)
    {
      JOptionPane.showMessageDialog( this,
        "Please specify a webservice and consumer key / secret.",
        "Can't fetch access token!", JOptionPane.ERROR_MESSAGE );
      return;
    }

    String verificationCode = StringUtils.trimToNull( JOptionPane.showInputDialog( this,
      "Please enter the verification code, that you've received by the webservice." ) );
    if (verificationCode==null) return;

    doAccessVerify( createClient( url, consumerKey, consumerSecret ), verificationCode );
  }//GEN-LAST:event_verifyAccessMenuItemActionPerformed

  private void getAllRealEstatesMenuItemActionPerformed(ActionEvent evt)//GEN-FIRST:event_getAllRealEstatesMenuItemActionPerformed
  {//GEN-HEADEREND:event_getAllRealEstatesMenuItemActionPerformed
    String url = StringUtils.trimToNull( webserviceUrlField.getSelectedItem().toString() );
    String consumerKey = StringUtils.trimToNull( consumerKeyField.getText() );
    String consumerSecret = StringUtils.trimToNull( consumerSecretField.getText() );
    String accessToken = StringUtils.trimToNull( accessTokenField.getText() );
    String accessSecret = StringUtils.trimToNull( accessSecretField.getText() );
    if (url==null || consumerKey==null || consumerSecret==null || accessToken==null || accessSecret==null)
    {
      JOptionPane.showMessageDialog( this,
        "Please specify a webservice, consumer key / secret and access token / secret.",
        "Can't get real estates!", JOptionPane.ERROR_MESSAGE );
      return;
    }

    try
    {
      doRealEstatesGetAll( createClient( url, consumerKey, consumerSecret, accessToken, accessSecret ) );
    }
    catch (OAuthException ex)
    {
      String error = "Authorization failed!";
      System.err.println( error );
      ex.printStackTrace( System.err );
      writeExceptionToOutputField( error, ex );
    }
  }//GEN-LAST:event_getAllRealEstatesMenuItemActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main( String args[] )
  {
    /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    /*try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals( info.getName() ))
        {
          javax.swing.UIManager.setLookAndFeel( info.getClassName() );
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger( Is24RestApp.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger( Is24RestApp.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger( Is24RestApp.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger( Is24RestApp.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
    }*/
        //</editor-fold>


    // Disable certificate checks to make things easier
    try
    {
      SSLUtils.disableCertificateChecks();
    }
    catch (Exception ex)
    {
      String error = "Can't disable certificate checks!";
      System.err.println( error );
      ex.printStackTrace( System.err );
    }

    // Create and display the form
    java.awt.EventQueue.invokeLater( new Runnable()
    {
      @Override
      public void run()
      {
        new Is24RestApp().setVisible( true );
      }
    } );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private JTextField accessSecretField;
  private JLabel accessSecretLabel;
  private JTextField accessTokenField;
  private JLabel accessTokenLabel;
  private JMenu actionMenu;
  private JPopupMenu.Separator actionMenuSeparator;
  private JTextField consumerKeyField;
  private JLabel consumerKeyLabel;
  private JTextField consumerSecretField;
  private JLabel consumerSecretLabel;
  private JMenuItem getAllRealEstatesMenuItem;
  private JMenu importExportApiMenu;
  private JMenuItem loadSettingsMenuItem;
  private JMenuBar menuBar;
  private JTextArea outputField;
  private JPanel outputPanel;
  private JScrollPane outputScroller;
  private JMenu programMenu;
  private JPopupMenu.Separator programMenuSeparator;
  private JProgressBar progressBar;
  private JMenuItem quitProgramMenuItem;
  private JMenuItem requestAccessMenuItem;
  private JMenuItem saveSettingsMenuItem;
  private JPanel settingsPanel;
  private JMenuItem verifyAccessMenuItem;
  private JComboBox webserviceUrlField;
  private JLabel webserviceUrlLabel;
  // End of variables declaration//GEN-END:variables

  private final static class PropertiesFileFilter extends FileFilter
  {
    @Override
    public boolean accept( File file )
    {
      return file!=null && (file.isDirectory()
        || file.getName().toLowerCase().endsWith( ".properties" )
        || file.getName().toLowerCase().endsWith( ".xml" ));
    }

    @Override
    public String getDescription()
    {
      return "Properties (*.properties, *.xml)";
    }
  }
}