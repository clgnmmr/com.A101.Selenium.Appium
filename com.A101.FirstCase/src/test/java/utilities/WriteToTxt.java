package utilities;




import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class WriteToTxt {


    public static void saveAllData
            (String filename,String text){

        try {
            FileWriter fileWriter = new FileWriter(filename, false);


            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(text+ ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void saveAlldataList(String filename, List<String> baslık){


        try {
            FileWriter fileWriter = new FileWriter(filename, false);


            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i = 0; i <baslık.size() ; i++) {
                writer.append(baslık.get(i)+ ", \n");

            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}