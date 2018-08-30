<#include "/templates/injection.ftl">

<@inject position="header" />

#include "${tickdata_file}"

// The data for the model
${tickdata_type} ${tickdata_name};

<@inject position="body" />

int main(int argc, const char* argv[]) {
    // Initialize 
    reset(&${tickdata_name});
    
    <@inject position="init" /><#nt>
    
    // Tick loop
    while (1) {
        // Read inputs
        <@inject position="input" /><#nt>
  
        // Reaction of model
        tick(&${tickdata_name});
         
        // Send outputs
        <@inject position="output" /><#nt>
    }
}
