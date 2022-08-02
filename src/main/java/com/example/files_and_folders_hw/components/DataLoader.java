package com.example.files_and_folders_hw.components;

import com.example.files_and_folders_hw.models.File;
import com.example.files_and_folders_hw.models.Folder;
import com.example.files_and_folders_hw.models.Person;
import com.example.files_and_folders_hw.repositories.FileRepository;
import com.example.files_and_folders_hw.repositories.FolderRepository;
import com.example.files_and_folders_hw.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args){
        Person cameron = new Person("Cameron Wilson");
        personRepository.save(cameron);

        Folder physics = new Folder("Physics", cameron);
        folderRepository.save(physics);

        Folder maths = new Folder("Maths", cameron);
        folderRepository.save(maths);

        Folder english = new Folder("English", cameron);
        folderRepository.save(english);

        Folder spanish = new Folder("Spanish", cameron);
        folderRepository.save(spanish);

        File electricity = new File("Electricity", 50, physics);
        fileRepository.save(electricity);

        File dynamics = new File("Dynamics", 60, physics);
        fileRepository.save(dynamics);

        File astronomy = new File("Astronomy", 55, physics);
        fileRepository.save(astronomy);

        File calculus = new File("Calculus", 75, maths);
        fileRepository.save(calculus);

        File theory = new File("Theory", 80, maths);
        fileRepository.save(theory);

        File poems = new File("Poems", 20, english);
        fileRepository.save(poems);

        File portfolio = new File("Portfolio", 100, english);
        fileRepository.save(portfolio);

        File reading = new File("Reading", 25, english);
        fileRepository.save(reading);

        File speaking = new File("Speaking", 10, spanish);
        fileRepository.save(speaking);

        File writing = new File("Writing", 50, spanish);
        fileRepository.save(writing);

        File listening = new File("Listening", 5, spanish);
        fileRepository.save(listening);
    }
}

