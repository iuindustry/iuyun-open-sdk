package com.iuyun.open.config;

public class Config {
    private String appId;

    private String secret;

    private String endpoint;

    public static Config build(String appId, String secret, String endpoint) {
        Config config = new Config();
        config.setAppId(appId);
        config.setSecret(secret);
        config.setEndpoint(endpoint);
        return new Config();
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
