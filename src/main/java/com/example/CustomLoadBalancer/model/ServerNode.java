package com.example.CustomLoadBalancer.model;

import lombok.Data;
import org.apache.catalina.Server;

@Data
public class ServerNode<V> {
    private V server;
    private ServerNode<V> prevServer;
    private ServerNode<V> nextServer;

    public ServerNode (V server) {
        this.server = server;
        this.prevServer = null;
        this.nextServer = null;
    }
}
