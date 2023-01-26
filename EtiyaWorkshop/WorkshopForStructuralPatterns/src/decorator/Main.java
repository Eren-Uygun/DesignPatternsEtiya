package decorator;

import decorator.decorators.PersonWorkDecorator;
import decorator.models.Customer;
import decorator.models.Employee;
import decorator.models.Person;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.createPerson();

        Customer customer = new Customer();
        customer.createPerson();

        System.out.println("******************************************************************");

        Person person = new PersonWorkDecorator(new Employee());
        person.createPerson();



    }
}
