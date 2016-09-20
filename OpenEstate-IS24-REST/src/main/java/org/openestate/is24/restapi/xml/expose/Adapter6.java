
package org.openestate.is24.restapi.xml.expose;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseText40(value));
    }

    public String marshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printText40(value));
    }

}
