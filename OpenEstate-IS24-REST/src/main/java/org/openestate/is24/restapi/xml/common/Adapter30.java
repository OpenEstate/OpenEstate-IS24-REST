
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter30
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseInteger999(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printInteger999(value));
    }

}
