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

     If autoFalse is set to true, the reset variable is set to false automatically. 

     Note that ResetClock directly depends on the implementation of the Clock annotation.

     Example for SCCharts:
         @Wrapper Clock, "5000" 
         input bool clockVariable;
         
         @Wrapper ResetClock, clockVariable;
         output bool resetClock; -->
<#macro ResetClock clockVariable autoFalse=true>
    <@output>
        // ResetClock
        if(scchart.${varname}){
            ${clockVariable}Counter = System.currentTimeMillis();
            <#if autoFalse>
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

<#-- TickLoopDuration -->
<#-- Sets the input variable to the duration that the last complete tick loop needed (in milliseconds).
     This means for the very first tick, the input variable is not set.
     
     Furthermore there can be a target duration specified (in milliseconds).
     If the tick loop takes less time than the target duration,
     the program will wait until the target duration has been reached.
     
     The input variable that uses this macro should be the first in the model,
     so that waiting for the target duration is the last action in the tick loop.
     
     Example for SCCharts:
         @Wrapper TickLoopDuration, "50" // Tick function should be called every 50 milliseconds.
         output int tickDuration; -->
<#macro TickLoopDuration targetMillis=0>
    <@init>
        long tickDurationCounter = System.currentTimeMillis();
        boolean isFirstTick = true;
    </@>
    <@input>
        // Don't set tick duration in very first tick
        if(isFirstTick) {
            isFirstTick = false;
        } else {
            // Set actual tick duration
            scchart.${varname} = new Long(System.currentTimeMillis() - tickDurationCounter).intValue();
            <#if targetMillis != 0 >
            // Wait until target duration of tick reached
            if ( tickDurationCounter + ${targetMillis} > System.currentTimeMillis() ) {
                try {
                    Thread.sleep((tickDurationCounter + ${targetMillis}) - System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            </#if>
            // Remember tick duration
            tickDurationCounter = System.currentTimeMillis();
        }
    </@>
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
         @Wrapper TickWakeUp
         input output int wakeUpTime = 0;  -->
<#macro TickWakeUp>
    <@input>
        // Wait until wake up time has been reached.
        long wakeUpTime = scchart.${varname};
        if ( wakeUpTime > System.currentTimeMillis() ) {
            try {
                Thread.sleep(wakeUpTime - System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Set input of model to new system time. This should be the old wake up time.
        scchart.${varname} = new Long(System.currentTimeMillis()).intValue();
        // The tick function should come next...
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