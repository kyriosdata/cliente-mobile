# Projeto (_software design_) da solução 
O _design_ está dividido em projeto arquitetural e projeto detalhado. 

## Projeto arquitetural

A solução pressupõe: 

- Android app
- iOS app
- Serviço de busca
- Serviço de análise

FIGURA A SER CONSTRUÍDA: App (Android e iOS) comunica com serviço de busca (https) que, por sua vez, 
para cada requisição recebida, envia (evento correspondente) para o serviço de análise. O serviço de busca persiste 
as requisições. Serviço de análise atualiza tabelas úteis para consultas a serem recebidas via RESTFul API de outros 
serviços (fora do escopo do presente projeto).

#### Para analisar, ...

- Usar [Axon](https://axoniq.io/) como estratégia para todo o _backend_.
- Usar Spring Boot com RabbitMQ ou estratégia similar para sinalizar eventos? ([aqui](https://reflectoring.io/event-messaging-with-spring-boot-and-rabbitmq/))

## Projeto detalhado do Serviço de Busca (SA)

- MongoDB para armazenar requisições.


