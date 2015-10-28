import lejos.nxt.*;
import lejos.nxt.comm.RConsole;

public class Main {
    // Instantiate SCChart
    public static NewModel scchart = new NewModel();
    
    // Init Annotations

    
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

            
        // Tick
        scchart.tick();
            
        // Update output annotations


        }
        
        RConsole.close();
    }
}