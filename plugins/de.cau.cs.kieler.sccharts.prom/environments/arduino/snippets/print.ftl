<#-- SerialRate -->
<#-- As output variable, sets the rate for serial communication.
     This is done only once in the initialization.

     Example for SCCharts:
         @Wrapper SerialRate
         output int serialRate = 9600; -->
<#macro SerialRate>
    <@init>
        Serial.begin(${varname});
    </@>
</#macro>

<#-- Print -->
<#-- As output variable, print the variable to the output.
         
     Example for SCCharts:
         @Wrapper Print
         output string text; -->
<#macro Print>
    <@output>
        // Print to display
        if(${varname} != null) {
            Serial.println(${varname});
        }
    </@>
</#macro>
