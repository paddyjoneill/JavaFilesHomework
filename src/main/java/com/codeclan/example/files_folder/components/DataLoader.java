package com.codeclan.example.files_folder.components;

import com.codeclan.example.files_folder.models.File;
import com.codeclan.example.files_folder.models.Folder;
import com.codeclan.example.files_folder.models.User;
import com.codeclan.example.files_folder.repositories.FileRepository;
import com.codeclan.example.files_folder.repositories.FolderRepository;
import com.codeclan.example.files_folder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){}


    public void run(ApplicationArguments args){
        User user = new User("Paddy");
        userRepository.save(user);

        Folder documents = new Folder("Documents", user);
        folderRepository.save(documents);

        Folder downloads = new Folder("Downloads", user);
        folderRepository.save(downloads);

        user.addFolder(documents);
        user.addFolder(downloads);
        userRepository.save(user);

        File cv = new File("CV", ".doc", 1234, documents);
        fileRepository.save(cv);

        File coverLetter = new File("Cover Letter",".doc", 321, documents);
        fileRepository.save(coverLetter);

        documents.addFile(cv);
        documents.addFile(coverLetter);
        folderRepository.save(documents);

        File chrome = new File("Chrome",".dmg", 3213213, downloads);
        fileRepository.save(chrome);

        File firefox = new File("Firefox", ".dmg", 43243243, downloads);
        fileRepository.save(firefox);

        downloads.addFile(chrome);
        downloads.addFile(firefox);
        folderRepository.save(downloads);


    }
}
