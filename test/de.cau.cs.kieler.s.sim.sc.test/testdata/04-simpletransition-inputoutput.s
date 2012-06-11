Synchronous Program _04_simpletransition ( 4 )

input signal I : pure ;
output signal O : pure ;

State ( L_root_surface ) {
	Fork ( L_S_surface , 2 ) ;
	Fork ( L_root_depth , 4 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( L_F_surface ) {
	Prio ( 3 ) ;
	Trans ( L_F_depth ) ;
}

State ( L_F_depth ) {
	Halt ( ) ;
}

State ( L_S_surface ) {
	Prio ( 2 ) ;
	Trans ( L_S_depth ) ;
}

State ( L_S_depth ) {
	Prio ( 2 ) ;
	Pause ( ) ;
	If ( I ) {
		Emit ( O ) ;
		Trans ( L_F_surface ) ;
	} ;
	Trans ( L_S_depth ) ;
}