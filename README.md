# Email-Service

Este repositório contém o código-fonte do backend de um serviço de e-mail desenvolvido em Java com o framework Spring, utilizando arquitetura limpa, o que permite a troca de sistemas de disparo de e-mails com mínimas mudanças no código. O AmazonSES foi utilizado como exemplo de serviço de envio de e-mails.

## Tecnologias Utilizadas

- Java
- Spring Framework (Spring Boot, Spring MVC, Spring Data)
- AmazonSES (Exemplo de serviço de envio de e-mails)
- Insomnia (Testador de API)

## Configuração do Ambiente

Para executar localmente, siga os seguintes passos:

### Requisitos

- Java Development Kit (JDK)
- Conta da Amazon AWS com acesso ao SES
- Insomnia (ou ferramenta similar para testar as APIs)

### Passos para Configuração

1. **Clonar o Repositório:**

   ```bash
   git clone https://github.com/seu-usuario/backend-email-service.git
   ```

2. **Configurar as Credenciais do AmazonSES:**

   - Obtenha as credenciais do AmazonSES (Access Key ID e Secret Access Key).
   - Configure as credenciais no arquivo `application.properties`.

3. **Executar o Backend:**

   - Utilize sua IDE preferida ou execute o projeto via linha de comando:

   ```bash
   ./mvnw spring-boot:run
   ```

4. **Testar as Rotas:**

   - Importe o arquivo de workspace do Insomnia que se encontra na pasta `insomnia/` para ter acesso às rotas e seus testes pré-configurados.

## Estrutura do Projeto

A estrutura do projeto segue uma arquitetura limpa, permitindo a fácil substituição do serviço de envio de e-mails. Está organizado da seguinte forma:

```
|-- src/
|   |-- main/
|   |   |-- java/
|   |   |   |-- com/
|   |   |   |   |-- example/
|   |   |   |   |   |-- backendemail/
|   |   |   |   |   |   |-- adapters/
|   |   |   |   |   |   |-- application/
|   |   |   |   |   |   |-- controllers/
|   |   |   |   |   |   |-- core/
|   |   |   |   |   |   |-- infrases/
|   |   |   |   |   |   |-- EmailServiceApplication.java
|   |-- resources/
|   |   |-- application.properties
|-- insomnia/
|   |-- backend_email_service_insomnia.json
|-- .gitignore
|-- README.md
|-- pom.xml
```

## Flexibilidade na Troca de Serviços de Email

O código foi desenvolvido seguindo os princípios da arquitetura limpa, o que possibilita a substituição do serviço de envio de e-mails com poucas mudanças no código-fonte. Para isso, basta implementar um novo adapter para o serviço desejado e fazer a injeção adequada nos casos de uso relevantes.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões para melhorias, sinta-se à vontade para abrir uma **issue** ou enviar um **pull request**.

## Licença

Este projeto está licenciado sob a licença [MIT](https://opensource.org/licenses/MIT) - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
