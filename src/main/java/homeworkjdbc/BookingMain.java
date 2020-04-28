package homeworkjdbc;
import java.sql.*;
public class BookingMain {
    /**
     * 1. define a database ("booking")
     * - open Command Prompt;
     * - sql -h localhost -U postgres postgres
     * - enter Password
     * postgres=# CREATE DATABASE booking;
     * - the response must be: CREATE DATABASE
     * postgres=# \l
     * - the new database must be in the list but it still not appear in the java project
     * postgres=# \c booking
     * - successfully connected to the database booking
     * - in project, Database, Data Sources and Driver change database to 'booking' and click Apply
     */
    protected static final String SQL_INSERT_IN_TABLE1 = "insert into accommodation " +
            "(type, bed_type, max_guest, description) values (?, ?, ?, ?)";
    private static final String SQL_INSERT_IN_TABLE2 = "insert into room_fair " +
            "(value, season) values (?, ?)";
    public static void main(String[] args) {
        //2. create the connection to the database booking
        Connection connection = myConnection(
                "postgresql",
                "localhost",
                "5432",
                "booking",
                "postgres",
                "Mega2020@"
        );
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
//        createTableAccommodation(connection);
//        createTableRoomFair(connection);
//        createViewOfLinkedTable(connection);
//        insertDataInTable(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        private static void insertDataInTable (Connection connection) throws SQLException
        {
            PreparedStatement insertData =
                    connection.prepareCall(SQL_INSERT_IN_TABLE2);
            insertData.setDouble(1, 821.56);
            insertData.setString(2, "spring");
            int row = insertData.executeUpdate();
            connection.commit();
        }
        private static void createViewOfLinkedTable (Connection connection) throws SQLException {
            PreparedStatement createView =
                    connection.prepareStatement(
                            "select * from accommodation a inner join room_fair r on a.id = r.id"
                    );
            createView.execute();
            connection.commit();
        }
        private static void createTableRoomFair (Connection connection) throws SQLException {
            PreparedStatement createTable =
                    connection.prepareStatement(
                            "create table room_fair" +
                                    "(" +
                                    "id SERIAL not null," +
                                    "value double precision," +
                                    "season varchar(32)," +
                                    "primary key(id))"
                    );
            createTable.execute();
            connection.commit();
        }
        private static void createTableAccommodation (Connection connection) throws SQLException {
            PreparedStatement createTable =
                    connection.prepareStatement(
                            "create table accommodation " +
                                    "(" +
                                    "id SERIAL not null," +
                                    "type varchar(32), " +
                                    "bed_type varchar(32),  " +
                                    "max_guest int," +
                                    "description varchar(512)," +
                                    "primary key(id))"
                    );
            createTable.execute();
            connection.commit();
        }
        // create a general connection method to the database
        private static Connection myConnection (
                String type, String host, String port,
                String dbName, String user, String password){
            String url = "jdbc:" + type + "://" + host + ":" + port + "/" +
                    dbName + "?user=" + user + "&password=" + password;
            try {
                return DriverManager.getConnection(url);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    }