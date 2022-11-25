# Restful Web Services with Spring Boot

Build a REST API for a Social Media
Application
 
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

Key Resources: 
Users
Posts
Key Details:
User: id, name, birthDate
Post: id, description

Return the correct response status
Resource is not found => 404 
Server exception => 500 
Validation error => 400

Important Response Statuses 200 — Success
201 — Created
204 — No Content
401 — Unauthorized (when authorization fails) 400 — Bad Request (such as validation error) 404 — Resource Not Found
500 — Server Error