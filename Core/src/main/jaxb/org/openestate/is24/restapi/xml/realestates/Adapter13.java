
package org.openestate.is24.restapi.xml.realestates;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseInteger99999(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printInteger99999(value));
    }

}
