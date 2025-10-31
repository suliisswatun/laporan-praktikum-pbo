package dip;

public class Main {
    public static void main(String[] args) {
        Database mysql = new MySQL();
        Database postgreSQL = new PostgreSQL();

        UserService userServiceMySQL= new UserService(mysql);
        userServiceMySQL.RegisterUser("Siti");

        UserService userServicePostgreSQL= new UserService(postgreSQL);
        userServicePostgreSQL.RegisterUser("Yadi");
        
    
}
}
