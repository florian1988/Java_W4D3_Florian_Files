import java.io.*;
import java.util.*;
import java.lang.*;

public class A5Product {


    public void createFile(){

        try{
            File file = new File("C://Users/User/Documents/Codefactory/CFJava/Java_W4D3_Florian_Files/my_files/productList.txt");

            if(file.createNewFile()) {
                System.out.printf("File created" + file);

            }else{
                System.out.print("Filename already there you moron!");
            }

        }catch(Exception e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }



    public void createProduct(){

            ArrayList<String> products = new ArrayList<>();

            String item1 = "Vöslauer , mineralwater , sparkling";
            String item2 = "Stiegl , Beer , hell";
            String item3 = "Mooser Wein , Whitewine , Riesling";




            products.add(item1);
            products.add(item2);
            products.add(item3);



        try{
            FileWriter file = new FileWriter("C://Users/User/Documents/Codefactory/CFJava/Java_W4D3_Florian_Files/my_files/productList.txt");

            for ( String e : products){
                file.write(e + System.lineSeparator());
            }



            file.close();
            System.out.print("was working");

        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();

        }



    }

}
