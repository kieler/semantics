#include "${model_name}.ino"

// Declarations
${decls}

void setup() {
    // Initializations
${inits}
    
    // Init model file
    reset();  
}

void loop() {

    // Inputs
${inputs}
        
    // Reaction of model
    tick();

    // Outputs
${outputs}
}