# 🎓 Student & Course Management System

![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=flat-square&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=flat-square&logo=mysql)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=flat-square&logo=apachemaven)
![REST API](https://img.shields.io/badge/REST-API-blue?style=flat-square)

A Spring Boot REST API application for managing students and courses, built using a clean **6-layer architecture** and **DTO-based design** following industry best practices.

---

## 📌 Overview

This project demonstrates backend development using **Java 21**, **Spring Boot**, **Spring Data JPA**, and **MySQL**. It follows a structured architecture with clear separation between Controller, Service, Repository, DTO, and Entity layers.

The application provides complete **CRUD functionality** for managing students and courses through RESTful APIs — designed to reflect real-world, production-style project organisation.

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Core language |
| Spring Boot | Application framework |
| Spring Data JPA | Data access abstraction |
| Hibernate ORM | ORM & database mapping |
| MySQL | Relational database |
| Maven | Build & dependency management |
| Postman | API testing |

---

## 🏗️ Project Architecture

The application follows a **6-layer architecture**:

```
src/main/java/com/Akanksha/Student_management/
│
├── controller/        → Handles HTTP requests and API responses
├── service/           → Defines business operations (interfaces)
├── serviceImpl/       → Implements business logic
├── repository/        → Database operations using Spring Data JPA
├── dto/               → Data Transfer Objects (request/response)
└── entity/            → JPA entities mapped to database tables
```

This separation of concerns improves **maintainability**, **scalability**, and **testability**.

---

## 🚀 Features

### 👨‍🎓 Student Management
- ✅ Create a new student
- ✅ Retrieve student details by ID
- ✅ Update student information
- ✅ Delete student records

### 📚 Course Management
- ✅ Create a new course
- ✅ Retrieve course details by ID
- ✅ Update course information
- ✅ Delete course records

### 🔗 Relationship
- ✅ Many-to-Many Student–Course relationship with join table
- ✅ Enroll students into multiple courses via API
- ✅ DTO pattern to cleanly expose nested course data per student

### 🛡️ Exception Handling
- ✅ Global exception handler with custom error responses
- ✅ Meaningful error messages for invalid IDs

---

## 📡 API Endpoints

### Students

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/students` | Create a new student |
| `GET` | `/students` | Get all students |
| `GET` | `/students/{id}` | Get student by ID |
| `PUT` | `/students/{id}` | Update student |
| `DELETE` | `/students/{id}` | Delete student |

### Courses

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/courses` | Create a new course |
| `GET` | `/courses` | Get all courses |
| `GET` | `/courses/{id}` | Get course by ID |
| `PUT` | `/courses/{id}` | Update course |
| `DELETE` | `/courses/{id}` | Delete course |

---

## ⚙️ How to Run

### Prerequisites
- Java 21 installed
- MySQL running locally
- Maven installed

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/AKANKSHAchavhan/student-management-system.git

# 2. Navigate into the project
cd student-management-system

# 3. Configure MySQL in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

# 4. Build and run
mvn spring-boot:run
```

> API will be available at `http://localhost:8080`

Test all endpoints using **Postman** or any REST client.

---

## 🔮 Planned Enhancements

- [ ] Swagger / OpenAPI documentation
- [ ] Spring Security — JWT-based authentication & authorisation
- [ ] Unit testing (JUnit 5 + Mockito)
- [ ] Integration testing

---

## 👩‍💻 Author

**Akanksha Chavhan**
Java Full Stack Developer | Spring Boot · React · REST APIs

[![GitHub](https://img.shields.io/badge/GitHub-AKANKSHAchavhan-181717?style=flat-square&logo=github)](https://github.com/AKANKSHAchavhan)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-0077B5?style=flat-square&logo=linkedin)](https://www.linkedin.com/in/your-linkedin-id)

---

> ⭐ If you found this project useful, consider giving it a star!
