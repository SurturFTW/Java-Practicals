//Writing bytes to a file
import java.io.*;
public class Pract8C {
    public static void main(String[] args) {
        //declare and initialize the array
        byte cities [] = {'D','E','L','H','I','\n','M','A','D','R','A','S','\n','L','O','N','D','O','N'};
        //create an output file stream
        FileOutputStream outfile = null;
        try{
            //connect the outfile stream to "city.txt"
            outfile = new FileOutputStream("city.txt");
            //write data to the steam
            outfile.write(cities);
            outfile.close();
        }
        catch(IOException ioe){
            System.out.println(ioe);
            System.exit(-1);
        }
    }
}
