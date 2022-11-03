public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        if(age >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress() {
        if(address != null) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (age >= 0) {
            age ++;
        } else {
            System.out.println("Возраст неизвестен =(((");
        }
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address)
                .setAge(0);

    }


    @Override
    public String toString() {
        return "Личность{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Возраст=" + age +
                ", Адрес='" + address + '\'' +
                '}';
    }
}
