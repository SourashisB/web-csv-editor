package com.webCSV.entities;
import jakarta.persistence.*;

@Entity
@Table(name="csv_data")
public class CSVData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    @Column(name = "content", nullable = false)
    private String content; // Raw CSV content

    @Column(name = "filename", nullable = false)
    private String filename;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
