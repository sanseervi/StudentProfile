package com.studentapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.studentapp.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
