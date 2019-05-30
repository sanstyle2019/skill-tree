## 技术开发概况

- 1.用户端 交互+样式 JavaScript [Coding] [Top] 用户体验
- 2.服务端 Java [Coding] [Top] 中台架构
```
基础架构平台，业务中台，
非常科学的研发方法和体系
电商通用底层业务系统：商品、交易、评价、支付、物流等
避免有些功能重复建设和维护，更合理地利用技术资源
开发、运维成本极高
```
- 3.大数据处理 Scala [Coding] [Top] 数据计算
- 4.数据分析&挖掘 Python [Coding] [Top] 算法挖掘

### 原理
- 数据结构&常见算法
- 数据库原理
- 网络&安全
- 操作系统原理
- 高级算法&数学原理
- 语言编译原理

### 领域

#### 1.用户端
- JavaScript/TypeScript, HTML/CSS
``` 
交互：
    es,ts,
    jquery,
    vue,react,angular,
展示：
    html5,
    css3
...
```

#### 2.服务端
- Java,C/C++,Python, Go, Node.js
```
Java:
    Spring,SpringBoot,Tomcat,SpringCloud,Dubbo,ElasticSearch,RocketMQ,Netty    
    Java的核心: JVM (数据结构,网络,操作系统原理,语言编译原理)
服务端架构典型中间件:
    数据存储: 
    db => Mysql Mongo (数据库原理)
    加速查询效率，提升查询性能: 
    cache => Redis Memcached (数据结构)
    search => Lucene Solr ElasticSearch (数据结构)
    加速处理效率，提升执行性能：
    mq => Rabbitmq ActiveMQ Rocketmq (数据结构)
    network & nio => Netty Mina (网络,NIO)
C/C++:
        
Python:
    django,flask
Go:
        
Node.js:
    express,koa2
...
```

#### 3.数据层
- SQL, Scala, Java,Python
``` 
数据库：
    mysql,mongo,redis,
大数据处理：
    hadoop,habse,hive,spark,flink,kafka,elasticsearch
...
```

#### 4.运维层
- Lua,Bash, Python,Go
``` 
服务器：linux,
资源管理监控：ansible,nmap,
网关接入层：nginx,openresty,
部署容器：docker,k8s
...
```

#### 5.推荐系统,数据分析&挖掘
- Python,SQL
``` 

```

#### 6.人工智能机器学习深度学习
- Python,C/C++
``` 

```

### 语言
#### 1.汇总
``` 
1.javascript,es,ts,node.js   1+2
2.html/css   1
3.java   2+3
4.python   2+3+4+5+6
5.go   2+4
6.sql   3+5
7.scala   3
8.shell   4
9.lua   4
10.c/c++   2+3+4+5+6

5:  c/c++ (服务端&数据库&服务器&推荐系统数据挖掘数据分析&人工智能机器学习深度学习)
    python(服务端&大数据处理&运维层&推荐系统数据挖掘数据分析&人工智能机器学习深度学习)
2:  javascript(用户端&服务端),java(服务端&大数据处理),go(服务端&运维层),sql(数据库大数据处理&数据分析)
1:  html/css(用户端),scala(大数据处理),shell(运维层),lua(运维层)
```

#### 2.排行
- [TIOBE编程语言排行榜](https://hellogithub.com/report/tiobe/)
``` 
Java,C/C++,Python,C#
JavaScript,SQL,PHP,Objective-C
Perl,MATLAB,Ruby,Groovy,Swift,Go
R,[Scratch,]Dart,Scala,Lisp,Lua,Kotlin,
TypeScript,Julia,Haskell,Clojure,Erlang,Bash


Java,C/C++,Python,
JavaScript,SQL,
Groovy,Go
Dart,Scala,Lua,Kotlin,
TypeScript,Julia,Clojure,Erlang,Bash

JVM语言: Java,Groovy,Scala,Kotlin,Clojure

Java,C/C++,Python,
JavaScript,SQL,
Go
Scala,Lua,
TypeScript,Bash

Java,C/C++,Python, Go, Node.js
JavaScript/TypeScript, HTML/CSS
SQL, Scala, Java,Python
Lua,Bash, Python,Go
Python,SQL
Python,C/C++
```

#### 3.职位
- 1.后端 Java,C/C++,Python, Go, Node.js
```
优先选择: Java    
    响应式编程: Vert.x,RxJava Spring的WebFlux
    
    暂不考虑: Python,Go,Node.js 
    Go的性能高，适合高并发业务场景？
    Node.js的并发性能高，更节省服务器？
```

- 2.前端 JavaScript/TypeScript, HTML/CSS
``` 
交互: JavaScript: Vue.js/jQuery
样式: HTML/CSS: 好用的UI样式组件
```

- 3.数据 SQL, Scala, Java,Python
``` 
Database: SQL
大数据处理: 
优先选择: Scala,SQL
    暂不考虑: Java,Python
```

- 4.运维 Lua,Bash, Python,Go
``` 
Nginx: Lua
Linux: Bash
    运维资源监控自动化: Python
容器Docker/K8s: Go
```

- 5.推荐系统,数据分析&挖掘 Python,SQL
``` 
    推荐系统: Python
数据分析&挖掘: Python
```

- 6.人工智能机器学习深度学习 Python,C/C++
``` 
    AI一等公民: Python
```

### 总结

#### 红红火火
``` 
1.后端
    Java   [Well use]
        SpringCloud,Dubbo,ZK [Hot]
        分布式问题 [Hot]
2.前端
    交互: JavaScript: Vue.js/jQuery   [Well use]
    样式: HTML/CSS: 好用的UI样式组件   [Can use]
3.数据
    Database: SQL   [Well use]
    大数据处理: Scala,SQL   [Well use]
4.运维
    Nginx: Lua   [Can use]
    Linux: Bash   [Can use]
    容器Docker/K8s: Go [Hot]   [Can use]
5.推荐系统,数据分析&挖掘
    数据分析&挖掘: Python [Hot]   [Well use]
6.人工智能机器学习深度学习
    No

[Well use] 
    Java,JavaScript,SQL,Scala,Python => Java,Python,JavaScript,SQL,Scala
[Can use]
    HTML/CSS,Lua,Bash,Go => HTML/CSS,Go,Lua,Bash
[Hot] 
    分布式微服务 => Java[Well use], Go[Can use]
    数据分析&挖掘 => Python[Well use]
```

#### 恍恍惚惚 Top5
- [1.Java 2.Python 3.Scala 4.JavaScript]
- 1.后端 Java
```
SpringCloud,Dubbo,ZK,分布式问题,架构问题
Web框架: Spring MyBatis SpringBoot (MVC分层)
Web应用服务器: Tomcat (Java Web Servlet PK WebFlux)
分布式微服务框架: SpringCloud Dubbo Zookeeper (分布式微服务)
    Dubbo(Netty)
分布式问题()
    分布式事务保证
    分布式锁
    分布式最终一致性
    分布式全局唯一ID
架构问题()
    扩容: 垂直扩容，水平扩容 DB主从,分区
    缓存: Guava Cache,Memcached,Redis
    MQ: 好处多多,业务解耦,异步广播,错峰与限流,最终一致性...
    业务拆分: 微服务框架,SpringCloud,Dubbo,
        之后的问题: 服务间通信,跨库事务保证,
    限流: 一些常见算法来解决吧,漏桶算法,令牌桶算法
    服务降级服务熔断: Hystrix
    DB分库分表: 分库,分表...
    接入搜索引擎，提升数据量大时系统的查询效率
    网关接入层: Nginx(Lua Openrestry) 流量控制 高并发时可在这一层进行捕捉处理
    必要时可进行NIO,响应式编程的优化，集群大时提升单机TPS,QPS可大大降低成本
    
    db,cache,search,mq,nio...
    
搜索引擎: Lucene Solr ElasticSearch (数据结构)
消息队列: ActiveMQ RocketMQ (数据结构)

NIO高性能网络通信: Netty (NIO&网络)

Java的核心: JVM (数据结构,网络,操作系统原理,语言编译原理)
    JDK里的数据结构用到哪些,集合容器,IO,NIO,Network,多线程
    内存(线程)模型: 主内存和工作(线程)内存的数据共享问题及happens-before原则
    线程安全问题: CAS(Atomic类),Unsafe,synchronized关键字,volatile关键字
    JUC包: AQS,线程池,高性能同步容器
    死锁问题

数据三要素: 除了计算和存储之外，正是传输赋予其非凡的意义。

[MMP] Java(架构) 真TM无底洞...
``` 

- 2.数据分析&挖掘 Python
```      
Numpy,Pandas,Scipy,Matplotlib,Seaborn
IDE: 推荐 PyCharm, Jupyter Notebook

1.数据收集 
    爬虫 Scrapy,Requests...
    存储 Pymongo...
2.数据清洗、转换 
    Numpy,Pandas...
3.数据分析&挖掘
    Numpy,Pandas,Scipy...
4.数据可视化
    Matplotlib,Seaborn,Pyecharts...

[MMP] Python数据分析&挖掘 商业价值比较大... 
```

- 3.大数据处理 Scala
```
Hadoop,Spark,Flink,Kafka,Beam
大数据存储平台: Hadoop,HBase
大数据仓库平台: Hive,Impala
大数据消息队列: Kafka
大数据实时计算平台: Spark,Flink
大数据统一计算平台: Beam
```

- 4.Database SQL
```  
MySQL (数据库原理)
数据库原理: 学了之后技术思维绝对升级
``` 

- 5.前端交互 JavaScript    
```  
Vue.js,jQuery
前端的重要性在于，它是产品力的体现形式，非常重要
标准: ECMAScript2015,HTML5,CSS3
交互: jQuery的生态还是很丰富的，不过Vue.js这种，开发起来很爽
    Vue生态:
        
样式: 推荐直接采用好的样式组件，满足大部分基础页面需求
    好看好用的UI组件
    Mobile:  
    PC: 
后端: 关注一下Node.js     
```

- 6.关注一下 Go
``` 
后端 分布式高并发场景
容器 Docker,K8s
```

#### 系统之路
- 1.用户端 交互+样式 JavaScript [Coding] [Top] 目前对搭建基础平台来说最薄弱
- 2.服务端 Java [Coding] [Top] 近年核心，架构能力
- 5.大数据处理 Scala [Coding] [Top] 对找工作最有帮助
- 6.数据分析&挖掘 Python [Coding] 闲时玩玩，只是觉得有意思
``` 
1.用户端 交互+样式 JavaScript [Coding] [Top]
    Vue.js/jQuery + 好用的UI样式组件
    
    这个要重视起来，暂时优先，目前对搭建基础平台来说最薄弱

2.服务端 Java [Coding] [Top]
    SpringBoot/SpringCloud
        业务拆分: 先单体,再拆分,为快速成型 
    + Mybatis + Redis 先只接入Redis
    
    + RabbitMQ/ActiveMQ 
    + ElasticSearch
    
    这个要重视起来，近年核心，架构能力
    做 DevOps 及架构，适当关注一下 Go ，是挑战 Java 地位排名第二的语言(第一当然是 Python )

3.数据库 SQL
    MySQL(交易类业务数据), Mongo(内容类业务数据)

4.运维
    Nginx,Tomcat,
    Linux,Docker

5.大数据处理 Scala [Coding] [Top]
    Hadoop,Spark,Flink,Kafka
    
    这个要重视起来，近期优先，对找工作最有帮助

6.数据分析&挖掘 Python [Coding]
    数据收集: 
        爬虫: Scrapy,Requests,Redis,Mongo,ElasticSearch(ELK可进行简单的数据分析)
        日志: 大数据处理收集到的系统访问日志
        开源数据集
    数据清洗、转换、分析、挖掘:
        Numpy,Pandas,Scipy,
    数据可视化:
        Matplotlib,Seaborn,Pyecharts
        
    这个要重视起来，闲时玩玩，只是觉得有意思
    Python 的综合影响力再过一些年头，应该会超过目前No.1的 Java ，拭目以待吧

7.推荐系统 
    ?

1.交易产品 (基础交易系统)
2.内容产品 (基础内容系统)
3.数据中心 (大数据处理,数据分析&挖掘)
4.用户增长 (推荐系统,运营推广)
```

#### 基础学习
```
数据结构&常见算法: 这是最基础的基础
数据库原理: 学习数据库的设计思路,提升思维
网络&安全: 这个很重要也比较复杂,TCP/IP协议,常见的安全问题及解决办法
操作系统原理: 这个就比较难了 可以系统学习Linux
    CPU(计算),寄存器高速缓存内存磁盘(存储),磁盘&网络IO(数据传输字节流转)
    内核态,用户态,进程,线程...
高级算法&数学原理: 这个很难,哈哈哈
语言编译原理: 这个也很难,呵呵呵
```
