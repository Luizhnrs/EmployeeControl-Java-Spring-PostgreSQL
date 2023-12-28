# EmployeeControl-Java-Spring-PostgreSQL

An employee control system built in Java with spring boot

Controle de Funcionários - Java Spring & PostgreSQL
Este projeto é uma aplicação full stack para o controle de funcionários, desenvolvida utilizando Java Spring para o backend, PostgreSQL como banco de dados e Angular 17 para o frontend.

Descrição
O Controle de Funcionários é uma aplicação web que permite gerenciar informações sobre funcionários, como cadastro, edição, exclusão e visualização de dados.

Funcionalidades Principais
Backend em Java Spring:
Utilização do Spring Framework para criar APIs RESTful.
Integração com o banco de dados PostgreSQL para armazenamento dos dados.

Frontend com Angular 17:
Interface de usuário interativa e responsiva.
Consumo dos endpoints da API para exibição e manipulação dos dados dos funcionários.

Tecnologias Utilizadas
Java Spring Framework:
Desenvolvimento do backend da aplicação.
Implementação de endpoints RESTful para a gestão de funcionários.

PostgreSQL:
Banco de dados utilizado para armazenamento persistente dos dados dos funcionários.

Angular 17:
Desenvolvimento do frontend da aplicação.
Consumo dos serviços fornecidos pela API REST do backend.

Configuração e Execução
Pré-requisitos
Java JDK
Node.js e npm (para o frontend)
PostgreSQL
Backend (Java Spring)

Clonar o Repositório:
git clone https://github.com/Luizhnrs/EmployeeControl-Java-Spring-PostgreSQL.git

Configuração do Banco de Dados:
Crie um banco de dados PostgreSQL.
Atualize as informações de conexão no arquivo application.properties.

Execução do Backend:
cd EmployeeControl-Java-Spring-PostgreSQL/backend
./mvnw spring-boot:run

Frontend (Angular)
Instalação das Dependências:
cd EmployeeControl-Java-Spring-PostgreSQL/frontend
npm install

Execução do Frontend:
Acesso à Aplicação:
Acesse a aplicação pelo navegador utilizando o link: http://localhost:4200.
