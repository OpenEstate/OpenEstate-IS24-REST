
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter55
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseText30(value));
    }

    public String marshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printText30(value));
    }

}
