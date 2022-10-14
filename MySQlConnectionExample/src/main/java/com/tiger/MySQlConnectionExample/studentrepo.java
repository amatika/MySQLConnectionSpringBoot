package com.tiger.MySQlConnectionExample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepo extends JpaRepository<student, Integer> 
{

}
