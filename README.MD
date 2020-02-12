# DemoConsoleApplication
This's a backend project with my first steps in spring boot, following the steps of the youtube video: 
> https://youtu.be/sLY9umEahso
 
## Contenido
### Step 1 Dependencies' injection 
 - Adding the first project dependencies
 - Adding services and repositories
 - Injection of dependency by annotations such as: @SpringBootService, @Service, @Repository, @Autowired, @Qualifer
 
 ### Step 2 Spring MVC
  - Adding controller class and work with annotations as: @Cotroller, @GetMapping, @RequestParam
  - Using the Thymeleaf dependency to develop HTML web pages. Create HTML page
  - Create DemoWebApplication and annotate it as: @SpringBootApplication to run the project

 ### Step 3 Spring Data JPA
  - Adding the dependencies for projecto of JPA
  - Additing the classes of the model. Annotation used in model classes: @Entity, @Id, @Column
  - Setting access to data at the file: application.properties
  - Work with JpaRepository
  - Implement `List people`
  
 ### Step 4 REST Services
  - Implement RestDemoController and annotate it as @RestController
  - Install <a href="https://www.postman.com/downloads/" target="_blank">**Postman**</a> 
  - Work with methods as GET and POST and JSON in Postman.
  - Work with Request
  
 ### Step 5 Spring Security
  - Add dependences to Spring Security in pom
  - Create the User class and annotate it as @Entity, add class attributes and annotate the identifier as @Id
  - Testing using SpringJUnit
  - Create class SecurityConfig and note it as @Configuration, to connect login credentials
     
## Installation
   - All the `code` required to get started. Clone: `https://github.com/grleyvaj/springboot_firststeps.git`
   - You will need to define the `JAVA_HOME` and `MAVEN_HOME` environment variables to deploy this project