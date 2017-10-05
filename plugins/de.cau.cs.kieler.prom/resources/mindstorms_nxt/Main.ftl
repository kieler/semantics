import lejos.nxt.*;
import lejos.nxt.addon.*;
import lejos.nxt.comm.RConsole;

public class ${file_name} {
    // Instantiate SCChart
    public static ${model_name} scchart = new ${model_name}();
    
    public static void main(String[] args) {
        
        // RConsole is meant to be used
        // together with the nxjconsoleviewer program in the leJOS bin directory.
//        RConsole.openUSB(10000);
//        RConsole.println("RConsole opened");

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
        
        RConsole.close();
    }
}