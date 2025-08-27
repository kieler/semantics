<#include "/assets/snippets/core.ftl" >
<#include "/assets/snippets/light.ftl" >
<#include "/assets/snippets/motor.ftl" >
<#include "/assets/snippets/print.ftl" >
<#include "/assets/snippets/sound.ftl" >
<#include "/assets/snippets/timing.ftl" >
<#include "/assets/snippets/touch_and_buttons.ftl" >
<#include "/assets/snippets/ultrasonic.ftl" >
package model;

import lejos.nxt.*;
import lejos.nxt.addon.*;
import lejos.nxt.comm.RConsole;

public class ${file_basename} {
    // Instantiate SCChart
    public static ${model_name} scchart = new ${model_name}();
    
    public static void main(String[] args) {
        
        // RConsole is meant to be used
        // together with the nxjconsoleviewer program in the leJOS bin directory.
//        RConsole.openUSB(10000);
//        RConsole.println("RConsole opened");

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
        
        RConsole.close();
    }
}