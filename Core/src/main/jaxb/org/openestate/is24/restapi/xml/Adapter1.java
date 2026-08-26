package org.openestate.is24.restapi.xml;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (jakarta.xml.bind.DatatypeConverter.parseDecimal(value));
    }

    public String marshal(BigDecimal value) {
        if (value == null) {
            return null;
        }
        return (jakarta.xml.bind.DatatypeConverter.printDecimal(value));
    }

}
