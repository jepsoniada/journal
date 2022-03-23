package com.demo.journal.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record WorkRecordDto(
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate dateOfWork,
    Integer numberOfHours,
    String description
) {}