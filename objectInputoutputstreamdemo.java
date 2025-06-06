import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.IOException;

class person implements Serializable{
    private String name;
    private boolean gender;
    private int age;
   public person(String n,boolean g,int a){
    name=n;
    gender=g;
    age=a;
   }
   public String toString(){
         return "name: "+this.name+" gender: "+this.gender+" age : "+this.age;
   }
}

public class objectInputoutputstreamdemo {
    public static void main(String [] args){
        person pin=new person("Ashutosh",true,2045);
        System.out.println(pin);
        try {
            FileOutputStream fos=new FileOutputStream("object.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(pin);
             
            FileInputStream fis=new FileInputStream("object.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);

            person pot=(person) ois.readObject();
            System.out.println(pot);
            

            
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();

        }
    }
}
