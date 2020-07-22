import java.io.File;
import java.io.FileNotFoundException;

public class A4Basic {

    public void deleteFile(){


        File file = new File("C://Users/User/Documents/Codefactory/CFJava/Java_W4D3_Florian_Files/my_files/fuck.txt");
        if(file.delete()){
            System.out.print("File" + file + " deleted");
        } else {
            System.out.print("No file found");
        }
    }


    public static void main(String[] args) {

        A4Basic delete = new A4Basic();

        delete.deleteFile();
    }
}
