
package org.openestate.is24.restapi.xml.common;

import java.awt.Color;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Color>
{


    public Color unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseColor(value));
    }

    public String marshal(Color value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printColor(value));
    }

}
