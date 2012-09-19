synchronous program simple ( 4 )

input signal I ;
output signal O ; ''

state ( L_root_surface ) {
	fork ( L_A_surface , 2 ) ;
	fork ( L_root_depth , 4 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_B_surface ) {
	prio ( 3 ) ;
	trans ( L_B_depth ) ;
}

state ( L_B_depth ) {
	halt ( ) ;
}

state ( L_A_surface ) {
	prio ( 2 ) ;
	trans ( L_A_depth ) ;
}

state ( L_A_depth ) {
	prio ( 2 ) ;
	pause ( ) ;
	if ( I ) {
		emit ( O ) ;
		trans ( L_B_surface ) ;
	} ;
	trans ( L_A_depth ) ;
}