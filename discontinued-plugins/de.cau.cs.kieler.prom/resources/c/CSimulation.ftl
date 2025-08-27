<#include "/assets/CSimulationSnippets.ftl" >
<#include "/assets/CSimulationWrapperSnippets.ftl" >
#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>

// Include JSON library and file to be simulated.
#include "../lib/cJSON.c"
#include "${compiled_model_loc}"

// Determines if a simin file with the json object should be generated,
// which can be used to feed the simulation when starting the executable not from within KIELER.
// #define WRITE_SIMIN_FILE

cJSON* output = 0;

// The data for the model
TickData tickData;

// The next tick to be executed
int nextTick = 0;

void receiveVariables() {
    char buffer[10000];
    int i = 0;
    char c;
    // read next line
    for (i = 0; (c = getchar()) != '\n'; i++) {
        buffer[i] = c;
    }
    buffer[i] = 0;

    cJSON *root = cJSON_Parse(buffer);
    cJSON *variable = 0;
    if(root != NULL) {
${sim_inputs}    

    }
  
    cJSON_Delete(root);
}

void sendVariables() {
    cJSON* root = cJSON_CreateObject();
  
    cJSON* variable = 0;
    cJSON* arr = 0;
    cJSON* arrIndices = 0;
    cJSON* arrValues = 0;
    
${sim_outputs}

    // Get JSON object as string
    char* outString = cJSON_Print(root);
    cJSON_Minify(outString);
    // Flush to stdout
    printf("%s\n", outString);
    fflush(stdout);
    
#ifdef WRITE_SIMIN_FILE
    // Flush to simin file
    FILE *file = fopen("json_output.simin", "w");
    if(file != NULL) {
      fprintf(file, "%s\n", outString);
      fclose(file);
    }
#endif

    cJSON_Delete(root);
}

int main(int argc, const char* argv[]) {
    // Initialize 
    reset(&tickData);
    sendVariables();
    nextTick = 1;
    
    // Initialize annotations
    ${decls}
    ${inits}
    
    // Tick loop
    while (1) {
        // Receive variables
        receiveVariables();
        
        // Update input annotations
        ${inputs}
  
        // Reaction of model
        tick(&tickData);
         
        // Update output annotations
        ${outputs}
        
        // Send variables
        sendVariables();
        
        // Update tick index
        nextTick++;
    }
}
