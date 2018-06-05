<#include "/templates/injection.ftl">

<@inject position="header" />

#include "${tickdata_file}"

// The data for the model
${tickdata_type} ${tickdata_name};

// The next tick to be executed
int nextTick = 0;

<@inject position="body" />

int main(int argc, const char* argv[]) {
    // Initialize 
    reset(&${tickdata_name});
    nextTick = 1;
    
    <@inject position="init" /><#nt>
    
    // Tick loop
    while (1) {
        // Read inputs
        <@inject position="input" /><#nt>
  
        // Reaction of model
        tick(&${tickdata_name});
         
        // Send outputs
        <@inject position="output" /><#nt>
     
        // Update tick index
        nextTick++;
    }
}
