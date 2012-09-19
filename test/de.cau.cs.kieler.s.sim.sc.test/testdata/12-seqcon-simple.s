synchronous program sequential_concurrent_simple ( 10 )

output signal S ; ''

state ( L_root_surface ) {
	fork ( L_sequential_concurrent_simple__A_surface , 7 ) ;
	fork ( L_sequential_concurrent_simple__D2_surface , 4 ) ;
	fork ( L_sequential_concurrent_simple__F2_surface , 5 ) ;
	fork ( L_root_depth , 10 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_sequential_concurrent_simple__H_surface ) {
	prio ( 9 ) ;
	trans ( L_sequential_concurrent_simple__H_depth ) ;
}

state ( L_sequential_concurrent_simple__H_depth ) {
	halt ( ) ;
}

state ( L_sequential_concurrent_simple__E_surface ) {
	prio ( 8 ) ;
	trans ( L_sequential_concurrent_simple__E_depth ) ;
}

state ( L_sequential_concurrent_simple__E_depth ) {
	halt ( ) ;
}

state ( L_sequential_concurrent_simple__A_surface ) {
	prio ( 7 ) ;
	trans ( L_sequential_concurrent_simple__A_depth ) ;
}

state ( L_sequential_concurrent_simple__A_depth ) {
	prio ( 7 ) ;
	pause ( ) ;
	if ( not S ) {
		emit ( S ) ;
		trans ( L_sequential_concurrent_simple__B_surface ) ;
	} ;
	trans ( L_sequential_concurrent_simple__A_depth ) ;
}

state ( L_sequential_concurrent_simple__G2_surface ) {
	prio ( 6 ) ;
	trans ( L_sequential_concurrent_simple__G2_depth ) ;
}

state ( L_sequential_concurrent_simple__G2_depth ) {
	prio ( 6 ) ;
	pause ( ) ;
	if ( not S ) {
		trans ( L_sequential_concurrent_simple__H_surface ) ;
	} ;
	trans ( L_sequential_concurrent_simple__G2_depth ) ;
}

state ( L_sequential_concurrent_simple__F2_surface ) {
	prio ( 5 ) ;
	trans ( L_sequential_concurrent_simple__F2_depth ) ;
}

state ( L_sequential_concurrent_simple__F2_depth ) {
	prio ( 5 ) ;
	pause ( ) ;
	if ( not S ) {
		trans ( L_sequential_concurrent_simple__G2_surface ) ;
	} ;
	trans ( L_sequential_concurrent_simple__F2_depth ) ;
}

state ( L_sequential_concurrent_simple__D2_surface ) {
	prio ( 4 ) ;
	trans ( L_sequential_concurrent_simple__D2_depth ) ;
}

state ( L_sequential_concurrent_simple__D2_depth ) {
	prio ( 4 ) ;
	pause ( ) ;
	if ( S ) {
		trans ( L_sequential_concurrent_simple__E_surface ) ;
	} ;
	trans ( L_sequential_concurrent_simple__D2_depth ) ;
}

state ( L_sequential_concurrent_simple__B_surface ) {
	prio ( 3 ) ;
	if ( S ) {
		trans ( L_sequential_concurrent_simple__C_surface ) ;
	} ;
	trans ( L_sequential_concurrent_simple__B_depth ) ;
}

state ( L_sequential_concurrent_simple__B_depth ) {
	prio ( 3 ) ;
	pause ( ) ;
	if ( S ) {
		trans ( L_sequential_concurrent_simple__C_surface ) ;
	} ;
	trans ( L_sequential_concurrent_simple__B_depth ) ;
}

state ( L_sequential_concurrent_simple__C_surface ) {
	prio ( 2 ) ;
	trans ( L_sequential_concurrent_simple__C_depth ) ;
}

state ( L_sequential_concurrent_simple__C_depth ) {
	halt ( ) ;
}