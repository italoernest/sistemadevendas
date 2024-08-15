<img src="https://landix.com.br/wp-content/uploads/2021/02/5.-Imagem-blogpost.png" alt="Sistemas de Vendas">

# Sistema de Vendas em Java

Este é um sistema de vendas desenvolvido em Java, que permite gerenciar estoque, realizar vendas, cadastrar produtos e clientes. O sistema foi projetado para ser simples e eficiente, facilitando o gerenciamento das operações de uma loja ou empresa.

## Funcionalidades

- **Gerenciamento de Estoque:** Controle de produtos em estoque, incluindo adição, remoção e atualização de quantidades.
- **Cadastro de Produtos:** Permite adicionar novos produtos com detalhes como nome, descrição, preço e quantidade em estoque.
- **Cadastro de Clientes:** Registro de clientes com informações como nome, endereço, e histórico de compras.
- **Gestão de Vendas:** Realização de vendas, geração de recibos e atualização automática do estoque.
- **Relatórios:** Geração de relatórios de vendas, clientes, e produtos em estoque.

## Estrutura do Projeto

O projeto está organizado em pacotes para melhor modularização e organização do código:

- `br.com.sistemadevendas.estoque`: Gerenciamento de estoque e produtos.
- `br.com.sistemadevendas.vendas`: Lógica de vendas e geração de recibos.
- `br.com.sistemadevendas.produtos`: Modelos e operações relacionadas aos produtos.
- `br.com.sistemadevendas.clientes`: Cadastro e gestão de clientes.

## Tecnologias Utilizadas

- **Java 17:** Linguagem de programação utilizada no desenvolvimento do sistema.
- **Maven:** Gerenciamento de dependências e automação de build.
- **MySQL:** Banco de dados relacional para armazenamento das informações de produtos, clientes e vendas.
- **JUnit:** Framework para testes unitários.
- **Git:** Controle de versão.
- **Eclipse:** IDE de Desenvolvimento.

## Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seuusuario/sistema-de-vendas-java.git
   cd sistema-de-vendas-java
