O projeto lê uma planilha em CSV e salva no banco H2,
lista os piores filmes com menor e maior intervalo entre 
prêmios pelo endpoint disponível

Requisitos do sistema
JAVA JDK 17+
Maven

Dependencias utilizadas no pom.xml
H2
spring-boot-starter-data-jpa
spring-boot-starter-web
spring-boot-devtools

End point de acesso aos intervalos:
método GET
http://localhost:8080/filme/produtor/intervalo

