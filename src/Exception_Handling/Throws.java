package Exception_Handling;

import java.io.FileReader;
import java.io.IOException;

public class Throws {
    static void readFile() throws IOException{
        FileReader fr = new FileReader("anc.txt");
    }

    public static void main(String[] args){

        try{
            readFile();
        }
        catch (Exception e){
            System.out.println("file not found");
        }
    }
}
