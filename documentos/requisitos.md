# Requisitos

#### Requisitos funcionais

- R1 Navegar por tópicos. Um tópico reúne várias notícias. Um tópico possui atributos como título, data e autor, dentre outros.

- R2 Navegar por notícias de um tópico. Uma notícia possui atributos como título, data e autor, além, naturalmente, do corpo propriamente dito da notícia. Esta navegação apenas permite conhecer o "destaque" ou "título" de uma notícia e não inclui o acesso a todo o conteúdo da notícia. 

- R3 Navegar pelo corpo da notícia. Cada notícia é texto com figuras. O usuário poderá ler todo o texto da notícia, assim como observar as possíveis figuras pertinentes. 

- R4 Buscar por notícia. Uma ou mais palavras, o que é denominado de requisição, devem ser empregadas para localizar notícias cujo texto as incluem, independente do tópico. Além de uma busca local, se houver acesso à internet, a requisição será enviada para servidor remoto, onde possivelmente notícias não consideradas na busca local poderão ser recuperadas.

- R5 Persistir requisição. Além das palavras que fazem parte da requisição devem ser armazenadas, para cada requisição, a identificação do "cliente" e a localização (se acesso ao GPS do dispositivo móvel for possível).

- R6 Enviar requisições. Consultas não enviadas para o servidor, em decorrência de ausência de acesso à internet, por exemplo, serão enviadas assim que houver disponibilidade de acesso. Neste caso, apenas o envio é submetido, sem que o resultado correspondente seja retornado. 

- R7 Análise de requisições. Atualiza dados que permitem identificar as palavras mais empregadas por local (país) de origem da requisição.

#### Restrições de projeto

- R8 A busca por notícias deverá ser implementada por serviço remoto (serviço de busca). 

- R9 O requisito R5 (Persistir requisição) deve ser implementado pelo Serviço de busca.

- R10 Ao persistir uma requisição o Serviço de busca deve sinalizar um evento correspondente para o Serviço de análise.

- R11 O requisito R7 (Análise de requisições) deve ser implementado pelo Serviço de análise, independentemente do Serviço de busca, possivelmente em execução em nó distinto de uma rede. 

- R12 O acesso ao Serviço de análise de dá por meio de evento sinalizado pelo Serviço de busca e por meio de RESTFul API (para acesso por serviço administrativo, além do escopo). 

#### Internacionalização e localização

- R13 Contemplar várias línguas (inicialmente inglês e português do Brasil). Quando uma língua é alternada, os textos correspondentes a menus e outros elementos gráficos exibidos são substituídos para refletir a língua selecionada além, naturalmente, do conteúdo propriamente dito das notícias e tópicos.

#### Interfaces de software

- R14 RESTFul API para acesso ao serviço de busca. Deve ser usado exclusivamente pelo dispositivo móvel.

- R15 RESTFul API para acesso ao serviço de análise. Esta API será empregada por serviço administrativo (além do escopo do presente projeto).

#### Modelagem de dados

- Cada tópico está associado a várias notícias.
- Cada notícia está associada a uma sequência de blocos.
- Cada bloco é um parágrafo de texto ou uma imagem.
- Tópico, notícia e bloco possuem o atributo língua. 
- Apenas há associação entre tópico, notícia e bloco se possuem o mesmo valor para língua. 

#### Mapa de diálogo

- Ao abrir aplicativo móvel é exibida _splash screen_, que é exibida na língua empregada pela última vez pelo aplicativo. 
- A _splash screen_ é automaticamente substituída pela tela inicial (Home). Esta tela lista os tópicos.
- Tela Home (lista de tópicos). 
- Usuário pode alternar para uma outra língua e a interface é alterada de acordo com a seleção feita.
- Usuário seleciona um tópico e a lista de notícias pertinentes é exibida. 
- Usuário seleciona uma notícia e o conteúdo correspondente é exibido. 
- Usuário pode alternar para uma outra língua.
- Usuário pode realizar busca por notícia e, neste caso, lista das notícias correspondentes é exibida. 
- Usuário pode optar por ir para a Home (lista de tópicos). 

