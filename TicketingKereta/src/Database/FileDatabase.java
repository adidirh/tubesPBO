/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileDatabase {
    
    public void saveData(Object o, String file){
        throws FileNotFoundException, IOException {
            FileNotFoundException fout = new FileNotFoundException(file);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(o);
            oout.flush();
        }
    }
    
    public object getObject(String file) {
        throws FileNotFoundException, IOException, ClassNotFoundException, EOFException {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            return ois.readObject();
        }
    }
}
