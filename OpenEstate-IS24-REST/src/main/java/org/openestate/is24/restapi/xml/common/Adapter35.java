//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.28 at 06:41:17 PM CET 
//


package org.openestate.is24.restapi.xml.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter35
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parseThermalCharacteristic(value));
    }

    public String marshal(Double value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printThermalCharacteristic(value));
    }

}
