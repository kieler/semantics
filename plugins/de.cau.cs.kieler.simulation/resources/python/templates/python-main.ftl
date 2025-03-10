<#include "/templates/injection.ftl">

<@inject position="header" />

from ${tickdata_type} import ${tickdata_type}

${tickdata_name}: ${tickdata_type} = ${tickdata_type}()

<@inject position="global-decl" /><#nt>
    
<@inject position="body" />

<@inject position="local-decl" /><#nt>
        
# Initialize 
${tickdata_name}.${reset_name}()
        
<@inject position="init" /><#nt>
        
while True:
    <@inject position="start-loop" /><#nt>

    # Read inputs
    <@inject position="input" /><#nt>
   
    <@inject position="pre-tick" /><#nt>

    # Reaction of model
    ${tickdata_name}.${tick_name}()
   
    <@inject position="post-tick" /><#nt>
   
    # Send outputs
    <@inject position="output" /><#nt>
   
    <@inject position="end-loop" /><#nt>


<@inject position="end-main" /><#nt>