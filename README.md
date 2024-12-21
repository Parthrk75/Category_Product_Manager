# Category and Product Management API

This project is a Spring Boot application that implements a CRUD API for managing **Categories** and **Products** with a one-to-many relationship. It uses JPA, Hibernate, and a relational database for persistence. The API also includes server-side pagination for improved data handling.

## Features

1. **Category Management**:
   - Create, Read, Update, and Delete categories.
   - Pagination support for listing categories.

2. **Product Management**:
   - Create, Read, Update, and Delete products.
   - Products are linked to categories (One-to-Many relationship).

3. **Relational Mapping**:
   - A category can have multiple products.
   - Products include details about their respective category in the API responses.

4. **Server-Side Pagination**:
   - Optimized data retrieval for large datasets.

5. **Postman Collection**:
   - A Postman collection has been created for easy testing of the APIs. The collection includes all endpoints with sample payloads.
   - https://hello4-6853.postman.co/workspace/hello-Workspace~72ac151c-2736-4e93-9823-40b66a270ada/collection/30485759-8215aa25-2053-4980-854a-27797efa169c?action=share&creator=30485759
     
## Technologies Used

- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **H2/MySQL/Other RDBMS**
- **Lombok** (for reducing boilerplate code)
- **Postman** (for API testing)

## Prerequisites

1. **Java Development Kit (JDK)** - Version 8 or later.
2. **Maven** - For dependency management and project build.
3. **Database** - Ensure a relational database is available and configured.
4. **Postman** - For testing the APIs.

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-repo-name.git
   cd your-repo-name
   ```

2. **Configure Database**:
   - Update the `application.properties` file with your database credentials.

   Example:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build and Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the APIs**:
   - The application will run on `http://localhost:8080` by default.
   - API endpoints are available under `/api/categories` and `/api/products`.

## API Endpoints

### Category Endpoints
1. **Get All Categories** (with Pagination):
   - `GET /api/categories?page=0&size=10`

2. **Create a Category**:
   - `POST /api/categories`
   - Sample Payload:
     ```json
     {
       "name": "Electronics"
     }
     ```

3. **Get Category by ID**:
   - `GET /api/categories/{id}`

4. **Update Category**:
   - `PUT /api/categories/{id}`
   - Sample Payload:
     ```json
     {
       "name": "Updated Electronics"
     }
     ```

5. **Delete Category**:
   - `DELETE /api/categories/{id}`

### Product Endpoints
1. **Get All Products** (with Pagination):
   - `GET /api/products?page=0&size=10`

2. **Create a Product**:
   - `POST /api/products`
   - Sample Payload:
     ```json
     {
       "name": "Smartphone",
       "price": 500.0,
       "quantity": 100,
       "description": "Latest model smartphone",
       "categoryId": 1
     }
     ```

3. **Get Product by ID**:
   - `GET /api/products/{id}`

4. **Update Product**:
   - `PUT /api/products/{id}`
   - Sample Payload:
     ```json
     {
       "name": "Updated Smartphone",
       "price": 450.0,
       "quantity": 50,
       "description": "Updated model smartphone",
       "categoryId": 1
     }
     ```

5. **Delete Product**:
   - `DELETE /api/products/{id}`

## Postman Collection

A Postman collection has been created with all endpoints and sample data for testing.
You can import the collection using this https://hello4-6853.postman.co/workspace/hello-Workspace~72ac151c-2736-4e93-9823-40b66a270ada/collection/30485759-8215aa25-2053-4980-854a-27797efa169c?action=share&creator=30485759
