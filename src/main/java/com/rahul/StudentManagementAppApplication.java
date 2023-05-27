package com.rahul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rahul.entity.Student;
import com.rahul.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementAppApplication.class, args);
	}
	
	//write logic to insert records
	//add records in the table 

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// create a entity class object 
		/*Student s1 = new Student();
		s1.setFirstName("Rahul");
		s1.setLastName("Maurya");
		s1.setEmail("Rahulmaurya8520@gmail.com");
		 
		studentRepository.save(s1);
		
		Student s2 = new Student();
		s2.setFirstName("Kamal");
		s2.setLastName("Maurya");
		s2.setEmail("Kamalmaurya8520@gmail.com");
		
		studentRepository.save(s2);
		
		Student s3 = new Student();
		s3.setFirstName("Raju");
		s3.setLastName("Maurya");
		s3.setEmail("Rajumaurya8520@gmail.com");
		
		studentRepository.save(s3);
		
		*/
	}

}
