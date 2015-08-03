
package org.openestate.is24.restapi.xml;

import java.net.URL;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, URL>
{


    public URL unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseUrl(value));
    }

    public String marshal(URL value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printUrl(value));
    }

}
