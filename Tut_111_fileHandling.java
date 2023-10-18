import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tut_111_fileHandling {
    public static void main(String[] args) {
        //Creating a new file
        File f=new File("MyFile.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Writing to a file
        try {
            FileWriter fw=new FileWriter(f);
            fw.write("Hello !!! :)\nI am a new Java Programmer\nHow u r?\nStay happy and blessed !!!");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Reading from a file
        try {
            Scanner sc=new Scanner(f);
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Deleting a file
        /*
        f.delete();
        System.out.println(f.getName()+" file is deleted !!");

         */
    }
}
/*
Hello !!! :)
I am a new Java Programmer
How u r?
Stay happy and blessed !!!
MyFile.txt file is deleted !!
 */