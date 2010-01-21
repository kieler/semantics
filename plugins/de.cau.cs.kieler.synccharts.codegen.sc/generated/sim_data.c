// generated SC-code //
	
#include "sc.h"
#include "cJSON.h"
#include <string.h>

cJSON* output = 0;
cJSON* value = 0;
cJSON* stateArray = 0;

void JSONstate(char *state){
	cJSON_AddItemToArray(stateArray, cJSON_CreateString(state));
	if (cJSON_GetObjectItem(output, "state") == NULL){
		cJSON_AddItemToObject(output, "state", stateArray);
	}
}

void selectCid() {
	int act;

	_cid = 0;
	for (act = active; act > 1; act >>= 1){
		_cid++;
	}
}
			
void Test_O_O1(int status){
	value = cJSON_CreateObject();
	cJSON_AddItemToObject(value, "present", status?cJSON_CreateTrue():cJSON_CreateFalse());
	cJSON_AddItemToObject(output, "O1", value);
}

			
void Test_O_O2(int status){
	value = cJSON_CreateObject();
	cJSON_AddItemToObject(value, "present", status?cJSON_CreateTrue():cJSON_CreateFalse());
	cJSON_AddItemToObject(output, "O2", value);
}

	
void setInputs(){
  char buffer[2048];
  int i=0;
  char c;
  // read next line
  for (i=0; (c=getchar())!='\n'; i++){
    buffer[i]=c;
  }
  buffer[i]=0;
  
  //char* str = rcvMessage();
	cJSON* object = 0;
	cJSON* child = 0;
	cJSON* present = 0;
	cJSON* value = 0;

	object = cJSON_Parse(buffer);
	
  child = cJSON_GetObjectItem(object, "I");
	if (child != NULL){
		present = cJSON_GetObjectItem(child, "present");
		value = cJSON_GetObjectItem(child, "value");
		Test_I_I(present != NULL && present->type);
	}
}
	
void printOutputs(){
	printf("%s \n", cJSON_Print(output));
}
	
int main(int argc, const char* argv[]){
	
	stateArray = cJSON_CreateArray();
	output = cJSON_CreateObject();
	setInputs();
	tick(1);
	while(1){
		callOutputs();
		char* outString = cJSON_Print(output);
		strip_white_spaces(outString);
		printf("%s\n", outString);
		fflush(stdout);
		reset();
		output = cJSON_CreateObject();
		stateArray = cJSON_CreateArray();
		setInputs();
		tick(0);
	}
}
	