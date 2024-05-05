# Spring Boot REST API Project

This project is a Spring Boot REST API implementation for managing employees. It provides endpoints to perform various CRUD operations on employee data.

## Technologies Used

- **Spring Boot**: For creating the RESTful API and handling HTTP requests.
- **Spring Data JPA**: For interacting with the database.
- **MySQL**: As the database management system.
- **Swagger**: For API documentation.
- **PostMan** For run application
- **Lombok**: To reduce boilerplate code.

## API Endpoints

{{url}} = "localhost:9090/api"

### GET Requests:

1. **App Details**: `{{url}}/version`

   - Get the version details of the application.

2. **Read Employees**: `{{url}}/employees`

   - Get a list of all employees.

3. **Read Employee by ID**: `{{url}}/employees/{id}`

   - Get details of a specific employee by their ID.

4. **Read Employees by Name**: `{{url}}/employee/searchByName?name={name}`

   - Get employees by their name.

5. **Read Employee by Name and Location [RequestParam]**: `{{url}}/employee/searchByNameAndLocation?name={name}&location={location}`

   - Get employees by their name and location using request parameters.

6. **Read Employee by Name and Location [PathVariable]**: `{{url}}/employee/{name}/{location}`

   - Get employees by their name and location using path variables.

7. **Read Employee by Keyword**: `{{url}}/employee/searchByKeyword?keyword={keyword}`

   - Get employees by a keyword in their name or location.

8. **Read Employee by Age Greater Than [RequestParam]**: `{{url}}/employee/searchByAgeGreaterThan?age={age}`

   - Get employees whose age is greater than the specified value using a request parameter.

9. **Read Employee by Age Greater Than [PathVariable]**: `{{url}}/employee/{age}`

   - Get employees whose age is greater than the specified value using a path variable.

10. **Read Employee by Age Between FromAge to ToAge**: `{{url}}/employee/searchByAgeFromAndAgeTo?ageFrom={ageFrom}&ageTo={ageTo}`
    - Get employees whose age falls within the specified range.

### POST Request:

1. **Create Employee**: `{{url}}/employees`
   - Create a new employee.

### PUT Request:

1. **Update Employee**: `{{url}}/employees/{id}`
   - Update details of an existing employee.

### DELETE Request:

1. **Delete Employee**: `{{url}}/employees?id={id}`
   - Delete an employee by their ID.

# Screenshot:

[!Screenshot](/ss.png)

## Running the Application

To run the application:

1. Clone this repository to your local machine.
2. Configure your MySQL database details in the `application.properties` file.
3. Run the application using your IDE or by executing the `mvn spring-boot:run` command in the project directory.
4. Access the API endpoints using a tool like Postman or by directly hitting the URLs in your browser.
