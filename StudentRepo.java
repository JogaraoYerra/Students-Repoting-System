package com.web.Repo;

import org.springframework.data.repository.CrudRepository;

import com.web.model.Student1;

public interface StudentRepo extends CrudRepository<Student1, Integer> {

}
