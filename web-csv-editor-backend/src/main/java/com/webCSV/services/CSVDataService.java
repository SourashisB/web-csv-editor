package com.webCSV.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.List;
import com.webCSV.repositories.CSVDataRepository;
import com.webCSV.entities.CSVData;

import jakarta.transaction.Transactional;

@Service
public class CSVDataService {
    
    private final CSVDataRepository csvDataRepository;

    public CSVDataService(CSVDataRepository csvDataRepository){
        this.csvDataRepository = csvDataRepository;
    }

    @Transactional
    public CSVData saveCsvData(MultipartFile file) {
        String content = parseCsvFileToString(file);
        CSVData csvData = new CSVData();
        csvData.setContent(content);
        csvData.setFilename(file.getOriginalFilename());
        return csvDataRepository.save(csvData);
    }

    public CSVData getCsvDataById(Long id) {
        return csvDataRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("CSV data not found with id: " + id));
    }

    @Transactional
    public CSVData updateCsvData(Long id, String content) {
        CSVData csvData = getCsvDataById(id);
        csvData.setContent(content);
        return csvDataRepository.save(csvData);
    }

    @Transactional
    public void deleteCsvData(Long id) {
        CSVData csvData = getCsvDataById(id);
        csvDataRepository.delete(csvData);
    }


    public List<CSVData> getAllCsvData() {
        return csvDataRepository.findAll();
    }

    private String parseCsvFileToString(MultipartFile file) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            return reader.lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse CSV file", e);
        }
    }
}
