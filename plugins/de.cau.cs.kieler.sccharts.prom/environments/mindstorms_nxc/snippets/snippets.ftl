<#-- Clock -->
<#-- As input variable, sets a boolean variable to true after the given time (in clock cycles) has passed.

     Example for SCCharts:
         @Wrapper Clock, "1000"
         input bool clock; -->
<#macro Clock millis>
    <@init>
        long ${varname}Counter = 0;
    </@>
    <@input>
        // Clock
        ${varname} = false;
        if ( ${varname}Counter + ${millis} < CurrentTick() ){
            ${varname}Counter= CurrentTick();
            ${varname} = true;
        }
    </@>
</#macro>


<#-- LightSensor -->
<#-- As input variable, reads the value of the light sensor, that is attached to the given port.

     Example for SCCharts:
         @Wrapper LightSensor, S3
         input int light; -->
<#macro LightSensor port getPerCentValue='true'>
    <@init>
        SetSensorLight(${port}, true);
    </@>
    <@input>
        // Light
        <#if getPerCentValue=='true'>
            ${varname} = Sensor(${port});
        <#else>
            ${varname} = SensorRaw(${port});
        </#if>
    </@>
</#macro>


<#-- Floodlight -->
<#-- The Floodlight is the red lamp of a light sensor, that can be turned on and off.
     As input variable, reads the Floodlight state (on or off), that is attached to the given port.
     As output variable, turns the lamp on (true) or off (false).
     
     Example for SCCharts:
         @Wrapper Floodlight, S3 
         output bool floodlight; -->
<#macro Floodlight port>
    <@output>
        // Floodlight ${port}
        SetSensorLight(${port}, ${varname});
    </@>
</#macro>


<#-- MotorSpeed -->
<#-- As input variable, reads the speed of the motor (value from -100 to 100), that is attached to the given port.
     As output variable, sets the speed of the motor (value from -100 to 100).
     Example for SCCharts:
         @Wrapper MotorSpeed, A
         @Wrapper MotorSpeed, B
         output int speed; -->
<#macro MotorSpeed port>
    <@output>
        // Motor ${port}
        if(${varname} == 0)
            Off(OUT_${port});
        else if(${varname} > 0)
            OnFwd(OUT_${port}, ${varname});
        else if(${varname} < 0)
            OnRev(OUT_${port}, ${varname});
    </@>
</#macro>


<#-- Sleep -->
<#-- As output variable, if the variable is true,
        blocks the running thread on the Mindstorms robot for the given time (in milliseconds).
     
     Example for SCCharts:
         @Wrapper Sleep
         output int sleepTime; -->
<#macro Sleep millis>
    <@output>
        // Sleep ${millis}
        if(${varname} > 0)
            Wait(${varname});
    </@>
</#macro>