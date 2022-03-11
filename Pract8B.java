//Copying characters from one file into another
import java.io.*;
public class Pract8B {
    public static void main(String[] args) {
        //declare and create input & output files
        File inFile = new File("input.txt");
        File outFile = new File("output.txt");
        FileReader ins = null; //creates file stream ins
        FileWriter outs = null; //creates file stream outs
        try{
            ins = new FileReader(inFile); //opens inFile
            outs = new FileWriter(outFile); //opens outFile
            //read & write till the end
            int ch;
            while((ch = ins.read())!=-1){
                outs.write(ch);
                System.out.print((char)ch);
            }
        }
        catch(IOException e){
            System.out.println(e);
            System.exit(-1);
        }
        //close files
        finally{ 
            try{
                ins.close();
                outs.close();
            }
            catch(IOException e){}
        }
    }
}