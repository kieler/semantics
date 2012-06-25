Synchronous Program mySimpleSProgram ( 1 )

input signal I : pure ;
output signal O : pure ;

State ( start ) {
	Pause ( ) ;
	If ( I ) {
		Trans ( middle ) ;
	} ;
	Trans ( start ) ;
}

State ( middle ) { 
	//Pause();
	Emit ( O ) ;
	Trans ( end ) ;
}

State ( end ) {
	Halt ( ) ;
}
