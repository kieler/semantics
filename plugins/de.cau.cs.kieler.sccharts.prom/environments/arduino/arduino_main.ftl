
void setup() {
${inits}
    
    // Init model file
    reset();
    
    // Workaround for not using loop()
    // to have all variables in one function scope.
    while(true){
        
        // Input snippets
${inputs}
        
        // Reaction of model
        tick();
        
        // Output snippets
${outputs}
        
        // Code that is normally run
        // after the loop() function of an Arduino
        if (serialEventRun) {
            serialEventRun();
        }
    }
}

// Not used.
void loop() {
}