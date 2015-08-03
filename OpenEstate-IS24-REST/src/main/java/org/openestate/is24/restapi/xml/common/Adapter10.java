
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parsePriceMultiplier(value));
    }

    public String marshal(Double value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printPriceMultiplier(value));
    }

}
