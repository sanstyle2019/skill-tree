### GrayLog
``` 
Industry Leading Log Management
Open Source Log Management for All

> cat /etc/redhat-release
CentOS Linux release 7.5.1804 (Core)

> uname -a
Linux 2.6.32-042stab123.1 #1 SMP Wed Mar 22 15:21:30 MSK 2017 x86_64 x86_64 x86_64 GNU/Linux

> df -h

> tail -f xxx.log

> ps 
  info ps
  ps -aux
  
> yum install lsof
> lsof -i:80

> netstat -tunlp
    -t (tcp) 仅显示tcp相关选项
    -u (udp) 仅显示udp相关选项
    -n 拒绝显示别名，能显示数字的全部转化为数字
    -l 仅列出在Listen(监听)的服务状态
    -p 显示建立相关链接的程序名
> netstat -tunlp | grep 80

> netstat
  -help 
    -r, --route              display routing table
    -I, --interfaces=<Iface> display interface table for <Iface>
    -i, --interfaces         display interface table
    -g, --groups             display multicast group memberships
    -s, --statistics         display networking statistics (like SNMP)
    -M, --masquerade         display masqueraded connections

    -v, --verbose            be verbose
    -W, --wide               don't truncate IP addresses
    -n, --numeric            don't resolve names
    --numeric-hosts          don't resolve host names
    --numeric-ports          don't resolve port names
    --numeric-users          don't resolve user names
    -N, --symbolic           resolve hardware names
    -e, --extend             display other/more information
    -p, --programs           display PID/Program name for sockets
    -o, --timers             display timers
    -c, --continuous         continuous listing

    -l, --listening          display listening server sockets
    -a, --all                display all sockets (default: connected)
    -F, --fib                display Forwarding Information Base (default)
    -C, --cache              display routing cache instead of FIB
    -Z, --context            display SELinux security context for sockets

  -s [Ip,Icmp,IcmpMsg,Tcp,Udp,UdpLite,TcpExt,IpExt]
  
> systemctl 
https://www.cnblogs.com/zdz8207/p/linux-systemctl.html
```

- [文档](http://docs.graylog.org/en/3.0/)

- [Minimum setup]()
![Minimum setup](http://docs.graylog.org/en/3.0/_images/architec_small_setup.png)

- [Bigger production setup]()
![Bigger production setup](http://docs.graylog.org/en/3.0/_images/architec_bigger_setup.png)

#### Getting Started

- [Prerequisites](http://docs.graylog.org/en/3.0/pages/installation/os/centos.html)
```
Java (>= 8)
	参考教材: https://www.jianshu.com/p/695c809bd1b7
	> yum -y install java-1.8.0-openjdk java-1.8.0-openjdk-devel
	  or > yum install java-1.8.0-openjdk-headless.x86_64
	> dirname $(readlink $(readlink $(which java)))
	> find / -name java
	/usr/lib/jvm/java-1.8.0
	> vim /etc/profile
	export JAVA_HOME=/usr/lib/jvm/java-1.8.0
    export PATH=$PATH:$JAVA_HOME/bin
    export CLASSPATH=.:$JAVA_HOME/jre/lib:$JAVA_HOME/lib:$JAVA_HOME/lib/tools.jar
	> source /etc/profile
	> echo $JAVA_HOME
	/usr/lib/jvm/java-1.8.0
MongoDB (>= 3.6)
	systemctl enable mongod.service
	systemctl disable mongod.service
  	systemctl start mongod.service
  	systemctl restart mongod.service
	systemctl stop mongod.service
	systemctl status mongod.service	      83M
Elasticsearch (5.x or 6.x)
	/etc/elasticsearch/elasticsearch.yml
	  bootstrap.memory_lock: false
	  bootstrap.system_call_filter: false

	/etc/elasticsearch/jvm.options  

	systemctl enable elasticsearch.service
	systemctl disable elasticsearch.service
	systemctl start elasticsearch.service
	systemctl restart elasticsearch.service
	systemctl stop elasticsearch.service
	systemctl status elasticsearch.service      360M  329M  336M

	tail -f /var/log/elasticsearch/graylog.log

	 If the number of processors is expected to increase from one, then you should configure the n...lGCThreads=N
Graylog (admin/admin)
	/etc/graylog/server/server.conf
	/etc/sysconfig/graylog-server

	systemctl enable graylog-server.service
	systemctl disable graylog-server.service
  	systemctl start graylog-server.service
  	systemctl restart graylog-server.service
	systemctl stop graylog-server.service
	systemctl status graylog-server.service     344M  278M  313M

	tail -f /var/log/graylog-server/server.log


这文档写得真好。
```

- Docker setup
```
https://docs.docker.com/install/linux/docker-ce/centos/

> yum install -y yum-utils \
  device-mapper-persistent-data \
  lvm2
> yum-config-manager \
    --add-repo \
    https://download.docker.com/linux/centos/docker-ce.repo  
> yum install docker-ce docker-ce-cli containerd.io
> systemctl start docker
> docker run hello-world
```

