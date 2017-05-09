/*****************************************************************************/
/* SIMULATION WRAPPER CODE
/*****************************************************************************/

#include <string.h>
#include <stdlib.h>
#include <stdio.h>

#include "cJSON.c"
#include "${compiled_model_loc}"

/*****************************************************************************/
/* SIMULATION WRAPPER CODE
/*****************************************************************************/

cJSON* output = 0;

void receiveVariables() {
    char buffer[10000];
    int i = 0;
    char c;
    // read next line
    for (i = 0; (c = getchar()) != '\n'; i++) {
        buffer[i] = c;
    }
    buffer[i] = 0;

    cJSON * root = cJSON_Parse(buffer);
    cJSON* variable = 0;
    
${inputs}

    cJSON_Delete(root);
}

void sendVariables() {
    cJSON* root = cJSON_CreateObject();
    cJSON* variable = 0;
    
${outputs}
    
    char* outString = cJSON_Print(root);
    cJSON_Minify(outString);
    printf("%s\n", outString);
    fflush(stdout);
    
    cJSON_Delete(root);
}

int main(int argc, const char* argv[]) {
    // Initialize 
    reset();
    sendVariables();
    
    while (1) {
       // Receive variables
       receiveVariables();
       
       // Reaction of model
       tick();
       
       // Send variables
       sendVariables();
    }
}