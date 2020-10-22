### Spring Cloud Stream

Recentemente com o rápido crescimento do cloud computing, surgiu o Serverless Computing, oferecendo-nos outra opção para construção das nossas aplicações.
Neste artigo vamos nos concentrar numa implementação básica com Spring cloud Function e depois implementá-la na AWS Lambda e API Gateway.

#### Serveless
Poderíamos dizer que se trata de um modelo de execução de aplicações em nuvem, no qual o fornecedor gera dinamicamente a criação e atribuição de recursos.
Os principais fornecedores com seus respectivos produtos, são: AWS Lambda, Azure function, Google cloud functions e etc.
Spring Cloud Function é um componente que nos permite criar aplicações sem servidor, desconhecerem o local aonde serão implantadas. Uma das principais vantagens dessa stack, é o nivel de transparência, ou seja, grande parte do esforço será voltado a lógica da aplicação.

### Implementação
Spring Cloud Function suporte 3 tipos de interfaces do java 8:
- Function: Aceita um input e retorna um response.
- Consumer: Aceita um input e não retorna nada.
- Supplier: não aceita input e retorna uma resposta.

## Exemplo de requisição:

```
function: localhost:8080/empresa POST
{
    "name": "Coca-cola"
}

consumer: localhost:8080/empresaConsumer POST
{
    "name": "Coca-cola"
}

supplier: localhost:8080/empresaSupplier GET 

```
