<#include "/assets/JavaSimulationSnippets.ftl" >
package sim.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.*;

import model.*;


public class ${file_basename} {

    public static ${model_name} model = new ${model_name}();
  
    public static int nextTick = 0;
    public static BufferedReader stdInReader = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        // Initialize 
        model.reset();
        sendVariables();
        nextTick = 1;
        while (true) {
           // Receive variables
           receiveVariables();
           
           // Reaction of model
           model.tick();
           
           // Send variables
           sendVariables();
           
           // Increment tick count
           nextTick++;
        }
    }
    
    private static void receiveVariables() {
        try {
          String line = stdInReader.readLine();
          JSONObject json = new JSONObject(line);
          JSONObject jsonVar;
          JSONObject arrayObject;
          JSONArray jsonArray;
          
${inputs}
        
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
          // Ignore other input
        }
    }
    
    private static void sendVariables() {
        JSONObject json = new JSONObject();
        JSONObject jsonVar;
        JSONObject arrayObject;
        JSONArray jsonArray;
        
${outputs}
    
        System.out.println(json.toString());
    }
}