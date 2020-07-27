package com.company;

import java.awt.*;
import java.util.Scanner;

public class drawTriangle {

    public static void draTriangle(int floor) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < floor + 1; i++){
            for (int j = 1; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        draTriangle(5);
    }

}
