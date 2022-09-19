package writefile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class WriteReadFile {
    public static void main(String[] args) throws IOException {
        // File Write
        File file = new File("C:\\Users\\user\\Desktop\\testWriteData.txt");
        file.createNewFile();
        
        try (PrintWriter printInFile = new PrintWriter(file)) {
            printInFile.print("This is a Java programar");
        }
        Scanner sc = new Scanner(file);
    
        while(sc.hasNext()){
            
            System.out.println(sc.nextLine());
        
        }



        //File Read
//        try {
//            File readFile = new File("C:\\Users\\user\\Desktop\\testWriteData.txt");
//            Scanner fileReader = new Scanner(readFile);
//            while (fileReader.hasNextLine()) {
//                String data = fileReader.nextLine();
//                System.out.println(data);
//            }
//            fileReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

        
        
        
    }
    
}
