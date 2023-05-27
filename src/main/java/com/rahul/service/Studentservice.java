package com.rahul.service;

import java.util.List;

import com.rahul.entity.Student;

public interface Studentservice {

	// for List of students 
	List<Student>getAllStudent();
	//create method for saving the student data then go impl  implements  feature 
	Student saveStudent(Student student);
	//create methods for update the student details
	Student updateStudent(Student student);
    
	//create a methods for check id is present or not 
	Student getStudentById(long id);
	
	void deleteStudentById(Long id);
	
  // then go impl class and implemets all methods
	
}
 