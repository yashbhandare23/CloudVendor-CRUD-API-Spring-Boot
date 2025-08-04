
```markdown
# 🌩️ CloudVendor CRUD API – Spring Boot

A basic **Spring Boot REST API** demonstrating **CRUD operations** (Create, Read, Update, Delete) on a `CloudVendor` entity using in-memory storage.

## 🚀 Technologies Used

- Java
- Spring Boot
- REST API
- Postman (for testing)

## 📦 Project Structure

```

src/
├── controller/
│   └── CloudVendorAPIService.java
├── model/
│   └── CloudVendor.java
└── RestDemoApplication.java

```

## 🧾 API Endpoints

| Method | Endpoint             | Description                |
|--------|----------------------|----------------------------|
| POST   | `/cloudvendor`       | Create a Cloud Vendor      |
| GET    | `/cloudvendor/{id}`  | Retrieve Cloud Vendor info |
| PUT    | `/cloudvendor`       | Update Cloud Vendor info   |
| DELETE | `/cloudvendor/{id}`  | Delete Cloud Vendor        |

---

## 📷 Screenshots

> Make sure to upload your screenshots in a folder named `screenshots/` in the root directory of your repository.

### ✅ POST Request – Create Cloud Vendor  
<img width="1375" height="864" alt="image" src="https://github.com/user-attachments/assets/aeb2d874-8477-46d2-bf9f-566d4aed3833" />


### 📥 GET Request – Retrieve Cloud Vendor  
<img width="1370" height="859" alt="image" src="https://github.com/user-attachments/assets/ae419570-a9bf-4911-8acc-9db1c0b00322" />


### 🔁 PUT Request – Update Cloud Vendor  
<img width="1367" height="867" alt="image" src="https://github.com/user-attachments/assets/e134f3a5-d00a-41d8-bc65-b7c15c5769e4" />


### ❌ DELETE Request – Remove Cloud Vendor  
<img width="1361" height="859" alt="image" src="https://github.com/user-attachments/assets/d06e1796-fd7d-4239-9138-b02acda48149" />


---

## 📌 Notes

- This demo uses **in-memory storage**, so data is not persistent.
- Extend this by adding a **repository layer** and **database integration** (e.g., H2, MySQL).

---

## 🧑‍💻 Author

**Yash Bhandare**  
📍 Navi Mumbai, India

---
```
