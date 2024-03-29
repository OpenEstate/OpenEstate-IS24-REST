/*
 * Copyright 2014-2021 OpenEstate.org.
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

import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Token for authentication at the Webservice.
 *
 * @author Andreas Rudolph
 * @since 0.1
 */
public class Authorization implements Serializable {
    private final static long serialVersionUID = -9192150555289246368L;
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(Authorization.class);
    public final String accessToken;
    public final String accessTokenSecret;

    public Authorization(String accessToken, String accessTokenSecret) {
        this.accessToken = accessToken;
        this.accessTokenSecret = accessTokenSecret;
    }
}