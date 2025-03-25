package org.isdb.first.service;

import java.util.List;

import org.isdb.first.dto.StudentDTO;
import org.isdb.first.model.Student;
import org.isdb.first.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private final StudentRepository repository;

	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}


    public Student saveStudent(StudentDTO studentDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveStudent'");
    }

    public Student getAllStudent(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStudent'");
    }

    public void deleteStudent(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }

    public Student updateStudent(Integer id, Student student) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateStudent'");
    }

}
