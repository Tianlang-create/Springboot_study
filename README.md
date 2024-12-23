# Springboot
  *Made by Tianlang 23/12/2024*
## 			                                    														——基于Spring的优化


​			 Spring 的 Web 应用体系结构可以大大简化，如果它提供了从上到下利用 Spring 组件和配置模型的工具和参考体系结构。在简单的 main()方法引导的 Spring 容器内嵌入和统一这些常用Web 容器服务的配置。

## Springboot简介

​			Spring Boot 是伴随着 Spring 4.0 诞生的，从字面理解，Boot是引导的意思，因此 Spring Boot 旨在帮助开发者快速搭建 [Spring 框架](https://so.csdn.net/so/search?q=Spring框架&spm=1001.2101.3001.7020)。Spring Boot 继承了原有 Spring 框架的优秀基因，使 Spring 在使用中更加方便快捷。

### 1.与Spring区别

- 在使用 Spring 的时候，需要在 pom 文件中添加多个依赖，而 Spring Boot 则会帮助开发着快速启动一个 **web 容器**，在 Spring Boot 中，我们只需要在 pom 文件中添加如下一个 starter-web 依赖即可[（web容器概述）](https://blog.csdn.net/sinat_34814635/article/details/136847045?fromshare=blogdetail&sharetype=blogdetail&sharerId=136847045&sharerefer=PC&sharesource=m0_67168376&sharefrom=from_link)

- Spring 虽然使Java EE轻量级框架，但由于其繁琐的配置，一度被人认为是“配置地狱”。各种XML、Annotation配置会让人眼花缭乱，而且配置多的话，如果出错了也很难找出原因。Spring Boot更多的是采用 Java Config 的方式，对 Spring 进行配置

- 一个普通的类，那么我们如何使它也成为一个 Bean 让 Spring 去管理呢？只需要@Configuration 和@Bean两个注解即可，如下：

  ```java
  public class TestService {
      public String sayHello () {
          return "Hello Spring Boot!";
      }
  }
  ```

  ```java 
  import org.springframework.context.annotation.Bean;
  import org.springframework.context.annotation.Configuration;
  
  @Configuration
  public class JavaConfig {
      @Bean
      public TestService getTestService() {
          return new TestService();
      }
  }
  /*之前的加载在spring-config.xml上
  *<bean id="user" class="org.example.User"></bean>
  */
  ```

- 在使用 Spring 时，项目部署时需要我们在服务器上部署 tomcat，然后把项目打成 war 包扔到 tomcat里，在使用 Spring Boot 后，我们不需要在服务器上去部署 tomcat，因为 Spring Boot 内嵌了 tomcat，我们只需要将项目打成 jar 包，使用 java -jar xxx.jar一键式启动项目。

  另外，也降低对运行环境的基本要求，环境变量中有JDK即可。

### 2.Springboot的基本配置