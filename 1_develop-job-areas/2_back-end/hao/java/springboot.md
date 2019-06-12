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