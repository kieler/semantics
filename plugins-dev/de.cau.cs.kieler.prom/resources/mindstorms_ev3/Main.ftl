<#include "/assets/snippets/core.ftl" >
<#include "/assets/snippets/light.ftl" >
<#include "/assets/snippets/motor.ftl" >
<#include "/assets/snippets/print.ftl" >
<#include "/assets/snippets/sound.ftl" >
<#include "/assets/snippets/timing.ftl" >
<#include "/assets/snippets/touch_and_buttons.ftl" >
<#include "/assets/snippets/ultrasonic.ftl" >
<#include "/assets/snippets/ev3/gyro.ftl" >
<#include "/assets/snippets/ev3/light.ftl" >
<#include "/assets/snippets/ev3/motor.ftl" >
<#include "/assets/snippets/ev3/touch_and_buttons.ftl" >
<#include "/assets/snippets/ev3/ultrasonic.ftl" >
package model;

import lejos.ev3.*;
import lejos.hardware.*;
import lejos.hardware.motor.*;
import lejos.hardware.port.*;
import lejos.hardware.sensor.*;
import lejos.robotics.*;

public class ${file_basename} {
    // Instantiate SCChart
    public static ${model_name} scchart = new ${model_name}();
    
    public static void main(String[] args) {

        // Init SCChart
        System.out.println("running...");
        scchart.reset();
        
        // Init Annotations
${inits}
        
        // Tick loop
        while(!Button.ESCAPE.isDown()){
            
        // Update input annotations
${inputs}
        
        // Tick
        scchart.tick();
        
        // Update output annotations
${outputs}

        }
        
        // Free resources
${releases}
    }
}