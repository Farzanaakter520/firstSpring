package org.isdb.first.controller;

import java.util.List;

import org.isdb.first.model.Student;
import org.isdb.first.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Value("${custom.env}")
	private String env;

	@Autowired
	private final StudentService service;

	// contractor injection
	public StudentController(StudentService service) {
		this.service = service;
	}

	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		Student saveStudent = service.saveStudent(student);

		return saveStudent;

	}

	@GetMapping
	public List<Student> getStudents() {
		return service.getStudents();
	}

}
