package com.omie.erp.core.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestClientException;

@Component
public class OmieApiClient {

    private static final String BASE_URL = "https://app.omie.com.br/api/v1/";
    private final RestTemplate restTemplate;

    @Autowired
    public OmieApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public <T, R> R consult(String endpoint, T request, Class<R> responseType) {
        String url = BASE_URL + endpoint;

        try {
            return restTemplate.postForObject(url, request, responseType);
        } catch (RestClientException e) {
            System.err.println("Erro ao consultar recurso: " + e.getMessage());
            return null;
        }
    }
}

