package com.po.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class SapApiClient {

    private final RestClient restClient;
    private final String apiUrl;


    SapApiClient(RestClient.Builder builder,
        @Value("${sap.api.url}") String apiUrl) {
        this.restClient = builder.build();
        this.apiUrl = apiUrl;
    }

    public String fetchPurchaseOrders() {
        return restClient.get()
                .uri(apiUrl)
                .retrieve()
                .body(String.class);
    }
}
