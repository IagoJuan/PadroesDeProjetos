import java.io.*; 
import java.util.Scanner;

public final class MyFile {

   //create an object of MyFile
   private static MyFile instance = null;
   
   static {
     try {
      instance = new MyFile();
     }
     catch(Exception ex) {
       ex.printStackTrace();
     }
   }

   private static final String filename = "MyFile.txt";

   private File myFile = null;

   //make the constructor private so that this class cannot be
   //instantiated
   private MyFile() throws IOException {
     myFile = new File(filename);
     if (myFile.createNewFile()) {
       System.out.println("File created: " + myFile.getName());
     } else {
       System.out.println("File already exists.");
     }
   }

   //Get the only object available
   public static MyFile getInstance(){     
      return instance;
   }

   public String readFile() throws FileNotFoundException {
     Scanner myReader = null;
     try {
        myReader = new Scanner(myFile);    
        String content = "";
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          content = content + data;
        }

        return content;
     }
     finally {
       if (myReader != null) {
         myReader.close();
       }       
     }    
   }

   public void writeFile(String content) {
     try {
      FileWriter myWriter = new FileWriter(filename);
      myWriter.write(content);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
   }
}