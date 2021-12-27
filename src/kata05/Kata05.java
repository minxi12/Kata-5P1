package kata05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Kata05 {

    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.selectAll();
    }
}
