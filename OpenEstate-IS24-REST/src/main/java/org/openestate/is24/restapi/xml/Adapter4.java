
package org.openestate.is24.restapi.xml;

import java.net.URI;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, URI>
{


    public URI unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseUri(value));
    }

    public String marshal(URI value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printUri(value));
    }

}
