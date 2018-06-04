
package org.openestate.is24.restapi.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Long>
{


    public Long unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseLong(value));
    }

    public String marshal(Long value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printLong(value));
    }

}
