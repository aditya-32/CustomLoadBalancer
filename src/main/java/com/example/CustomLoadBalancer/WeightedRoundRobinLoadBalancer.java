package com.example.CustomLoadBalancer;
import com.example.CustomLoadBalancer.model.ApplicationServer;
import java.util.PriorityQueue;

public class WeightedRoundRobinLoadBalancer implements LoadBalancer{

    private PriorityQueue<ApplicationServer> serverPool;
    public WeightedRoundRobinLoadBalancer(){
        serverPool = new PriorityQueue<>((o1, o2) -> (int) (o1.getWeight()-o2.getWeight()));
    }

    @Override
    public ApplicationServer chooseServer() {
        return serverPool.poll();
    }

    @Override
    public void addServer(ApplicationServer server) {
        serverPool.add(server);
    }

    @Override
    public void removeServer(ApplicationServer server) {
        serverPool.remove(server);
    }
}
