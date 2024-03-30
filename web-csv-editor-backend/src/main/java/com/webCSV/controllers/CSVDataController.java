package com.webCSV.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.webCSV.entities.CSVData;
import com.webCSV.services.CSVDataService;

import java.util.List;

@RestController
@RequestMapping("/api/csv")
public class CSVDataController {
    
    private final CSVDataService csvDataService;

    public CSVDataController(CSVDataService csvDataService) {
        this.csvDataService = csvDataService;
    }

    @PostMapping("/upload")
    public ResponseEntity<CSVData> uploadCsvData(@RequestParam("file") MultipartFile file) {
        CSVData savedCsvData = csvDataService.saveCsvData(file);
        return new ResponseEntity<>(savedCsvData, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<CSVData>> getAllCsvData() {
        List<CSVData> csvDataList = csvDataService.getAllCsvData();
        return new ResponseEntity<>(csvDataList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CSVData> getCsvDataById(@PathVariable Long id) {
        CSVData csvData = csvDataService.getCsvDataById(id);
        return new ResponseEntity<>(csvData, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CSVData> updateCsvData(@PathVariable Long id, @RequestBody String content) {
        CSVData updatedCsvData = csvDataService.updateCsvData(id, content);
        return new ResponseEntity<>(updatedCsvData, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCsvData(@PathVariable Long id) {
        csvDataService.deleteCsvData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/test")
    public String test(){
        return "Hello test";
    }
}