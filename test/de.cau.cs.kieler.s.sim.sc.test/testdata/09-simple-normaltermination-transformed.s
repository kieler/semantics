Synchronous Program simple ( 6 )

input signal I : pure ;
output signal O : pure ;
input signal L : pure ;

State ( L_root_surface ) {
	Fork ( L_R_surface , 5 ) ;
	Fork ( L_root_depth , 6 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( L_R_surface ) {
	Fork ( L_R_S_surface , 4 ) ;
	Fork ( L_R_depth , 5 ) ;
}

State ( L_R_depth ) {
	Prio ( 5 ) ;
	Pause ( ) ;
	Prio ( 2 ) ;
	If ( L ) {
		Emit ( O ) ;
		Abort ( ) ;
		Trans ( L_R_surface ) ;
	} ;
	Trans ( L_R_depth ) ;
}

State ( L_R_S_surface ) {
	Prio ( 4 ) ;
	Trans ( L_R_S_depth ) ;
}

State ( L_R_S_depth ) {
	Prio ( 4 ) ;
	Pause ( ) ;
	If ( I ) {
		Emit ( L ) ;
		Trans ( L_R_E_surface ) ;
	} ;
	Trans ( L_R_S_depth ) ;
}

State ( L_R_E_surface ) {
	Prio ( 3 ) ;
	Trans ( L_R_E_depth ) ;
}

State ( L_R_E_depth ) {
	Prio ( 3 ) ;
	Pause ( ) ;
	If ( L ) {
		Trans ( L_R_E_surface ) ;
	} ;
	Trans ( L_R_E_depth ) ;
}