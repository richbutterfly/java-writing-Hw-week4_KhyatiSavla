package programme_26_encapsulation;

public class Encapsulate {
    // Private variable declared these can only be accessed by public method of class
    private String name;
    private int rollNo;
    private int age;

    // Set method for name to access private variable name
    public void setName(String name) {
        this.name = name;
    }

    // Get method for Name to access private variable name
    public String getName() {
        return name;
    }

    // Get method for roll No. to access private variable roll no.
    public int getRollNo() {
        return rollNo;
    }

    // Set method to roll No. to access private variable roll No.
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Get method for age to access private variable age
    public int getAge() {
        return age;
    }

    // Set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;

    }

}
