synchronous program mySimpleSProgram ( 1 )

input signal I : pure ;
output signal O : pure ;

state ( start ) {
	pause ( ) ;
	if ( I ) {
		trans ( middle ) ;
	} ;
	trans ( start ) ;
}

state ( middle ) { 
	pause();
	emit ( O ) ;
	trans ( end ) ;
}

state ( end ) {
	halt ( ) ;
}
