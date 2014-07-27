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

package org.openestate.is24.restapi.utils;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 *
 * @author andy
 */
public final class SSLUtils
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( SSLUtils.class );

  private SSLUtils()
  {
  }

  public static void disableCertificateChecks() throws NoSuchAlgorithmException, KeyManagementException
  {
    // Create a trust manager that does not validate certificate chains
    TrustManager[] trustAllCerts = new TrustManager[]
    {
      new X509TrustManager()
      {
        @Override
        public X509Certificate[] getAcceptedIssuers()
        {
          return null;
        }

        @Override
        public void checkClientTrusted( X509Certificate[] certs, String authType )
        {
        }

        @Override
        public void checkServerTrusted( X509Certificate[] certs, String authType )
        {
        }
      }
    };

    // Install the all-trusting trust manager
    SSLContext sc = SSLContext.getInstance( "SSL" );
    sc.init( null, trustAllCerts, new java.security.SecureRandom() );
    HttpsURLConnection.setDefaultSSLSocketFactory( sc.getSocketFactory() );
  }
}
