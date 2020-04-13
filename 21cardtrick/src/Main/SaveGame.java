package Main;

import java.io.IOException;
import java.io.*;


public class SaveGame {
    private BufferedWriter save;
    public SaveGame(){
        try{
            save=new BufferedWriter(new OutputStreamWriter(new FileOutputStream((System.currentTimeMillis())+".txt")));
        }
        catch(IOException e){
        }
    }
    public void write(String l){
        try{
            save.write(l+"\n");
        }
        catch(IOException e){
        }
    }

    public void close() {
        try{
            save.close();
        }
        catch(IOException e){
        }
    }
}
