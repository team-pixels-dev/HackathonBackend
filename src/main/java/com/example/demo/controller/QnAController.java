package com.example.demo.controller;

import com.example.demo.domain.QnA;
import com.example.demo.service.QnAService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class QnAController {

    private final QnAService qnAService;

    @PostMapping("/qna")
    public QnA oneQnAByQuestion(@RequestBody QnARequestDto dto) {
        return qnAService.readOneQnAByQuestion(dto.question);
    }

    @GetMapping("/qna/{id}")
    public QnA oneQnAById(@PathVariable Integer id) {
        return qnAService.readOneQnAById(id);
    }

    @GetMapping("/qna/all")
    public Iterable<QnA> allQnA() {
        return qnAService.readAll();
    }
}
