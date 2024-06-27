package com.example.demo.service;

import com.example.demo.domain.QnA;
import com.example.demo.repository.QnARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class QnAService {
    private final QnARepository qnARepository;
    public QnA readOneQnAById(Integer id) {
        return qnARepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 ID의 QnA가 없습니다. id=" + id));
    }

    public QnA readOneQnAByQuestion(String question) {
        Integer id = qnARepository.findIdByQuestion(question);
        return readOneQnAById(id);
    }

    public Iterable<QnA> readAll() {
        return qnARepository.findAll();
    }
}
