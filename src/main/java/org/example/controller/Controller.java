package org.example.controller;

import org.example.model.Model;
import org.example.view.View;

import java.io.IOException;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model){
        this.model = model;
        this.view = view;
        run();
    }
    public void run(){
        try {
            String command = " ";
            while(!command.startsWith("END")) {
                command = view.promt("Введите команду: ");
                if (command.equals("CREATE")) {
                    String title = view.promt("Введите title: ");
                    String content = view.promt("Введите content: ");
                    model.write(title, content);
                }
                if (command.equals("DELETE")) {
                    String titleOrId = view.promt("Введите title или id: ");
                    model.delete(titleOrId);
                }
                if (command.equals("READ")) {
                    String titleOrId = view.promt("Введите title или id: ");
                    model.read(titleOrId);
                }

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
