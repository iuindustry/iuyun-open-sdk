<p align="center">
<a href=" https://www.iuyun.com"><img src="https://static-a1b2.iuyun.com/icons/0518a62.png"></a>
</p>

<h1 align="center">IUYUN OPEN SDK for Java</h1>
欢迎使用 IUYUN OPEN SDK for Java 。IUYUN OPEN SDK for Java 让您快速接入iu工业云平台。
这里向您介绍如何获取 IUYUN OPEN SDK for Java 并开始调用。
如果您在使用 IUYUN OPEN SDK for Java 的过程中遇到任何问题，欢迎在当前 GitHub

[提交 Issue](https://github.com/iuindustry/iuyun-open-sdk/issues/new) 

## 环境要求
1. IUYUN OPEN SDK for Java 需要1.6以上的JDK。

## 安装依赖
#### 通过Maven来管理项目依赖(推荐)
如果您使用Apache Maven来管理Java项目，只需在项目的`pom.xml`文件加入相应的依赖项即可。
```xml
<dependency>
    <groupId>com.iuyun</groupId>
    <artifactId>open-sdk</artifactId>
    <version>1.0.7</version>
</dependency>
```

## 快速使用

以下这个代码示例向您展示了调用 IUYUN OPEN SDK for Java 的3个主要步骤：
1. 创建Client实例并初始化。
2. 创建API请求并设置参数。
3. 发起请求并处理应答或异常。

```java
package com.testprogram;


import com.iuyun.open.config.Config;
import com.iuyun.open.domain.Client;
import com.iuyun.open.model.request.collection.BatchCollectDataRequest;
import com.iuyun.open.model.request.collection.CollectDataRequest;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // 创建Client实例并初始化
        Config config = Config.build(
                "<your-app-id>", // IU云为企业分配的 APPID，联系IU云管理员提供 
                "<your-secret>", //IU云的SECRET，联系IU云管理员提供
                "<your-endpoint>"); //默认填写："open.iuindustry.com"
        Client client = new Client(config);
        
        //上传单个示例
        CollectDataRequest request = new CollectDataRequest();
        request.setDataCode("001");  //IU云数据ID
        request.setDataTime("2021-12-26 20:48:10"); //采集时间
        request.setStatisticsValue("1"); //采集值
        client.collectData(request); //上传至IU云
        
        //批量上传示例
        CollectData data1 = new CollectDataImpl();
        data1.setDataCode("001"); //IU云数据ID
        data1.setDataTime("2021-12-26 20:48:10"); //采集时间
        data1.setStatisticsValue("1"); //采集值
        CollectData data2 = new CollectDataImpl();
        data2.setDataCode("002"); //IU云数据ID
        data2.setDataTime("2021-12-26 20:49:10"); //采集时间
        data2.setStatisticsValue("2"); //采集值
        BatchCollectDataRequest batchRequest = new BatchCollectDataRequest(
                Arrays.asList(data1,data2)
        );
        //上传至IU云
        client.batchCollectData(batchRequest);

    }
}
```

## 问题
[提交 Issue](https://github.com/iuindustry/iuyun-open-sdk/issues/new) 

## 发行说明
每个版本的详细更改记录在[发行说明](./ChangeLog.txt)中。

## 许可证
[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2017-present, Innovation & Union Technology Co.,Ltd. All rights reserved.
