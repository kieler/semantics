import lejos.nxt.*;
import lejos.nxt.comm.RConsole;

public class Main {
    // Instantiate SCChart
    public static ${scchart_name} scchart = new ${scchart_name}();
    
    // Init Annotations
${inits}
    
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
${inputs}
            
        // Tick
        scchart.tick();
            
        // Update output annotations
${outputs}

        }
        
        RConsole.close();
    }
}