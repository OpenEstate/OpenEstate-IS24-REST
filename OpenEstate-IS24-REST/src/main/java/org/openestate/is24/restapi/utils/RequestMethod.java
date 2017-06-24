/*
 * Copyright 2014-2017 OpenEstate.org.
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HTTP request methods.
 * <p>
 * These methods are used by the client to communicate with the Webservice.
 *
 * @since 0.1
 * @author Andreas Rudolph <andy@openindex.de>
 */
public enum RequestMethod
{
  GET, POST, PUT, DELETE;

  private final static Logger LOGGER = LoggerFactory.getLogger( RequestMethod.class );
}