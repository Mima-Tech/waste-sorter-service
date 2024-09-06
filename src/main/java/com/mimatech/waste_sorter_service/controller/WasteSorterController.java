package com.mimatech.waste_sorter_service.controller;

import com.mimatech.waste_sorter_service.service.WasteSorterService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class WasteSorterController {

    @Resource
    WasteSorterService wasteSorterService;

    @PostMapping("/sort")
    public ResponseEntity<String> sortImage(@RequestParam("image") MultipartFile imageFile) {
        return ResponseEntity.ok(wasteSorterService.sortImage(imageFile));
    }
}
