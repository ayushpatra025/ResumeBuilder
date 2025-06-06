📝 Resume Builder – Java Console App
A simple Java-based console application that helps users create customized resumes using pre-built templates. This lightweight app takes user input and generates a .txt resume file.

📁 Project Structure
css
Copy
Edit
ResumeBuilder/
├── src/
│   ├── Main.java
│   ├── Resume.java
│   ├── ResumeBuilder.java
│   ├── Template.java
│   ├── FileSaver.java
│   └── InputValidator.java
│
├── templates/
│   └── basic_template.txt
│
├── output/
│   └── resume_output.txt   ← Generated file will be saved here
│
└── README.md
🚀 How to Run
🧩 Prerequisites
Java JDK 8 or higher

Any text editor or IDE (e.g., VS Code, IntelliJ, Eclipse)

🔧 Steps
Clone or Download the project

Place the basic_template.txt inside the templates/ folder

Create an empty output/ folder in the project root

Open terminal and run:

bash
Copy
Edit
cd ResumeBuilder
javac src/*.java
java -cp src Main
Follow the prompts in the console

Your generated resume will be saved in:

bash
Copy
Edit
output/resume_output.txt
🧠 Features
Console-based resume builder

Input validation (email, phone number)

Uses a text template with placeholders like ${name}, ${email}, etc.

Saves output as .txt file

Fully written in Java (no external libraries)

