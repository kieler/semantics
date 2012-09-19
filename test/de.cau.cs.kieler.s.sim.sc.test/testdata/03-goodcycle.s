synchronous program instcommhiearchy ( 11 )

signal L1 ;
signal L2 ;
signal L3 ;
input signal I ;
output signal O ; ''

state ( L_root_surface ) {
	fork ( L_instcommhiearchy__ABC_surface , 2 ) ;
	fork ( L_instcommhiearchy__X_surface , 9 ) ;
	fork ( L_root_depth , 11 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_instcommhiearchy__ABC_A_surface ) {
	prio ( 10 ) ;
	trans ( L_instcommhiearchy__ABC_A_depth ) ;
}

state ( L_instcommhiearchy__ABC_A_depth ) {
	prio ( 10 ) ;
	pause ( ) ;
	if ( I ) {
		emit ( L1 ) ;
		trans ( L_instcommhiearchy__ABC_BC_surface ) ;
	} ;
	trans ( L_instcommhiearchy__ABC_A_depth ) ;
}

state ( L_instcommhiearchy__X_surface ) {
	prio ( 9 ) ;
	if ( L1 ) {
		emit ( L2 ) ;
		trans ( L_instcommhiearchy__YZ_surface ) ;
	} ;
	trans ( L_instcommhiearchy__X_depth ) ;
}

state ( L_instcommhiearchy__X_depth ) {
	prio ( 9 ) ;
	pause ( ) ;
	if ( L1 ) {
		emit ( L2 ) ;
		trans ( L_instcommhiearchy__YZ_surface ) ;
	} ;
	trans ( L_instcommhiearchy__X_depth ) ;
}

state ( L_instcommhiearchy__ABC_BC_B_surface ) {
	prio ( 8 ) ;
	if ( L2 ) {
		emit ( L3 ) ;
		trans ( L_instcommhiearchy__ABC_BC_C_surface ) ;
	} ;
	trans ( L_instcommhiearchy__ABC_BC_B_depth ) ;
}

state ( L_instcommhiearchy__ABC_BC_B_depth ) {
	prio ( 8 ) ;
	pause ( ) ;
	if ( L2 ) {
		emit ( L3 ) ;
		trans ( L_instcommhiearchy__ABC_BC_C_surface ) ;
	} ;
	trans ( L_instcommhiearchy__ABC_BC_B_depth ) ;
}

state ( L_instcommhiearchy__YZ_Y_surface ) {
	prio ( 7 ) ;
	if ( L3 ) {
		emit ( O ) ;
		trans ( L_instcommhiearchy__YZ_Z_surface ) ;
	} ;
	trans ( L_instcommhiearchy__YZ_Y_depth ) ;
}

state ( L_instcommhiearchy__YZ_Y_depth ) {
	prio ( 7 ) ;
	pause ( ) ;
	if ( L3 ) {
		emit ( O ) ;
		trans ( L_instcommhiearchy__YZ_Z_surface ) ;
	} ;
	trans ( L_instcommhiearchy__YZ_Y_depth ) ;
}

state ( L_instcommhiearchy__YZ_Z_surface ) {
	prio ( 6 ) ;
	trans ( L_instcommhiearchy__YZ_Z_depth ) ;
}

state ( L_instcommhiearchy__YZ_Z_depth ) {
	halt ( ) ;
}

state ( L_instcommhiearchy__YZ_surface ) {
	fork ( L_instcommhiearchy__YZ_Y_surface , 7 ) ;
	fork ( L_instcommhiearchy__YZ_depth , 5 ) ;
}

state ( L_instcommhiearchy__YZ_depth ) {
	halt ( ) ;
}

state ( L_instcommhiearchy__ABC_BC_C_surface ) {
	prio ( 4 ) ;
	trans ( L_instcommhiearchy__ABC_BC_C_depth ) ;
}

state ( L_instcommhiearchy__ABC_BC_C_depth ) {
	halt ( ) ;
}

state ( L_instcommhiearchy__ABC_BC_surface ) {
	fork ( L_instcommhiearchy__ABC_BC_B_surface , 8 ) ;
	fork ( L_instcommhiearchy__ABC_BC_depth , 3 ) ;
}

state ( L_instcommhiearchy__ABC_BC_depth ) {
	halt ( ) ;
}

state ( L_instcommhiearchy__ABC_surface ) {
	fork ( L_instcommhiearchy__ABC_A_surface , 10 ) ;
	fork ( L_instcommhiearchy__ABC_depth , 2 ) ;
}

state ( L_instcommhiearchy__ABC_depth ) {
	halt ( ) ;
}