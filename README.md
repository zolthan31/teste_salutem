
# Teste Salutem

- Este projeto consiste em um teste realizado para a empresa Salutem Inteligencia em Gestao de Saude

- Consiste na criação de API REST para consultas de Pessoas e Contatos, utilizando os verbos GET, POST, PUT e DELETE

- Tecnologias Utilizadas
* linguagem java 11
* Framework SpringBoot
* Banco de dados em memoria para testes H2
* Ide STS(Spring Tools Suit)
* Banco de dados Ralacional Postgres

- Não foi realizado o front-end em Angular

- Aplicação rodando no HEROKU link: https://teste-salutem.herokuapp.com/

## API Referencia/contatos

#### Get all contatos

```http
  GET  https://teste-salutem.herokuapp.com/contatos
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get contatos id

```http
  GET  https://teste-salutem.herokuapp.com/contatos/id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |


#### Post contatos 

```http
  POST  https://teste-salutem.herokuapp.com/contatos/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `api_key` | `string` | **Required**. Id of item to fetch |
| `nome`    | `string` | **Required**. Id of item to fetch |
| `telefone`| `string` | **Required**. Id of item to fetch |
| `email`   | `string` | **Required**. Id of item to fetch |

#### Put contatos 

```http
  PUT  https://teste-salutem.herokuapp.com/contatos/id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |
| `nome`    | `string` | **Required**. Id of item to fetch |
| `telefone`| `string` | **Required**. Id of item to fetch |
| `email`   | `string` | **Required**. Id of item to fetch |

#### Delete contatos 

```http
  DELETE  https://teste-salutem.herokuapp.com/contatos/id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |
| `nome`    | `string` | **Required**. Id of item to fetch |
| `telefone`| `string` | **Required**. Id of item to fetch |
| `email`   | `string` | **Required**. Id of item to fetch |

## API Referencia/pessoas

#### Get all pessoas

```http
  GET  https://teste-salutem.herokuapp.com/pessoas
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get contatos id

```http
  GET  https://teste-salutem.herokuapp.com/pessoas/id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |


#### Post contatos 

```http
  POST  https://teste-salutem.herokuapp.com/pessoas/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `api_key` | `string` | **Required**. Id of item to fetch |
| `nome`    | `string` | **Required**. Id of item to fetch |
| `cpf`     | `string` | **Required**. Id of item to fetch |
| `data`    | `string` | **Required**. Id of item to fetch |

#### Put contatos 

```http
  PUT  https://teste-salutem.herokuapp.com/pessoas/id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |
| `nome`    | `string` | **Required**. Id of item to fetch |
| `cpf`     | `string` | **Required**. Id of item to fetch |
| `data`   | `string` | **Required**. Id of item to fetch |

#### Delete contatos 

```http
  DELETE  https://teste-salutem.herokuapp.com/pessoas/id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |
| `nome`    | `string` | **Required**. Id of item to fetch |
| `cpf`     | `string` | **Required**. Id of item to fetch |
| `data`    | `string` | **Required**. Id of item to fetch |
