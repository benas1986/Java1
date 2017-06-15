package septintaPaskaita;

import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by Lina on 2017.06.14.
 */
public class WriteStudentAddress {
    private int id;
    private String name;
    private String surname;
    private int student_id;
    private String country;
    private String city;
    private String street;
    private String post_code;


    private Scanner scanner;

    WriteStudentAddress(Scanner sc) {
        this.scanner = sc;
    }

    public void writeStudentAddress() {
        // cia turi buti nuskaitoma, patikrinama ar yra db, irasoma i db.
        readValues();
        readAdress();
        Connection connection = JdbcUtils.getConnection();
        String query = "SELECT * FROM students " +
                "where name='" + name + "' and" +
                " surname='" + surname + "'";
        ResultSet resultSet = JdbcUtils.getResultSet(connection, query);
        try {
            if (resultSet.next()) {
                System.out.println("Toks studentas egzistuoja");

                student_id = findStudentId();

                String studentCreateQuery = "INSERT INTO student_address(student_id, country, city , street, post_code)values(" +
                        student_id + ",'" + country + "','" + city + "','" + street + "','" + post_code + "');";
                JdbcUtils.update(connection, studentCreateQuery);
                System.out.println("Studento adresas ivestas");
            } else {
                System.out.println("Toks vartotojas nerastas");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readValues() {
        System.out.println("IVESKITE STUDENTO VARDA");
        name = scanner.next();
        System.out.println("IVESKITE STUDENTO PAVARDE");
        surname = scanner.next();
    }

    public void readAdress() {
        System.out.println("IVESKITE STUDENTO SALI");
        country = scanner.next();
        System.out.println("IVESKITE STUDENTO MIESTA");
        city = scanner.next();
        System.out.println("IVESKITE STUDENTO GATVE");
        street = scanner.next();
        System.out.println("IVESKITE STUDENTO PASTO KODA");
        post_code = scanner.next();
    }

    public int findStudentId(){
        Connection connection = JdbcUtils.getConnection();
        String studentIdQuery = "SELECT id From students where name='" + name + "' and surname='" + surname + "';";
        ResultSet resultSet1 = JdbcUtils.getResultSet(connection, studentIdQuery);
        try {
            while(resultSet1.next()){
                id = (int) resultSet1.getObject(1);
                student_id = id;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  student_id;
    }

}
