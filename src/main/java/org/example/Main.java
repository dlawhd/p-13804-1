package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        lab1();
    }

    private static void  lab1(){
        String input = "등록\n나의 죽음";
        Scanner scanner = new Scanner(input);

        String cmd = scanner.nextLine();
        String content = scanner.nextLine();

        System.out.println(cmd);
        System.out.println(content);

    }
}