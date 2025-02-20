package org.example.soapservice.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getHelloRequest", namespace = "http://example.com/hello")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetHelloRequest {

    @XmlElement(required = true)
    private String name;

    // Getter y Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
