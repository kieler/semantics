<#-- Clock -->
<#-- As input variable, sets a boolean variable to true after the given time (in milliseconds) has passed.

     Example for SCCharts:
         @Clock 1000 
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

     Example for SCCharts:
         @Clock 5000 
         input bool clockVariable;
         
         @ResetClock clockVariable;
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

<#-- LightSensor -->
<#-- As input variable, reads the value of the light sensor, that is attached to the given port.

     Example for SCCharts:
         @LightSensor S3
         input int light; -->
 <#macro LightSensor port getPerCentValue='true'>
    <@init>
        LightSensor lightSensor${port} = new LightSensor(SensorPort.${port});
    </@>
    <@input>
        // Light
        <#if getPerCentValue=='true'>
        scchart.${varname} = lightSensor${port}.readNormalizedValue();
        <#else>
        scchart.${varname} = lightSensor${port}.getLightValue();
        </#if>
    </@>
</#macro>

<#-- TouchSensor -->
<#-- As input variable, reads the touch sensor, that is attached to the given port.

     Example for SCCharts:
         @TouchSensor S3 
         input bool isTouchSensorPressed; -->
<#macro TouchSensor port>
    <@init>
        TouchSensor touchSensor${port} = new TouchSensor(SensorPort.${port});
    </@>
    <@input>
        // Touch
        scchart.${varname} = touchSensor${port}.isPressed();
    </@>
</#macro>

<#-- Floodlight -->
<#-- The Floodlight is the red lamp of a light sensor, that can be turned on and off.
     As input variable, reads the Floodlight state (on or off), that is attached to the given port.
     As output variable, turns the lamp on (true) or off (false).
     
     Example for SCCharts:
         @Floodlight S3 
         output bool floodlight; -->
<#macro Floodlight port>
    <@init>
        LightSensor lightSensorFloodlight${port} = new LightSensor(SensorPort.${port});
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

<#-- MotorIsMoving -->
<#-- As input variable, sets a boolean to true, iff the motor on the given port is moving.
     
     Example for SCCharts:
         @MotorIsMoving A 
         input bool isMotorMoving; -->
<#macro MotorIsMoving port>
    <@input>
        // Motor ${port}
        scchart.${varname} = Motor.${port}.isMoving();
    </@>
</#macro>

<#-- MotorSpeed -->
<#-- As input variable, reads the speed of the motor, that is attached to the given port.
     As output variable, sets the speed of the motor.
     Example for SCCharts:
         @MotorSpeed A
         @MotorSpeed B
         input bool speed; -->
<#macro MotorSpeed port>
    <@input>
        // Motor ${port}
        scchart.${varname} = Motor.${port}.getSpeed();
    </@>
    <@output>
        // Motor ${port}
        Motor.${port}.setSpeed(scchart.${varname} > 0 ? scchart.${varname} : -scchart.${varname});
        if(scchart.${varname} == 0)
            Motor.${port}.stop();
        else if(scchart.${varname} > 0)
            Motor.${port}.forward();
        else if(scchart.${varname} < 0)
            Motor.${port}.backward();
    </@>
</#macro>

<#-- MotorRotation -->
<#-- As input variable, reads the motor rotation in degrees.
     As output variable, commands the motor, that is attached to the given port,
            to rotate the variable's value in degrees.
        This is done only if the variable's value is unequal zero.
        Thus, after the Mindstorms motor has received the target rotation,
            the value of the variable should be reset back to zero. 
     
     Example for SCCharts:
         @MotorSpeed A
         @MotorSpeed B
         output int rotateToDegrees; -->
<#macro MotorRotation port>
    <@input>
        // Motor ${port}
        scchart.${varname} = Motor.${port}.getTachoCount();
    </@>
    <@output>
        // Motor ${port}
        if(scchart.${varname} != 0)
            Motor.${port}.rotate(scchart.${varname}, true);
    </@>
</#macro>

<#-- Sleep -->
<#-- As output variable, if the variable is true,
        blocks the running thread on the Mindstorms robot for the given time (in milliseconds).
     
     Example for SCCharts:
         @Sleep 500
         output bool blockThread; -->
<#macro Sleep millis>
    <@output>
        // Sleep ${millis}
        if(scchart.${varname} > 0) {
            try {
                Thread.sleep(scchart.${varname});
            } catch (InterruptedException e) { }
        }
    </@>
</#macro>
