Java Spring Boot REST API
This is a simple Java Spring Boot REST API that provides endpoints for managing students.

Getting Started
To get started with this project, follow these steps:

Clone this repository to your local machine.
Open the project in your favorite Java IDE.
Build the project by running mvn clean install in the terminal.
Start the application by running mvn spring-boot:run.
Open your web browser and navigate to http://localhost:8080 to see the app in action.
Endpoints
The following endpoints are available:

GET /student: Returns a single student with a hardcoded ID, first name, and last name.
GET /get-students: Returns a list of students with predefined IDs, first names, and last names.
GET /students/{id}/{first-name}/{last-name}: Returns a student with a dynamic ID, first name, and last name.
GET /students/query?id={id}&firstName={firstName}&lastName={lastName}: Returns a student with query parameters.
POST /students/create: Creates a new student with a JSON payload.
PUT /students/{id}/update: Updates an existing student with a JSON payload.
DELETE /students/{id}/delete: Deletes an existing student with a dynamic ID.
Building and Deploying
To build the app for production, run mvn clean install. This will create a JAR file with a production-ready version of the app.

To deploy the app, you can use a service like Heroku, AWS, or Google Cloud.

Contributing
If you'd like to contribute to this project, please fork the repository and make your changes in a new branch. Then, submit a pull request with a description of your changes.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact
If you have any questions or comments, please contact me at 
B.Bultongez@outlook.com or Github.

Acknowledgments
This project was created using the Spring Boot framework.