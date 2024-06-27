package com.example.demo.controller;

import com.example.demo.domain.OnboardingGuide;
import com.example.demo.service.OnBoardingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;

@RequiredArgsConstructor
@RestController
public class OnBoardingController {

    private final OnBoardingService onBoardingService;
    @GetMapping("/onboarding/guide/all")
    public Iterable<OnboardingGuide> onboardingGuide() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", StandardCharsets.UTF_8));
        Iterable<OnboardingGuide> onboardingGuides = onBoardingService.readAllGuide();
        //return new ResponseEntity<Iterable<OnboardingGuide>>(onboardingGuides, headers, HttpStatus.OK);
        return onboardingGuides;
    }

//    @PostMapping("/onboarding/question")
//    public ResponseEntity<?> onboardingQuestion() {
//
//    }
}
