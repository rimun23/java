package models;
public abstract class Person implements Payable, Comparable<Person> {
    int id;
    String name;
    String surname;
    static int idCounter = 1;
    public Person() {
        this.id = idCounter++;
    }
    public Person(String name, String surname){
        this();
        this.surname = surname;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getPosition(){
        return "Student";
    }
    @Override
    public String toString(){
        return id + ". " + name + " " + surname;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}
