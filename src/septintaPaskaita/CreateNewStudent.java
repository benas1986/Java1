package septintaPaskaita;

import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by Lina on 2017.06.14.
 */
public class CreateNewStudent {

    private String name;
    private String surname;
    private String phone;
    private String email;


    private Scanner scanner;

    CreateNewStudent(Scanner sc) {
        this.scanner = sc;
    }

    public void createNewStudent() {
        // cia turi buti nuskaitoma, patikrinama ar yra db, irasoma i db.
        readValues();

        Connection connection = JdbcUtils.getConnection();
        String query = "SELECT * FROM students " +
                "where name='"+ name + "' and" +
                " surname='"+ surname + "'";
        ResultSet resultSet = JdbcUtils.getResultSet(connection, query);
        try {
            if (resultSet.next()) {
                System.out.println("Toks studentas egzistuoja");

            } else {
                System.out.println("Sukurtas naujas studentas");
                String studentCreateQuery = "INSERT INTO students(name, surname, phone, email)values('"
                        + name + "','" + surname + "','" + phone + "','" + email + "');";
                JdbcUtils.update(connection, studentCreateQuery);
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
        System.out.println("IVESKITE STUDENTO TELEFONO NUMERI");
        phone = scanner.next();
        System.out.println("IVESKITE STUDENTO EMAILA");
        email = scanner.next();
    }
}
