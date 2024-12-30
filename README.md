Gmail Sender Project

This is a Spring Boot project integrated with Thymeleaf to send emails using Gmail's SMTP server. 
It demonstrates how to create a functional email-sending application with a simple and styled web interface.

Features

Send emails to any recipient using Gmail.

Customizable fields for:

Recipient email address

Subject

Message content

User-friendly interface with CSS styling.

Technology Stack

Backend:

Spring Boot

JavaMailSender API

Frontend:

Thymeleaf

HTML/CSS

Configuration:

Gmail SMTP Server

Setup Instructions

Clone the Repository:

git clone https://github.com/your-repo/gmail-sender.git
cd gmail-sender

Configure application.properties:
Update the following properties with your Gmail credentials:

spring.application.name=GmailSender
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-email-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.ssl.enable=false
spring.mail.properties.mail.smtp.ssl.trust=smtp.gmail.com

Note: If using 2-step verification, generate an app password for your Gmail account.


Run the Application: ./mvnw spring-boot:run
Access the Application:
Open your browser and navigate to:http://localhost:8080
