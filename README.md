# 🎟️ TicketUp -- Event and Venue Management API

A RESTful system developed with Spring Boot, designed to manage events and venues in a simple, clean, and professional way.


## 🚀 Technologies Used

- **Java 21**
- **Spring Boot 3.5.7**
- **Spring Web**
- **Springdoc OpenAPI (Swagger UI)**
- **Lombok**
- Layered Architecture (Controller, Service, Repository, DTO)
- Centralized Error Handling with GlobalExceptionHandler

## 📐 Project Architecture

The project is organized in layers to ensure a clear separation of responsibilities:

src/

└── main/java/com/riwi/ticketup/

├── controller/ → REST Endpoints

├── service/ → Business Logic

├── repository/ → Data Access

├── dto/ → Data Transfer

└── exceptions/ → Global Error Handler

## 📘 Available Endpoints

### 🔹 Events

Method Endpoint Description

-------- ---------------- --------------------------

GET `/events` List all events

GET `/events/{id}` Get event by ID

POST `/events` Create a new event

DELETE `/events/{id}` Delete event

### 🔹 Venues

Method Endpoint Description

-------- ---------------- ----------------------

GET `/venues` List venues

GET `/venues/{id}` Get venue by ID

POST `/venues` Create a venue

DELETE `/venues/{id}` Delete a venue

## 🧩 Global Error Handling

Includes a **GlobalExceptionHandler** that catches common errors and returns responses Consistent JSON.

## 🧪 Example of Request and Response

### ✔ Creating a Venue

**POST** `/venues`

#### Request:

``` json
{
"name": "Stadium X",
"capacity": 35000
}
```

#### Response:

``` json
{
"id": 1,
"name": "Stadium X",
"capacity": 35000
}
```

## 📚 Swagger Documentation

Available at:\
**http://localhost:8080/swagger-ui.html**

## ⚙️ Project Configuration

### Main Dependencies in `pom.xml`:

- Spring Web\
- Springdoc OpenAPI\
- DevTools\
- Lombok

mvn clean install

mvn spring-boot:run

## 🧑‍💻 Author

**Andrés Niebles**
