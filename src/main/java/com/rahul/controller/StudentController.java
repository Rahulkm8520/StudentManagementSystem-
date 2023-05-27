package com.rahul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.rahul.entity.Student;
import com.rahul.service.Studentservice;

@Controller
public class StudentController {
	
	private Studentservice studentservice;

	public StudentController(Studentservice studentservice) {
		super();
		this.studentservice = studentservice;
		
	}
	//handler methods to handle list students and return model and view
	
	@GetMapping("/students")
	public String listStudent(Model model) {
		//display this list of student in a view students.html
		model.addAttribute("students" , studentservice.getAllStudent());
		return "students";//this view is created on html
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		//here we create student object to hold student form data 
		Student studentadd = new Student ();
		model.addAttribute("student" , studentadd);
		
		return"create_student";
	}
	
	@PostMapping("/students")
	//@ModelAttribute("student")) bind form data to the object to entity
	public String SaveStudent(@ModelAttribute("student") Student student) {
		
		//save the student in database
		//first we go in service create a save student methods
		studentservice.saveStudent(student);
		return "redirect:/students";
	}
	@GetMapping("students/edit/{id}")
	public String editstudentForm(@PathVariable Long id, Model model) {
	//for editing we create methods in student service
		model.addAttribute("student",studentservice.getStudentById(id));
		return "edit_student" ;
		
	}
	
	@PostMapping("/students/{id}")
	public String UpdateStudent(@PathVariable Long id ,
			@ModelAttribute("student") Student student,
			Model model) {
		//get student from ddatabase by id 
		Student existStudent = studentservice.getStudentById(id);
		existStudent.setId(id);
		existStudent.setFirstName(student.getFirstName());
		existStudent.setEmail(student.getEmail());
		existStudent.setLastName(student.getLastName());
		// save updated student object 
		studentservice.updateStudent(existStudent);
		
		return"redirect:/students";
		
	}
	//handler method to handle delete student request 
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id  ) {
		studentservice.deleteStudentById(id);
		return"redirect:/students";
	}

}
