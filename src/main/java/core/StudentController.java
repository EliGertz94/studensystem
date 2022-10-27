package core;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    /// http local host:8080
    @GetMapping("/student") // without  this specification just localhost
    public Student getStudent(){
        return new Student("rumi","pdfjgfdi");
    }

    @GetMapping("/students") // without  this specification just localhost
    public List<Student> getStudents(){

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("eli","gerzman"));
        students.add(new Student("yana","gerzman"));
        students.add(new Student("avi","gerzman"));
        students.add(new Student("boris","gerzman"));


        return students;
    }

    /// http local host:8080/student/eli/gerzman
    @GetMapping("students/{firstName}/{lastName}")
    public Student studentsPath(@PathVariable("firstName") String firstName,
                                @PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }


    //build query according
    /// http local host:8080/student?firstName=ramesh&lastName=sdfds
    @GetMapping("/student/q")
    public Student getStudentByQuery(
            @RequestParam(name= "firstName") String firstName,
            @RequestParam(name= "lastName") String lastName){
        return new Student(firstName,lastName);
    }





















}
