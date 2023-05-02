package myObjectStream1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("f.txt"));

        ArrayList<People> list = (ArrayList<People>) ois.readObject();
        for (People people : list) {
            System.out.println(people);
        }
        ois.close();
    }
}
