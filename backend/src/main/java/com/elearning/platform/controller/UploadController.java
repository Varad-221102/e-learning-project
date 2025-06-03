package com.elearning.platform.controller;

import com.elearning.platform.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/upload")
public class UploadController {

    @Autowired
    private S3Service s3Service;

    @PostMapping
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            return s3Service.uploadFile(file);
        } catch (Exception e) {
            return "Upload failed: " + e.getMessage();
        }
    }
}
