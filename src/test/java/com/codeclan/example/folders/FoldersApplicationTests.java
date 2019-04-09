package com.codeclan.example.folders;

import com.codeclan.example.folders.Models.File;
import com.codeclan.example.folders.Models.Folder;
import com.codeclan.example.folders.Models.User;
import com.codeclan.example.folders.Repositories.FileRepository;
import com.codeclan.example.folders.Repositories.FolderRepository;
import com.codeclan.example.folders.Repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoldersApplicationTests {


	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	File file;
	Folder folder;
	User superUser;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void canSaveFileToDB(){
//		file = new File("Test","exe",5);
//		fileRepository.save(file);
//	}
//
//	@Test
//	public void canSaveFolderToDB(){
//		folder = new Folder("test");
//		folderRepository.save(folder);
//	}
//
//	@Test
//	public void canSaveUserToDB(){
//		superUser = new User("Tony");
//		userRepository.save(superUser);
//	}

}

