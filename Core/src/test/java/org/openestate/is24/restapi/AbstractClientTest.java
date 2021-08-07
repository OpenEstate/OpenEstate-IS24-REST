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
package org.openestate.is24.restapi;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractClientTest.
 *
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class AbstractClientTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(AbstractClientTest.class);

    @Test
    public void testGetUrlEncodedValue() {
        Assert.assertEquals(
                "1%2B2%3D3%20%C3%A4%C3%B6%C3%BC%C3%9F%20%2F%20%E2%82%AC%20%26",
                AbstractClient.getUrlEncodedValue("1+2=3 äöüß / € &"));
    }
}