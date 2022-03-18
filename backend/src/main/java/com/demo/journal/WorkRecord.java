package com.demo.journal;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("journal")
public class WorkRecord {
    @Id
    private Long id;
    private LocalDate dateOfWork;
    private Integer numberOfHours;
    private String description;

    public WorkRecord(Long id, LocalDate dateOfWork, Integer numberOfHours, String description) {
        this.id = id;
        this.dateOfWork = dateOfWork;
        this.numberOfHours = numberOfHours;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDateOfWork() {
        return dateOfWork;
    }

    public Integer getNumberOfHours() {
        return numberOfHours;
    }

    public String getDescription() {
        return description;
    }
}
