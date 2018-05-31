<#include "/templates/Injection.ftl">

package sim.code; // ?? Default package?

<@inject position="header" />

import model.*; // ?? Default package?

public class ${target_basename} {

    public static ${model_class} model = new ${model_class}();
  
    public static int nextTick = 0;
    
    <@inject position="body" />
    
    public static void main(String[] args) {
        // Initialize 
        model.reset();
        nextTick = 1;
        
        <@inject position="init" />
        
        while (true) {
           // Read inputs
           <@inject position="input" />
           
           // Reaction of model
           model.tick();
           
           // Send outputs
           <@inject position="output" />
           
           // Increment tick count
           nextTick++;
        }
    }
}