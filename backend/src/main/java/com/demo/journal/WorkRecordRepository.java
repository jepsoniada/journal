package com.demo.journal;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRecordRepository extends CrudRepository<WorkRecord, Integer> {
    @Query("SELECT * FROM journal")
    List<WorkRecord> fetchAll();
}