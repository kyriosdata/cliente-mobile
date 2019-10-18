# Projeto (_software design_) da solução 
O _design_ está dividido em projeto arquitetural e projeto detalhado. 

## Projeto arquitetural

![arquitetura](https://user-images.githubusercontent.com/1735792/65272064-cb591880-daf4-11e9-9e56-cb2dda143403.png)


#### Para analisar, ...

- Usar [Axon](https://axoniq.io/) como estratégia para todo o _backend_.
- Usar Spring Boot com RabbitMQ ou estratégia similar para sinalizar eventos? ([aqui](https://reflectoring.io/event-messaging-with-spring-boot-and-rabbitmq/)). Veja como a integração pode ser realizada [aqui](https://spring.io/blog/2019/10/15/simple-event-driven-microservices-with-spring-cloud-stream).

## Projeto detalhado do Serviço de Busca (SA)

- MongoDB para armazenar requisições.


