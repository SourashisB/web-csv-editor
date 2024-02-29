package com.webCSV.repositories;
import org.springframework.data.jpa.repository.JpaRepository;


import com.webCSV.entities.CSVData;

public interface CSVDataRepository extends JpaRepository<CSVData, Long>{
    

}
