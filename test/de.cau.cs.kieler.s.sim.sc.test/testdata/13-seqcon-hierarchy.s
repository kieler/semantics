synchronous program sequential_concurrent_hierarchy ( 14 )

output signal L1 ;
signal L2 ;
input signal I ;
input signal E ;
output signal O1 ;
output signal O2 ;

state ( L_root_surface ) {
	fork ( L__3072782_G2_surface , 5 ) ;
	fork ( L__3992269_L_surface , 6 ) ;
	fork ( L__22759222_M_surface , 13 ) ;
	fork ( L__21362968_I_surface , 3 ) ;
	fork ( L_root_depth , 14 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L__22759222_M_surface ) {
	prio ( 13 ) ;
	if ( E ) {
		abort ( ) ;
		trans ( L__22759222_E_surface ) ;
	} ;
	fork ( L__22759222_M_A_surface , 11 ) ;
	fork ( L__22759222_M_surface2 , 13 ) ;
}

state ( L__22759222_M_surface2 ) {
	prio ( 8 ) ;
	if ( L1 ) {
		abort ( ) ;
		trans ( L__22759222_D_surface ) ;
	} ;
	trans ( L__22759222_M_depth ) ;
}

state ( L__22759222_M_depth ) {
	prio ( 13 ) ;
	pause ( ) ;
	if ( E ) {
		abort ( ) ;
		trans ( L__22759222_E_surface ) ;
	} ;
	prio ( 8 ) ;
	if ( L1 ) {
		abort ( ) ;
		trans ( L__22759222_D_surface ) ;
	} ;
	trans ( L__22759222_M_depth ) ;
}

state ( L__22759222_M_A_surface ) {
	prio ( 11 ) ;
	if ( I and not L1 ) {
		emit ( L1 ) ;
		trans ( L__22759222_M_B_surface ) ;
	} ;
	trans ( L__22759222_M_A_depth ) ;
}

state ( L__22759222_M_A_depth ) {
	prio ( 11 ) ;
	pause ( ) ;
	if ( I and not L1 ) {
		emit ( L1 ) ;
		trans ( L__22759222_M_B_surface ) ;
	} ;
	trans ( L__22759222_M_A_depth ) ;
}

state ( L__22759222_M_B_surface ) {
	prio ( 10 ) ;
	if ( L1 ) {
		emit ( O1 ) ;
		trans ( L__22759222_M_C_surface ) ;
	} ;
	trans ( L__22759222_M_B_depth ) ;
}

state ( L__22759222_M_B_depth ) {
	prio ( 10 ) ;
	pause ( ) ;
	if ( L1 ) {
		emit ( O1 ) ;
		trans ( L__22759222_M_C_surface ) ;
	} ;
	trans ( L__22759222_M_B_depth ) ;
}

state ( L__3992269_N_surface ) {
	prio ( 7 ) ;
	trans ( L__3992269_N_depth ) ;
}

state ( L__3992269_N_depth ) {
	prio ( 7 ) ;
	pause ( ) ;
	if ( not L1 ) {
		trans ( L__3992269_O_surface ) ;
	} ;
	trans ( L__3992269_N_depth ) ;
}

state ( L__3992269_L_surface ) {
	prio ( 6 ) ;
	if ( not L1 ) {
		trans ( L__3992269_N_surface ) ;
	} ;
	trans ( L__3992269_L_depth ) ;
}

state ( L__3992269_L_depth ) {
	prio ( 6 ) ;
	pause ( ) ;
	if ( not L1 ) {
		trans ( L__3992269_N_surface ) ;
	} ;
	trans ( L__3992269_L_depth ) ;
}

state ( L__3072782_G2_surface ) {
	prio ( 5 ) ;
	if ( L1 ) {
		emit ( L2 ) ;
		trans ( L__3072782_H_surface ) ;
	} ;
	trans ( L__3072782_G2_depth ) ;
}

state ( L__3072782_G2_depth ) {
	prio ( 5 ) ;
	pause ( ) ;
	if ( L1 ) {
		emit ( L2 ) ;
		trans ( L__3072782_H_surface ) ;
	} ;
	trans ( L__3072782_G2_depth ) ;
}

state ( L__21362968_J_surface ) {
	prio ( 4 ) ;
	trans ( L__21362968_J_depth ) ;
}

state ( L__21362968_J_depth ) {
	prio ( 4 ) ;
	pause ( ) ;
	if ( not L2 ) {
		trans ( L__21362968_K_surface ) ;
	} ;
	trans ( L__21362968_J_depth ) ;
}

state ( L__21362968_I_surface ) {
	prio ( 3 ) ;
	if ( not L2 ) {
		trans ( L__21362968_J_surface ) ;
	} ;
	trans ( L__21362968_I_depth ) ;
}

state ( L__21362968_I_depth ) {
	prio ( 3 ) ;
	pause ( ) ;
	if ( not L2 ) {
		trans ( L__21362968_J_surface ) ;
	} ;
	trans ( L__21362968_I_depth ) ;
}

state ( L__22759222_D_surface ) {
	prio ( 2 ) ;
	if ( L2 ) {
		emit ( O2 ) ;
		trans ( L__22759222_F_surface ) ;
	} ;
	trans ( L__22759222_D_depth ) ;
}

state ( L__22759222_D_depth ) {
	prio ( 2 ) ;
	pause ( ) ;
	if ( L2 ) {
		emit ( O2 ) ;
		trans ( L__22759222_F_surface ) ;
	} ;
	trans ( L__22759222_D_depth ) ;
}

state ( L__3072782_H_surface ) {
	trans ( L__3072782_H_depth ) ;
}

state ( L__3072782_H_depth ) {
	halt ( ) ;
}

state ( L__3992269_O_surface ) {
	trans ( L__3992269_O_depth ) ;
}

state ( L__3992269_O_depth ) {
	halt ( ) ;
}

state ( L__22759222_M_C_surface ) {
	trans ( L__22759222_M_C_depth ) ;
}

state ( L__22759222_M_C_depth ) {
	halt ( ) ;
}

state ( L__22759222_E_surface ) {
	trans ( L__22759222_E_depth ) ;
}

state ( L__22759222_E_depth ) {
	halt ( ) ;
}

state ( L__22759222_F_surface ) {
	trans ( L__22759222_F_depth ) ;
}

state ( L__22759222_F_depth ) {
	halt ( ) ;
}

state ( L__21362968_K_surface ) {
	trans ( L__21362968_K_depth ) ;
}

state ( L__21362968_K_depth ) {
	halt ( ) ;
}