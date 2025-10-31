package dip;

public class MySQL implements Database {
    @Override
        public void insert(String data){
            System.out.println("Inserting data into MySQL database: " + data);
        }
    
}
