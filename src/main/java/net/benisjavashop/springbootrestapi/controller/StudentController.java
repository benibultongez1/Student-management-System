package net.benisjavashop.springbootrestapi.controller;

import net.benisjavashop.springbootrestapi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("/student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student(
                1,
                "tom",
                "hanks"
        );
       // return new ResponseEntity<>(student, HttpStatus.OK);
        return ResponseEntity.ok()
        .header("custom-header","Tom")
        .body(student);
    }


   // http://localhost:8080/get-students
    @GetMapping("students")
    public ResponseEntity getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "alex", "Jones"));
        students.add(new Student(2, "Tim", "Tebow"));
        students.add(new Student(3, "Tom", "Cruz"));
        students.add(new Student(4, "Eli'ante", "Smith"));
        students.add(new Student(5, "Steve", "Wozniak"));
        return ResponseEntity.ok().header("student-body","\fg").body(students);

    }

    // spring boot REST API with Path variable
    // {id} - URL template variable
    // http://localhost:8080/students/1/Umesh/Tony
@GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                      @PathVariable("firstName")  String firstName,
                                      @PathVariable("lastName") String lastName){
        return new Student(1,"Umesh","Tony");
    }

    // Spring boot REST API with Request Param
    //http://localhost:8080/students/query?id=3&firstName=Tim&lastName=Tebow
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam("id") int id,
                                          @RequestParam("firstName") String firstName,
                                          @RequestParam("lastName") String lastName){
        return new Student(id, firstName, lastName);
    }

    // Spring boot REST API that handles HTTP Post request : create new resource
    // @PostMapping & @RequestBody
    //http://localhost:8080/students/create
    @PostMapping("students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    // Spring boot REST API that handles PUT request : updates existing resource
    //http://localhost:8080/student/1/update
    @PutMapping("students/{id}/update")
    public Student updateStudent(@RequestBody Student student , @PathVariable("id") int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    // Spring boot REST API that handles DELETE request : delete existing resource
    //http://localhost:8080/student/1/delete
    @DeleteMapping("students/{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return "student deleted successfully";
    }
}
