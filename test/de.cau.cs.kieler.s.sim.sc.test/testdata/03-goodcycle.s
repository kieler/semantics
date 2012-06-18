Synchronous Program instcommhiearchy ( 14 )

signal L1 : pure ;
signal L2 : pure ;
signal L3 : pure ;
input signal I : pure ;
output signal O : pure ;

State ( L_root_surface ) {
	Fork ( _instcommhiearchy__ABC_surface , 13 ) ;
	Fork ( _instcommhiearchy__X_surface , 10 ) ;
	Fork ( L_root_depth , 14 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( _instcommhiearchy__ABC_surface ) {
	Fork ( _instcommhiearchy__ABC_A_surface , 11 ) ;
	Fork ( _instcommhiearchy__ABC_depth , 13 ) ;
}

State ( _instcommhiearchy__ABC_depth ) {
	Halt ( ) ;
}

State ( _instcommhiearchy__ABC_BC_surface ) {
	Fork ( _instcommhiearchy__ABC_BC_B_surface , 9 ) ;
	Fork ( _instcommhiearchy__ABC_BC_depth , 12 ) ;
}

State ( _instcommhiearchy__ABC_BC_depth ) {
	Halt ( ) ;
}

State ( _instcommhiearchy__ABC_A_surface ) {
	Prio ( 11 ) ;
	Trans ( _instcommhiearchy__ABC_A_depth ) ;
}

State ( _instcommhiearchy__ABC_A_depth ) {
	Prio ( 11 ) ;
	Pause ( ) ;
	If ( I ) {
		Emit ( L1 ) ;
		Trans ( _instcommhiearchy__ABC_BC_surface ) ;
	} ;
	Trans ( _instcommhiearchy__ABC_A_depth ) ;
}

State ( _instcommhiearchy__X_surface ) {
	Prio ( 10 ) ;
	If ( L1 ) {
		Emit ( L2 ) ;
		Trans ( _instcommhiearchy__YZ_surface ) ;
	} ;
	Trans ( _instcommhiearchy__X_depth ) ;
}

State ( _instcommhiearchy__X_depth ) {
	Prio ( 10 ) ;
	Pause ( ) ;
	If ( L1 ) {
		Emit ( L2 ) ;
		Trans ( _instcommhiearchy__YZ_surface ) ;
	} ;
	Trans ( _instcommhiearchy__X_depth ) ;
}

State ( _instcommhiearchy__ABC_BC_B_surface ) {
	Prio ( 9 ) ;
	If ( L2 ) {
		Emit ( L3 ) ;
		Trans ( _instcommhiearchy__ABC_BC_C_surface ) ;
	} ;
	Trans ( _instcommhiearchy__ABC_BC_B_depth ) ;
}

State ( _instcommhiearchy__ABC_BC_B_depth ) {
	Prio ( 9 ) ;
	Pause ( ) ;
	If ( L2 ) {
		Emit ( L3 ) ;
		Trans ( _instcommhiearchy__ABC_BC_C_surface ) ;
	} ;
	Trans ( _instcommhiearchy__ABC_BC_B_depth ) ;
}

State ( _instcommhiearchy__ABC_BC_C_surface ) {
	Prio ( 8 ) ;
	Trans ( _instcommhiearchy__ABC_BC_C_depth ) ;
}

State ( _instcommhiearchy__ABC_BC_C_depth ) {
	Halt ( ) ;
}

State ( _instcommhiearchy__YZ_surface ) {
	Fork ( _instcommhiearchy__YZ_Y_surface , 5 ) ;
	Fork ( _instcommhiearchy__YZ_depth , 6 ) ;
}

State ( _instcommhiearchy__YZ_depth ) {
	Halt ( ) ;
}

State ( _instcommhiearchy__YZ_Y_surface ) {
	Prio ( 5 ) ;
	If ( L3 ) {
		Emit ( O ) ;
		Trans ( _instcommhiearchy__YZ_Z_surface ) ;
	} ;
	Trans ( _instcommhiearchy__YZ_Y_depth ) ;
}

State ( _instcommhiearchy__YZ_Y_depth ) {
	Prio ( 5 ) ;
	Pause ( ) ;
	If ( L3 ) {
		Emit ( O ) ;
		Trans ( _instcommhiearchy__YZ_Z_surface ) ;
	} ;
	Trans ( _instcommhiearchy__YZ_Y_depth ) ;
}

State ( _instcommhiearchy__YZ_Z_surface ) {
	Prio ( 4 ) ;
	Trans ( _instcommhiearchy__YZ_Z_depth ) ;
}

State ( _instcommhiearchy__YZ_Z_depth ) {
	Halt ( ) ;
}