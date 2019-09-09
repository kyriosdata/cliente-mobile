## Proposta inicial

Inclui um cliente mobile para coleta de dados e o backend correspondente, que deve receber requisições por dados e para a atualização deles. Um backend “paralelo” deve ser projetado com o propósito de receber eventos de atualização gerados pelo outro backend. Adicionalmente, cada evento recebido deve repercutir nos dados armazenados que, neste caso, o projeto visa atender demandas
administrativas.

## Primeira revisão 

- R1 Criar cliente mobile.
- R2 Criar _backend_ para interação com cliente. Cada requisição possivelmente gera um evento, e se for o caso, deve persisti-la antes de sinalizá-lo para o segundo _backend_.
- R3 Criar um segundo _backend_ que recebe eventos do outro _backend_. 
