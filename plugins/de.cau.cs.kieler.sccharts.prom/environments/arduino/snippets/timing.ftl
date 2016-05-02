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
        ${varname} = false;
        if((millis() - ${varname}Counter) > ${millis}){
            ${varname}Counter= millis();
            ${varname} = true;
        }
    </@>
</#macro>

<#-- ResetClock -->
<#-- As output variable, if the value is true, resets the clock with the given variable name.
     Thus the clock will wait until its full time intervall has elapsed before the clock's variable is set to true again.

     If autoFalse is set to true, the reset variable is set to false automatically. 

     Note that ResetClock directly depends on the implementation of the Clock annotation.

     Example for SCCharts:
         @Wrapper Clock, "5000" 
         input bool clockVariable;
         
         @Wrapper ResetClock, clockVariable;
         output bool resetClock; -->
<#macro ResetClock clockVariable autoFalse = 'true'>
    <@output>
        // ResetClock
        if(${varname}){
            ${clockVariable}Counter = millis();
            <#if autoFalse == 'true'>
            ${varname} = false;
            </#if>
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
        ${varname} = millis();
    </@>
</#macro>

<#-- TickDuration -->
<#-- As input variable, waits until the tick loop duration is at least the target duration in milliseconds.
     Furthermore the variable of the model is set to the actual duration,
     which may be longer than the target duration.
     
     The input variable that uses this macro should be the first in the model,
     so that waiting for the target duration is the last action in the tick loop. 
     
     Example for SCCharts:
         @Wrapper TickDuration, "50"
         output unsigned tickDuration; -->
<#macro TickDuration targetMillis='0'>
    <@decl>
        unsigned long tickDurationCounter;
        char isFirstTick;
    </@>
    <@init>
        tickDurationCounter = millis();
        isFirstTick = true;
    </@>
    <@input>
        // Don't set tick duration in very first tick
        if(isFirstTick) {
            isFirstTick = false;
        } else {
            // Set actual tick duration
            ${varname} = millis() - tickDurationCounter;
            <#if targetMillis != '0' >
            // Wait until target duration of tick reached
            if ( millis() - tickDurationCounter < ${targetMillis} ) {
                delay(${targetMillis} - (millis() - tickDurationCounter));
            }
            </#if>
            // Remember time
            tickDurationCounter = millis();
        }
    </@>
</#macro>

<#-- Delay -->
<#-- As output variable, delays the execution by the variable value in milliseconds.

     Example for SCCharts:
         @Wrapper Delay
         output unsigned delayTime = 500; -->
<#macro Delay>
    <@output>
        if(${varname} > 0) {
            delay(${varname});
        }
    </@>
</#macro>

