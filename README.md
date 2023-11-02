# Implementation of a REST service, returning a value from the labseq sequence.

## Main technologies
- **Java 21**
- **Spring Boot 3.1.5**
- **Maven 3.8.5**
- **OpenAPI (Swagger)**

## Execution instructions

1. Run the backend:
```console
$ mvn spring-boot:run
```

2. Access the endpoint, specifying a non-negative integer n:
```console
http://localhost:8080/labseq/n
```

3. Documentation
```console
http://localhost:8080/swagger-ui/index.html
```
