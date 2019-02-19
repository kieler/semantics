<#include "/templates/injection.ftl">

<@inject position="header" />

#include "${tickdata_file}"

// The data for the model
${tickdata_type} ${tickdata_name};

<@inject position="global-decl" /><#nt>

<@inject position="body" />

int main(int argc, const char* argv[]) {
    <@inject position="local-decl" /><#nt>

    // Initialize 
    ${reset_name}(&${tickdata_name});
    
    <@inject position="init" /><#nt>
    
    // Tick loop
    while (1) {
        <@inject position="start-loop" /><#nt>
    
        // Read inputs
        <@inject position="input" /><#nt>
        
        <@inject position="pre-tick" /><#nt>
  
        // Reaction of model
        ${tick_name}(&${tickdata_name});
        
        <@inject position="post-tick" /><#nt>
         
        // Send outputs
        <@inject position="output" /><#nt>
        
        <@inject position="end-loop" /><#nt>
    }
    <@inject position="end-main" /><#nt>
}
