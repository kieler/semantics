import lejos.nxt.*;

public class Main {
    
    // Instantiate SCChart
    public static ${scchart_name} scchart = new ${scchart_name}();
    
    // Init Annotations
    ${inits}
    
    public static void main(String[] args) {
    
        // Init SCChart
        scchart.reset();
        
        // Tick loop
        while(!Button.ESCAPE.isPressed()){
            
            // Update input annotations
            ${inputs}
            
            // Tick
            scchart.tick();
            
            // Update output annotations
            ${outputs}
        }
        
    }
    
}