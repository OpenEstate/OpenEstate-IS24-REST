
package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter14
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseInteger9Positive(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printInteger9Positive(value));
    }

}
