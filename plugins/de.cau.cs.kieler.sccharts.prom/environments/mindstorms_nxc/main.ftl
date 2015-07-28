#include "${model_name}.nxc"

// Init Annotations
${inits}

/**
 * Main task. 
 * This is executed when the program is run.
 */
task main() {

    // Init SCChart
    reset();
    
    // Tick loop
    while(!ButtonPressed(BTNEXIT, false)){
    
        // Update input annotations
${inputs}
        
        // Tick
        tick();

        // Update output annotations
${outputs}

    }
}