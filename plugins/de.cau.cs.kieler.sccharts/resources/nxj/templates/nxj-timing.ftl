<#-- Clock -->
<#-- As input variable, sets a boolean variable to true after the given time (in milliseconds) has passed.

     Note that the ResetClock macro directly depends on this implementation. 

     Example for SCCharts:
         input bool 
         @macro "Clock", "1000" clock
-->
<#macro Clock position>
<#if position=="init">
<#list parameters["Clock"] as parameters>
        long ${parameters.varName}Counter = System.currentTimeMillis();
</#list>
</#if>
<#if position=="input">
<#list parameters["Clock"] as parameters>
        // Clock
        scchart.${parameters.varName} = false;
        if ( ${parameters.varName}Counter + ${parameters.parameter1!1000} < System.currentTimeMillis() ){
            ${parameters.varName}Counter= System.currentTimeMillis();
            scchart.${parameters.varName} = true;
        }
</#list>
</#if>
</#macro>

<#-- ResetClock -->
<#-- As output variable, if the value is true, resets the clock with the given variable name.
     Thus the clock will wait until its full time intervall has elapsed before the clock's variable is set to true again.

     If autoFalse is set to true, the reset variable is set to false automatically. 

     Note that ResetClock directly depends on the implementation of the Clock annotation.

     Example for SCCharts:
         input bool 
         @macro "Clock", "5000" clockVariable
         
         output bool 
         @macro "ResetClock", "clockVariable" resetClock
-->
<#macro ResetClock position>
<#if position=="output">
<#list parameters["ResetClock"] as parameters>
        // ResetClock
        if(scchart.${parameters.varName}){
            ${parameters.parameter1}Counter = System.currentTimeMillis();
            scchart.${parameters.varName} = false;
        }
</#list>
</#if>
</#macro>

<#-- Time -->
<#-- As input variable, contains the elapsed time since program start in milliseconds.

    Example:
        input int 
        @macro "Time" time
-->
<#macro Time position>
<#if position=="init">
<#list parameters["Time"] as parameters>
        // Timestamp of program start
        long startTime = System.currentTimeMillis();
</#list>
</#if>
<#if position=="input">
<#list parameters["Time"] as parameters>
        // Time
        scchart.${parameters.varName} = (int)(System.currentTimeMillis() - startTime);
</#list>
</#if>
</#macro>

<#-- TickLoopDuration -->
<#-- Sets the input variable to the duration that the last complete tick loop needed (in milliseconds).
     This means for the very first tick, the input variable is not set.
     
     Furthermore there can be a target duration specified (in milliseconds).
     If the tick loop takes less time than the target duration,
     the program will wait until the target duration has been reached.
     
     The input variable that uses this macro should be the first in the model,
     so that waiting for the target duration is the last action in the tick loop.
     
     Example for SCCharts: // Tick function should be called every 50 milliseconds.
         output int 
         @macro "TickLoopDuration", "50" tickDuration; -->
<#macro TickLoopDuration position>
<#if position=="init">
<#list parameters["TickLoopDuration"] as parameters>
        long tickDurationCounter = System.currentTimeMillis();
        boolean isFirstTick = true;
</#list>
</#if>
<#if position=="input">
<#list parameters["TickLoopDuration"] as parameters>
        // Don't set tick duration in very first tick
        if(isFirstTick) {
            isFirstTick = false;
        } else {
            // Set actual tick duration
            scchart.${parameters.varName} = (int)(System.currentTimeMillis() - tickDurationCounter);
            <#if (parameters.parameter1!0) != 0 >
            // Wait until target duration of tick reached
            if ( tickDurationCounter + ${parameters.parameter1} > System.currentTimeMillis() ) {
                try {
                    Thread.sleep((tickDurationCounter + ${parameters.parameter1}) - System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            </#if>
            // Remember tick duration
            tickDurationCounter = System.currentTimeMillis();
        }
</#list>
</#if>
</#macro>

<#-- TickWakeUp -->
<#-- Using this macro, the model can set the time when it will be executed next.

     As input variable, will contain the system time when the tick function was called.
     The model can then add an amount to this variable.
     The next tick function is delayed until this new wake up time has been reached. 
     
     The input variable that uses this macro should be the last in the model,
     so that waiting for the wake up is the last action before the tick function call.
     
     The time is always in milliseconds.
     
     Example for SCCharts:         
         input output int 
         @macro "TickWakeUp" wakeUpTime
-->
<#macro TickWakeUp position>
<#if position=="output">
<#list parameters["TickWakeUp"] as parameters>        
        // Set input of model to new system time. This should be the old wake up time.
        scchart.${parameters.varName} = (int)(System.currentTimeMillis());
        // The tick function should come next...
</#list>
</#if>
<#if position=="output">
<#list parameters["TickWakeUp"] as parameters>
        // Wait until wake up time has been reached.
        long wakeUpTime = scchart.${parameters.varName};
        if ( wakeUpTime > System.currentTimeMillis() ) {
            try {
                Thread.sleep(wakeUpTime - System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
</#list>
</#if>
</#macro>

<#-- Sleep -->
<#-- As output variable, if the variable is true,
        blocks the running thread on the Mindstorms robot for the given time (in milliseconds).
     
     Example for SCCharts:
         output int 
         @macro "Sleep" sleepTime
-->
<#macro Sleep position>
<#if position=="output">
<#list parameters["Sleep"] as parameters>
        // Sleep
        if(scchart.${parameters.varName} > 0) {
            try {
                Thread.sleep(scchart.${parameters.varName});
            } catch (InterruptedException e) { }
        }
</#list>
</#if>
</#macro>

<#-- TickCount -->
<#-- As input variable, counts the ticks.
     The initial tick is tick 0, the following are tick 1, 2, 3, ...
     
     Example for SCCharts:
         input int 
         @macro "TickCount" tickCount
-->
<#macro TickCount position>
<#if position=="init">
<#list parameters["Sleep"] as parameters>
      scchart.${parameters.varName} = -1; // Start with -1 because increasing is done before each tick.
</#list>
</#if>
<#if position=="input">
<#list parameters["Sleep"] as parameters>
        // TickCount
        scchart.${parameters.varName}++;
</#list>
</#if>
</#macro>