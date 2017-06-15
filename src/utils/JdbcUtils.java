package utils;

import com.sun.istack.internal.Nullable;

import java.sql.*;

/**
 * Created by Lina on 2017.06.13.
 */
public class JdbcUtils {
    private static final String URL= "jdbc:mysql://127.0.0.1:3306/kcs"; // kai sukuriamas final daugiau jo  pakeisti nebegalima
    private static final String NAME = "root";
    private static final  String PASSWORD= "";

    @Nullable // tai anotacija programuotojui, kuri pasako, kad gali grazinti nuli
    public static Connection getConnection(){

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
            System.out.println("Prisijungta!\n");
        } catch (SQLException e) {
            System.out.println("Neprisijungta!!!\n");
            System.out.println();
        }

        return connection;
    }

    public static ResultSet getResultSet(Connection connection, String query){
        ResultSet resultSet = null;
        if (connection != null && query != null){
            try {
                Statement st = connection.createStatement();
                resultSet = st.executeQuery(query);
            } catch (SQLException e) {
                System.out.println("Sukurti statement nepavyko");
            }
        }
        return resultSet;
    }


    public static void print(ResultSet resultSet) {

        if (resultSet != null) {
            try {
                ResultSetMetaData metaData = resultSet.getMetaData();

                while (resultSet.next()) {
                    StringBuilder sb = new StringBuilder();
                    for(int i =1; i<= metaData.getColumnCount();i++){
                        sb.append(metaData.getColumnName(i)).append("=")
                                .append(resultSet.getObject(i)).append(" ");
            }
            System.out.println(sb.toString());
        }
                } catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }

    public static void update(Connection connection, String updateQuery){
        try {
            connection.createStatement().execute(updateQuery);
        } catch (SQLException e) {
            System.out.println("Nepavyko updatinti");
        }
    }

    public static boolean isTableExist(Connection connection, String tableName){
        boolean isTableExist = false;
        if (connection != null && StringUtils.isNotBlank(tableName)){
            try {
                DatabaseMetaData metaData = connection.getMetaData();
                ResultSet resultSet = metaData.getTables(null, null, tableName, null);
                isTableExist = resultSet.next();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return isTableExist;
    }


}
