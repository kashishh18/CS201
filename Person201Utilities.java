import java.io.*;
import java.util.*;
import java.net.*;

public class Person201Utilities {
    public static List<Person201> sameBuilding(Person201[] people, Person201 person) {
        List<Person201> sameBuilding = new ArrayList<>();
        for (Person201 p : people) {
            if (!p.equals(person) && p.sameBuilding(person)) {
                sameBuilding.add(p);
            }
        }
        return sameBuilding;
    }

    public static List<Person201> sameFloor(Person201[] people, Person201 person) {
        List<Person201> sameFloor = new ArrayList<>();

        for(Person201 p : people){ 
            if(!p.equals(person) && p.sameFloor(person) && p.sameBuilding(person)){ 
                sameFloor.add(p);
            }
        }
        return sameFloor;
    }

    public static Person201[] readFile(String fname) throws IOException {
        Scanner s = new Scanner(new File(fname));
        ArrayList<Person201> list = new ArrayList<>();

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] data = line.split(", ");
            Person201 p = new Person201(data[0], data[1], Integer.parseInt(data[2]));
            list.add(p);
        }

        s.close();
        return list.toArray(new Person201[0]);
    }
