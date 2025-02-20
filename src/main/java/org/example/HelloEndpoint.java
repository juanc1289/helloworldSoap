package org.example;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.example.soapservice.model.GetHelloRequest;
import org.example.soapservice.model.GetHelloResponse;

@Endpoint
public class HelloEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/hello";

    // Mapea las peticiones cuyo elemento raíz es "getHelloRequest"
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHelloRequest")
    @ResponsePayload
    public GetHelloResponse getHello(@RequestPayload GetHelloRequest request) {
        GetHelloResponse response = new GetHelloResponse();
        response.setMessage("Hola " + request.getName());
        return response;
    }
}