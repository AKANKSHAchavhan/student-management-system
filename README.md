Student & Course Management System

A production-ready Spring Boot REST API application for managing Students and Courses, designed using a clean layered architecture and DTO-based approach following industry best practices.

 Overview

This project showcases backend development skills using Java 21 and Spring Boot. It demonstrates structured application design with clear separation of concerns across Controller, Service, Repository, DTO, and Entity layers.

The application provides full CRUD operations for managing students and courses using RESTful APIs.

 Tech Stack

Java 21

Spring Boot

Spring Data JPA

Hibernate ORM

MySQL Database

Maven

REST APIs

 Architecture

The application follows a layered architecture:

Controller Layer → Handles REST API requests and responses

Service Layer → Contains business logic

Service Implementation Layer → Implements service interfaces

Repository Layer → Handles database interactions using JPA

DTO Layer → Manages structured data transfer between layers

Entity Layer → Represents database models

This structure ensures scalability, maintainability, and clean code organization.

 Modules
 Student Module

Create Student

Retrieve Student Details

Update Student

Delete Student

 Course Module

Create Course

Retrieve Course Details

Update Course

Delete Course

 Key Highlights

RESTful API design principles

DTO pattern implementation

Clean and modular code structure

Separation of concerns

Maven-based dependency management

Production-style project structure

 How to Run

Clone the repository

Configure MySQL credentials in application.properties

Run StudentManagementProjectApplication.java

Test APIs using Postman

 Author

Akanksha Chavhan
Java Full Stack Developer
