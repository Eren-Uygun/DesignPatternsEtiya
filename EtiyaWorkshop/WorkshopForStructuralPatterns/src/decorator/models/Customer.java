package decorator.models;

public class Customer implements Person{
    @Override
    public void createPerson() {
        System.out.println("Customer person created");
    }
}
