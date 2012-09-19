synchronous program syncchart ( 6 )

input signal I ;
output signal O ;
signal L ; ''

state ( L_root_surface ) {
	fork ( L_syncchart__A_surface , 3 ) ;
	fork ( L_syncchart__C_surface , 2 ) ;
	fork ( L_root_depth , 6 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_syncchart__D_surface ) {
	prio ( 5 ) ;
	trans ( L_syncchart__D_depth ) ;
}

state ( L_syncchart__D_depth ) {
	halt ( ) ;
}

state ( L_syncchart__B_surface ) {
	prio ( 4 ) ;
	trans ( L_syncchart__B_depth ) ;
}

state ( L_syncchart__B_depth ) {
	halt ( ) ;
}

state ( L_syncchart__A_surface ) {
	prio ( 3 ) ;
	trans ( L_syncchart__A_depth ) ;
}

state ( L_syncchart__A_depth ) {
	prio ( 3 ) ;
	pause ( ) ;
	if ( I ) {
		emit ( L ) ;
		trans ( L_syncchart__B_surface ) ;
	} ;
	trans ( L_syncchart__A_depth ) ;
}

state ( L_syncchart__C_surface ) {
	prio ( 2 ) ;
	trans ( L_syncchart__C_depth ) ;
}

state ( L_syncchart__C_depth ) {
	prio ( 2 ) ;
	pause ( ) ;
	if ( not L ) {
		emit ( O ) ;
		trans ( L_syncchart__D_surface ) ;
	} ;
	trans ( L_syncchart__C_depth ) ;
}