[TOC]
## Hadoop
- [Hadoop下载网站:Cloudera](https://archive.cloudera.com/cdh5/cdh/5/)
``` 
https://archive.cloudera.com/cdh5/cdh/5/hadoop-2.6.0-cdh5.7.0/
```

### Modules
- Hadoop Common: The common utilities that support the other Hadoop modules.
- Hadoop Distributed File System (HDFS™): A distributed file system that provides high-throughput access to application data.
- Hadoop YARN: A framework for job scheduling and cluster resource management.
``` 
ResourceManager 
NodeManager 
```
- Hadoop MapReduce: A YARN-based system for parallel processing of large data sets.

### Related projects  
- Avro™: A data serialization system.
- Cassandra™: A scalable multi-master database with no single points of failure.
- HBase™: A scalable, distributed database that supports structured data storage for large tables.
- Hive™: A data warehouse infrastructure that provides data summarization and ad hoc querying.
- Spark™: A fast and general compute engine for Hadoop data. Spark provides a simple and expressive programming model 
     that supports a wide range of applications, including ETL, machine learning, stream processing, and graph computation.
- ZooKeeper™: A high-performance coordination(协调) service for distributed applications.

### Getting started

#### Setting up a Single Node Cluster
- [Set up Hadoop on GNU/Linux](http://hadoop.apache.org/docs/stable/hadoop-project-dist/hadoop-common/SingleCluster.html)
- [Set up Hadoop on Windows](https://wiki.apache.org/hadoop/Hadoop2OnWindows)

##### Required Software
- Java™
``` 
edit the file etc/hadoop/hadoop-env.sh
  # set to the root of your Java installation
  export JAVA_HOME=xxx
> bin/hadoop  
```
- ssh

##### Pseudo-Distributed Operation
- Configuration
``` 
etc/hadoop/core-site.xml:
etc/hadoop/hdfs-site.xml:
```

- Execution
```
  $ bin/hdfs namenode -format
  $ sbin/start-dfs.sh
  NameNode - http://localhost:50070/
  
  $ bin/hdfs dfs -mkdir /user
  $ bin/hdfs dfs -mkdir /user/<username>
  $ bin/hdfs dfs -put etc/hadoop input
  $ bin/hdfs dfs -get output output
  $ cat output/*  
  $ bin/hdfs dfs -cat output/*  

  $ sbin/stop-dfs.sh
```  

- YARN on a Single Node
``` 
ResourceManager 
NodeManager

etc/hadoop/mapred-site.xml:
    <configuration>
        <property>
            <name>mapreduce.framework.name</name>
            <value>yarn</value>
        </property>
    </configuration>
etc/hadoop/yarn-site.xml:
    <configuration>
        <property>
            <name>yarn.nodemanager.aux-services</name>
            <value>mapreduce_shuffle</value>
        </property>
    </configuration>    
$ sbin/start-yarn.sh    
ResourceManager - http://localhost:8088/
$ sbin/stop-yarn.sh
```

### Documentation

#### General
``` 
NameNode
DataNode	
Secondary NameNode	
ResourceManager	
NodeManager	
WebAppProxy	
MapReduce JobHistory Server
	
etc/hadoop/core-site.xml 
etc/hadoop/hdfs-site.xml
etc/hadoop/yarn-site.xml
etc/hadoop/mapred-site.xml

NameNode	http://nn_host:port/	Default HTTP port is 50070.
ResourceManager	http://rm_host:port/	Default HTTP port is 8088.
MapReduce JobHistory Server	http://jhs_host:port/	Default HTTP port is 19888.

fs
jar
```
- FileSystem Shell
``` 
bin/hadoop fs <args> or hdfs dfs <args>
> hadoop fs -cat URI
> hadoop fs -copyFromLocal <localsrc> URI or -put
> hadoop fs -copyToLocal URI or -get
> hadoop fs -cp
> hadoop dfs -df /user/hadoop/dir1
> hadoop fs -find / -name test -print
> hadoop fs -help
> hadoop fs -ls /user/hadoop/file1
> hadoop fs -mkdir /user/hadoop/dir1 /user/hadoop/dir2
> hadoop fs -mv /user/hadoop/file1 /user/hadoop/file2
> hadoop fs -rm hdfs://nn.example.com/file /user/hadoop/emptydir
> hadoop fs -rmdir /user/hadoop/emptydir
> hadoop fs -rm -r
```

#### HDFS
``` 
Moving Computation is Cheaper than Moving Data

NameNode and DataNodes

Data Blocks: A typical block size used by HDFS is 128 MB.

```

#### YARN
``` 
The ResourceManager has two main components: Scheduler and ApplicationsManager.

```