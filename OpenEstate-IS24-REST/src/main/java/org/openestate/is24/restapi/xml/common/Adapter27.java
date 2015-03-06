
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter27
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parsePhoneNumberCountryCode(value));
    }

    public String marshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printPhoneNumberCountryCode(value));
    }

}
