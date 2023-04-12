package iopackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SecondCharacterStream {
    public static void main(String[] args) {
        try(FileReader inputStream = new FileReader("Read.txt");
            FileWriter fileOutputStream = new FileWriter("Write.txt"))
        {
            char[] buffer = new char[16];
            int read;
            while((read = inputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,read);
            }
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
