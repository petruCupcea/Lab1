package md.usm.laborator1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReaderLab1Splitter {
    public static void main(String[] args) {
        String fileToParse = "src/main/java/md/usm/laborator1/files/employees-table.csv";
        BufferedReader fileReader = null;

        final String DELIMITER = ",";

        try{
            String line = "";
            fileReader = new BufferedReader(new FileReader(fileToParse));

            while ((line = fileReader.readLine()) != null){
                String[] tokens = line.split(DELIMITER);
                for(String token : tokens){
                    System.out.println(token);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
