package com.studentapp.services;

import com.studentapp.entities.Student;

public interface StudentService {

    Iterable<Student> listAllStudents();

    Student getStudentById(Integer id);

    Student saveStudent(Student student);

    void deleteStudent(Integer id);

}
