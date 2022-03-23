package com.vu.miausoft.services;

import com.vu.miausoft.dto.ParcelDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcelService {
    public List<ParcelDto> getParcels() {
        return List.of(new ParcelDto(1L), new ParcelDto(2L));
    }
}
