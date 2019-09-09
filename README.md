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
