synchronous program hierarchy ( 8 )

input signal I ;
output signal O ;
signal L1 ;
signal L2 ;
signal L3 ; ''

state ( L_root_surface ) {
	fork ( L_hierarchy__H_surface , 2 ) ;
	fork ( L_hierarchy__D_surface , 5 ) ;
	fork ( L_root_depth , 8 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_hierarchy__E_surface ) {
	prio ( 7 ) ;
	trans ( L_hierarchy__E_depth ) ;
}

state ( L_hierarchy__E_depth ) {
	halt ( ) ;
}

state ( L_hierarchy__H_A_surface ) {
	prio ( 6 ) ;
	trans ( L_hierarchy__H_A_depth ) ;
}

state ( L_hierarchy__H_A_depth ) {
	prio ( 6 ) ;
	pause ( ) ;
	if ( I ) {
		emit ( L1 ) ;
		trans ( L_hierarchy__H_B_surface ) ;
	} ;
	trans ( L_hierarchy__H_A_depth ) ;
}

state ( L_hierarchy__D_surface ) {
	prio ( 5 ) ;
	trans ( L_hierarchy__D_depth ) ;
}

state ( L_hierarchy__D_depth ) {
	prio ( 5 ) ;
	pause ( ) ;
	if ( L1 ) {
		emit ( L2 ) ;
		trans ( L_hierarchy__D_surface ) ;
	} ;
	trans ( L_hierarchy__D_depth ) ;
}

state ( L_hierarchy__H_B_surface ) {
	prio ( 4 ) ;
	if ( L2 ) {
		emit ( L3 ) ;
		trans ( L_hierarchy__H_C_surface ) ;
	} ;
	trans ( L_hierarchy__H_B_depth ) ;
}

state ( L_hierarchy__H_B_depth ) {
	prio ( 4 ) ;
	pause ( ) ;
	if ( L2 ) {
		emit ( L3 ) ;
		trans ( L_hierarchy__H_C_surface ) ;
	} ;
	trans ( L_hierarchy__H_B_depth ) ;
}

state ( L_hierarchy__H_C_surface ) {
	prio ( 3 ) ;
	trans ( L_hierarchy__H_C_depth ) ;
}

state ( L_hierarchy__H_C_depth ) {
	halt ( ) ;
}

state ( L_hierarchy__H_surface ) {
	fork ( L_hierarchy__H_A_surface , 6 ) ;
	fork ( L_hierarchy__H_depth , 2 ) ;
}

state ( L_hierarchy__H_depth ) {
	prio ( 2 ) ;
	pause ( ) ;
	if ( L3 ) {
		emit ( O ) ;
		abort ( ) ;
		trans ( L_hierarchy__E_surface ) ;
	} ;
	trans ( L_hierarchy__H_depth ) ;
}