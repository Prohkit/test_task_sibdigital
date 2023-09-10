package com.example.test_task_sibdigital.repository;

import com.example.test_task_sibdigital.model.SortedValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SortedValueRepository extends CrudRepository<SortedValue, Long> {
}
