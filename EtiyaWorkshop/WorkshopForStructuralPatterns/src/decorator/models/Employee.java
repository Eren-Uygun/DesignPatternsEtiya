package decorator.models;

public class Employee implements Person{
    @Override
    public void createPerson() {
        System.out.println("Employee person created");

    }
}
