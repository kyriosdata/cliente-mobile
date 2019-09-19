## Diagrama de contexto

Além de um App (mobile) o sistema de notícias inclui pelo menos dois componentes (serviços), conforme restrições de projeto, acessíveis externamente por um software administrativo, conforme ilustrado abaixo.

![Diagrama de contexto](https://user-images.githubusercontent.com/1735792/65262947-cb035200-dae1-11e9-95e8-436030ca221b.png)

## Modelagem de dados


![cliente-mobile](https://user-images.githubusercontent.com/1735792/65263882-d6f01380-dae3-11e9-9589-df242d921ab8.png)



## Mapa de diálogo

- Ao abrir aplicativo móvel é exibida _splash screen_, que é exibida na língua empregada pela última vez pelo aplicativo. 
- A _splash screen_ é automaticamente substituída pela tela inicial (Home). Esta tela lista os tópicos.
- Tela Home (lista de tópicos). 
- Usuário pode alternar para uma outra língua e a interface é alterada de acordo com a seleção feita.
- Usuário seleciona um tópico e a lista de notícias pertinentes é exibida. 
- Usuário seleciona uma notícia e o conteúdo correspondente é exibido. 
- Usuário pode alternar para uma outra língua.
- Usuário pode realizar busca por notícia e, neste caso, lista das notícias correspondentes é exibida. 
- Usuário pode optar por ir para a Home (lista de tópicos). 

