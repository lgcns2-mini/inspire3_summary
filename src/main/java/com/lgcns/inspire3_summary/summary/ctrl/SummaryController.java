package com.lgcns.inspire3_summary.summary.ctrl;

import com.lgcns.inspire3_summary.summary.domain.dto.SummaryResponseDTO;
import com.lgcns.inspire3_summary.summary.service.SummaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/summary")
@RequiredArgsConstructor
public class SummaryController {

    private final SummaryService summaryService;

    @PostMapping
    public SummaryResponseDTO summarize(@RequestBody String text) {
        return summaryService.summarizeText(text);
    }
}