package org.example;

import org.example.controller.Controller;
import org.example.controller.Note;
import org.example.model.Model;
import org.example.view.View;

import javax.swing.plaf.IconUIResource;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    int iter = 0;
    Main main = new Main();
    public static void main(String[] args) throws IOException {
        String content2 = "Today is homework day, because i late to " +
                "submit my homework, it s mean great project OOP";
//        String id = promt("Введите id: ");
//        String title = promt("Введите title: ");
//        String content =promt("Введите content: ");
//       writeNote(title ,content);
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view,model);
//        controller.run();

    }

    public static void writeNote(String title, String content) throws IOException {
        int iter = 0;

//            Note note = new Note(title, content);
//            System.out.println(note.toString());
//            FileWriter fileWriter = new FileWriter(title, true);
//            fileWriter.write(note.toString());
//            fileWriter.flush();
//            iter++;

    }
    public static String promt(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        return scanner.nextLine();
    }

}