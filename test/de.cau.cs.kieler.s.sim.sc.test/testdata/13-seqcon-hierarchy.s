synchronous program sequential_concurrent_hierarchy ( 20 )

output signal L1 ;
signal L2 ;
input signal I ;
input signal E ;
output signal O1 ;
output signal O2 ; 

state ( L_root_surface ) {
	fork ( L_sequential_concurrent_hierarchy__G2_surface , 7 ) ;
	fork ( L_sequential_concurrent_hierarchy__L_surface , 9 ) ;
	fork ( L_sequential_concurrent_hierarchy__M_surface , 18 ) ;
	fork ( L_sequential_concurrent_hierarchy__I_surface , 6 ) ;
	fork ( L_root_depth , 20 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_sequential_concurrent_hierarchy__K_surface ) {
	prio ( 19 ) ;
	trans ( L_sequential_concurrent_hierarchy__K_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__K_depth ) {
	halt ( ) ;
}

state ( L_sequential_concurrent_hierarchy__M_surface ) {
	prio ( 17 ) ;
	if ( E ) {
		abort ( ) ;
		trans ( L_sequential_concurrent_hierarchy__E_surface ) ;
	} ;
	fork ( L_sequential_concurrent_hierarchy__M_A_surface , 16 ) ;
	fork ( L_sequential_concurrent_hierarchy__M_surface2 , 18 ) ;
}

state ( L_sequential_concurrent_hierarchy__M_surface2 ) {
	prio ( 13 ) ;
	if ( L1 ) {
		abort ( ) ;
		trans ( L_sequential_concurrent_hierarchy__D_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__M_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__M_depth ) {
	prio ( 18 ) ;
	pause ( ) ;
	prio ( 17 ) ;
	if ( E ) {
		abort ( ) ;
		trans ( L_sequential_concurrent_hierarchy__E_surface ) ;
	} ;
	prio ( 13 ) ;
	if ( L1 ) {
		abort ( ) ;
		trans ( L_sequential_concurrent_hierarchy__D_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__M_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__M_A_surface ) {
	prio ( 16 ) ;
	if ( I and not L1 ) {
		emit ( L1 ) ;
		trans ( L_sequential_concurrent_hierarchy__M_B_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__M_A_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__M_A_depth ) {
	prio ( 16 ) ;
	pause ( ) ;
	if ( I and not L1 ) {
		emit ( L1 ) ;
		trans ( L_sequential_concurrent_hierarchy__M_B_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__M_A_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__M_B_surface ) {
	prio ( 15 ) ;
	if ( L1 ) {
		emit ( O1 ) ;
		trans ( L_sequential_concurrent_hierarchy__M_C_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__M_B_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__M_B_depth ) {
	prio ( 15 ) ;
	pause ( ) ;
	if ( L1 ) {
		emit ( O1 ) ;
		trans ( L_sequential_concurrent_hierarchy__M_C_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__M_B_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__M_C_surface ) {
	prio ( 14 ) ;
	trans ( L_sequential_concurrent_hierarchy__M_C_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__M_C_depth ) {
	halt ( ) ;
}

state ( L_sequential_concurrent_hierarchy__E_surface ) {
	prio ( 11 ) ;
	trans ( L_sequential_concurrent_hierarchy__E_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__E_depth ) {
	halt ( ) ;
}

state ( L_sequential_concurrent_hierarchy__O_surface ) {
	prio ( 10 ) ;
	trans ( L_sequential_concurrent_hierarchy__O_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__O_depth ) {
	halt ( ) ;
}

state ( L_sequential_concurrent_hierarchy__L_surface ) {
	prio ( 9 ) ;
	if ( not L1 ) {
		trans ( L_sequential_concurrent_hierarchy__N_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__L_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__L_depth ) {
	prio ( 9 ) ;
	pause ( ) ;
	if ( not L1 ) {
		trans ( L_sequential_concurrent_hierarchy__N_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__L_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__N_surface ) {
	prio ( 8 ) ;
	trans ( L_sequential_concurrent_hierarchy__N_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__N_depth ) {
	prio ( 8 ) ;
	pause ( ) ;
	if ( not L1 ) {
		trans ( L_sequential_concurrent_hierarchy__O_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__N_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__G2_surface ) {
	prio ( 7 ) ;
	if ( L1 ) {
		emit ( L2 ) ;
		trans ( L_sequential_concurrent_hierarchy__H_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__G2_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__G2_depth ) {
	prio ( 7 ) ;
	pause ( ) ;
	if ( L1 ) {
		emit ( L2 ) ;
		trans ( L_sequential_concurrent_hierarchy__H_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__G2_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__I_surface ) {
	prio ( 6 ) ;
	if ( not L2 ) {
		trans ( L_sequential_concurrent_hierarchy__J_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__I_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__I_depth ) {
	prio ( 6 ) ;
	pause ( ) ;
	if ( not L2 ) {
		trans ( L_sequential_concurrent_hierarchy__J_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__I_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__J_surface ) {
	prio ( 5 ) ;
	trans ( L_sequential_concurrent_hierarchy__J_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__J_depth ) {
	prio ( 5 ) ;
	pause ( ) ;
	if ( not L2 ) {
		trans ( L_sequential_concurrent_hierarchy__K_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__J_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__D_surface ) {
	prio ( 4 ) ;
	if ( L2 ) {
		emit ( O2 ) ;
		trans ( L_sequential_concurrent_hierarchy__F_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__D_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__D_depth ) {
	prio ( 4 ) ;
	pause ( ) ;
	if ( L2 ) {
		emit ( O2 ) ;
		trans ( L_sequential_concurrent_hierarchy__F_surface ) ;
	} ;
	trans ( L_sequential_concurrent_hierarchy__D_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__F_surface ) {
	prio ( 3 ) ;
	trans ( L_sequential_concurrent_hierarchy__F_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__F_depth ) {
	halt ( ) ;
}

state ( L_sequential_concurrent_hierarchy__H_surface ) {
	prio ( 2 ) ;
	trans ( L_sequential_concurrent_hierarchy__H_depth ) ;
}

state ( L_sequential_concurrent_hierarchy__H_depth ) {
	halt ( ) ;
}