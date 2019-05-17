<#-- Print -->
<#-- As output variable, if the value is not an empty string, print the string to the display.
         If autoReset is true then the string will be cleared after it has been printed. 
         
     Example for SCCharts:
         output string 
         @macro "Print" text; -->
<#macro Print position>
<#if position=="output">
<#list parameters["Print"] as parameters>
// Print to display
if(scchart.${parameters.varName} != null && !scchart.${parameters.varName}.equals("")) {
  System.out.println(scchart.${parameters.varName});
  <#if (parameters.parameter1!"true")=="true">
  scchart.${parameters.varName} = "";
  </#if>
}
</#list>
</#if>
</#macro>

<#-- DrawString -->
<#-- As output variable, print the variable to the display on the given coordinate.
         
     Example for SCCharts:
         output string 
         @macro "DrawString" text; -->
<#macro DrawString position>
<#if position=="output">
<#list parameters["DrawString"] as parameters>
// Draw on display
if(scchart.${parameters.varName} != null && !scchart.${parameters.varName}.equals("")) {
  LCD.drawString(scchart.${parameters.varName}, ${parameters.parameter1!0}, ${parameters.parameter2!0});
}
</#list>
</#if>
</#macro>

<#-- DrawInt -->
<#-- As output variable, print the variable to the display on the given coordinate.
         
     Example for SCCharts:
         @Wrapper Print
         output string text; -->
<#macro DrawInt position>
<#if position=="init">
<#list parameters["DrawInt"] as parameters>
        scchart.${parameters.varName} = ${parameters.parameter3!-9991};
</#list>        
</#if>
<#if position=="output">
<#list parameters["DrawInt"] as parameters>
if(scchart.${parameters.varName} != ${parameters.parameter3!-9991}) {
  LCD.drawInt(scchart.${parameters.varName}, ${parameters.parameter1!0}, ${parameters.parameter2!0});
}
</#list>        
</#if>
</#macro>