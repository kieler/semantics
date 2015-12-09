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
         input float light; -->
 <#macro LightSensor port>
    <@init>
        <#if !((initializedLights![])?seq_contains(port))>
        <#assign initializedLights = (initializedLights![]) + [port]>
        EV3ColorSensor lightSensor${port} = new EV3ColorSensor(SensorPort.${port});
        </#if>
        float lightSensor${port}Samples[] = new float[lightSensor${port}.sampleSize()];
    </@>
    <@input>
        // Light
        lightSensor${port}.getMode("Ambient").fetchSample(lightSensor${port}Samples, 0);
        scchart.${varname} = lightSensor${port}Samples[0];
    </@>
</#macro>

<#-- TouchSensor -->
<#-- As input variable, reads the touch sensor, that is attached to the given port.

     Example for SCCharts:
         @Wrapper TouchSensor, S3 
         input bool isTouchSensorPressed; -->
<#macro TouchSensor port>
    <@init>
        EV3TouchSensor touchSensor${port} = new EV3TouchSensor(SensorPort.${port});
        float touchSensor${port}Samples[] = new float[touchSensor${port}.sampleSize()];
    </@>
    <@input>
        // Touch
        touchSensor${port}.getTouchMode().fetchSample(touchSensor${port}Samples, 0);
        scchart.${varname} = touchSensor${port}Samples[0] > 0;
    </@>
</#macro>

<#-- Floodlight -->
<#-- The Floodlight is the red lamp of a light sensor, that can be turned on and off.
     As input variable, reads the Floodlight state (on or off), that is attached to the given port.
     As output variable, turns the lamp on (true) or off (false).
     
     Note: Switching the floodlight state on the new EV3ColorSensor is much slower than on the old NXT light sensor  (seconds vs milliseconds).
     
     Example for SCCharts:
         @Wrapper Floodlight, S3 
         output bool floodlight; -->
<#macro Floodlight port>
    <@init>
        <#if !((initializedLights![])?seq_contains(port))>
        <#assign initializedLights = (initializedLights![]) + [port]>
        EV3ColorSensor lightSensor${port} = new EV3ColorSensor(SensorPort.${port});
        </#if>
    </@>
    <@input>
        // Floodlight ${port}
        scchart.${varname} = (lightSensor${port}.getFloodlight() != Color.NONE);
    </@>
    <@output>
        // Floodlight ${port}
        if(scchart.${varname}) {
            if(lightSensor${port}.getFloodlight() != Color.RED){
                lightSensor${port}.setFloodlight(Color.RED);
            }
        } else {
            if(lightSensor${port}.getFloodlight() != Color.NONE){
                lightSensor${port}.setFloodlight(Color.NONE);
            }
        }
    </@>
</#macro>

<#-- MotorIsMoving -->
<#-- As input variable, sets a boolean to true, iff the motor on the given port is moving.
     
     Example for SCCharts:
         @Wrapper MotorIsMoving, A
         input bool isMotorMoving; -->
<#macro MotorIsMoving port>
    <@init>
        <#if !((initializedMotors![])?seq_contains(port))>
        <#assign initializedMotors = (initializedMotors![]) + [port]>
        RegulatedMotor motor${port} = new EV3LargeRegulatedMotor(MotorPort.${port});
        </#if>
    </@>
    <@input>
        // Motor ${port}
        scchart.${varname} = motor${port}.isMoving();
    </@>
</#macro>

<#-- MotorSpeed -->
<#-- As input variable, reads the speed of the motor, that is attached to the given port.
     As output variable, sets the speed of the motor.
     Example for SCCharts:
         @Wrapper MotorSpeed, A
         @Wrapper MotorSpeed, B
         output int speed; -->
<#macro MotorSpeed port>
    <@init>
        <#if !((initializedMotors![])?seq_contains(port))>
        <#assign initializedMotors = (initializedMotors![]) + [port]>
        RegulatedMotor motor${port} = new EV3LargeRegulatedMotor(MotorPort.${port});
        </#if>
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

<#-- MotorRotation -->
<#-- As input variable, reads the motor rotation in degrees.
     As output variable, commands the motor, that is attached to the given port,
            to rotate the variable's value in degrees.
        This is done only if the variable's value is unequal zero.
        Thus, after the Mindstorms motor has received the target rotation,
            the value of the variable should be reset back to zero. 
     
     Example for SCCharts:
         @Wrapper MotorRotation, A
         output int rotateToDegrees; -->
<#macro MotorRotation port>
    <@init>
        <#if !((initializedMotors![])?seq_contains(port))>
        <#assign initializedMotors = (initializedMotors![]) + [port]>
        RegulatedMotor motor${port} = new EV3LargeRegulatedMotor(MotorPort.${port});
        </#if>
    </@>
    <@input>
        // Motor ${port}
        scchart.${varname} = motor${port}.getTachoCount();
    </@>
    <@output>
        // Motor ${port}
        if(scchart.${varname} != 0)
            motor${port}.rotate(scchart.${varname}, true);
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
