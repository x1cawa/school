package alex.khodin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            String text = new String(Files.readAllBytes(Paths.get("./src/alex/khodin/Class.java")), StandardCharsets.UTF_8);
            text = text.replaceAll("public", "private");
            new File("./src/alex/khodin/newDir").mkdirs();
            PrintWriter out = new PrintWriter("./src/alex/khodin/newDir/NewClass.java");
            out.print(text);
            out.close();
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
