
import java.sql.*;

public class jdbcCalls {
    public static void main(String[] args) {

        String databaseURL = "jdbc:mysql://localhost:3306/babynames";
        String user = "user";
        String password = "password";

        Connection connection;
        Statement statement;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(databaseURL,user,password);
            System.out.println("Database Connected...");

            statement = connection.createStatement();
            String query1 = "CREATE TABLE BABYNAMES" +
                    "ID INTEGER not nul,"+
                    "NAME VARCHAR(40),"+
                    "DATE_YEAR INTEGER,"+
                    "GENDER CHAR(1),"+
                    "US_STATE CHAR(2),"+
                    "NUM_BABIES INTEGER,"+
                    "PRIMARY KEY(ID)";

            String query2 = "insert into BABYNAMES (ID, NAME, DATE_YEAR, GENDER, US_STATE, NUM_BABIES)\n" +
                    "values  (1, 'Michael', 1991, 'M', 'MD', 5),\n" +
                    "        (2, 'Christopher', 1999, 'M', 'PA', 9),\n" +
                    "        (3, 'Christopher', 1991, 'M', 'FL', 12),\n" +
                    "        (4, 'Christopher', 1996, 'M', 'CA', 7),\n" +
                    "        (5, 'Rosemary', 1995, 'F', 'CA', 9),\n" +
                    "        (6, 'Rosemary', 1995, 'F', 'NY', 21),\n" +
                    "        (7, 'Rosemary', 1995, 'F', 'CA', 8),\n" +
                    "        (8, 'Rosemary', 1990, 'F', 'AK', 7),\n" +
                    "        (9, 'Rosemary', 1990, 'F', 'AK', 3),\n" +
                    "        (10, 'James', 2000, 'M', 'MD', 512),\n" +
                    "        (11, 'Claudia', 2000, 'F', 'MD', 526),\n" +
                    "        (12, 'Xavier', 1990, 'M', 'MI', 7),\n" +
                    "        (13, 'Xavier', 1990, 'M', 'PA', 2),\n" +
                    "        (14, 'Xavier', 1990, 'M', 'AZ', 10),\n" +
                    "        (15, 'Hannah', 1990, 'F', 'NV', 65),\n" +
                    "        (16, 'Hannah', 1990, 'F', 'MN', 21),\n" +
                    "        (17, 'Hannah', 1990, 'F', 'TX', 8);";
            statement.execute(query1);
            statement.execute(query2);


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}