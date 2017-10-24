<#-- Print -->
<#-- As output variable, if the value is not an empty string, print the string to the display.
         If autoReset is true then the string will be cleared after it has been printed. 
         
     Example for SCCharts:
         @Wrapper Print
         output string text; -->
<#macro Print autoReset=true>
    <@output>
        // Print to display
        if(scchart.${varName} != null && !scchart.${varName}.equals("")) {
            System.out.println(scchart.${varName});
            <#if autoReset>
            scchart.${varName} = "";
            </#if>
        }
    </@>
</#macro>

<#macro PrintInt autoReset=true sentinel='-1'>
    <@init>
        scchart.${varName} = ${sentinel};
    </@>
    <@output>
        // Print to display
        if(scchart.${varName} != ${sentinel}) {
            System.out.println(scchart.${varName});
            <#if autoReset>
            scchart.${varName} = ${sentinel};
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
        if(scchart.${varName} != null && !scchart.${varName}.equals("")) {
            LCD.drawString(scchart.${varName}, ${x}, ${y});
        }
    </@>
</#macro>

<#-- DrawInt -->
<#-- As output variable, print the variable to the display on the given coordinate.
         
     Example for SCCharts:
         @Wrapper Print
         output string text; -->
<#macro DrawInt x2='0' y2='0' sentinel='-1'>
    <@init>
        scchart.${varName} = ${sentinel};
    </@>
    <@output>
        // Draw on display
        if(scchart.${varName} != ${sentinel}) {
            LCD.drawInt(scchart.${varName}, ${x2}, ${y2});
        }
    </@>
</#macro>