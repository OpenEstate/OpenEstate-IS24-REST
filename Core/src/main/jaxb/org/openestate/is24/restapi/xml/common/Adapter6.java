
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parsePassword(value));
    }

    public String marshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printPassword(value));
    }

}
