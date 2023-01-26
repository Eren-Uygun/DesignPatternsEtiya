package decorator.decorators;

import decorator.models.Person;

public abstract class PersonDecorator implements Person{

    public Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void createPerson() {
        person.createPerson();
    }
}
