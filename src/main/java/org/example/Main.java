package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        CreateREG createREG = new CreateREG();
        createREG.loadHashMap();
        boolean flag = true;
        System.out.println("\nEnter your command (Use ';' when giving multiple commands) \nEnter 'EXIT' when you are done with your operations");
        while(flag){
            System.out.println();
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String actions[] = input.split(";");
            for(String action: actions) {
                if(action.charAt(0) == 'M'){
                    createREG.createREG(action);
                }else if(action.charAt(0) == 'A'){
                    AddToREG addToREG = new AddToREG();
                    addToREG.command(action);
                }else if(action.charAt(0) == 'S'){
                    ShowREG showREG = new ShowREG();
                    showREG.showResult();
                }else if(action.charAt(0) == 'E'){
                    flag = false;
                }else{
                    System.out.println("Unknown Command");
                }
            }
        }

        createREG.storeHashMap();
    }
}