package sample.equip;
import java.sql.*;


    public abstract class SqlClient {
        private static Connection connection;
        private static Statement statement;

        public synchronized static void connect() {
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:C:\\JavaApp\\PerListWH40DE\\src\\WH40K.db");
                statement = connection.createStatement();
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public synchronized static void disconnect() {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

       public synchronized static String[] getThing (String thingName, String type) {
            String request = "SELECT * FROM " + type + " WHERE nameAm='" + thingName + "'";
            try (ResultSet set = statement.executeQuery(request)) {
                if (set.next()) {
                    ResultSetMetaData rsmd = set.getMetaData();
                    String[] attributes = new String[rsmd.getColumnCount()];
                    for (int i = 0; i<attributes.length; i++){
                        attributes[i] = set.getString(i+1);
                    }
                    return attributes;
                } else {
                    return null;
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

       public synchronized static String[] getAttributes (String name, String type){
            String request = "SELECT * FROM " + type + " WHERE nameAm='" + name + "'";
            try (ResultSet set = statement.executeQuery(request)) {
                if (set.next()) {
                    ResultSetMetaData rsmd = set.getMetaData();
                    String[] attributes = new String[rsmd.getColumnCount()];
                    for (int i = 0; i<attributes.length; i++){
                        attributes[i] = set.getString(i+1);
                    }
                    return attributes;
                } else {
                    return null;
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
