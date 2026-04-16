package DocumentEditorLld;

import java.io.File;
import java.io.FileWriter;

public class SaveToFile implements Persitance {


    @Override
    public void save(String data) {

        try{
            FileWriter fileWriter = new FileWriter("Document.txt");
            fileWriter.write(data);
            fileWriter.close();
            System.out.println("File saved!");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("File not saved!");
        }

    }
}
