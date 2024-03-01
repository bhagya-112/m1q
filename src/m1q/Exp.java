package m1q;  //file check

import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.io.FileReader; 
import java.io.IOException;

class ExceptionCheck121 {
	public ArrayList numberCheck(String str) {
        ArrayList result = new ArrayList<>();
        for (char c : str.toCharArray()) {
            try {
                result.add(String.valueOf(Integer.parseInt(String.valueOf(c))));
            } catch (NumberFormatException e) {
                result.add("For input string: \"" + c + "\"");
            }
        }
        return result;
    }
    public String fileCheck(String filename) {
        try {
            File file = new File(filename);
            if (file.exists()) {
                return "File Found";
            } else {
                throw new FileNotFoundException("File not found: " + filename);
            }
        } catch (FileNotFoundException e) {
            return filename + " (No such file or directory)";
        }
    }
}
public class Exp {
    public static void main(String[] args) {
        ExceptionCheck121 checker = new ExceptionCheck121();
        String str = "10ASD";
        ArrayList numberResult = checker.numberCheck(str);
        System.out.println("Number Check Result: " + numberResult);
        String filename = "abc.txt";
        String fileResult = checker.fileCheck(filename);
        System.out.println("File Check Result: " + fileResult);
    }
}
