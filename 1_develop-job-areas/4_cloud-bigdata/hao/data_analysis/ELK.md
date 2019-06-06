### ELK
```
从 Security 到 Alerting、Monitoring、Reporting、Graph 关联分析和 Machine Learning，
轻松获取这些功能，并将您的 Elastic Stack 带入一个新的高度。

Java: Data search
    Client: 
Python: Data analysis
    Client: 
```

#### Elasticsearch
``` 
对您的数据进行搜索、分析和存储。
Elasticsearch 是基于 JSON 的分布式搜索和分析引擎，专为实现水平可扩展性、高可靠性和管理便捷性而设计。

速度快的原理：
    我们通过有限状态转换器实现了用于全文检索的倒排索引，实现了用于存储数值数据和地理位置数据的 BKD 树，以及用于分析的列存储。
可扩展性：
    无论 Elasticsearch 是在一个节点上运行，还是在一个包含 300 个节点的集群上运行，您都能够以相同的方式与 Elasticsearch 进行通信。    
弹性：
    硬件故障。网络分割。Elasticsearch 为您检测这些故障并确保您的集群（和数据）的安全性和可用性。通过跨集群复制功能，辅助集群可以作为热备份随时投入使用。
    Elasticsearch 运行在一个分布式的环境中，从设计之初就考虑到了这一点，目的只有一个，让您永远高枕无忧。
灵活性：
    数字、文本、地理位置、结构化数据、非结构化数据。欢迎使用所有数据类型。
    应用搜索、安全分析、指标或日志分析只是全球众多公司利用 Elasticsearch 解决各种挑战的冰山一角。
HADOOP 和 SPARK：
    Hadoop 中有大量数据？您可以使用 Elasticsearch-Hadoop (ES-Hadoop) 连接器，利用 Elasticsearch 的实时搜索和分析功能处理您的大数据。
    这是两大领域最大优势的融合。
```
- start up
``` 
java.lang.RuntimeException: can not run elasticsearch as root
https://blog.csdn.net/ooyhao/article/details/84704151
adduser elk
passwd elkelkelk
su elk
Exception in thread "main" java.nio.file.AccessDeniedException: /home/elk/elasticsearch-7.1.1/config/jvm.options
chown -R elk /home/elk/
```
- exception analysis
``` 
org.elasticsearch.http.netty4.
org.elasticsearch.http.DefaultRestChannel
org.elasticsearch.rest.RestController 
    [at org.elasticsearch.rest.RestController.dispatchRequest(RestController.java:177) [elasticsearch-7.1.1.jar:7.1.1]]
org.elasticsearch.http.AbstractHttpServerTransport
io.netty.channel.
io.netty.handler.
io.netty.util. 
    [at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:909) [netty-common-4.1.32.Final.jar:4.1.32.Final]]
java.lang.Thread 
    [at java.lang.Thread.run(Thread.java:748) [?:1.8.0_212]]

[2019-06-06T03:13:30,134][ERROR][o.e.r.RestController     ] [root] failed to send failure response for uri [sip:nm]
java.lang.IllegalArgumentException: Unexpected http protocol version: SIP/2.0
        at org.elasticsearch.http.netty4.Netty4HttpRequest.protocolVersion(Netty4HttpRequest.java:136) ~[?:?]
        at org.elasticsearch.http.DefaultRestChannel.isHttp10(DefaultRestChannel.java:172) ~[elasticsearch-7.1.1.jar:7.1.1]
        at org.elasticsearch.http.DefaultRestChannel.isCloseConnection(DefaultRestChannel.java:166) ~[elasticsearch-7.1.1.jar:7.1.1]
        at org.elasticsearch.http.DefaultRestChannel.sendResponse(DefaultRestChannel.java:118) ~[elasticsearch-7.1.1.jar:7.1.1]
        at org.elasticsearch.rest.RestController.dispatchRequest(RestController.java:177) [elasticsearch-7.1.1.jar:7.1.1]
        at org.elasticsearch.http.AbstractHttpServerTransport.dispatchRequest(AbstractHttpServerTransport.java:317) [elasticsearch-7.1.1.jar:7.1.1]
        at org.elasticsearch.http.AbstractHttpServerTransport.handleIncomingRequest(AbstractHttpServerTransport.java:367) [elasticsearch-7.1.1.jar:7.1.1]
        at org.elasticsearch.http.AbstractHttpServerTransport.incomingRequest(AbstractHttpServerTransport.java:296) [elasticsearch-7.1.1.jar:7.1.1]
        at org.elasticsearch.http.netty4.Netty4HttpRequestHandler.channelRead0(Netty4HttpRequestHandler.java:66) [transport-netty4-client-7.1.1.jar:7.1.1]
        at org.elasticsearch.http.netty4.Netty4HttpRequestHandler.channelRead0(Netty4HttpRequestHandler.java:31) [transport-netty4-client-7.1.1.jar:7.1.1]
        at io.netty.channel.SimpleChannelInboundHandler.channelRead(SimpleChannelInboundHandler.java:105) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at org.elasticsearch.http.netty4.Netty4HttpPipeliningHandler.channelRead(Netty4HttpPipeliningHandler.java:58) [transport-netty4-client-7.1.1.jar:7.1.1]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:102) [netty-codec-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.handler.codec.MessageToMessageCodec.channelRead(MessageToMessageCodec.java:111) [netty-codec-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:102) [netty-codec-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:102) [netty-codec-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:323) [netty-codec-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:297) [netty-codec-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.handler.timeout.IdleStateHandler.channelRead(IdleStateHandler.java:286) [netty-handler-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1434) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:965) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:163) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:656) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.nio.NioEventLoop.processSelectedKeysPlain(NioEventLoop.java:556) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:510) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:470) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:909) [netty-common-4.1.32.Final.jar:4.1.32.Final]
        at java.lang.Thread.run(Thread.java:748) [?:1.8.0_212]
```

#### Kibana
``` 
实现数据可视化。在 Elastic Stack 中进行导航。
Kibana 能够以图表的形式呈现数据，并且具有可扩展的用户界面，供您全方位配置和管理 Elastic Stack。
```

#### Logstash
``` 
Logstash 是动态数据收集管道，拥有可扩展的插件生态系统，能够与 Elasticsearch 产生强大的协同作用。
```

#### Beats
``` 
Beats 是一个面向轻量型采集器的平台，这些采集器可从边缘机器向 Logstash 和 Elasticsearch 发送数据。
```

