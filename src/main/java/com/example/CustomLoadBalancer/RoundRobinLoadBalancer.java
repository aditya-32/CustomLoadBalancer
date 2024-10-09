package com.example.CustomLoadBalancer;

import com.example.CustomLoadBalancer.exception.NoApplicationServerAvailable;
import com.example.CustomLoadBalancer.model.ApplicationServer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RoundRobinLoadBalancer implements LoadBalancer{

    private static List<ApplicationServer> serverPool;
    private static int currentNode;
    static {
        serverPool = new ArrayList<>();
        currentNode = 0;
    }
    @Override
    public ApplicationServer chooseServer() {
        if (!serverPool.isEmpty()) {
            ApplicationServer server = serverPool.get(currentNode);
            currentNode = (currentNode+1) % serverPool.size();
            return server;
        }
        throw new NoApplicationServerAvailable("No Application Server for Routing Request");
    }

    @Override
    public void addServer(ApplicationServer server) {
        if (Objects.isNull(server)) {
            return;
        }
        serverPool.add(server);

    }

    @Override
    public void removeServer(ApplicationServer server) {
        serverPool.remove(server);
    }
}
