# 🥟 Baozi Store API

Projeto desenvolvido para a disciplina de Java, com o objetivo de criar uma API REST utilizando Spring Boot.

## 📌 Descrição

A Baozi Store é uma pequena loja fictícia que vende pão chinês (Baozi).  
O sistema permite o gerenciamento de:

- Clientes
- Produtos
- Pedidos

A API foi desenvolvida utilizando Spring Boot, JPA e MySQL.


## ⚙️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven


## 📂 Estrutura do Projeto

- **model** → Entidades (Cliente, Produto, Pedido)
- **repository** → Comunicação com o banco
- **controller** → Endpoints da API


## 🚀 Endpoints

### Cliente
- POST /clientes → Cadastrar cliente
- GET /clientes → Listar clientes
- GET /clientes/{id} → Buscar cliente por ID
- DELETE /clientes/{id} → Excluir cliente

### Produto
- POST /produtos → Cadastrar produto
- GET /produtos → Listar produtos

### Pedido
- POST /pedidos → Cadastrar pedido
- GET /pedidos → Listar pedidos




