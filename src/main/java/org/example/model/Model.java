package org.example.model;

import org.example.controller.Note;
import org.example.model.interfaces.Deletable;
import org.example.model.interfaces.Readable;
import org.example.model.interfaces.Writable;

import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Model implements Writable, Deletable, Readable {


    public Model(){

    }

    @Override
    public void write(String title, String content) throws IOException {
        Note note = new Note(title,content);
        System.out.println(note.toString());
        try(FileWriter fileWriter = new FileWriter(title,true)){
            fileWriter.write(note.toString());
            fileWriter.flush();
        }
    }
    @Override
    public void delete(String title) throws IOException {
        File file = new File("title");
        try {
            Files.delete(Path.of(title));
            if(!file.exists()){
                System.out.println("File: " + title+ " deleted");
            }
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", Path.of(title));
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", Path.of(title));
        } catch (IOException x) {
            System.err.println(x);
        }


    }

    @Override
    public void delete(int id) throws IOException {

    }


    @Override
    public void read(String title) throws IOException {
        try(FileReader fileReader = new FileReader(title);
            BufferedReader reader = new BufferedReader(fileReader)) {
            System.out.println(reader.readLine());
        }
    }

    public void closeProcess() {
    }
}
