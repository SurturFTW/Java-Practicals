import java.io.*;
//Reading bytes from a file
public class Pract8A {
    public static void main(String[] args) {
        //create an input file stream
        File in = new File("input.txt");
        FileInputStream infile = null;
        int b;
        try{
            //connect infile stream to the requires file 
            infile = new FileInputStream(in);
            //read and display data
            while((b = infile.read()) != -1){
                System.out.print((char)b);
            }
            infile.close();
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}