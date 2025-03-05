package org.isdb.first.service;

import java.util.List;

import org.isdb.first.model.Student;
import org.isdb.first.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private final StudentRepository repository;

	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}

	public Student saveStudent(Student student) {
		Student saved = repository.save(student);
		return saved;
	}

	public List<Student> getStudents() {

		return repository.findAll();
	}

}
