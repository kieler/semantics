synchronous program _18_valued_signals ( 6 )

output signal V : combine integer with * ;

state ( L_root_surface ) {
	fork ( L__18_valued_signals__A_surface , 2 ) ;
	fork ( L__18_valued_signals__C_surface , 4 ) ;
	fork ( L_root_depth , 6 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L__18_valued_signals__D_surface ) {
	prio ( 5 ) ;
	trans ( L__18_valued_signals__D_depth ) ;
}

state ( L__18_valued_signals__D_depth ) {
	halt ( ) ;
}

state ( L__18_valued_signals__C_surface ) {
	prio ( 4 ) ;
	trans ( L__18_valued_signals__C_depth ) ;
}

state ( L__18_valued_signals__C_depth ) {
	prio ( 4 ) ;
	pause ( ) ;
	if ( true ) {
		emit ( V ( 2 ) ) ;
		trans ( L__18_valued_signals__D_surface ) ;
	} ;
	trans ( L__18_valued_signals__C_depth ) ;
}

state ( L__18_valued_signals__B_surface ) {
	prio ( 3 ) ;
	trans ( L__18_valued_signals__B_depth ) ;
}

state ( L__18_valued_signals__B_depth ) {
	halt ( ) ;
}

state ( L__18_valued_signals__A_surface ) {
	prio ( 2 ) ;
	trans ( L__18_valued_signals__A_depth ) ;
}

state ( L__18_valued_signals__A_depth ) {
	prio ( 2 ) ;
	pause ( ) ;
	if ( true ) {
		emit ( V ( 5 ) ) ;
		trans ( L__18_valued_signals__B_surface ) ;
	} ;
	trans ( L__18_valued_signals__A_depth ) ;
}