import lejos.nxt.*;
import lejos.nxt.comm.RConsole;

public class Main {
    // Instantiate SCChart
    public static Model scchart = new Model();
    
    // Init Annotations
        static long clockCounter = System.currentTimeMillis();
        static LightSensor lightSensorFloodlightS3 = new LightSensor(SensorPort.S3);
    
    public static void main(String[] args) {
        
          // RConsole is meant to be used
          // together with the nxjconsoleviewer program in the leJOS bin directory.
//        RConsole.openUSB(30000);
//        RConsole.println("RConsole opened");
        
        // Init SCChart
        scchart.reset();
        
        // Tick loop
        while(!Button.ESCAPE.isDown()){
            
        // Update input annotations
        // Clock
        scchart.clock = false;
        if ( clockCounter + 500 < System.currentTimeMillis() ){
            clockCounter= System.currentTimeMillis();
            scchart.clock = true;
        }
            
        // Tick
        scchart.tick();
            
        // Update output annotations
        // Floodlight S3
        lightSensorFloodlightS3.setFloodlight(scchart.floodlight);

        }
        
        RConsole.close();
    }
}