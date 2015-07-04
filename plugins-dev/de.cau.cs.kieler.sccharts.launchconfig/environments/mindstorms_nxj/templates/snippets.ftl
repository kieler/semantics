<#-- LightSensor port -->
<#macro LightSensor port>
    <@init>static LightSensor lightSensor${port} = new LightSensor(SensorPort.${port});</@><#t>
    <@input>scchart.${varname} = lightSensor${port}.getLightValue();</@><#t>
    <@output>lightSensor${port}.setLightValue(scchart.${varname});</@><#t>
</#macro>

<#-- Clock millis -->
<#macro Clock millis>
    <@init>static long ${varname}Counter = System.currentTimeMillis();</@><#t>
    <@input>
        scchart.${varname} = false;
        if ( ${varname}Counter + ${millis} < System.currentTimeMillis() ){
            ${varname}Counter= System.currentTimeMillis();
            scchart.${varname} = true;
        }
    </@input><#t>
</#macro>