package org.openestate.is24.restapi.xml.common;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter49
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parsePhoneNumber(value));
    }

    public String marshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printPhoneNumber(value));
    }

}
