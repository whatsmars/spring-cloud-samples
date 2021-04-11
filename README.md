# Spring Cloud Samples
Spring Cloud 生态研究

### 演示
依次启动eureka,provider,consumer,gateway <br>
1. 直接访问 localhost:8763/hi?name=hongxi
1. 通过网关访问 localhost:8764/demo-consumer/hi?name=hongxi

依次启动eureka,config-server,config-client <br>

### Spring Cloud 实现方案
|               | Spring Cloud Netflix                    | Spring Cloud 官方                                            | Spring Cloud Alibaba | Spring Cloud Consul | Spring Cloud Kubernetes | Spring Cloud Zookeeper |
| ------------- | --------------------------------------- | ------------------------------------------------------------ | -------------------- | ------------------- | ----------------------- | ---------------------- |
| 分布式配置    | Archaius<br>(已不维护)                  | Spring Environment<br> (编程模型统一) <br> SCC Client/Server | Nacos                | Consul              | Config Map              | Zookeeper              |
| 服务注册/发现 | Eureka 1.x<br> Eureka 2.x<br>(已不维护) | Service Registry<br/> (编程模型统一)<br/> Service Discovery<br/> (编程模型统一) | Nacos                | Consul              | Api Server              | Zookeeper              |
| 服务熔断      | Hystrix<br>(已不维护)                   | Spring Cloud Circuit Breaker<br/> (编程模型统一)             | Sentinel             | -                   | -                       | -                      |
| 服务调用      | Feign                                   | OpenFeign<br>RestTemplate                                    | Dubbo RPC            | -                   | -                       | -                      |
| 服务路由      | Zuul                                    | Spring Cloud Gateway                                         | Dubbo+Servlet        | -                   | -                       | -                      |
| 分布式消息    | -                                       | Spring Cloud Stream<br/> (编程模型统一)<br/> SCS RabbitMQ/Kafka | SCS RocketMQ         | SCS Consul          | -                       | -                      |
| 消息总线      | -                                       | Spring Cloud Bus<br/> (编程模型统一)                         | SCB RocketMQ         | SCB Consul          | -                       | -                      |
| 负载均衡      | Ribbon<br>(已不维护)                    | Spring Cloud LoaderBalancer<br/> (编程模型统一)              | Dubbo LB             | -                   | -                       | -                      |
| 分布式事务    | -                                       | -                                                            | Seata                | -                   | -                       | -                      |

&copy; [hongxi.org](http://hongxi.org) | [cloud.hongxi.org](http://cloud.hongxi.org)
