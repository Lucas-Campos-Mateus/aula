<h1 align="center">
   Aula SpringBoot
</h1>


Aprendendo as camadas de uma API REST.

## Tecnologias
- Spring Boot
- Spring MVC
- Spring Data Jpa
- H2 Database

## Práticas adotadas
- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data Jpa
- Injeção de Dependências

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
Para executar a aplicação, siga as etapas abaixo:
1. Abra um terminal ou prompt de comando.
2. Navegue até o diretório onde o arquivo JAR está localizado. Use o comando `cd` para mudar de diretório.
3. Execute a aplicação usando o seguinte comando, substituindo `<caminho_para_seu_arquivo.jar>` pelo caminho real para o arquivo JAR:
```
#### java -jar <caminho_para_seu_arquivo.jar>

### Para salvar usuários, crie uma file com o nome "import.sql" no arquivo "resources" e dentro crie o script SQL:
```
INSERT INTO tb_user (name, password) values ('Maria', '124234');
``` 

## API Endpoints

### Para fazer a requisição HTTP abaixo, foi utilizada a ferramenta Insomnia, crie um Get e a API poderá ser acessada em http://localhost:8080/user/(ID desejado).
Primeiro quero informar que é uma aplicação simples apenas para aprendizado, e por isso criei apenas o método Get.


