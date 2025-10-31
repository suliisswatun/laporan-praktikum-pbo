package dip;

public class PostgreSQL implements Database {
    @Override
     public void insert(String data){
        System.out.println("Inserting data into PostgreSQL database: " + data);
     }
    
}
