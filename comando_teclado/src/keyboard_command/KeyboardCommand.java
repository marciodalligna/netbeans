package keyboard_command;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Márcio Dall'Igna
 * @since 30-08-2012
 */
public class KeyboardCommand {

    public static void main(String[] args) throws IOException {
        
        File file = new File("/dev/ttyACM1"); //porta mapeada do Arduino. (no meu caso)
        
        OutputStreamWriter writer = new FileWriter(file);
        int io = 0;
        
        while(io != 50) { //char 2
            io = System.in.read(); //1 acende, 0 apaga

            writer.append((char) io);
            writer.flush();
        }
        
        writer.close();
        System.exit(0);
    }
}
