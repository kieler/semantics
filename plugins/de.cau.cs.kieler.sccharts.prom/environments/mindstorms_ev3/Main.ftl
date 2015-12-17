import lejos.ev3.*;
import lejos.hardware.*;
import lejos.hardware.motor.*;
import lejos.hardware.port.*;
import lejos.hardware.sensor.*;
import lejos.robotics.*;

public class Main {
    // Instantiate SCChart
    public static ${model_name} scchart = new ${model_name}();
    
    public static void main(String[] args) {
        
        // Init Annotations
${inits}

        // Init SCChart
        System.out.println("running...");
        scchart.reset();
        
        // Tick loop
        while(!Button.ESCAPE.isDown()){
            
        // Update input annotations
${inputs}
        
        // Tick
        scchart.tick();
        
        // Update output annotations
${outputs}

        }
    }
}