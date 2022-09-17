
package javafinalexam.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        //File Create
        File file=new File("D:\\FileReadWrite\\java.txt" );
        if(file.exists()){
            System.out.println("File already exixt");
        }
        else{
            file.createNewFile();
        }
        //Write
        PrintWriter output=new PrintWriter(file);
        output.print("Hello From Java");
        output.close();
        
            //Read Netbeans 
        FileReader reed=new FileReader(file);
        Scanner input=new Scanner(file);
        System.out.println(input.nextLine());
        input.close();
        
    }
    
}
