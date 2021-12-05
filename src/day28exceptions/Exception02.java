package day28exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
    /*
     * 1) if you get red underline while you type, it can be Compile Time Exception
     * 2) Compile time exception are called "checked" exceptions
     * run time exceptions are called "unchecked" exceptions
     * 3) The most commen "checked" exceptions are 
     * i) FileNotFoundException : The path is wrong or file does not exist
     * ii) IOException: It is related with all input-outouts issues
     * 
     * 4) If there is IOException, no need to use FileNotFoundException
     * 5) if you need to use them in try-catch blocks, then type file FileNotFoundException at top
     * 6) e.printStackTrace(); It gives detailed technical information about error
     * 
     * 
     e.printStackTrace();
     */
public class Exception02 {
    
    //how to read a text file
    public static void main(String[] args) {
        
        readTextFiles2();
        
    }
    
    public static void readTextFiles1() throws IOException {
        FileInputStream fis = new FileInputStream("src/day28exceptions/TextFile");
        int i=0;
        while( (i=fis.read()) != -1  ) {
            System.out.print((char)i);
        }
        fis.close();
    }
    
    public static void readTextFiles2() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/day28exceptions/TextFile");
            int i=0;
            while( (i=fis.read()) != -1  ) {
                System.out.print((char)i);
            }           
            
        } catch (FileNotFoundException e) {
            
            System.err.println("The path is wrong or file does not exist: " + e.getMessage());
        } catch (IOException e) {
            //.err olursa cikti kirmizi renkte görünüyor
            System.out.println("File couldn't be read..." + e.getMessage());
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
                System.out.println("The file coulnd't be closed or The file coulnd't be accessed...");
            }
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
