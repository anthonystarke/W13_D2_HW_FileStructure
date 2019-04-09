package com.codeclan.example.folders.Components;

import com.codeclan.example.folders.Models.File;
import com.codeclan.example.folders.Models.Folder;
import com.codeclan.example.folders.Models.User;
import com.codeclan.example.folders.Repositories.FileRepository;
import com.codeclan.example.folders.Repositories.FolderRepository;
import com.codeclan.example.folders.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args){

        Folder folder = new Folder("Temp");
        folderRepository.save(folder);

        File file = new File("text","txt",5);
        fileRepository.save(file);

        User user = new User("Tony");
        userRepository.save(user);

    }

}
