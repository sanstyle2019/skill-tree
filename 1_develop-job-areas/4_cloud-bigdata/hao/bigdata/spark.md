[TOC]
## Spark
``` 
Spark生态圈是大数据领域的佼佼者
Apache Spark™ is a unified analytics engine for large-scale data processing.
```

### 1.Feature
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

### 2.Architecture
- RDD(核心：弹性分布式数据集)
- Spark SQL(大数据批处理)
``` 
SQL & DataFrame & DataSet
```
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

### 3.Download & Install
```
依赖 Hadoop HDFS 还有 Hadoop Yarn [可选]

spark-2.3.3-bin-hadoop2.6.tgz
pre-built with scala 2.11, except from version spark-2.4.2 is scala 2.12

> pip install pyspark
Successfully installed py4j-0.10.7 pyspark-2.4.3

Server: Java 8+
Spark runs on both Windows and UNIX-like systems (e.g. Linux, Mac OS). 
It’s easy to run locally on one machine — all you need is to have java installed on your system PATH, 
or the JAVA_HOME environment variable pointing to a Java installation.

Client: Java 8+, Python 2.7+/3.4+ and R 3.1+
Spark runs on Java 8+, Python 2.7+/3.4+ and R 3.1+. 
For the Scala API, Spark 2.4.3 uses Scala 2.12. 
You will need to use a compatible Scala version (2.12.x).

Note that support for Java 7, Python 2.6 and old Hadoop versions before 2.6.5 were removed as of Spark 2.2.0. 
Support for Scala 2.10 was removed as of 2.3.0. 
Support for Scala 2.11 is deprecated as of Spark 2.4.1 and will be removed in Spark 3.0.
```

### 4.Example
```
Java、Python、Scala[Import]、SQL、Javascript[Import]
官方Example优先级: Python、Scala、Java(不推荐，写起来太繁琐，但是可以看看，更能帮助知道对象是什么)

SparkContext => sc
RDD API (Word Count, Pi Estimation)
    textFile = sc.textFile("hdfs://...")
    counts = textFile.flatMap(lambda line: line.split(" ")) \
                 .map(lambda word: (word, 1)) \
                 .reduceByKey(lambda a, b: a + b)

    val textFile = sc.textFile("hdfs://...")                 
    val counts = textFile.flatMap(line => line.split(" "))
                     .map(word => (word, 1))
                     .reduceByKey(_ + _)                 
DataFrame API (Text Search, Simple Data Operations)
    textFile = sc.textFile("hdfs://...")
    df = textFile.map(lambda r: Row(r)).toDF(["line"])
    errors = df.filter(col("line").like("%ERROR%"))
    
    val textFile = sc.textFile("hdfs://...")
    val df = textFile.toDF("line")
    val errors = df.filter(col("line").like("%ERROR%"))

Machine Learning (Prediction with Logistic Regression)
    These algorithms cover tasks such as feature extraction, classification, regression, clustering, recommendation, and more. 
    这些算法涵盖了诸如特征提取，分类，回归，聚类，推荐等。
```

### 5.Documentation

#### 5.1 Running the Examples and Shell
```
> ./bin/run-example SparkPi 10

> ./bin/spark-shell --master local[2]

> ./bin/pyspark --master local[2]

> ./bin/spark-submit examples/src/main/python/pi.py 10

```

#### 5.2 Launching on a Cluster
``` 
val conf = new SparkConf()
  .setMaster(...)
  .setAppName(...)
  .set("spark.cores.max", "10")
val sc = new SparkContext(conf)

Standby Masters with ZooKeeper
```

#### 5.3 Quick Start
``` 
Scala|Python
./bin/spark-shell
./bin/pyspark
```

#### 5.4 RDD
``` 
Spark提供的主要抽象是弹性分布式数据集（RDD）
Spark中的第二个抽象是可以在并行操作中使用的共享变量。

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
val conf = new SparkConf().setAppName(appName).setMaster(master)
new SparkContext(conf)

import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.SparkConf;
SparkConf conf = new SparkConf().setAppName(appName).setMaster(master);
JavaSparkContext sc = new JavaSparkContext(conf);

from pyspark import SparkContext, SparkConf
conf = SparkConf().setAppName(appName).setMaster(master)
sc = SparkContext(conf=conf)

$ ./bin/spark-shell --master local[4]
$ ./bin/pyspark --master local[4]


Resilient Distributed Datasets (RDDs)

val data = Array(1, 2, 3, 4, 5)
val distData = sc.parallelize(data)

List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
JavaRDD<Integer> distData = sc.parallelize(data);

data = [1, 2, 3, 4, 5]
distData = sc.parallelize(data)
```
- Transformations
``` 
map(func)
filter(func)
flatMap(func)
groupByKey([numPartitions])
reduceByKey(func, [numPartitions])
```
- Actions
```
reduce(func)
collect()
count()
saveAsTextFile(path)
countByKey()
```
- RDD Persistence
``` 
MEMORY_ONLY
MEMORY_AND_DISK
DISK_ONLY
```
- Shared Variables
``` 
1.Broadcast Variables
val broadcastVar = sc.broadcast(Array(1, 2, 3))
broadcastVar.value // Array[Int] = Array(1, 2, 3)

2.Accumulators
```

#### 5.5 Spark SQL, DataFrames and Datasets
``` 

```