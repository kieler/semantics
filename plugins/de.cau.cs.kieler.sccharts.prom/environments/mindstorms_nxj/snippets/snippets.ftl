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

<#-- LightSensor -->
<#-- As input variable, reads the value of the light sensor, that is attached to the given port.

     Example for SCCharts:
         @Wrapper LightSensor, S3
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

<#-- Button -->
<#-- As input variable, sets the variable to true, iff the corresponding button on the Mindstorms brick is down.
     The buttons are ENTER, LEFT, RIGHT.

     Example for SCCharts:
         @Wrapper Button, ENTER 
         input bool isEnterDown; -->
<#macro Button buttonId>
    <@input>
        // Button
        scchart.${varname} = Button.${buttonId}.isDown();
    </@>
</#macro>

<#-- RCXLamp -->
<#-- As output variable, turns an RCX lamp on (variable is true) or off (variable is false).
     RCX lamps can be connected to the ports A, B, C and D.

     Example for SCCharts:
         @Wrapper RCXLamp, A 
         output bool lamp; -->
<#macro RCXLamp port>
    <@init>
        // Provide base power for RCX lamp
        Motor.${port}.setSpeed(720);
    </@>
    <@output>
        // RCX lamp ${port}
        if(scchart.${varname})
            Motor.${port}.forward();
        else
            Motor.${port}.flt();
    </@>
</#macro>

<#-- TouchSensor -->
<#-- As input variable, reads the touch sensor, that is attached to the given port.

     Example for SCCharts:
         @Wrapper TouchSensor, S3 
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
         @Wrapper Floodlight, S3 
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
         @Wrapper MotorIsMoving, A
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
     If the speed is zero and brake is true, the motor will stop nearly immediately.
     If brake is false, the motor will only lose all power, setting it to roll / float.
     
     Example for SCCharts:
         @Wrapper MotorSpeed, A
         @Wrapper MotorSpeed, B
         output int speed; -->
<#macro MotorSpeed port brake='true'>
    <@input>
        // Motor ${port}
        scchart.${varname} = Motor.${port}.getSpeed();
    </@>
    <@output>
        // Motor ${port}
        Motor.${port}.setSpeed(scchart.${varname} > 0 ? scchart.${varname} : -scchart.${varname});
        if(scchart.${varname} == 0)
            <#if brake='true'>
            Motor.${port}.stop();
            <#else>
            Motor.${port}.flt();
            </#if>
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
        This is done only if the variable's value is unequal zero
        and afterwards the variable is set back to zero.
     
     Example for SCCharts:
         @Wrapper MotorRotation, A
         output int rotateToDegrees; -->
<#macro MotorRotation port>
    <@input>
        // Motor ${port}
        scchart.${varname} = Motor.${port}.getTachoCount();
    </@>
    <@output>
        // Motor ${port}
        if(scchart.${varname} != 0){
            Motor.${port}.rotate(scchart.${varname}, true);
            scchart.${varname} = 0;
        }
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
