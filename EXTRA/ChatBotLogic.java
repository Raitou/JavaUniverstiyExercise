
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class ChatBotLogic {
    protected ChatBot loadFile(File fPath){
        ChatBot obj = null;
        if(fPath.exists()){
            try(FileInputStream iFStream = new FileInputStream(fPath);
                    ObjectInputStream iObjStream = new ObjectInputStream(iFStream)){
                    obj = (ChatBot)iObjStream.readObject();
            }catch(FileNotFoundException ex){
                System.out.println(ex.getLocalizedMessage());
            }catch(IOException | ClassNotFoundException ex){
                System.out.println(ex.getLocalizedMessage());
            }   
        } else {
            try{
                fPath.createNewFile();
            }catch(IOException ex){
                System.out.println(ex.getLocalizedMessage());
            }        
        }
        return obj;
    }
    protected void serializeObject(File fPath ,ChatBot obj){
        try(FileOutputStream oFStream = new FileOutputStream(fPath);
                ObjectOutputStream oObjStream = new ObjectOutputStream(oFStream)){
                oObjStream.writeObject(obj);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
    protected ChatBot deserializeObject(File fPath, ChatBot obj){
        try(FileInputStream iFStream = new FileInputStream(fPath);
            ObjectInputStream iObjStream = new ObjectInputStream(iFStream)){
            obj = (ChatBot)iObjStream.readObject();
        }catch(FileNotFoundException ex){
            System.out.println(ex.getLocalizedMessage());
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex.getLocalizedMessage());
        }
        return obj;
    }
    
}
