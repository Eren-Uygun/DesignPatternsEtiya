package decorator.decorators;

import decorator.models.Person;

public class PersonWorkDecorator extends PersonDecorator {

    public PersonWorkDecorator(Person person) {
        super(person);
    }

    @Override
    public void createPerson() {
        personsAreWorkingNow();
        super.createPerson();
    }

    private void personsAreWorkingNow(){
        System.out.println("Persons now workable");
    }
}
