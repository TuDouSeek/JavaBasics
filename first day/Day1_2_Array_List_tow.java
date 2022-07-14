package day1;


import day1.对象和类.Day1_1Dog;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Day1_2_Array_List_tow {
    public static void main(String[] args) {

        for(String str:Day1_1Dog.gets()) {
            System.out.println(str);
        }


        Scanner scanner = new Scanner(System.in);
        Integer san = scanner.nextInt();
        Integer san2 = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(san);
        list.add(san2);
        System.out.println(list);

    }
}
