/*
 * Copyright 2014-2016 OpenEstate.org.
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Low level methods for the Expose-API.
 * <p>
 * These methods are calling the different Webservices of the Expose-API.
 *
 * @see <a href="http://api.immobilienscout24.de/our-apis/expose.html">Expose-API</a>
 * @since 0.4
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class Expose
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Expose.class );
  public final static int PUBLISH_CHANNEL_IS24_ID = 10000;
  public final static String PUBLISH_CHANNEL_IS24_TITLE = "Immobilienscout24";
  public final static int PUBLISH_CHANNEL_HOMEPAGE_ID = 10001;
  public final static String PUBLISH_CHANNEL_HOMEPAGE_TITLE = "Homepage";

  private Expose()
  {
  }
}