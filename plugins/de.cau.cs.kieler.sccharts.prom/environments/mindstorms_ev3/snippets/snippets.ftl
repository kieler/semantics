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
        if(!scchart.${varname}.equals("")){
            System.out.println(scchart.${varname});
            <#if autoReset == "true">
            scchart.${varname} = "";
            </#if>
        }
    </@>
</#macro>

<#-- Button -->
<#-- As input variable, sets the variable to true, iff the corresponding button on the Mindstorms brick is down.
     The buttons are ENTER, LEFT, RIGHT, UP, DOWN.

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
        EV3TouchSensor touchSensor${port} = new EV3TouchSensor(SensorPort.${port});
        float touchSensor${port}Samples[] = new float[touchSensor${port}.sampleSize()];
    </@>
    <@input>
        // Touch
        touchSensor${port}.getTouchMode().fetchSample(touchSensor${port}Samples, 0);
        scchart.${varname} = touchSensor${port}Samples[0] > 0;
    </@>
    <@release>
        // Touch ${port}
        touchSensor${port}.close();
    </@>
</#macro>

<#-- LightSensor -->
<#-- As input variable, reads the value of the light sensor, that is attached to the given port.
     The modes are:
         Red : Measures the intensity of a reflected red light
         Ambient : Measures the ambient light level

     Example for SCCharts:
         @Wrapper LightSensor, S3
         input float light; -->
 <#macro LightSensor port mode = "Ambient">
    <@init>
        <@InitLightSensor port />
        float lightSensor${port}Samples[] = new float[lightSensor${port}.sampleSize()];
    </@>
    <@input>
        // Light
        lightSensor${port}.getMode("${mode}").fetchSample(lightSensor${port}Samples, 0);
        scchart.${varname} = lightSensor${port}Samples[0];
    </@>
    <@release>
        // Light ${port}
        lightSensor${port}.close();
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
        <@InitLightSensor port />
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
    <@release>
        // Floodlight ${port}
        lightSensor${port}.close();
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
        <@InitRCXMotor port />
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
    <@release>
        // RCX Motor for RCX lamp
        rcxMotor${port}.close();
    </@>
</#macro>

<#-- EV3ButtonLED -->
<#-- As output variable, set pattern of button LED.
     Values are 0-9:
         0: turn off button lights
         1: static green light
         2: static red light
         3: static yellow light
         4: slowly blinking green light
         5: slowly blinking red light
         6: slowly blinking yellow light
         7: fast blinking green light
         8: fast blinking red light
         9: fast blinking yellow light
         
    Example for SCCharts:
        @Wrapper EV3ButtonLED
        output int ledPattern -->
<#macro EV3ButtonLED>
    <@output>
        // Pattern for on-board LED of EV3 brick.
        Button.LEDPattern(scchart.${varname});
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
    <@init>
        <@InitMotor port />
    </@>
    <@input>
        // Motor ${port}
        scchart.${varname} = motor${port}.getSpeed();
    </@>
    <@output>
        // Motor ${port}
        if (Math.abs(scchart.${varname}) != motor${port}.getSpeed()) {
            motor${port}.setSpeed(Math.abs(scchart.${varname}));
            if(scchart.${varname} == 0)
                <#if brake='true'>
                motor${port}.stop(true);
                <#else>
                motor${port}.flt(true);
                </#if>
            else if(scchart.${varname} > 0)
                motor${port}.forward();
            else if(scchart.${varname} < 0)
                motor${port}.backward();
        }
    </@>
    <@release>
        // Motor ${port}
        motor${port}.close();
    </@>
</#macro>

<#-- MotorIsMoving -->
<#-- As input variable, sets a boolean to true, iff the motor on the given port is moving.
     
     Example for SCCharts:
         @Wrapper MotorIsMoving, A
         input bool isMotorMoving; -->
<#macro MotorIsMoving port>
    <@init>
        <@InitMotor port />
    </@>
    <@input>
        // Motor ${port}
        scchart.${varname} = motor${port}.isMoving();
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
    <@init>
        <@InitMotor port />
    </@>
    <@input>
        // Motor ${port}
        scchart.${varname} = motor${port}.getTachoCount();
    </@>
    <@output>
        // Motor ${port}
        if(scchart.${varname} != 0){
            motor${port}.rotate(scchart.${varname}, true);
            scchart.${varname} = 0;
        }
    </@>
    <@release>
        // Motor ${port}
        motor${port}.close();
    </@>
</#macro>

<#-- Gyro -->
<#-- As input variable, read the value of the gyro sensor at the given port.
     
     Possible modes are:
         Angle : Measures the orientation of the sensor in degrees.
         Rate : Measures the angular velocity of the sensor in (degrees / second).
     
     Example:
     @Wrapper Gyro, S3, Angle
     input float angle; -->
<#macro Gyro port mode = "Angle">
    <@init>
        <@InitGyroSensor port />
        float gyroSensor${port}Samples[] = new float[gyroSensor${port}.sampleSize()];
    </@>
    <@input>
        // Gyro sensor
        gyroSensor${port}.getMode("${mode}").fetchSample(gyroSensor${port}Samples, 0);
        scchart.${varname} = gyroSensor${port}Samples[0];
    </@>
    <@release>
        // Gyro ${port}
        gyroSensor${port}.close();
    </@>
</#macro>

<#-- CalibrateGyro -->
<#-- As output variable, if the value is true, reset the gyro sensor at given port.
     The sensor should be motionless during calibration.
     
     If autoReset is set to true, the reset variable is set to false automatically. 
     
     Example for SCCharts:
         @Wrapper CalibrateGyro, S3;
         output bool resetGyro; -->
<#macro CalibrateGyro port autoReset = 'true'>
    <@init>
        <@InitGyroSensor port />
    </@>
    <@output>
        // Reset gyro sensor
        if(scchart.${varname}){
            gyroSensor${port}.reset();
            <#if autoReset == 'true'>
            scchart.${varname} = false;
            </#if>
        }
    </@>
</#macro>

<#-- Auxiliary macro to initialize a motor if it is not yet initialized.
     This macro is not meant to be used in a model file. -->
<#macro InitMotor port>
        <#if !((initializedMotors![])?seq_contains(port))>
        <#assign initializedMotors = (initializedMotors![]) + [port]>
        RegulatedMotor motor${port} = new EV3LargeRegulatedMotor(MotorPort.${port});
        </#if>
</#macro>

<#-- Auxiliary macro to initialize an RCX motor if it is not yet initialized.
     This macro is not meant to be used in a model file. -->
<#macro InitRCXMotor port>
        <#if !((initializedRCXMotors![])?seq_contains(port))>
        <#assign initializedRCXMotors = (initializedRCXMotors![]) + [port]>
        RCXMotor rcxMotor${port} = new RCXMotor(MotorPort.${port});
        </#if>
</#macro>

<#-- Auxiliary macro to initialize a light sensor if it is not yet initialized.
     This macro is not meant to be used in a model file. -->
<#macro InitLightSensor port>
        <#if !((initializedLights![])?seq_contains(port))>
        <#assign initializedLights = (initializedLights![]) + [port]>
        EV3ColorSensor lightSensor${port} = new EV3ColorSensor(SensorPort.${port});
        </#if>
</#macro>

<#-- Auxiliary macro to initialize a gyro sensor if it is not yet initialized.
     This macro is not meant to be used in a model file. -->
<#macro InitGyroSensor port>
        <#if !((initializedLights![])?seq_contains(port))>
        <#assign initializedLights = (initializedLights![]) + [port]>
        EV3GyroSensor gyroSensor${port} = new EV3GyroSensor(SensorPort.${port});
        </#if>
</#macro>