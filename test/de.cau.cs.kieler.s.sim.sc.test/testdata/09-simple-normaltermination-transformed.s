synchronous program simple ( 5 )

input signal I ;
output signal O ;
input signal L ; ''

state ( L_root_surface ) {
	fork ( L_R_surface , 2 ) ;
	fork ( L_root_depth , 5 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_R_S_surface ) {
	prio ( 4 ) ;
	trans ( L_R_S_depth ) ;
}

state ( L_R_S_depth ) {
	prio ( 4 ) ;
	pause ( ) ;
	if ( I ) {
		emit ( L ) ;
		trans ( L_R_E_surface ) ;
	} ;
	trans ( L_R_S_depth ) ;
}

state ( L_R_E_surface ) {
	prio ( 3 ) ;
	trans ( L_R_E_depth ) ;
}

state ( L_R_E_depth ) {
	prio ( 3 ) ;
	pause ( ) ;
	if ( L ) {
		trans ( L_R_E_surface ) ;
	} ;
	trans ( L_R_E_depth ) ;
}

state ( L_R_surface ) {
	fork ( L_R_S_surface , 4 ) ;
	fork ( L_R_depth , 2 ) ;
}

state ( L_R_depth ) {
	prio ( 2 ) ;
	pause ( ) ;
	if ( L ) {
		emit ( O ) ;
		abort ( ) ;
		trans ( L_R_surface ) ;
	} ;
	trans ( L_R_depth ) ;
}