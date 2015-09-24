<#-- Clock -->
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
<#macro Floodlight port>
    <@output>
        // Floodlight ${port}
        SetSensorLight(${port}, ${varname});
    </@>
</#macro>


<#-- MotorSpeed -->
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
<#macro Sleep millis>
    <@output>
        // Sleep ${millis}
        if(${varname} > 0)
            Wait(${varname});
    </@>
</#macro>