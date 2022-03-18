package com.demo.journal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class JournalController {
	private final WorkRecordRepository dbRepository;

	public JournalController(WorkRecordRepository dbRepository) {
		this.dbRepository = dbRepository;
	}

//	@GetMapping("/")
//	public PlaceHolder index() {
//		return new PlaceHolder(21, LocalDate.now(), "testing");
//	}

	@GetMapping("/getAll")
	public Iterable<WorkRecord> index() {
		return dbRepository.fetchAll();
	}
}