*Estrutura do Projeto*


1. LojaRoupasApplication
Descrição: Classe principal que inicia a aplicação Spring Boot.
Método principal: main()
Como executar: Executar este arquivo para iniciar a aplicação.

2. Roupa
Descrição: Classe que representa uma peça de roupa.
Atributos:
nome: Nome da roupa.
tamanho: Tamanho da roupa.
quantidadeEmEstoque: Quantidade disponível em estoque.
preco: Preço da roupa.
foto: URL ou caminho para a foto da roupa.
Métodos: Getters e setters para todos os atributos.

3. RoupaRepository
Descrição: Classe que simula um repositório de dados para roupas.
Atributos:
roupas: Lista de roupas disponíveis.
Métodos:
listarRoupas(): Retorna a lista de todas as roupas.
cadastrarRoupa(roupa): Adiciona uma nova roupa à lista.
removerRoupa(nome): Remove uma roupa com o nome especificado da lista.

4. RoupaController
Descrição: Controlador Spring Boot para manipulação de requisições relacionadas a roupas.
Métodos:
listarRoupas(): Responde a requisições GET para listar todas as roupas.
cadastrarRoupa(roupa): Responde a requisições POST para cadastrar uma nova roupa.
removerRoupa(nome): Responde a requisições DELETE para remover uma roupa com base no nome.
Como Executar
Clone o repositório.
Abra o projeto em uma IDE compatível com Spring Boot (por exemplo, IntelliJ IDEA, Eclipse).
Execute a classe LojaRoupasApplication.
Endpoints da API

1. Listar Roupas
Método: GET
Endpoint: /api/roupas
Descrição: Retorna a lista de todas as roupas disponíveis na loja.

2. Cadastrar Roupa
Método: POST
Endpoint: /api/roupas
Descrição: Cadastra uma nova roupa na loja.
Corpo da Requisição: Objeto JSON contendo os detalhes da roupa.

3. Remover Roupa
Método: DELETE
Endpoint: /api/roupas
Descrição: Remove uma roupa com base no nome fornecido.
Parâmetro da Requisição: nome - Nome da roupa a ser removida.


*Sobre a Aplicação*
Esta aplicação é uma implementação simples de uma loja de roupas, fornecendo operações básicas de CRUD (Create, Read, Update, Delete) para gerenciar o estoque de roupas. Pode ser estendida e aprimorada para incluir mais recursos, como atualização de informações da roupa, busca por tamanho, entre outros.

*Tecnologias Utilizadas*

Java
Spring Boot
Spring Data (para o repositório)
RESTful API (para comunicação)
IDE recomendada: IntelliJ IDEA (ou qualquer IDE compatível com Spring Boot)


Autor

Nome: Pedro Giusepe Capelina
Contato: pgcapelina@minha.fag.edu.br
