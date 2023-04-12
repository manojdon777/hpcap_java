package iopackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FirstCharacterStream {
    public static void main(String[] args) {
        try(FileReader inputStream = new FileReader("Read.txt");
            FileWriter fileOutputStream = new FileWriter("Write.txt"))
        {
            int read;
            while((read = inputStream.read()) != -1){
                fileOutputStream.write(read);
            }
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
