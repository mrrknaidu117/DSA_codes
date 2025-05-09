import java.io.*;
import java.util.*;

public class rwbuffer{
    public static void main(String[]arges) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("rwbuffer.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.txt"));

        String line = br.readLine();
        while(line != null){
            bw.write(line);
            bw.newLine(); //bw.write("\n"); both are same 
            bw.flush();
            line = br.readLine();
        }
    br.close();
    bw.close();
    }
}