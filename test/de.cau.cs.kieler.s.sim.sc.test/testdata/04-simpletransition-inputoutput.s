synchronous program _04_simpletransition ( 4 )

input signal I ;
output signal O ; 

state ( L_root_surface ) {
	fork ( L_S_surface , 2 ) ;
	fork ( L_root_depth , 4 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_F_surface ) {
	prio ( 3 ) ;
	trans ( L_F_depth ) ;
}

state ( L_F_depth ) {
	halt ( ) ;
}

state ( L_S_surface ) {
	prio ( 2 ) ;
	trans ( L_S_depth ) ;
}

state ( L_S_depth ) {
	prio ( 2 ) ;
	pause ( ) ;
	if ( I ) {
		emit ( O ) ;
		trans ( L_F_surface ) ;
	} ;
	trans ( L_S_depth ) ;
}