package fileHandling;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.*;

public class Main {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("Axx");
//        System.out.println(matcher.matches());
        System.out.println(Pattern.matches("A?B", "AB"));

    }
}