package com.example.demo.service;

import com.example.demo.domain.OnboardingGuide;
import com.example.demo.repository.OnboardingGuideRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@RequiredArgsConstructor
@Service
public class OnBoardingService {
    private final OnboardingGuideRepository onboardingGuideRepository;
    @Transactional
    public Iterable<OnboardingGuide> readAllGuide() {
        return onboardingGuideRepository.findAll();
    }
}
