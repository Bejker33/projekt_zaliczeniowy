# ✨ Spring Boot Calculator Application

A simple **Spring Boot** web application providing:
- 🧮 Basic arithmetic operations (addition, subtraction, multiplication, division)
- 🏃‍♂️ Speed calculation (distance, time, speed)

---

## 📋 Features

✅ **Arithmetic Calculator**
- ➕ Addition  
- ➖ Subtraction  
- ✖️ Multiplication  
- ➗ Division (with handling division by zero)

✅ **Speed Calculator**
- Calculate:
  - 🏎️ Speed
  - 📏 Distance
  - ⏱️ Time

✅ **User Interface**
- Web interface built with **Thymeleaf**

✅ **Tests**
- Unit tests using **Spring MVC Test**

---

## 🗂️ Project Structure
src/
└── main/
└── java/
└── pl.merito.calculator.controller/
├── ArithmeticCalculatorController.java
├── SpeedCalculatorController.java
└── HomeController.java
└── resources/
└── templates/
├── calculator.html
├── speed_calculator.html
└── home.html
└── test/
└── java/
└── pl.merito.calculator.controller/
└── ArithmeticCalculatorControllerTest.java

---

## ⚙️ Technologies

- ☕ Java
- 🌱 Spring Boot
- 🌐 Spring MVC
- 📝 Thymeleaf
- 🧪 JUnit 5

---

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/Bejker33/projekt_zaliczeniowy.git
   cd projekt_zaliczeniowy

⚠️ Notes
Division by zero is handled gracefully – the user receives a clear error message.

Views use simple HTML forms with Thymeleaf templating.

Example humorous message in Polish appears if you try to divide by zero.

📄 License
This project is open source and available under the MIT License.

🙋 Author
Przemek Pyszczek

