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

/**
 * Token for authentication at the Webservice.
 *
 * @since 0.1
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class Authorization
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( Authorization.class );
  public final String accessToken;
  public final String accessTokenSecret;

  public Authorization( String accessToken, String accessTokenSecret )
  {
    this.accessToken = accessToken;
    this.accessTokenSecret = accessTokenSecret;
  }
}