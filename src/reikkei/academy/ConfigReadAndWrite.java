package reikkei.academy;

import java.io.*;

public class ConfigReadAndWrite<T> {
    static int cnt;
    public static String read(String path){
        String integerList = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            integerList = (String) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (Exception e){
            System.out.println("File not found");
        }
        return integerList;
    }
    public static void write(String path,String integerList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(integerList);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            System.out.println("File not found or error");
        }
    }
}
