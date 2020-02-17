package main.java.classes;
public class Person{
    //attributes (members)
    private String firstName;
    private String lastName;

    //operations (member functions)
    public void setFirstName(String value){
        firstName = value;
    }

    public void setLastName(String value){
        lastName = value;
    }

    public void printName(){
        System.out.println(firstName + " " + lastName);
    }

}