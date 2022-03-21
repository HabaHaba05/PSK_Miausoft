package com.vu.miausoft.controllers;

import com.vu.miausoft.services.ParcelService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class TestContrl {
    private final ParcelService parcelService;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(parcelService.getParcels().stream().map(s -> s.getId().toString()).collect(Collectors.joining(",")));
    }
}
