package com.example.AnyProj;

import org.testng.annotations.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPageTest {
    @Test
    public static void main(String[] args) throws IOException {
        File file = new File("numbers.txt");
        Scanner input = new Scanner(file);
        List<String> list = new ArrayList<String>();
        int sum = 0;
        while (input.hasNextLine()) {
            list.add(input.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("#")) {
                list.remove(i);
            }
            sum += Float.valueOf(list.get(i));
        }
    }
}
