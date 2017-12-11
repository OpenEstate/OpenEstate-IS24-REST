
package org.openestate.is24.restapi.xml.realestates;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseThermalCharacteristic(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printThermalCharacteristic(value));
    }

}
