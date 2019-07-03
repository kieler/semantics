<#include "/templates/injection.ftl">

<@inject position="header" /> 
#include "${tickdata_name}.h"

<@inject position="global-decl" /><#nt>

<@inject position="body" />

int main(int argc, const char* argv[]) {
    <@inject position="local-decl" /><#nt>
    
    <@inject position="init" /><#nt>
    
    // Tick loop
    int run = 1;
    do {
        <@inject position="start-loop" /><#nt>
    
        // Read inputs
        <@inject position="input" /><#nt>
        
        <@inject position="pre-tick" /><#nt>
        
        // Reaction of model
        ${tickdata_name}_step(<@inject position="step-parameter"/><#nt>);
        
        <@inject position="post-tick" /><#nt>
         
        // Send outputs
        <@inject position="output" /><#nt>
        
        <@inject position="end-loop" /><#nt>
    } while(run);
    
    <@inject position="end-main" /><#nt>
}