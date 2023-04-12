package iopackage;
import java.io.*;

public class ThirdCharacterStream {
    public static void main(String[] args) {
        try(FileReader input = new FileReader("Read.txt");
            FileWriter output = new FileWriter("Write.txt"))
        {
            BufferedReader bufferedReader = new BufferedReader(input);
            BufferedWriter bufferedWriter = new BufferedWriter(output);
            String line = bufferedReader.readLine();
            while (line != null){
                bufferedWriter.write(line,0, line.length());
                bufferedWriter.flush();
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
