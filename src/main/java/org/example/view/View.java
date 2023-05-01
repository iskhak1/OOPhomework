package org.example.view;

import java.util.Scanner;

public class View {

    public  String promt(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        return scanner.nextLine();
    }

}
