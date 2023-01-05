package com.iuyun.open.model.response;

public class CreateSecurityTokenResponse extends BaseResponse {
    /**
     * 获取的AK
     */
    private String access;

    /**
     * AK/SK和securitytoken的过期时间。响应参数为UTC时间格式，北京时间为UTC+8小时
     */
    private String expires_at;

    /**
     * 获取的SK
     */
    private String secret;

    /**
     * securitytoken是将所获的AK、SK等信息进行加密后的字符串
     */
    private String securitytoken;

    public CreateSecurityTokenResponse() {
    }

    public CreateSecurityTokenResponse(String access, String expires_at, String secret, String securitytoken) {
        this.access = access;
        this.expires_at = expires_at;
        this.secret = secret;
        this.securitytoken = securitytoken;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(String expires_at) {
        this.expires_at = expires_at;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecuritytoken() {
        return securitytoken;
    }

    public void setSecuritytoken(String securitytoken) {
        this.securitytoken = securitytoken;
    }
}
