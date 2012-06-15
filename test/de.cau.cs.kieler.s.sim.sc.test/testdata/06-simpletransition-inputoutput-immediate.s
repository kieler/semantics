Synchronous Program syncchart ( 5 )

input signal I : pure ;
output signal O : pure ;

State ( L_root_surface ) {
	Fork ( L_A_surface , 2 ) ;
	Fork ( L_root_depth , 5 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( L_B_surface ) {
	Prio ( 4 ) ;
	If ( true ) {
		Emit ( O ) ;
		Trans ( L_C_surface ) ;
	} ;
	Trans ( L_B_depth ) ;
}

State ( L_B_depth ) {
	Prio ( 4 ) ;
	Pause ( ) ;
	If ( true ) {
		Emit ( O ) ;
		Trans ( L_C_surface ) ;
	} ;
	Trans ( L_B_depth ) ;
}

State ( L_C_surface ) {
	Prio ( 3 ) ;
	Trans ( L_C_depth ) ;
}

State ( L_C_depth ) {
	Halt ( ) ;
}

State ( L_A_surface ) {
	Prio ( 2 ) ;
	Trans ( L_A_depth ) ;
}

State ( L_A_depth ) {
	Prio ( 2 ) ;
	Pause ( ) ;
	If ( I ) {
		Trans ( L_B_surface ) ;
	} ;
	Trans ( L_A_depth ) ;
}