import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class A3Basic {

    String line = null;

    private void readMe(){

        try{
            FileReader file = new FileReader("C://Users/User/Documents/Codefactory/CFJava/Java_W4D3_Florian_Files/my_files/readme.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            System.out.println("");
            while((line = bufferedReader.readLine()) != null){

                System.out.println(line);
            }
            bufferedReader.close();

        }catch(FileNotFoundException e){

            System.out.println("Error no File found");
            e.printStackTrace();

        }catch (IOException ex){

            System.out.print("Error reading file not possible");
            ex.printStackTrace();
        }

    }

    private void countEgg(){
        String egg = "egg";
        String egg2 = "egg:";
        int count = 0;
        int totalcount = 0;

        try{
            File file = new File("C://Users/User/Documents/Codefactory/CFJava/Java_W4D3_Florian_Files/my_files/readme.txt");
            Scanner scan =  new Scanner(file);
                while (scan.hasNext()) {
                     line = scan.next();
                     totalcount++;

                    if(line.equals(egg) ||  line.equals(egg2) ){
                        count++;
                    }
                }
            System.out.println( "Egg counter: " +count + "\n" + "Total word counter:" +totalcount);

                scan.close();

        }catch(FileNotFoundException e){
            System.out.println("Error no File found");
            e.printStackTrace();
        }

    }

    public static void main(String[] args){

        A3Basic readText = new A3Basic();

        readText.readMe();
        readText.countEgg();

    }
}
