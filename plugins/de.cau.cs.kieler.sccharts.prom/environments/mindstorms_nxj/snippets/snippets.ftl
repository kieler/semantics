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
<#macro ResetClock clockVariable autoFalse = 'true'>
    <@output>
        // ResetClock
        if(scchart.${varname}){
            ${clockVariable}Counter = System.currentTimeMillis();
            <#if autoFalse == 'true'>
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

<#-- MaxTickDuration -->
<#-- As input variable, sets an int to the highest tick loop duration so far.
    
     Example for SCCharts:
         @Wrapper MaxTickDuration
         input int maxDuration; -->
<#macro MaxTickDuration>
    <@init>
        long maxTickDurationCounter = System.currentTimeMillis();
    </@>
    <@input>
        // Set max tick duration
        if(scchart.${varname} < (System.currentTimeMillis() - maxTickDurationCounter)) {
            scchart.${varname} =  new Long( (System.currentTimeMillis() - maxTickDurationCounter) ).intValue();
        }
        maxTickDurationCounter = System.currentTimeMillis();
    </@>
</#macro>

<#-- TickDuration -->
<#-- As output variable, waits until the tick loop duration is at least the target duration in milliseconds.
     Furthermore the variable of the model is set to the actual duration,
     which may be longer than the target duration.
    
     Note that this macro sets a variable although it is intended to be used on an output variable!
     
     The output variable that uses this macro should be the last in the model,
     so that waiting for the target duration is the last action in the tick loop. 
     
     Example for SCCharts:
         @Wrapper TickDuration, "50"
         output int tickDuration; -->
<#macro TickDuration targetMillis='0'>
    <@init>
        long tickDurationCounter = System.currentTimeMillis();
    </@>
    <@output>
        <#if targetMillis != '0' >
        // Wait until target duration of tick reached
        while ( tickDurationCounter + ${targetMillis} > System.currentTimeMillis() ) {
            // Busy waiting...
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

<#-- Print -->
<#-- As output variable, if the value is not an empty string, print the string to the display.
         If autoReset is true then the string will be cleared after it has been printed. 
         
     Example for SCCharts:
         @Wrapper Print
         output string text; -->
<#macro Print autoReset = "true">
    <@output>
        // Print to display
        if(scchart.${varname} != null && !scchart.${varname}.equals("")){
            System.out.println(scchart.${varname});
            <#if autoReset == "true">
            scchart.${varname} = "";
            </#if>
        }
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

<#-- CalibrateLightSensor -->
<#-- As output variable, calibrates the light sensor if the variable is true.
     A light sensor can return percent values where 0% is returned for the calibrated low value
     and 100% is returned for the calibrated high value. 
       
     To calibrate, signal has to be either "High" or "Low". 

     Example for SCCharts:
         @Wrapper CalibrateLightSensor, S3, High
         output bool calibrateWhite; -->
 <#macro CalibrateLightSensor port signal>
    <@output>
        // Calibrate light sensor
        if (scchart.${varname}) {
            scchart.${varname} = false;
            lightSensor${port}.calibrate${signal}();
        }
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

<#-- RCXLamp -->
<#-- As output variable, turns an RCX lamp on (variable is true) or off (variable is false).
     RCX lamps can be connected to the ports A, B, C and D.

     Example for SCCharts:
         @Wrapper RCXLamp, A 
         output bool lamp; -->
<#macro RCXLamp port>
    <@init>
        RCXMotor rcxMotor${port} = new RCXMotor(MotorPort.${port});
        // Provide base power for RCX lamp
        rcxMotor${port}.setPower(100);
        rcxMotor${port}.flt();
    </@>
    <@output>
        // RCX lamp ${port}
        if(scchart.${varname})
            rcxMotor${port}.forward();
        else
            rcxMotor${port}.flt();
    </@>
</#macro>

<#-- UltraSonic -->
<#-- As an input variable, sets variable to the measured distance. 

     Example for SCCharts:
         @Wrapper UltraSonic, S1
         input int distance;
-->
<#macro UltraSonic port >
    <@init>
        UltrasonicSensor usSensor${port} = new UltrasonicSensor(SensorPort.${port});
    </@>
    <@input>
        // Ultrasonic sensor
        scchart.${varname} = usSensor${port}.getDistance();
    </@>
</#macro>

<#-- Beep -->
<#-- As output variable, plays a warning beep as long as the variable is true.

     Example for SCCharts:
         @Wrapper Beep
         ouput bool warningBeep; -->
<#macro Beep>
    <@output>
        // Play beep sound
        if(scchart.${varname}) {
            Sound.beep();
        }
    </@>
</#macro>

<#-- Buzz -->
<#-- As output variable, plays a low buzz sound as long as the variable is true.

     Example for SCCharts:
         @Wrapper Beep
         ouput bool warningBeep; -->
<#macro Buzz>
    <@output>
        // Play buzz sound
        if(scchart.${varname}) {
            Sound.buzz();
        }
    </@>
</#macro>

<#-- BeepSequence -->
<#-- As output variable, plays a beep sequence if the variable is true and afterwards sets the variable to false.
     The direction of the beep sequence can either be up or down.
     
     Example for SCCharts:
         @Wrapper BeepSequence, Up
         ouput bool playBeepSequence; -->
<#macro BeepSequence direction = "Down">
    <@output>
        // Play sequence of beep tones
        if(scchart.${varname}) {
            scchart.${varname} = false;
            <#if direction == "Up">
            Sound.beepSequenceUp();
            <#elseif direction == "Down">
            Sound.beepSequence();
            </#if>
        }
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
        if (Math.abs(scchart.${varname}) != Motor.${port}.getSpeed()) {
            Motor.${port}.setSpeed(Math.abs(scchart.${varname}));
            if(scchart.${varname} == 0)
                <#if brake='true'>
                Motor.${port}.stop(true);
                <#else>
                Motor.${port}.flt(true);
                </#if>
            else if(scchart.${varname} > 0)
                Motor.${port}.forward();
            else if(scchart.${varname} < 0)
                Motor.${port}.backward();
        }
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
