package iopackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FirstBytesStream {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("Read.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("Write.txt"))
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
