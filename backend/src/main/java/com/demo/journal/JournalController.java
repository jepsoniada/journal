package com.demo.journal;

import com.demo.journal.dto.WorkRecordDto;
import com.demo.journal.dto.WorkRecordDtoResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/")
public class JournalController {
	private final WorkRecordRepository dbRepository;

	public JournalController(WorkRecordRepository dbRepository) {
		this.dbRepository = dbRepository;
	}

	@GetMapping("/getAll")
	public Iterable<WorkRecordDto> getAll() {
		return dbRepository.fetchAll().stream()
			.map(e -> new WorkRecordDto(
				e.dateOfWork(),
				e.numberOfHours(),
				e.description()
			))
			.collect(Collectors.toList());
	}

	@PostMapping("/setter")
	@ResponseStatus(HttpStatus.CREATED)
	public WorkRecordDtoResult addNewRecord(@RequestBody WorkRecordDto workRecordDto) {
		var record = new WorkRecord(
			null,
			workRecordDto.dateOfWork(),
			workRecordDto.numberOfHours(),
			workRecordDto.description()
		);
		dbRepository.save(record);
		return new WorkRecordDtoResult(record.id());
	}
}