package com.example.CustomLoadBalancer.model;

import com.example.CustomLoadBalancer.enums.ServerStatus;
import lombok.Data;

@Data
public class ApplicationServer {
    private String host;
    private String port;
    private Long weight;
    public ApplicationServer(String host, String port, Long weight){
        this.weight = weight;
        this.host = host;
        this.port=port;
    }
}
