<#include "/assets/JavaSimulationSnippets.ftl" >
package sim.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.*;

import model.*;

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
          String line = br.readLine();
          JSONObject json = new JSONObject(line);
          JSONArray vars = json.getJSONArray("variables");
          
          JSONObject var;
          int i = 0;
          
${inputs}
          
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
          // Ignore other input
        }
    }
    
    private static void sendVariables() {
        JSONObject json = new JSONObject();
        JSONArray vars = new JSONArray();
        json.put("variables", vars);

        JSONObject var;
      
${outputs}
    
        System.out.println(json.toString());
    }
}