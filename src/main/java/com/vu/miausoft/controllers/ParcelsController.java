package com.vu.miausoft.controllers;

import com.vu.miausoft.dto.ParcelDto;
import com.vu.miausoft.services.ParcelService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/parcels")
@AllArgsConstructor
public class ParcelsController {
    private final ParcelService parcelService;

    @GetMapping("/")
    public ResponseEntity<List<ParcelDto>> test() {
        return ResponseEntity.ok(parcelService.getParcels());
    }
}
