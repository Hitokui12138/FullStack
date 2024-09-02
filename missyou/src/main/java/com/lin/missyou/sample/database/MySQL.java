package com.lin.missyou.sample.database;

import com.lin.missyou.sample.IConnect;

public class MySQL implements IConnect {
    private String ip;
    private Integer port;

    public MySQL(String ip, Integer port) {
        System.out.println("MySQL instance is 实例化");
        this.ip = ip;
        this.port = port;
    }

    public MySQL() {
    }

    @Override
    public void connect(){
        System.out.println("MySQL Connected: " + this.ip + " : " + this.port);
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
