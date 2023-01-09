package com.iuyun.open.model.response;

public class CreateSecurityTokenResponse extends BaseResponse {
    /**
     * 获取的AK
     */
    private String access;

    /**
     * 获取的SK
     */
    private String secret;

    /**
     * securitytoken是将所获的AK、SK等信息进行加密后的字符串
     */
    private String securitytoken;

    /**
     * 上传文件的桶
     */
    private String bucketName;

    public CreateSecurityTokenResponse() {
    }

    public CreateSecurityTokenResponse(String access, String secret, String securitytoken, String bucketName) {
        this.access = access;
        this.secret = secret;
        this.securitytoken = securitytoken;
        this.bucketName = bucketName;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
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

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
