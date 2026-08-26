package org.openestate.is24.restapi.xml.common;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter43
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.parsePhoneNumberAreaCode(value));
    }

    public String marshal(String value) {
        return (org.openestate.is24.restapi.utils.XmlUtils.printPhoneNumberAreaCode(value));
    }

}
