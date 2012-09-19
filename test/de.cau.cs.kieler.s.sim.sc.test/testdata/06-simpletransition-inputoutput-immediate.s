synchronous program syncchart ( 7 )

input signal I ;
output signal O ; ''

state ( L_root_surface ) {
	fork ( L_H_surface , 3 ) ;
	fork ( L_root_depth , 7 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_H_B_surface ) {
	prio ( 6 ) ;
	if ( true ) {
		emit ( O ) ;
		trans ( L_H_C_surface ) ;
	} ;
	trans ( L_H_B_depth ) ;
}

state ( L_H_B_depth ) {
	prio ( 6 ) ;
	pause ( ) ;
	if ( true ) {
		emit ( O ) ;
		trans ( L_H_C_surface ) ;
	} ;
	trans ( L_H_B_depth ) ;
}

state ( L_H_C_surface ) {
	prio ( 5 ) ;
	trans ( L_H_C_depth ) ;
}

state ( L_H_C_depth ) {
	halt ( ) ;
}

state ( L_H_A_surface ) {
	prio ( 4 ) ;
	trans ( L_H_A_depth ) ;
}

state ( L_H_A_depth ) {
	prio ( 4 ) ;
	pause ( ) ;
	if ( I ) {
		trans ( L_H_B_surface ) ;
	} ;
	trans ( L_H_A_depth ) ;
}

state ( L_H_surface ) {
	fork ( L_H_A_surface , 4 ) ;
	fork ( L_H_surface2 , 3 ) ;
}

state ( L_H_surface2 ) {
	prio ( 3 ) ;
	if ( I ) {
		abort ( ) ;
		trans ( L_S_surface ) ;
	} ;
	trans ( L_H_depth ) ;
}

state ( L_H_depth ) {
	prio ( 3 ) ;
	pause ( ) ;
	if ( I ) {
		abort ( ) ;
		trans ( L_S_surface ) ;
	} ;
	trans ( L_H_depth ) ;
}

state ( L_S_surface ) {
	prio ( 2 ) ;
	trans ( L_S_depth ) ;
}

state ( L_S_depth ) {
	halt ( ) ;
}