package com.demo.journal;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("journal")
record WorkRecord(
    @Id Long id,
    LocalDate dateOfWork,
    Integer numberOfHours,
    String description
) {}