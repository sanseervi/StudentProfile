package com.studentapp.services;

import com.studentapp.entities.Student;
import com.studentapp.repositories.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service implement.
 */
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Iterable<Student> listAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findOne(id);
    }

    @Override
    public Student saveStudent(Student Student) {
        return studentRepository.save(Student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.delete(id);
    }

}
