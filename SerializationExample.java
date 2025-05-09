import java.io.*;

   class person implements Serializable{
    String name;
    int age;
    transient String password;
    
    public person(String name, int age, String password){
        this.name = name;
        this.age = age;
        this.password = password;
    }
}

public class SerializationExample{
    public static void main(String []args) throws Exception{
        person p1 = new person("rk",21,"rk1231213");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.rk"));
        oos.writeObject(p1);
        System.out.println("serialization done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.rk"));
        person p2 = (person)ois.readObject();
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.password);
        oos.close();
        ois.close();
    }
}