Synchronous Program simple ( 6 )

input signal I : pure ;
output signal O : pure ;

State ( L_root_surface ) {
	Fork ( L_R_surface , 5 ) ;
	Fork ( L_root_depth , 6 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( L_R_surface ) {
	Fork ( L_R_S_surface , 3 ) ;
	Fork ( L_R_join , 5 ) ;
}

State ( L_R_join ) {
	Prio ( 2 ) ;
	Join ( L_R_depth ) ;
	If ( true ) {
		Emit ( O ) ;
		Abort ( ) ;
		Trans ( L_R_surface ) ;
	} ;
}

State ( L_R_depth ) {
	Prio ( 2 ) ;
	Trans ( L_R_join ) ;
}

State ( L_R_E_surface ) {
	Prio ( 4 ) ;
	Trans ( L_R_E_depth ) ;
}

State ( L_R_E_depth ) {
	Term ( ) ;
}

State ( L_R_S_surface ) {
	Prio ( 3 ) ;
	Trans ( L_R_S_depth ) ;
}

State ( L_R_S_depth ) {
	Prio ( 3 ) ;
	Pause ( ) ;
	If ( I ) {
		Trans ( L_R_E_surface ) ;
	} ;
	Trans ( L_R_S_depth ) ;
}