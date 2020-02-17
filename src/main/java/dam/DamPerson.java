package main.java.dam;

//import sql libraries and package classes
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.classes.Person;


public class DamPerson{
    private Database database;

    public DamPerson(Database database){
        this.database = database;
    }

    public Person selectPersonByID(String value){
        String sql = "SELECT *" 
                        + " FROM "
                            + "Person.Person" 
                        + " WHERE "
                            +   "rowguid='"
                            +   value
                            +   "'";

        try (Connection connection = database.connection(); Statement statement = database.connection().createStatement();) {
            // Create and execute a SELECT SQL statement.
            ResultSet rs = statement.executeQuery(sql);
            Person p = new Person();
            while(rs.next()){
                p.setFirstName(rs.getString("firstName"));
                p.setLastName(rs.getString("lastName"));
            }
            // return result set
            return p;
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}