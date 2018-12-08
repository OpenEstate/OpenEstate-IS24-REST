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
package org.openestate.is24.restapi;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * XmlUtilsTest.
 *
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class XmlUtilsTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(XmlUtilsTest.class);

    @Test
    public void testPrintEmail() {
        String[] validEmails = new String[]{
                "example@example.com",
                "example@example.de",
                "example@example.net",
                "example@example.biz",
                "example@example.immobilien",
        };

        String[] invalidEmails = new String[]{
                "",
                "@",
                "@example.com",
                ".@.com",
                ".@localhost",
                "example@.com",
                "example@",
        };

        for (String email : validEmails) {
            try {
                Assert.assertEquals("print valid " + email,
                        email, XmlUtils.printEmail(email));
            } catch (IllegalArgumentException ex) {
                Assert.fail("valid email '" + email + "' is not printed");
            }
        }

        for (String email : invalidEmails) {
            try {
                String m = XmlUtils.printEmail(email);
                Assert.fail("invalid email '" + email + "' was printed as '" + m + "'");
            } catch (IllegalArgumentException ex) {
                Assert.assertTrue("print invalid " + email, true);
            }
        }
    }

    @Test
    public void testPrintText() {
        String test = "test<br>"
                + "> test2<br/>"
                + "< test3<BR>"
                + "> test4<BR/>"
                + "< test5<bR>"
                + "> test6<Br/>"
                + "< test7<Br / >"
                + "> test8< BR / >"
                + "< test9 < test10 >";
        String expectedResult = "test" + System.lineSeparator()
                + "» test2" + System.lineSeparator()
                + "« test3" + System.lineSeparator()
                + "» test4" + System.lineSeparator()
                + "« test5" + System.lineSeparator()
                + "» test6" + System.lineSeparator()
                + "« test7" + System.lineSeparator()
                + "» test8" + System.lineSeparator()
                + "« test9";
        String result = XmlUtils.printText3999(test);
        //LOGGER.info( "TEST VALUE: " + System.lineSeparator() + test );
        //LOGGER.info( "EXPECTED RESULT: " + System.lineSeparator() + expectedResult );
        //LOGGER.info( "ACTUAL RESULT: " + System.lineSeparator() + result );
        Assert.assertEquals(expectedResult, result);
    }
}