package main.java;

import main.java.dam.Database;
import main.java.classes.Person;
import main.java.dam.DamPerson;
class Main{
    public static void main(String[] args){
        Database db = new Database("192.154.227.17", "CGCC", 1444, "AdventureWorks", false, "jdoe", "Password1234!");
        //db.selectTopFromTable("Person.Person", 10);
        //System.out.println("Hello World!");
        Person p = new DamPerson(db).selectPersonByID("D8763459-8AA8-47CC-AFF7-C9079AF79033");
        System.out.println(db.getConnectionURL());
        p.printName();
    }
}