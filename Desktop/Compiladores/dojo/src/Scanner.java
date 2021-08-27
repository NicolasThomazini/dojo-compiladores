import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Scanner {

    private char [] content; 

    public Scanner(String filename) {
        try {

            String txtAnalise;
            txtAnalise = new String(Files.readAllBytes(Paths.get(filename), StandardCharsets.UTF_8));
            content = txtAnalise.toCharArray();
        }
        catch ( Exception ex ){

            ex.printStackTrace();
        }
    }

    private boolean isNumber( char c ){

        return c >= '0' && c <= '9';
    }

    private boolean isChar( char c ){

        return c >= 'a' && c <= 'z';
    }

    private boolean isOperator( char c ){

        return c == '>' || c == '<' || c == '=' || c == '!';
    }

    private boolean isSpace( char c ){

        return c == ' ' || c == '\t' || c == '\n' || c == '\r';
    }  
}