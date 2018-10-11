/*
 * Copyright 2014-2018 OpenEstate.org.
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
package org.openestate.is24.restapi.utils;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SSL helper methods.
 *
 * @since 0.2
 * @author Andreas Rudolph
 */
public final class SslUtils
{
  private final static Logger LOGGER = LoggerFactory.getLogger( SslUtils.class );

  private SslUtils()
  {
  }

  /**
   * Disable checking of SSL certificates in the application environment.
   *
   * @throws NoSuchAlgorithmException
   * @throws KeyManagementException
   */
  public static void disableCertificateChecks() throws NoSuchAlgorithmException, KeyManagementException
  {
    // Create a trust manager that does not validate certificate chains
    TrustManager[] trustAllCerts = new TrustManager[]{ new InsecureTrustManager() };

    // Install the all-trusting trust manager
    SSLContext sc = SSLContext.getInstance( "SSL" );
    sc.init( null, trustAllCerts, new java.security.SecureRandom() );
    HttpsURLConnection.setDefaultSSLSocketFactory( sc.getSocketFactory() );
  }

  /**
   * Disable hostname verification for SSL connections in the application
   * environment.
   */
  public static void disableHostnameVerification()
  {
    HttpsURLConnection.setDefaultHostnameVerifier( new InsecureHostnameVerifier() );
  }

  /**
   * A {@link HostnameVerifier} that accepts all hostnames.
   * <p>
   * This class disables certificate checks for encrypted connections. You
   * should not use this feature in a productive system.
   */
  public final static class InsecureHostnameVerifier implements HostnameVerifier
  {
    @Override
    public boolean verify(String hostname, SSLSession session)
    {
      return true;
    }
  }

  /**
   * A {@link X509TrustManager} that accepts all certificates.
   * <p>
   * This class disables certificate checks for encrypted connections. You
   * should not use this feature in a productive system.
   */
  public final static class InsecureTrustManager implements X509TrustManager
  {
    @Override
    public java.security.cert.X509Certificate[] getAcceptedIssuers()
    {
      return null;
    }
    @Override
    public void checkClientTrusted(X509Certificate[] certs, String authType)
    {
    }
    @Override
    public void checkServerTrusted(X509Certificate[] certs, String authType)
    {
    }
  }
}