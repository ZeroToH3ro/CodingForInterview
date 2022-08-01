package Progress.ProgramsMustToKnow;

import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("./Progress/ProgramsMustToKnow/MyFile.txt", true);
            writer.write("HelloWorld");
            writer.write("\n");
            writer.write("Goood bye");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
