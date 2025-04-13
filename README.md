# Product Catalog Microservice

This microservice provides CRUD operations and search capabilities for managing a product catalog.

## Features:
- **/health**: Returns a simple health check message.
- **/products**: Returns a list of all products.
- **/products/search**: Allows searching products by name.
- **/products/advanced-search**: Allows searching products with advanced filters (category, minPrice, maxPrice).

## Endpoints:
- **GET /health**: Check if the service is up.
- **GET /products**: Retrieve all products.
- **GET /products/search?keyword=product_name**: Search for products by name.
- **GET /products/advanced-search?category=category_name&minPrice=price&maxPrice=price**: Advanced search by category and price range.

## How to Run Locally

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/spring-boot-crud-mysql-k8s-example02.git
    cd spring-boot-crud-mysql-k8s-example02
    ```

2. Build the application:
    ```bash
    mvn clean install
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Deployment to Kubernetes

1. Build Docker Image:
    ```bash
    docker build -t your-image-name .
    ```

2. Deploy to Kubernetes using `kubectl`:
    ```bash
    kubectl apply -f deployment.yaml
    ```

## CI/CD Pipeline

This repository uses **GitHub Actions** for CI/CD. The pipeline automates the following:
- Building and pushing Docker images to Docker Hub.
- Deploying to Kubernetes.
- Running integration tests after deployment.
