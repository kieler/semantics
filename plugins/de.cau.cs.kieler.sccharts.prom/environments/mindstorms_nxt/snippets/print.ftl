<#-- Print -->
<#-- As output variable, if the value is not an empty string, print the string to the display.
         If autoReset is true then the string will be cleared after it has been printed. 
         
     Example for SCCharts:
         @Wrapper Print
         output string text; -->
<#macro Print autoReset=true>
    <@output>
        // Print to display
        if(scchart.${varname} != null && !scchart.${varname}.equals("")) {
            System.out.println(scchart.${varname});
            <#if autoReset>
            scchart.${varname} = "";
            </#if>
        }
    </@>
</#macro>

<#-- DrawString -->
<#-- As output variable, print the variable to the display on the given coordinate.
         
     Example for SCCharts:
         @Wrapper Print
         output string text; -->
<#macro DrawString x='0' y='0'>
    <@output>
        // Draw on display
        if(scchart.${varname} != null && !scchart.${varname}.equals("")) {
            LCD.drawString(scchart.${varname}, ${x}, ${y});
        }
    </@>
</#macro>