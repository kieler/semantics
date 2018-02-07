<#-- Toggle -->
<#-- As input variable, toggles the state of a boolean variable. 

     Example for SCCharts:
         @SimWrapper Toggle
         input bool b; -->
<#macro Toggle>
    <@input>
        // Toggle
        tickData.${varName} = !tickData.${varName};
    </@>
</#macro>