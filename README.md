# CloudVendor CRUD API - Spring Boot

This is a basic Spring Boot project that implements CRUD operations for managing a Cloud Vendor using REST APIs. It uses an in-memory object for simplicity, without any database connection.

## Technologies Used

* Java
* Spring Boot
* REST API
* Postman (for testing)

## Project Structure

```
src/
├── controller/
│   └── CloudVendorAPIService.java
├── model/
│   └── CloudVendor.java
└── RestDemoApplication.java
```

## API Endpoints

| Method | Endpoint          | Description             |
| ------ | ----------------- | ----------------------- |
| POST   | /cloudvendor      | Create a Cloud Vendor   |
| GET    | /cloudvendor/{id} | Get details of a vendor |
| PUT    | /cloudvendor      | Update a Cloud Vendor   |
| DELETE | /cloudvendor/{id} | Delete a Cloud Vendor   |

## Screenshots

(You can refer to the below screenshots showing how each API works)

* POST Request – Create Cloud Vendor
<img width="1355" height="868" alt="image" src="https://github.com/user-attachments/assets/ff079af4-4aae-412c-8f84-6ab5d89266f6" />


* GET Request – Retrieve Cloud Vendor
<img width="1381" height="870" alt="image" src="https://github.com/user-attachments/assets/390aaace-474c-4689-86b5-d906e8278624" />


* PUT Request – Update Cloud Vendor
<img width="1373" height="881" alt="image" src="https://github.com/user-attachments/assets/16530d45-e409-400b-b010-f3cec497023a" />


* DELETE Request – Delete Cloud Vendor
<img width="1381" height="874" alt="image" src="https://github.com/user-attachments/assets/c55cc1cd-0eb4-4a71-b92c-8941283a4dc2" />


## Notes

* This project uses in-memory storage. Data will be lost when the server restarts.
* You can extend it by adding a database and repository layer using Spring Data JPA.


---

Let me know if you want me to make it shorter or include setup instructions like `mvn clean install` and `java -jar`.
