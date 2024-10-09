package com.example.CustomLoadBalancer;

import com.example.CustomLoadBalancer.model.ApplicationServer;

public interface LoadBalancer {

    ApplicationServer chooseServer();

    void addServer(ApplicationServer server);

    void removeServer(ApplicationServer server);
}
