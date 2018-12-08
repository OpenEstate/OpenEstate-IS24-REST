
package org.openestate.is24.restapi.xml.offerlistelement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseRoomNrForBaseHouse(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printRoomNrForBaseHouse(value));
    }

}
