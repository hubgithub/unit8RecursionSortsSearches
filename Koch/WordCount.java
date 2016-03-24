import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class WordCount 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File inputFile = new File("./WordFile.txt");
        Scanner file_scan = new Scanner(inputFile);
        file_scan.useDelimiter(" ");
        int word_count = 0;
        while(file_scan.hasNext())
        {
            System.out.println(file_scan.next());
            
            word_count+= 1;
        }
        
        Scanner charater_scan = new Scanner(inputFile);
        
        int count_chars = 0;
        charater_scan.useDelimiter("[^A-Za-z]+");
        while(file_scan.hasNext())
        {
            count_chars++;
        }
        
        System.out.println("Char Count: " + count_chars);
        file_scan.close();
        System.out.println("Word Count: " + word_count);
        
    }
}
