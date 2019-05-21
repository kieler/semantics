<#-- Print -->
<#-- As output variable, if the value is not an empty string, print the string to the display.
         If autoReset is true then the string will be cleared after it has been printed. 
         
     Example for SCCharts:
         output string 
         @macro "Print" text
-->
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
         @macro "DrawString" text
-->
<#macro DrawString position>
<#if position=="init">
<#list parameters["DrawString"] as parameters>
        String lastDrawString${parameters.varName} = "";
</#list>
</#if>
<#if position=="output">
<#list parameters["DrawString"] as parameters>
// Draw on display
        if(scchart.${parameters.varName} != null && !scchart.${parameters.varName}.equals(lastDrawString${parameters.varName})) {
            for (int drawStringI = 0; drawStringI < lastDrawString${parameters.varName}.length() - 1; drawStringI++) {
                LCD.drawString(" ", ${parameters.parameter1!0} + drawStringI, ${parameters.parameter2!0});
            }
        
            lastDrawString${parameters.varName} = scchart.${parameters.varName};
            LCD.drawString(scchart.${parameters.varName}, ${parameters.parameter1!0}, ${parameters.parameter2!0});
        }
</#list>
</#if>
</#macro>

<#-- DrawInt -->
<#-- As output variable, print the variable to the display on the given coordinate.
         
     Example for SCCharts:
         output string 
         @macro "DrawInt", "0", "2" number
-->
<#macro DrawInt position>
<#if position=="init">
        String[] drawIntClear = new String[6];
        drawIntClear[0] = "";
        for (int drawIntI = 1; drawIntI < 6; drawIntI++) {
            drawIntClear[drawIntI] = drawIntClear[drawIntI - 1] + " ";
        }
<#list parameters["DrawInt"] as parameters>
        int lastDrawInt${parameters.varName} = -99991;
        int lastDrawIntLength${parameters.varName} = 0;
</#list>        
</#if>
<#if position=="output">
<#list parameters["DrawInt"] as parameters>
    if(scchart.${parameters.varName} != lastDrawInt${parameters.varName}) {
        lastDrawInt${parameters.varName} = scchart.${parameters.varName};
        if (lastDrawIntLength${parameters.varName} > 0) {
            int drawIntClearIndex = lastDrawIntLength${parameters.varName} < 6 ? lastDrawIntLength${parameters.varName} : 5;
            LCD.drawString(drawIntClear[drawIntClearIndex], ${parameters.parameter1!0}, ${parameters.parameter2!0});
        }
        LCD.drawInt(scchart.${parameters.varName}, ${parameters.parameter1!0}, ${parameters.parameter2!0});
        lastDrawIntLength${parameters.varName} = ("" + scchart.${parameters.varName}).length();
    }
</#list>        
</#if>
</#macro>