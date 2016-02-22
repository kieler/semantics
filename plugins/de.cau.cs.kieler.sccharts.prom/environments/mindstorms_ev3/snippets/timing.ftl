<#-- Clock -->
<#-- As input variable, sets a boolean variable to true after the given time (in milliseconds) has passed.

     Note that the ResetClock macro directly depends on this implementation. 

     Example for SCCharts:
         @Wrapper Clock, "1000"
         input bool clock; -->
<#macro Clock millis>
    <@init>
        long ${varname}Counter = System.currentTimeMillis();
    </@>
    <@input>
        // Clock
        scchart.${varname} = false;
        if ( ${varname}Counter + ${millis} < System.currentTimeMillis() ){
            ${varname}Counter= System.currentTimeMillis();
            scchart.${varname} = true;
        }
    </@>
</#macro>

<#-- ResetClock -->
<#-- As output variable, if the value is true, resets the clock with the given variable name.
     Thus the clock will wait until its full time intervall has elapsed before the clock's variable is set to true again.

     If autoFalse is set to 'true', the reset variable is set to false automatically. 

     Note that ResetClock directly depends on the implementation of the Clock annotation.

     Example for SCCharts:
         @Wrapper Clock, "5000" 
         input bool clockVariable;
         
         @Wrapper ResetClock, clockVariable;
         output bool resetClock; -->
<#macro ResetClock clockVariable autoFalse = 'true'>
    <@output>
        // ResetClock
        if(scchart.${varname}){
            ${clockVariable}Counter = System.currentTimeMillis();
            <#if autoFalse = 'true'>
            scchart.${varname} = false;
            </#if>
        }
    </@>
</#macro>

<#-- Time -->
<#-- As input variable, contains the elapsed time since program start in milliseconds.

    Example:
    @Wrapper Time
    input int time; -->
<#macro Time>
    <@init>
        // Timestamp of program start
        long startTime = System.currentTimeMillis();
    </@>
    <@input>
        // Time
        scchart.${varname} = new Long(System.currentTimeMillis() - startTime).intValue();
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
         output int tickDuration; -->
<#macro TickDuration targetMillis='0'>
    <@init>
        long tickDurationCounter = System.currentTimeMillis();
        boolean isFirstTick = true;
    </@>
    <@input>
        <#if targetMillis != '0' >
        // Wait until target duration of tick reached, but not in very first tick.
        if(isFirstTick) {
            isFirstTick = false;
        } else {
            while ( tickDurationCounter + ${targetMillis} > System.currentTimeMillis() ) {
                // Busy waiting...
            }
        }
        </#if>
        // Set actual tick duration
        scchart.${varname} = new Long(System.currentTimeMillis() - tickDurationCounter).intValue();
        tickDurationCounter = System.currentTimeMillis();
    </@>
</#macro>

<#-- Sleep -->
<#-- As output variable, if the variable is true,
        blocks the running thread on the Mindstorms robot for the given time (in milliseconds).
     
     Example for SCCharts:
         @Wrapper Sleep
         output int sleepTime; -->
<#macro Sleep>
    <@output>
        // Sleep
        if(scchart.${varname} > 0) {
            try {
                Thread.sleep(scchart.${varname});
            } catch (InterruptedException e) { }
        }
    </@>
</#macro>