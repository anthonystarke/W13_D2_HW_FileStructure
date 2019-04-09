package com.codeclan.example.folders.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

//    @JsonIgnore
//    @OneToMany
//    @JoinColumn(name = "file_id", nullable = false)
//    private List<File> file;

    public Folder(){
    }

    public Folder(String title){
        this.title = title;
//        this.file = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public List<File> getFile() {
//        return file;
//    }
//
//    public void setFile(List<File> file) {
//        this.file = file;
//    }
}
