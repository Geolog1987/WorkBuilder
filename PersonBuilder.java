package Builder;

public class PersonBuilder {
    String name;
    String surname;
    int age;
    String address;

    public PersonBuilder setName(String name) {
       if(name == null || name.isEmpty()){
           throw new IllegalArgumentException("Не корректный ввод поля имя");
       } this.name = name;
       return this;
    }

    public PersonBuilder setSurname(String surname) {
        if(surname == null || surname.isEmpty()){
            throw new IllegalArgumentException("Не корректный ввод поля фамилия");
        } this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Не корректный ввод поля возраст");
        } this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public Person build() throws IllegalStateException {
        Person person;
        if (name == null || surname == null)
            throw new IllegalStateException("Не корректный ввод полей имя и фамилия");
        if (age < 0) {
            person = new Person(name, surname);
        } else person = new Person(name, surname, age);
        person.setAddress(address);
        return person;
    }
}
