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

import org.apache.commons.lang3.SystemUtils;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.is24.restapi.utils.XmlUtils;

/**
 * XmlUtilsTest.
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
@RunWith( JUnit4.class )
public class XmlUtilsTest
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( XmlUtilsTest.class );

  @Test
  public void testPrintText()
  {
    String test = "test<br>"
      + "> test2<br/>"
      + "< test3<BR>"
      + "> test4<BR/>"
      + "< test5<bR>"
      + "> test6<Br/>"
      + "< test7<Br / >"
      + "> test8< BR / >"
      + "< test9 < test10 >";
    String expectedResult = "test" + SystemUtils.LINE_SEPARATOR
      + "» test2" + SystemUtils.LINE_SEPARATOR
      + "« test3" + SystemUtils.LINE_SEPARATOR
      + "» test4" + SystemUtils.LINE_SEPARATOR
      + "« test5" + SystemUtils.LINE_SEPARATOR
      + "» test6" + SystemUtils.LINE_SEPARATOR
      + "« test7" + SystemUtils.LINE_SEPARATOR
      + "» test8" + SystemUtils.LINE_SEPARATOR
      + "« test9";
    String result = XmlUtils.printText2000( test );
    //LOGGER.info( "TEST VALUE: " + SystemUtils.LINE_SEPARATOR + test );
    //LOGGER.info( "EXPECTED RESULT: " + SystemUtils.LINE_SEPARATOR + expectedResult );
    //LOGGER.info( "ACTUAL RESULT: " + SystemUtils.LINE_SEPARATOR + result );
    Assert.assertEquals( expectedResult, result );
  }
}