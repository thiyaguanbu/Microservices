# Microservices

Spring framework provides set of libraries for creating microservices in Java. They are a part of Spring Cloud project. To create simple microservices using Spring Boot and following technologies:

## Spring Cloud Config :
It provides server-side and client-side support for externalized configuration in a distributed system. With the Config Server, you have a central place to manage external properties for applications across all environments. The concepts on both client and server map identically to the Spring Environment and PropertySource abstractions, so they fit very well with Spring applications but can be used with any application running in any language. As an application moves through the deployment pipeline from dev to test and into production, you can manage the configuration between those environments and be certain that applications have everything they need to run when they migrate. The default implementation of the server storage backend uses git, so it easily supports labelled versions of configuration environments as well as being accessible to a wide range of tooling for managing the content. It is easy to add alternative implementations and plug them in with Spring configuration.

## Zuul
> gateway service that provides dynamic routing, monitoring, resiliency, security, and more
## Ribbon
> client side load balancer
## Feign 
> declarative REST client
## Eureka 
> service registration and discovery

## To run the project:

1. start the config server
2. start the discovery server
3. start all the other services in any order.


## REST API Endpoints
All inputs and outputs use JSON format.

