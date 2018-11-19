<#-- Clock -->
<#-- As input variable, sets a boolean variable to true after the given time (in milliseconds) has passed.

     Note that the ResetClock macro directly depends on this implementation. 

     Example for SCCharts:
         @Wrapper Clock, "1000"
         input bool clock; -->
<#macro Clock millis>
    <@decl>
        unsigned long ${varname}Counter;
    </@>
    <@init>
        ${varname}Counter = millis();
    </@>
    <@input>
        // Clock
        tickData.${varname} = false;
        if((millis() - ${varname}Counter) > ${millis}){
            ${varname}Counter= millis();
            tickData.${varname} = true;
        }
    </@>
</#macro>

<#-- Time -->
<#-- As input variable, contains the elapsed time since program start in milliseconds.

    Example:
    @Wrapper Time
    input unsigned time; -->
<#macro Time>
    <@input>
        // Time
        tickData.${varname} = millis();
    </@>
</#macro>

<#-- Delay -->
<#-- As output variable, delays the execution by the variable value in milliseconds.

     Example for SCCharts:
         @Wrapper Delay
         output unsigned delayTime = 500; -->
<#macro Delay>
    <@output>
        if(tickData.${varname} > 0) {
            delay(tickData.${varname});
        }
    </@>
</#macro>

