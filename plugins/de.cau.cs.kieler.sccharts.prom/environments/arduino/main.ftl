// Declaration part of snippets
${decls}

void setup() {
    // Initialization part of snippets 
${inits}
    
    // Init model file
    reset();  
}

void loop() {

    // Input part of snippets
${inputs}
        
    // Reaction of model
    tick();

    // Output part of snippets
${outputs}
}