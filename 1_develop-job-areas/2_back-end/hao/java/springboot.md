### SpringBoot

#### Application Main Class
```java
package org.shao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 组合注解
 *
 * @SpringBootConfiguration -> @Configuration -> @Component
 * @EnableAutoConfiguration -> (exclude = {})
 * @ComponentScan(excludeFilters = {
 * 		@Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
 * 		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
 * 	-> (basePackages = {}, excludeFilters={}, lazyInit=false)
 */
@SpringBootApplication
public class JucApplication {

	/**
	 * SpringApplication 核心就是 构造方法 和 run方法 的逻辑
	 * https://juejin.im/post/5b8f05a5f265da43296c6102
	 * 构造方法：4个重要的步骤
	 * run方法：复杂
	 * @param args
	 */
	public static void main(String[] args) {
		// 默认的启动方法 返回 ConfigurableApplicationContext
		SpringApplication.run(JucApplication.class, args);
		// 自定义扩展启动方法
//		SpringApplication app = new SpringApplication(JucApplication.class);
//		app.xxx
//		app.run(args);

	}

}
```

#### 3种部署方式
- 在Java Archive（JAR）中作为独立应用程序进行部署
``` 
<build> 
  <plugins> 
    <plugin> 
      <groupId> org.springframework.boot </ groupId> 
      <artifactId> spring-boot-maven-plugin </ artifactId> 
    </ plugin> 
  </ plugins> 
</ build>
mvn clean package => xxx.jar 会包含一个嵌入式的servlet容器
java -jar xxx.jar
```

- 将Web应用程序存档（WAR）部署到servlet容器中
``` 
requirement: jdk, tomcat
<packaging>war</packaging>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-tomcat</artifactId
  <scope>provided</scope>
</dependency>
通过扩展SpringBootServletInitializer并覆盖configure方法来初始化Tomcat所需的Servlet上下文。
mvn clean package => xxx.war
请将生成的WAR文件复制到tomcat/webapps/目录
```
```java
@SpringBootApplication
public class DemoApp extends SpringBootServletInitializer {
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(DemoApp.class);
  }
  public static void main(String[] args) {
    SpringApplication.run(DemoApp.class, args);
  }
}
```

- 在Docker Container中部署
``` 
1. mvn clean package => xxx.jar 会包含一个嵌入式的servlet容器

2. 首先在项目根目录中创建一个Dockerfile
    # latest oracle openjdk is the basis
    FROM openjdk:oracle
    # copy jar file into container image under app directory
    COPY target/xxx.jar app/xxx.jar
    # expose server port accept connections
    EXPOSE 8080
    # start application
    CMD ["java", "-jar", "app/xxx.jar"]

3. 构建Docker镜像 -t是要构建的镜像的名称和标记
    docker image build -t demo-app:latest . 

4. 创建和运行容器
    -p是发布（映射）主机端口到容器端口（在这种情况下，两个都是8080）
    选项-d（detach）指定在后台运行容器，并用--name指定容器的名称
    docker container run -p 8080:8080 -d --name app-container demo-app
```