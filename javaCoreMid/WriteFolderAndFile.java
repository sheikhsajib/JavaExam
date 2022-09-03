package practiceformidexam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class WriteFolderAndFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("C:\\Users\\Gazi\\Desktop\\JAVA Class\\PracticeForMidExam\\testWriteData.txt");
        file.createNewFile();
        
        try (PrintWriter printInFile = new PrintWriter(file)) {
            printInFile.print("This is a Java programar");
        }

    }
    
}
