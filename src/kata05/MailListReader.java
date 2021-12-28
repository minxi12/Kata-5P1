/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lou Minxi
 */
public class MailListReader {

    private static List<String> listaEmail = new ArrayList<>();

    public static List<String> read(String fileName) throws IOException {
        String nombre = fileName;
        BufferedReader buffer = new BufferedReader(new FileReader(nombre));

        String text = buffer.readLine();

        while (text != null) {
            if (text.contains("@") == true) {
                listaEmail.add(text);
            }
            text = buffer.readLine();
        }
        return listaEmail;
    }
}
