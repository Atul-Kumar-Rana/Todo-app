# 📝 Todo-app

A simple web-based to-do list application built with **Spring Boot**, **Spring MVC**, **Spring Data JPA**, and **H2 Database**. This project allows users to manage personal tasks with features like adding, viewing, and listing todos using a clean MVC structure and persistent storage.

---

## 👨‍💻 Author

**Atul Kumar Rana**  
📧 atulrana.dev@gmail.com  
🌐 [LinkedIn](www.linkedin.com/in/atul-kumar-rana-87607228a)

---

## 🚀 Technologies Used

- Java 17+
- Spring Boot 3.5.0-RC1
- Spring MVC
- Spring Data JPA
- H2 In-Memory Database
- JSP for View Rendering

---

## 📂 Project Structure
```
Todo-app/
├── src/                                                                              
│ ├── main/
│ │ ├── java/
│ │ │ └── com/webapp/FirstWebApp/
│ │ │ ├── controller/ # Handles HTTP requests
│ │ │ ├── entity/ # Entity class (TodoContent.java)
│ │ │ ├── repository/ # JPA repository (TodoRepository.java)
│ │ │ └── FirstWebAppApplication.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── templates/ # JSP files
```

---

## 🔧 Configuration (`application.properties`)

```properties
spring.application.name=FirstWebApp
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
logging.level.org.springframework=debug
spring.mvc.formate.date=yyyy-MM-dd
spring.datasource.url=jdbc:h2:mem:testdb

```

#Getting Started
Step 1: Clone the Repository
```
git clone https://github.com/Atul-Kumar-Rana/Todo-app.git
cd Todo-app
```
Step 2: Open in Your IDE
Use IntelliJ, Eclipse, or Spring Tool Suite.

Step 3: Run the Application
```
./mvnw spring-boot:run
```

Or run FirstWebAppApplication.java from your IDE.

