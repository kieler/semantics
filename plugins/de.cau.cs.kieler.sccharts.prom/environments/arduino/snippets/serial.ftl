<#-- SerialRate -->
<#-- As input or output variable, sets the rate for serial communication.
     This is done only once in the initialization.

     Example for SCCharts:
         @Wrapper SerialRate, "9600"
         output int serialRate; -->
<#macro SerialRate baud timeout=100>
    <@init>
        Serial.begin(${baud});
        Serial.setTimeout(${timeout});
        Serial.println("Serial ready!");
    </@>
</#macro>

<#-- Serial -->
<#-- As output variable, print the variable to the output.
     As input variable, read from the Serial up to the given buffer size.
     
     Example for SCCharts:
         @Wrapper Serial, "100"
         output string text; -->
<#macro Serial bufferSize autoReset=true autoFree=false>
    <@input>
        // Read serial if available
        if(!tickData.${varname}) {
            tickData.${varname} = new char[${bufferSize}];
            tickData.${varname}[0] = 0;
        }
        if(Serial.available()) {
            int length = Serial.readBytes(tickData.${varname}, ${bufferSize});
            tickData.${varname}[length] = 0; // Make string null terminated
        }
    </@>
    <@output>
        // Print to serial
        if(tickData.${varname}) {
            Serial.println(tickData.${varname});
            <#if autoReset>
            tickData.${varname}[0] = 0;
            </#if>
            <#if autoFree>
            free(tickData.${varname});
            </#if>
        }
    </@>
</#macro>
