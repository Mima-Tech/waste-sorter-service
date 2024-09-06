package com.mimatech.waste_sorter_service.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class WasteSorterService {
    public String sortImage(MultipartFile imageFile) {
        return "Recycling";
    }
}
