# Spring Boot Application with AWS LocalStack

![coding](https://media.giphy.com/media/JqmupuTVZYaQX5s094/giphy.gif?cid=ecf05e47bc6g57tbezwvvlvss43q66pljh39vivcfgzsvzij&ep=v1_gifs_search&rid=giphy.gif&ct=g)

Esta é uma aplicação Spring Boot configurada para usar LocalStack para emular serviços AWS localmente com banco de dados
DynamoDB.

## Requisitos

- Java 21
- DynamoDB
- Postman (caso queria testar)

## Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/Maria-Eduarda-Rodrigues-Schwinn/crud-with-dynamo-db-and-java-21.git

2. Ambiente de desenvolvimento:
   ```bash
   export LOCALSTACK_AUTH_TOKEN="seu-token-aqui" 
   export AWS_ACCESS_KEY_ID="test"
   export AWS_SECRET_ACCESS_KEY="test"
   export AWS_DEFAULT_REGION="us-east-1"

3. Inicie o LocalStack:
   ```bash
   localstack start

4. Importe a coleção Postman dos endpoints:

   Navegue até `collection-test-endpoints/` e importe o arquivo
   `Crud with DynamoDb + spring java 21.postman_collection.json` no
   Postman ou Insomnia.

**Testando Endpoints**

- Use o Postman ou Insomnia para testar os endpoints definidos na coleção importada.

### Bora! ☕🚀