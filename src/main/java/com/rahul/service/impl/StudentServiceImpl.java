package com.rahul.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rahul.entity.Student;
import com.rahul.repository.StudentRepository;
import com.rahul.service.Studentservice;

@Service
public class StudentServiceImpl implements Studentservice {

	//@Autowired here not required becouse here single constructor
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
		
	}
	
	

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	//implement List Students Feature



	@Override
	public Student saveStudent(Student student) {
			return studentRepository.save(student) ;
			
	}



	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}



	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}
	 
	
	
	

}
