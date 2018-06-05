<#include "/templates/injection.ftl">

<@inject position="header" />

public class ${target_basename} {

    public static ${tickdata_type} ${tickdata_name} = new ${tickdata_type}();
  
    public static int nextTick = 0;
    
    <@inject position="body" />
    
    public static void main(String[] args) {
        // Initialize 
        ${tickdata_name}.reset();
        nextTick = 1;
        
        <@inject position="init" /><#nt>
        
        while (true) {
           // Read inputs
           <@inject position="input" /><#nt>
           
           // Reaction of model
           ${tickdata_name}.tick();
           
           // Send outputs
           <@inject position="output" /><#nt>
           
           // Increment tick count
           nextTick++;
        }
    }
}