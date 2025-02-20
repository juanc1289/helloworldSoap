package org.example.soapservice.model;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getHelloResponse", namespace = "http://example.com/hello")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetHelloResponse {

    @XmlElement(required = true)
    private String message;

    // Getter y Setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}