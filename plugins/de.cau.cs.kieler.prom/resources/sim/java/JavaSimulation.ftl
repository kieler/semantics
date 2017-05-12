import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ${file_name} {

    public static ${model_name} model = new ${model_name}();

    public static void main(String[] args) {
        // Initialize 
        model.reset();
        sendVariables();
        
        while (true) {
           // Receive variables
           receiveVariables();
           
           // Reaction of model
           model.tick();
           
           // Send variables
           sendVariables();
        }
    }
    
    private static void receiveVariables() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String json = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void sendVariables() {
        String json = "{";
        
${outputs}
        
        json += "}";
        
        System.out.println(json);
    }
}