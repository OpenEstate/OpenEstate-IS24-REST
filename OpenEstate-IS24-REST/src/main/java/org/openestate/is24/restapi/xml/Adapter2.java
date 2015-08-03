
package org.openestate.is24.restapi.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseDate(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printDate(value));
    }

}
