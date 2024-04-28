package com.avaaj.hostelmanagement.controller;


import com.avaaj.hostelmanagement.constants.Constants;
import com.avaaj.hostelmanagement.service.GoogleDriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.GeneralSecurityException;


@RestController
public class PassPortController {

    @Autowired
    GoogleDriveService service;


    @GetMapping("/")
    public  String sample() throws IOException, GeneralSecurityException{
        return service.getfiles();
    }

    @PostMapping("/passport-photo")
    @CrossOrigin(origins = "http://127.0.0.1:5173/")
    public  String uploadPassport(@RequestParam("photo") MultipartFile file) {
        return service.uploadPhoto(Constants.PassPort_Folder_Id,file);
    }
    @PostMapping("/aadhar")
    @CrossOrigin(origins = "http://127.0.0.1:5173/")
    public  String uploadAadhar(@RequestParam("aadhar") MultipartFile file) {
        return service.uploadPhoto(Constants.Aadhar_Folder_Id,file);
    }
}