
package org.openestate.is24.restapi.xml.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parsePriceMultiplier(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printPriceMultiplier(value));
    }

}
