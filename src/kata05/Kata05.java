package kata05;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import static kata05.CrearTabla.createNewTable;

public class Kata05 {

    public static void main(String[] args) throws IOException {
        String url = "C:/Users/Lou Minxi/Documents/NetBeansProjects/Kata05/mail.txt";
        List<String> email = kata5p1.MailListReader.read(url);
        
        InsertarDatosTabla PreparedStatement = new InsertarDatosTabla();
        for (String i : email) {
            PreparedStatement.insert(i);
        }
    }
}
