#include "${model_name}.nxc"

// Init annotations
${inits}

/**
 * Main task. 
 * This is executed when the program is run.
 */
task main() {

    // Init model file
    reset();
    
    // Tick loop
    while(!ButtonPressed(BTNEXIT, false)){
    
        // Update input snippets
${inputs}
        
        // Reaction of model
        tick();

        // Update output snippets
${outputs}
    }
}