package com.iuyun.open.domain;

import com.iuyun.open.config.Config;


public class Client {

    private Config config;

    public Client(Config config) {
        this.config = config;
    }

    public DataCollection dataCollection() {
        DataCollection dataCollection = new DataCollection(config);
        return dataCollection;
    }


}
