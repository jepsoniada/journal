package com.demo.journal;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface WorkRecordRepository extends CrudRepository<WorkRecord, Integer> {
    @Query("SELECT * FROM journal")
    List<WorkRecord> fetchAll();

    @Modifying
    @Query("INSERT INTO journal (date_of_work, number_of_hours, description) VALUES (:date, :hours, :desc)")
    void putValue(@Param("date") LocalDate date, @Param("hours") Integer hours, @Param("desc") String desc);
}