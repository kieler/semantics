<#-- LightSensor -->
<#macro LightSensor port getPerCentValue='true'>
    <@init>
        static LightSensor lightSensor${port} = new LightSensor(SensorPort.${port});
    </@>
    <@input>
        // Light
        <#if getPerCentValue=='true'>
            scchart.${varname} = lightSensor${port}.getLightValue();
        <#else>
            scchart.${varname} = lightSensor${port}.readNormalizedValue();
        </#if>
    </@>
    <@output>
        // Light
        lightSensor${port}.setLightValue(scchart.${varname});
    </@>
</#macro>

<#-- Floodlight -->
<#macro Floodlight port>
    <@init>
        static LightSensor lightSensorFloodlight${port} = new LightSensor(SensorPort.${port});
    </@>
    <@input>
        // Floodlight ${port}
        scchart.${varname} = lightSensorFloodlight${port}.getFloodlight();
    </@>
    <@output>
        // Floodlight ${port}
        lightSensorFloodlight${port}.setFloodlight(scchart.${varname});
    </@>
</#macro>

<#-- Clock -->
<#macro Clock millis>
    <@init>
        static long ${varname}Counter = System.currentTimeMillis();
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

<#-- MotorSpeed -->
<#macro MotorSpeed port>
    <@init>
        static NXTRegulatedMotor motor${port} = Motor.${port};
    </@>
    <@input>
        // Motor ${port}
        scchart.${varname} = motor${port}.getSpeed();
    </@>
    <@output>
        // Motor ${port}
        motor${port}.setSpeed(scchart.${varname} > 0 ? scchart.${varname} : -scchart.${varname});
        if(scchart.${varname} == 0)
            motor${port}.stop();
        else if(scchart.${varname} > 0)
            motor${port}.forward();
        else if(scchart.${varname} < 0)
            motor${port}.backward();
    </@>
</#macro>