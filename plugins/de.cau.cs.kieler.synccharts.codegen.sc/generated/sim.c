	
// generated SC-code //
#include "sc.h"

extern void JSONstate(char*);

typedef enum {I, O1, O2} signaltype;

const char *s2signame[] = {"I", "O1", "O2"};


void Test_I_I(){
	signals = signals | (1 << I);
}

void callOutputs(){
	  Test_O_O1(signals & (1 << O1));
	  Test_O_O2(signals & (1 << O2));
}

void reset(){
	signals = 0;
}

int tick(int isInit){

			TICKSTART(isInit, 2);

H1:
			FORK(A, 5);
			FORKE(H1_main);

A:
			JSONstate("//@innerStates.0/@regions.0/@innerStates.0/@regions.0/@innerStates.0");
			PAUSE;
	
			// static PRIO
			PRIO(6);
			GOTO(B);


B:
			JSONstate("//@innerStates.0/@regions.0/@innerStates.0/@regions.0/@innerStates.1");
			// this should be HALT; but for simulation:
			PAUSE;
			GOTO(B);

H1_main:
			JSONstate("//@innerStates.0/@regions.0/@innerStates.0");
			PAUSE;
		if (PRESENT(I)){
			ABORT;
			// static PRIO
			PRIO(1);
			GOTO(H2);
		}
			GOTO(H1_main);

H2:
			FORK(C, 3);
			FORKE(H2_main);

C:
			JSONstate("//@innerStates.0/@regions.0/@innerStates.1/@regions.0/@innerStates.0");
			PAUSE;
	
			// static PRIO
			PRIO(4);
			GOTO(D);


D:
			JSONstate("//@innerStates.0/@regions.0/@innerStates.1/@regions.0/@innerStates.1");
			// this should be HALT; but for simulation:
			PAUSE;
			GOTO(D);

H2_main:
			JSONstate("//@innerStates.0/@regions.0/@innerStates.1");
			PAUSE;
			ABORT;
			// static PRIO
			PRIO(2);
			GOTO(H1);

			TICKEND;
}
	