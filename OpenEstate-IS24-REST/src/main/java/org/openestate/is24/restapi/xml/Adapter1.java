//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.03 at 08:04:31 PM CEST 
//


package org.openestate.is24.restapi.xml;

import java.net.URL;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, URL>
{


    public URL unmarshal(String value) {
        return (org.openestate.is24.restapi.xml.XmlUtils.parseUrl(value));
    }

    public String marshal(URL value) {
        return (org.openestate.is24.restapi.xml.XmlUtils.printUrl(value));
    }

}
