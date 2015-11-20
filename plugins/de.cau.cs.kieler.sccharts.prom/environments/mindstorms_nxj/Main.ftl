import lejos.nxt.*;
import lejos.nxt.comm.RConsole;

public class Main {
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
        println("running...");
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
    
    /**
     * Prints text for debugging.
     * If the RConsole is opened, the text is printed to the RConsole.
     * Otherwise the text is printed to the Mindstorms display.
     * 
     * You can use this method as hostcode in your model file.
     * 
     * @param text The text to be printed
     */
    public static void println(String text){
        if(RConsole.isOpen())
            RConsole.println(text);
        else
            System.out.println(text);
    }
}