# Employee RestTemplate Client

A Spring Boot project that demonstrates how to consume Employee REST APIs using RestTemplate.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- RestTemplate
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## Features

- Add Employee
- Get All Employees
- Get Employee by ID
- Update Employee
- Delete Employee
- REST API communication using RestTemplate

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/employees` | Add employee |
| GET | `/employees` | Get all employees |
| GET | `/employees/{id}` | Get employee by ID |
| PUT | `/employees/{id}` | Update employee |
| DELETE | `/employees/{id}` | Delete employee |

## How to Run

1. Clone the repository.
2. Open the project in Eclipse or IntelliJ IDEA.
3. Configure MySQL in `application.properties`.
4. Run the Spring Boot application.
5. Test the APIs using Postman.

## Example Employee

```json
{
  "employeeName": "Subhra",
  "department": "IT",
  "salary": 50000,
  "designation": "Software Developer"
}
