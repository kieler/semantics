synchronous program simple ( 5 )

input signal I ;
output signal O ; ''

state ( L_root_surface ) {
	fork ( L_R_surface , 2 ) ;
	fork ( L_root_depth , 5 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_R_E_surface ) {
	prio ( 4 ) ;
	trans ( L_R_E_depth ) ;
}

state ( L_R_E_depth ) {
	term ( ) ;
}

state ( L_R_S_surface ) {
	prio ( 3 ) ;
	trans ( L_R_S_depth ) ;
}

state ( L_R_S_depth ) {
	prio ( 3 ) ;
	pause ( ) ;
	if ( I ) {
		trans ( L_R_E_surface ) ;
	} ;
	trans ( L_R_S_depth ) ;
}

state ( L_R_surface ) {
	fork ( L_R_S_surface , 3 ) ;
	fork ( L_R_join , 2 ) ;
}

state ( L_R_join ) {
	prio ( 2 ) ;
	join ( L_R_depth ) ;
	if ( true ) {
		emit ( O ) ;
		abort ( ) ;
		trans ( L_R_surface ) ;
	} ;
}

state ( L_R_depth ) {
	prio ( 2 ) ;
	trans ( L_R_join ) ;
}