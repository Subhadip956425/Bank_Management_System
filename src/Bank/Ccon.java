package Bank;

import java.sql.*;

public class Ccon {
    public Connection connection;
    public Statement statement;

    public Ccon() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Subhadip@2003");
            this.statement = this.connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}