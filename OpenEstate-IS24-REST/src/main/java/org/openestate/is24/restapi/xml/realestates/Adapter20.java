
package org.openestate.is24.restapi.xml.realestates;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter20
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseRoomNrForBaseHouse(value));
    }

    public String marshal(Double value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printRoomNrForBaseHouse(value));
    }

}
