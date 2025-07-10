# MoneyTracker

## 📋 Descrição

MoneyTracker é uma aplicação web desenvolvida com Spring Boot para gerenciamento de finanças pessoais. Permite controlar
receitas, despesas e investimentos de forma simples e eficiente.

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Jakarta Persistence (JPA)
- Lombok
- Maven

## 🔧 Configuração do Projeto

### Pré-requisitos

- JDK 17 ou superior
- Maven 3.6 ou superior
- Uma IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Como executar

1. Clone o repositório:
```bash
git clone [https://github.com/gmbrax/MoneyTracker.git](https://github.com/gmbrax/MoneyTracker.git)

```

2. Entre no diretório do projeto:
```bash 
cd MoneyTracker

```
3. Execute o projeto com Maven:
```bash
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8950`

## 📚 API Endpoints
### Receitas
- GET `/api/receitas` - Lista todas as receitas
- GET `/api/receitas/{id}` - Busca uma receita específica por ID

## 🛠️ Em Desenvolvimento
- Gerenciamento de despesas
- Controle de investimentos
- Dashboard com resumo financeiro
- Relatórios personalizados
- Categorização de transações

## 📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

