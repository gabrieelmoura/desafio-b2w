# API REST Star Wars

Projeto desenvolvido como solução a um desafio proposto pelo processo seletivo da B2W.

## Tecnologias Utilizadas
* Spring Boot
* Spring Data Mongodb
* Spring MVC
* JUnit
* Mongodb
* Heroku

## Endpoints
* **POST:** https://teste-b2w.herokuapp.com/world  
Cria um novo planeta no sistema 
  * Parâmetros (Body)   
  **string**: name - O nome do planeta  
  **string**: climate - O clima do planeta  
  **string**: terrain - O terreno do planeta  
  **int**: apparitionsInFilms - A quantidade de vezes que o planeta apareceu em filmes

* **GET:** https://teste-b2w.herokuapp.com/world  
Recupera a lista de planetas do sistema
  * Parâmetros (Query String)  
  **string**: name - Filtra os planetas por nome (opcional)
     
* **GET:** https://teste-b2w.herokuapp.com/world/{id}  
Recupera um unico planeta pelo seu ID

* **DELETE:** https://teste-b2w.herokuapp.com/world/{id}  
Remove do sistema o planeta com o ID especificado

