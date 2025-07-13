# Product Catalog API

This project is a REST API for managing a product catalog and its categories. The application is built with Java, using Spring Boot and a MySQL database.

## Requirements

- **Java** 17 or higher
- **Maven** 3.6 or higher
- **MySQL**

## Initial Setup

1. Clone the Repository:

   ```bash
   git clone https://github.com/your-username/product-catalog-api.git
   cd product-catalog-api
   ```

2. Set Up the Database:

   - Create a database in MySQL called `productcatalog`.
   - Update the connection details in the `application.properties` file with your MySQL credentials:

   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/productcatalog
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```

3. Run the Application:

```bash
   mvn spring-boot:run
```

## API Documentation

### Products

- **Get All Products**

  - **Endpoint**: `/products`
  - **Method**: `GET`
  - **Description**: Retrieves a list of all products.
  - **Response Codes**: `200 OK` for data, `204 No Content` if empty.

- **Get Product by ID**

  - **Endpoint**: `/products/{id}`
  - **Method**: `GET`
  - **Description**: Retrieves a specific product by ID.
  - **Parameters**: `id` (path) - Product ID
  - **Response Codes**: `200 OK` for product, `404 Not Found` if ID is missing.

- **Search Products by Name**

  - **Endpoint**: `/products/search`
  - **Method**: `GET`
  - **Description**: Searches for products by name.
  - **Parameters**: `name` (query) - Name to search
  - **Response Codes**: `200 OK` for results, `204 No Content` if none.

- **Get Products by Category**

  - **Endpoint**: `/products/category/{categoryId}`
  - **Method**: `GET`
  - **Description**: Retrieves products within a category.
  - **Parameters**: `categoryId` (path) - Category ID
  - **Response Codes**: `200 OK` for products, `204 No Content` if empty.

- **Create a Product**

  - **Endpoint**: `/products`
  - **Method**: `POST`
  - **Description**: Creates a new product.
  - **Request Body**:
    ```bash
    {
        "name": "Product Name",
        "description": "Product description",
        "price": 100.00,
        "stock": 10,
        "category": { "id": 1 }
    }
    ```
  - **Response Codes**: `201 Created` for success, `400 Bad Request` if category not found.

- **Update a Product**

  - **Endpoint**: `/products/{id}`
  - **Method**: `PUT`
  - **Description**: Updates an existing product.
  - **Parameters**: `id` (path) - Product ID
  - **Request Body**:

  ```bash
    {
    "name": "Updated Name",
    "description": "Updated description",
    "price": 120.00,
    "stock": 20,
    "category": { "id": 2 }
    }
  ```

  - **Response Codes**: `200 OK` for success, `404 Not Found` if ID missing.

- **Delete a Product**
  - **Endpoint**: `/products/{id}`
  - **Method**: `DELETE`
  - **Description**: Deletes a specific product.
  - **Parameters**: `id` (path) - Product ID
  - **Response Codes**: `204 No Content` for success, `404 Not Found` if ID missing.

---

### Categories

- **Get All Categories**

  - **Endpoint**: `/categories`
  - **Method**: `GET`
  - **Description**: Retrieves all categories.
  - **Response Codes**: `200 OK` for data, `204 No Content` if empty.

- **Get Category by ID**

  - **Endpoint**: `/categories/{id}`
  - **Method**: `GET`
  - **Description**: Retrieves a category by ID.
  - **Parameters**: `id` (path) - Category ID
  - **Response Codes**: `200 OK` for category, `404 Not Found` if ID missing.

- **Create a Category**

  - **Endpoint**: `/categories`
  - **Method**: `POST`
  - **Description**: Creates a new category.
  - **Request Body**:

  ```bash
    {
    "name": "Category Name",
    "description": "Category description"
    }
  ```

  - **Response Codes**: `201 Created` for success.

- **Update a Category**

  - **Endpoint**: `/categories/{id}`
  - **Method**: `PUT`
  - **Description**: Updates an existing category.
  - **Parameters**: `id` (path) - Category ID
  - **Request Body**:

  ```bash
    {
    "name": "Updated Name",
    "description": "Updated description"
    }
  ```

  - **Response Codes**: `200 OK` for success, `404 Not Found` if ID missing.

- **Delete a Category**
  - **Endpoint**: `/categories/{id}`
  - **Method**: `DELETE`
  - **Description**: Deletes a specific category.
  - **Parameters**: `id` (path) - Category ID
  - **Response Codes**: `204 No Content` for success, `404 Not Found` if ID missing.

---

## Postman Collection

A [Postman collection](postman_collection.json) with all the endpoints is included for easy testing. Import it into Postman to quickly test the API.

---
