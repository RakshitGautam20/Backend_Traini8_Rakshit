
# Training Center API

This project is an API for managing government-funded training centers. It provides endpoints for creating and retrieving training centers with proper validations and data persistence using Spring Boot and MongoDB.



## Features

- Create Training Center: Adds a new training center with necessary validations
- Retrieve Training Centers: Fetches a list of all stored training centers.

- Validation Handling: Ensures data integrity with annotation-based validation.

- Exception Handling: Manages validation errors and incorrect inputs gracefully.


## Technologies Used
- Spring Boot

- Spring Data MongoDB

- Java 17

- MongoDB
## API Reference

#### Create Traning Centers(POST)

```
  POST /add
```
##### Request Body(JSON)

```
{
    "centerName": "Tech Skills Academy",
    "centerCode": "ABC123XY9Z45",
    "studentCapacity": 200,
    "coursesOffered": [
        "Java Programming",
        "Data Science",
        "Cybersecurity"
    ],
    "contactEmail": "infote@chskills.com",
    "contactPhone": "9876543310",
    "address": {
        "detailedAddress": "123 Main Street, Building 5",
        "city": "New York",
        "state": "NY",
        "pincode": "10001"
    }
}
  
```

#### Retrieve All Training Centers (GET)

```
  GET /findAll
```



## Steps to run the application

 - Clone the Repository
  
```
  git clone https://github.com/RakshitGautam20/Backend_Traini8_Rakshit.git
```
- Navigate to the project directory

```
  cd Backend_Traini8_Rakshit
```
- Built and run the application

```
  mvn spring-boot:run
```
- The API will be available at http://localhost:8080
## 🔗 Author
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/RakshitGautam20)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rakshit-gautam-6b635b21b/)


