# Restful Web Services with Spring Boot
 
Users REST API
+ Retrieve all Users
	GET /users
+ Create a User
	POST /users
+ Retrieve one User
	GET /users/{id} -> /users/1
+ Delete a User
	DELETE /users/{id} -> /users/1 

Posts REST API
+ Retrieve all posts for a User
	GET /users/{id}/posts
+ Create a post for a User
	POST /users/{id}/posts
+ Retrieve details of a post
	GET /users/{id}/posts/{post_id}