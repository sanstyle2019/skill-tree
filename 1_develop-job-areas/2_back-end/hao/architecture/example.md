## 部署分层架构
``` 
OS -> JVM -> Tomcat/Jetty -> Spring -> Web应用
```

### Tomcat/Jetty
``` 
Tomcat 或者 Jetty 就是一个“HTTP 服务器 + Servlet 容器”，我们也叫它们 Web 容器。

1) 处理 Socket 连接，负责网络字节流与 Request 和 Response 对象的转化。
2) 加载和管理 Servlet，以及具体处理 Request 请求。
因此 Tomcat 设计了两个核心组件连接器（Connector）和容器（Container）来分别做这两件事情。连接器负责对外交流，容器负责内部处理。
```

#### 必备基础：Servlet规范和Servlet容器
- Servlet
``` 
public interface Servlet {
    void init(javax.servlet.ServletConfig servletConfig) throws javax.servlet.ServletException;
    javax.servlet.ServletConfig getServletConfig();
    void service(javax.servlet.ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse) throws javax.servlet.ServletException, java.io.IOException;
    java.lang.String getServletInfo();
    void destroy();
}

ServletRequest 和 ServletResponse。ServletRequest 用来封装请求信息，ServletResponse 用来封装响应信息。
本质上这两个类是对通信协议的封装。

public interface Servlet
public abstract class GenericServlet implements javax.servlet.Servlet
public abstract class HttpServlet extends javax.servlet.GenericServlet
public class MyHttpServlet extends HttpServlet
```

- Filter
```
干预过程的
public interface Filter {
    void init(javax.servlet.FilterConfig filterConfig) throws javax.servlet.ServletException;
    void doFilter(javax.servlet.ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse, javax.servlet.FilterChain filterChain) throws java.io.IOException, javax.servlet.ServletException;
    void destroy();
}
public class MyFilter implements Filter
```

- Listener
``` 
基于状态的
public interface EventListener
public interface ServletContextListener extends java.util.EventListener {
    void contextInitialized(javax.servlet.ServletContextEvent servletContextEvent);
    void contextDestroyed(javax.servlet.ServletContextEvent servletContextEvent);
}
public class MyServletContextListener implements ServletContextListener
```

#### Tomcat系统架构之：连接器
``` 

```