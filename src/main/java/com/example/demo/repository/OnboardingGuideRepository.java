package com.example.demo.repository;

import com.example.demo.domain.OnboardingGuide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface OnboardingGuideRepository extends CrudRepository<OnboardingGuide, Integer> {

}
