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

4. Testing:
```console
$ mvn test -Dtest=LabseqApplicationTests
```

## Algorithm

The labseq – l(n) - sequence is defined as follows:

- n=0 => l(0) = 0
- n=1 => l(1) = 1
- n=2 => l(2) = 0
- n=3 => l(3) = 1
- n>3 => l(n) = l(n-4) + l(n-3)

Example of the first sequence values:
0
1
0
1
1
1
1
2
2
2
3
[…]
