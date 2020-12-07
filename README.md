# spring-microservices
 Repo for what I build in the "Master Microservices with Spring Boot and Spring Cloud" Udemy course.

 # RESTful Web Services
 (Video 13, 11/25/20)
 
 Social Media Application
 
 User -> Posts
 
 - Retrieve all Users     - GET     /users
 - Create a User          - POST    /users
 - Retrieve one User      - GET     /users/{id} -> /users/1
 - Delete a User          - DELETE  /users/{id} -> /users/1
 
 - Retrieve all posts for a User - GET /users/{id}/posts
 - Create a post for a User - POST /users/{id}/posts
 - Retrieve details of a post - GET /users/{id}/posts/{post_id}
 
 # Swagger
 
 Swagger automatically generates really great documentation for all HTTP requests/responses your 
 REST service can handle.
 
 Example URL: http://localhost:8080/swagger-ui/