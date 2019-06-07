<#-- SerialRate -->
<#-- As input or output variable, sets the rate for serial communication.
     This is done only once in the initialization.

     Example for SCCharts:
         output int
         @macro "SerialRate" SerialRate = 9600
-->         
<#macro SerialRate position>
<#if position=="init">
<#list parameters["SerialRate"] as parameters>
Serial.begin(115200);
</#list>
</#if>
</#macro>


<#-- Serial -->
<#-- As output variable, print the variable to the output.
     As input variable, read from the Serial up to the given buffer size.
         
     Example for SCCharts:
         output string
         @macro "Serial" Serial 
-->         
<#macro Serial position>
<#if position=="output">
<#list parameters["Serial"] as parameters>
// Print to serial
if(${tickdata_name}${parameters.varName}[0]) {
    Serial.println(${tickdata_name}${parameters.varName});
    ${tickdata_name}${parameters.varName}[0] = 0;
}
</#list>
</#if>
</#macro>
