import java.io.IOException;
import java.util.List;

public class PersonFinder {
    public static void main(String[] args) throws IOException {

        Person me = new Person("My Name", "My Building", 3);
        Person[] people = PersonUtilities.readURL("https://courses.cs.duke.edu/compsci201/spring23/notes/people.txt");

        System.out.println("\nSearching for people near " + me.getName() + "\n");
        
        System.out.println("People on the same floor: ");
        List<Person> sameFloor = PersonUtilities.sameFloor(people, me);
        PersonUtilities.printPeople(sameFloor);

        System.out.println("People in the same building: ");
        List<Person> sameBuilding = PersonUtilities.sameBuilding(people, me);
        PersonUtilities.printPeople(sameBuilding);
    }
}
