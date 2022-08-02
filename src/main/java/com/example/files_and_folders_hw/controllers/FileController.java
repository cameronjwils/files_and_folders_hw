package com.example.files_and_folders_hw.controllers;

import com.example.files_and_folders_hw.models.File;
import com.example.files_and_folders_hw.models.Person;
import com.example.files_and_folders_hw.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

        @Autowired
        FileRepository fileRepository;

        @GetMapping(value = "/files")
        public ResponseEntity<List<File>> getAllFiles(){
            return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
        }

        @GetMapping(value = "/files/{id}")
        public ResponseEntity getPFile(@PathVariable Long id){
            return new ResponseEntity(fileRepository.findById(id), HttpStatus.OK);
        }

        @PostMapping(value = "/files")
        public ResponseEntity<File> postFile(@RequestBody File file){
            fileRepository.save(file);
            return new ResponseEntity<>(file, HttpStatus.CREATED);
        }
    }
