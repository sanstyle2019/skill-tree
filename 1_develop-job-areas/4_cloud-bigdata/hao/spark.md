[TOC]
## Spark
``` 
Spark生态圈是大数据领域的佼佼者
Apache Spark™ is a unified analytics engine for large-scale data processing.
```

### 特性
- Speed
``` 
Run workloads 100x faster. 
```
- Ease of Use
``` 
Write applications quickly in Java, Scala, Python, R, and SQL. 
```
- Generality
``` 
Spark powers a stack of libraries including SQL and DataFrames, MLlib for machine learning, GraphX, and Spark Streaming. 
You can combine these libraries seamlessly in the same application.
```
- Runs Everywhere
``` 
You can run Spark using its standalone cluster mode, on EC2, on Hadoop YARN, on Mesos, or on Kubernetes. 
Access data in HDFS, Alluxio, Apache Cassandra, Apache HBase, Apache Hive, and hundreds of other data sources.
```

### 架构
- RDD(核心：弹性分布式数据集)
- Spark SQL(大数据批处理)
- Spark Streaming(大数据实时流处理)
- MLlib(分布式机器学习框架)
``` 
MLlib可使用许多常见的机器学习和统计算法，简化大规模机器学习时间，其中包括：
    汇总统计、相关性、分层抽样、假设检定、随机数据生成
    分类与回归：支持向量机、回归、线性回归、逻辑回归、决策树、朴素贝叶斯
    协同过滤：ALS
    分群：k-平均算法
    维度约减：奇异值分解（SVD），主成分分析（PCA）
    特征提取和转换：TF-IDF、Word2Vec、StandardScaler
    最优化：随机梯度下降法（SGD）、L-BFGS
```
- GraphX(分布式图形处理框架)
