# fml-spring-test
Java spring boot prac

# Theory Questions 

1. DI stands for dependency injection whilst IOC stands for inversion of control. Dependency Injection is a design pattern that provides
objects that an object needs. For instance if A is dependent on B, one can inject the dependencies via a constructor or setter injection,
rather than creating the object B in class A. 

Dependency injection seeks to achieve inversion of control which is kind of an inversion of the program flow. This means that instead of a 
user controlling the flow of the program, the external components to the program take the control. These external components include the 
framework, services, other components.

2. The spring boot framework supports three different types of embedded servlet containers, one of which is Tomcat.

3. By default, Spring Boot uses an externalized configuration file which is "application.properties" or "application.yml".

4. The spring boot annotation that allow resolving dependencies by field injection is the @Resource annotation

5. We can invoke an action after loading a spring context by implementing ApplicationListener<ContextRefreshedEvent>

6. @Controller vs @RestController

In typical spring mvc application, controller is indicated by annotation @Controller. This annotation serves as a specialization of @Component,
allowing for implementation classes to be auto-detected through classpath scanning. It is typically used in combination with annotated handler
methods based on the @RequestMapping annotation.

On the other hand, @RestController is used in case of REST style controllers i.e. handler methods shall return the JSON/XML response directly
to client rather using view resolvers. It is a convenience annotation that is itself annotated with @Controller and @ResponseBody.

The @Controller is a common annotation which is used to mark a class as Spring MVC Controller while the @RestController is a special controller
used in RESTFul web services and the equivalent of @Controller + @ResponseBody.

@RequestParam vs @PathVariable

@RequestParam is used to get the request parameters. @RequestParam automatically binds the request parameters to the arguments of your handler method. 
It also provides auto type conversion for some standard type like int, long, float, string, date etc.

@PathVariable is used to pass parameter along with the url, sometimes we need to pass parameters along with the url to get the data. Spring MVC provides 
support for customizing the URL in order to get data. To achieving this purpose @PathVariable annotation is used in Spring mvc framework.

The key difference between @RequestParam and @PathVariable is that @RequestParam used for accessing the values of the query parameters where as 
@PathVariable used for accessing the values from the URI template.

@ResponceEntity vs @ResponceBody

@ResponseEntity will give you some added flexibility in defining arbitrary HTTP response headers. @ResponseBody is an annotation, indicates that 
the return value of a method will be serialized into the body of the HTTP response.

@Component vs @Repository vs Service

@Component serves as a generic stereotype for any Spring-managed component; whereas, @Repository, @Service, and @Controller serve as specializations 
of @Component for more specific use cases (e.g., in the persistence, service, and presentation layers, respectively).

7. One tool that can be used to implement robust batch applications in SpringBoot in Spring Batch.

8. Server side load balancing in Spring can be achieved through the use of Spring Cloud Load Balancer. It provides a simple round robin rule for 
load balancing between multiple instances of a single service. The goal here is to implement a rule, which measures each application response time 
and gives a weight according to that time.
