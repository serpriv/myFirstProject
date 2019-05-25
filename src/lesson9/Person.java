package lesson9;

public class Person {
    private int age;
    private String name;
    private String sername;
    private long phoneNumber;


    public Person() {

    }

    public Person(int newAge, String newName, String newSername, long newPhoneNumber) {
        age = newAge;
        name = newName;
        sername = newSername;
        phoneNumber = newPhoneNumber;
    }

    public Person(int newAge) {
        age = newAge;
    }

    public Person(String newName) {
        name = newName;
    }

    public Person(String newSername, String newName) {
        name = newName;
        sername = newSername;

    }

    public Person(long newPhone) {
        phoneNumber = newPhone;
    }

    public Person(int newAge, String newName) {
        age = newAge;
        name = newName;
    }

    public Person(int newAge, long newPhone) {
        age = newAge;
        phoneNumber = newPhone;
    }

    public Person(long newPhone, String newName) {
        phoneNumber = newPhone;
        name = newName;

    }

    public Person(long newPhone, String newName, int newAge) {
        phoneNumber = newPhone;
        name = newName;
        age = newAge;

    }

    public Person(String newSername, int newAge) {
        sername = newSername;
        age = newAge;
    }

    public Person(int newAge, String newSername, long newPhone) {
        age = newAge;
        sername = newSername;
        phoneNumber = newPhone;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setSername(String newSername) {
        sername = newSername;
    }

    public String getSername() {
        return sername;
    }

    public void setPhoneNumber(long newPhone) {
        phoneNumber = newPhone;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
