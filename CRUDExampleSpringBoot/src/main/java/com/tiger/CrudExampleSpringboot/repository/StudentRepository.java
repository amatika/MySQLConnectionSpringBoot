package com.tiger.CrudExampleSpringboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiger.CrudExampleSpringboot.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> 
{
 
}