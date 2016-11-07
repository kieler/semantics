/*****************************************************************************/
/* SIMULATION WRAPPER CODE
/*****************************************************************************/

#include <string.h>
#include <stdlib.h>
#include <stdio.h>

#include "cJSON.c"

${kico_code}

/*****************************************************************************/
/* SIMULATION WRAPPER CODE
/*****************************************************************************/

cJSON* output = 0;

void readInputs() {
	char buffer[10000];
	int i = 0;
	char c;
	// read next line
	for (i = 0; (c = getchar()) != '\n'; i++) {
		buffer[i] = c;
	}
	buffer[i] = 0;

	cJSON* object = 0;
	cJSON* child = 0;
	cJSON* present = 0;
	cJSON* value = 0;

	object = cJSON_Parse(buffer);

${inputs}
}

void writeOutputs() {
	cJSON* value;
	
${outputs}
}

int main(int argc, const char* argv[]) {
	reset();
	output = cJSON_CreateObject();
	readInputs();
	tick();
	while (1) {
		writeOutputs();
		char* outString = cJSON_Print(output);
		strip_white_spaces(outString);
		printf("%s\n", outString);
		fflush(stdout);
		output = cJSON_CreateObject();
		readInputs();
		tick();
	}
}
