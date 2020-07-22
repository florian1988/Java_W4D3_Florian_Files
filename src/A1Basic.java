import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A1Basic {

    public static void main(String[] args) {
        try{
            File file = new File("C://Users/User/Documents/Codefactory/CFJava/Java_W4D3_Florian_Files/my_files/myFile.txt");
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }else{
                System.out.println("File already exists");
            }

        } catch( Exception e){
            System.out.println("Error occured");
            e.printStackTrace();
        }

        try{
            FileWriter file = new FileWriter("C://Users/User/Documents/Codefactory/CFJava/Java_W4D3_Florian_Files/my_files/myFile.txt");
            file.write("Hallo World!!!!");
            file.close();
            System.out.println("Successfully wrote to file.");
        }catch (IOException e){
            System.out.println("error occurred");
            e.printStackTrace();
        }



    }


}
