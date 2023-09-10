package com.example.test_task_sibdigital.repository;

import com.example.test_task_sibdigital.model.Result;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends CrudRepository<Result, Long> {
}
