package com.example.demo.repository;

import com.example.demo.domain.QnA;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QnARepository extends CrudRepository<QnA, Integer> {
    @Query(value = "SELECT id FROM qna WHERE Question=?1")
    Integer findIdByQuestion(String question);
}
