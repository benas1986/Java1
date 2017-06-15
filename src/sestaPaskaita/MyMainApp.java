package sestaPaskaita;

import utils.JdbcUtils;

import java.sql.*;

/**
 * Created by Lina on 2017.06.13.
 */
public class MyMainApp {

    public static void main(String[] args) {

        Connection connection = JdbcUtils.getConnection();

        String query = "SELECT * FROM students";
        ResultSet resultSet = JdbcUtils.getResultSet(connection, query);
        JdbcUtils.print(resultSet);
        System.out.println();

        System.out.println("Pakeisti studento duomenys, kurio studento ID yra 1:\n");
        String updateQuery = "UPDATE students set name='Petras', surname='Rimsa', " +
                "phone='865444441', email='jonas.rimsa@gmail.com' where id =1";
        JdbcUtils.update(connection, updateQuery);
        resultSet = JdbcUtils.getResultSet(connection, query);
        JdbcUtils.print(resultSet);
        System.out.println();


        System.out.println("Studentų vardai ir pavardės, kurie gavo mažiau arba lygu 5\n");
        String query1 = "SELECT students.NAME, students.SURNAME, student_marks.MARK\n" +
                "FROM students\n" +
                "INNER JOIN student_marks ON students.ID=student_marks.STUDENT_ID\n" +
                "Where mark <= 5";
        resultSet = JdbcUtils.getResultSet(connection, query1);
        JdbcUtils.print(resultSet);
        System.out.println();

        //Sukurkite pagalbinę klasę QueryUtils. Realizuokite metodą kuris priims parametrus
        // Connection ir lentelės vardą. Patikrins ar pametrai ne null.
        // Grąžins boolean ar lentelė egzistuoja ar ne.

        if (JdbcUtils.isTableExist(connection, "students")) {
            System.out.println("students lentelė yra sukurta.");
        }

        String dummyquery = "create table myDummyTable" +
                "(ID int not null auto_increment, " +
                "vardai varchar(255) not null, " +
                "primary key (ID));";

        //Startavus programai sistema turi sukurki 3 lenteles students,
      //  student_address, student_marks. Patikrinkite ar lentelė egzistuoja.
        // Jei neegzistuoja sukurkite lentelę ir atspausdinkite, kad lentelė sukurta sėkmingai.
        // Jei egzistuoja atspausdinkite, kad lentelė jau egzistuoja.


        LentelesSukurimas(connection, dummyquery, "students");
        LentelesSukurimas(connection, dummyquery, "student_address");
        LentelesSukurimas(connection, dummyquery, "student_marks");
        LentelesSukurimas(connection, dummyquery, "myDummyTable");
    }

    public static void LentelesSukurimas(Connection connection, String query, String tableName){
        if (connection != null && JdbcUtils.isTableExist(connection, tableName) != false){
            System.out.println("Tokia lentelė egzistuoja pavadinimu ->" + tableName);
        } else {
            JdbcUtils.update(connection, query);
            System.out.println("Lentelė sukurta pavadinimu ->" + tableName);
        }
    }
}
