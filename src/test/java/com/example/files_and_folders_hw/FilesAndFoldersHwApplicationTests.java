package com.example.files_and_folders_hw;

import com.example.files_and_folders_hw.models.File;
import com.example.files_and_folders_hw.models.Folder;
import com.example.files_and_folders_hw.models.Person;
import com.example.files_and_folders_hw.repositories.FileRepository;
import com.example.files_and_folders_hw.repositories.FolderRepository;
import com.example.files_and_folders_hw.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class FilesAndFoldersHwApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPersonAndFolderThenSave() {

		Person cameron = new Person("Cameron Wilson");
		personRepository.save(cameron);
		Folder physics = new Folder("Physics", cameron);
		folderRepository.save(physics);
		File file = new File("Electricity", 50, physics);
		fileRepository.save(file);
	}

//	@Test
//	public void createFolderAndFileThenSave() {
//		Person cameron = new Person("Cameron Wilson");
//		personRepository.save(cameron);
//		Folder physics = new Folder("Physics", cameron);
//		folderRepository.save(physics);
//
//
//	}
}
