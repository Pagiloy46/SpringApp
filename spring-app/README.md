# Spring Boot – Task 1

This is a simple Spring Boot application created for university practice.  
The goal of Task 1 was to create a Spring application with a controller, a view (Thymeleaf template), and static resources such as an image.

---

## Features

- Spring Boot project created using Spring Initializr
- Controller with two endpoints:
    - `/` – returns plain text using `@ResponseBody`
    - `/greeting` – returns HTML page rendered using Thymeleaf
- Passing data from controller to view using `Model`
- Image loaded from `static/images` directory and displayed on the page

---

## Technologies Used

| Technology | Purpose |
|----------|----------|
| Java | Main programming language |
| Spring Boot | Application framework |
| Spring Web | Enables controllers and HTTP endpoints |
| Thymeleaf | Template engine for HTML rendering |
| Maven | Dependency and project management |

---

## Project Structure

src/main/java/.../controller/MainController.java
src/main/resources/templates/greeting.html
src/main/resources/static/images/vistula.png


---

## Controller Example

```java
@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Hello Vistula! This is my first Spring controller.";
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "Yaroslav Zelinskyi");
        return "greeting";
    }
}

View (greeting.html)
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Greeting Page</title>
</head>
<body>

<h2>Hello,</h2>
<p>Hello, my name <span th:text="${name}"></span> and this is my first controller.</p>

<img src="/images/vistula.png" width="200">

</body>
</html>
How to Run the Project

Open the project in IntelliJ IDEA / any IDE

Run SpringAppApplication class

Open browser and check:

http://localhost:8080/
http://localhost:8080/greeting


You should see the greeting page with an image displayed.