## Proposta inicial

Inclui um cliente mobile para coleta de dados e o backend correspondente, que deve receber requisições por dados e para a atualização deles. Um backend “paralelo” deve ser projetado com o propósito de receber eventos de atualização gerados pelo outro backend. Adicionalmente, cada evento recebido deve repercutir nos dados armazenados que, neste caso, o projeto visa atender demandas
administrativas.

## Primeira revisão 

- R1 Criar cliente mobile.
- R2 Criar _backend_ para interação com cliente. Cada requisição possivelmente gera um evento, e se for o caso, deve persisti-la antes de sinalizá-lo para o segundo _backend_.
- R3 Criar um segundo _backend_ que recebe eventos do outro _backend_. 

#### Encaminhamento
> Ainda não está claro para mim. Requisitos devem ser identificados e refinados. É preciso analisar o que é esperado do software. Depois eu > inicio o _design_. 

## Segunda revisão

- R1 Cliente mobile que exibe notícias, organizadas por tópicos. Uma notícia é uma sequência de parágrafos, onde cada parágrafo é texto ou uma imagem. Pode-se pesquisar por notícias (palavra presente no texto). As buscas retornam notícias já disponíveis no dispositivo ou são resultantes da consulta enviada para o _backend_. 

- R2 Retornar notícias por palavras (_backend_). Recebe requisições por notícias contendo as palavras recebidas e as retorna. Todas as requisições recebidas são armazenadas. Todas as requisições recebidas são enviadas para análise.

- R3 Análise de requisições (_backend_). Responsável por analisar uma requisição. A requisição de busca por notícia inclui, além das palavras a serem localizadas, a ordem em que foram fornecidas e, naturalmente, uma localização de origem. Esta análise deverá listar as palavras mais consultadas por localização (país).

#### Encaminhamento

> Ainda não temos requisitos, mas "desejos", contudo, mais claros que na revisão anterior. É preciso um pouco de análise para investigar melhor.

## Terceira revisão
Identificadores únicos dos "supostos" requisitos agora não possuem relação com os anteriores. Adicionalmente, agora os "supostos" requisitos estão classificados em requisitos funcionais e restrições de projeto.

#### Requisitos funcionais

- R1 Navegar por tópicos. Um tópico reúne várias notícias. Cada notícia é texto com figuras. Tópico e notícia possuem atributos que os classificam como título, data e autor, dentre outros.
- R2 Buscar por notícia. Uma ou mais palavras devem ser empregadas para localizar notícias cujo texto as incluem, independente do tópico. Se há acesso à internet, então busca é enviada para servidor, onde possivelmente outras notícias podem ser recuperadas. Caso contrário, a consulta será salva para envio posterior.
- R3 Navegar por notícia. O usuário poderá ler todo o texto da notícia, assim como observar as possíveis figuras pertinentes. 
- R4 Enviar consultas. Consultas não enviadas para o servidor serão enviadas assim que houver disponibilidade de acesso à internet. Neste caso, apenas o envio é submetido, sem que o resultado correspondente seja retornado. 

#### Restrições de projeto

- R5 Localizar notícias por palavras (serviço de busca). Recebe requisições de busca por notícias. Cada requisição é uma sequência de uma ou mais palavras. Cada requisição deve ser persistida, juntamente com detalhes do "cliente" que faz a requisição, inclusive a localização. As notícias disponíveis e pertinentes à requisição são retornadas e a requisição é sinalizada para outro serviço. 

- R6 Analisar requisições (serviço de análise). Recebe eventos sinalizados pelo serviço de busca. Para cada evento recebido é realizada a atualização dos dados indicando, por local, as palavras mais empregadas. 

## Quarta revisão

#### Requisitos funcionais

- R1 Navegar por tópicos. Um tópico reúne várias notícias. Um tópico possui atributos como título, data e autor, dentre outros.

- R2 Navegar por destaques (títulos) das notícias de um tópico. Uma notícia, à semelhança de um tópico, também possui atributos como título, data e autor, além, naturalmente, do corpo propriamente dito da notícia.

- R3 Navegar por notícia. Cada notícia é texto com figuras. O usuário poderá ler todo o texto da notícia, assim como observar as possíveis figuras pertinentes. 

- R4 Buscar por notícia. Uma ou mais palavras, o que é denominado de requisição, devem ser empregadas para localizar notícias cujo texto as incluem, independente do tópico. Se há acesso à internet, então busca é enviada para servidor, onde possivelmente outras notícias podem ser recuperadas. 

- R5 Persistir requisição. Além das palavras que fazem parte da requisição devem ser armazenados, para cada requisição, a identificação do "cliente" e a localização (se possível).

- R6 Enviar consultas. Consultas não enviadas para o servidor, em decorrência de ausência de acesso à internet, por exemplo, serão enviadas assim que houver disponibilidade de acesso. Neste caso, apenas o envio é submetido, sem que o resultado correspondente seja retornado. 

- R7 Análise de requisições. Atualiza dados que permitem identificar as palavras mais empregadas por local (país) de origem da requisição.

#### Restrições de projeto

- R8 A busca por notícias deverá ser implementada por serviço próprio (serviço de busca). 

- R9 O requisito R5 (Persistir requisição) deve ser implementado pelo Serviço de busca.

- R10 Ao persistir uma requisição o Serviço de busca deve sinalizar um evento correspondente para o Serviço de análise.

- R11 O requisito R7 (Análise de requisições) deve ser implementado pelo Serviço de análise, independentemente do Serviço de busca, possivelmente em execução em nó distinto de uma rede. 

#### Internacionalização e localização

- R8 O cliente pode fazer uso de várias línguas. Quando uma língua é alternada, os textos correspondentes a menus e outros elementos gráficos exibidos são trocados, além do conteúdo das notícias propriamente ditas. 

#### Interfaces de software

- R9 RESTFul API para acesso ao serviço de busca. 

- R10 RESTFul API para acesso ao serviço de análise. 

## Quinta revisão

#### Requisitos funcionais

- R1 Navegar por tópicos. Um tópico reúne várias notícias. Um tópico possui atributos como título, data e autor, dentre outros.

- R2 Navegar por notícias de um tópico. Uma notícia, à semelhança de um tópico, também possui atributos como título, data e autor, além, naturalmente, do corpo propriamente dito da notícia. Esta navegação apenas permite conhecer o "destaque" ou "título" de uma notícia e não inclui o acesso a todo o conteúdo da notícia. 

- R3 Navegar por notícia. Cada notícia é texto com figuras. O usuário poderá ler todo o texto da notícia, assim como observar as possíveis figuras pertinentes. 

- R4 Buscar por notícia. Uma ou mais palavras, o que é denominado de requisição, devem ser empregadas para localizar notícias cujo texto as incluem, independente do tópico. Além de uma busca local, se houver acesso à internet, a requisição será enviada para servidor remoto, onde possivelmente notícias não consideradas na busca local poderão ser recuperadas.

- R5 Persistir requisição. Além das palavras que fazem parte da requisição devem ser armazenadas, para cada requisição, a identificação do "cliente" e a localização (se acesso ao GPS do dispositivo móvel for possível).

- R6 Enviar consultas. Consultas não enviadas para o servidor, em decorrência de ausência de acesso à internet, por exemplo, serão enviadas assim que houver disponibilidade de acesso. Neste caso, apenas o envio é submetido, sem que o resultado correspondente seja retornado. 

- R7 Análise de requisições. Atualiza dados que permitem identificar as palavras mais empregadas por local (país) de origem da requisição.

#### Restrições de projeto

- R8 A busca por notícias deverá ser implementada por serviço próprio (serviço de busca). 

- R9 O requisito R5 (Persistir requisição) deve ser implementado pelo Serviço de busca.

- R10 Ao persistir uma requisição o Serviço de busca deve sinalizar um evento correspondente para o Serviço de análise.

- R11 O requisito R7 (Análise de requisições) deve ser implementado pelo Serviço de análise, independentemente do Serviço de busca, possivelmente em execução em nó distinto de uma rede. 

#### Internacionalização e localização

- R8 O cliente pode fazer uso de várias línguas. Quando uma língua é alternada, os textos correspondentes a menus e outros elementos gráficos exibidos são trocados, além do conteúdo das notícias propriamente ditas. 

#### Interfaces de software

- R9 RESTFul API para acesso ao serviço de busca. 

- R10 RESTFul API para acesso ao serviço de análise. 
