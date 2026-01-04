import models.Employee;
import models.Student;
import models.Person;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public void main(String[] args){
        Employee emp1 = new Employee("Daryn", "Demezhol", "Waiter", 80000.0);
        Employee emp2 = new Employee("Yeren", "Vilor", "CEO", 1500000.0);
        Student student1 = new Student("Alikhan", "Malunshuk", 2.89);
        Student student2 = new Student("Sanzhar", "Forazhen", 2.1);
        ArrayList<Person> people = new ArrayList<>();
        people.add(emp1);
        people.add(emp2);
        people.add(student1);
        people.add(student2);
        Collections.sort(people);
        printData(people);
    }
    public void printData(Iterable<Person> persons){
        for(Person per : persons){
            System.out.println(per.toString() + " " + per.getPaymentAmount());
        }
    }
}
