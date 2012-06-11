Synchronous Program hierarchy ( 8 )

input signal I : pure ;
output signal O : pure ;
signal L1 : pure ;
signal L2 : pure ;

State ( L_root_surface ) {
	Fork ( L_hierarchy__H_surface , 6 ) ;
	Fork ( L_hierarchy__C_surface , 3 ) ;
	Fork ( L_root_depth , 8 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( L_hierarchy__D_surface ) {
	Prio ( 7 ) ;
	Trans ( L_hierarchy__D_depth ) ;
}

State ( L_hierarchy__D_depth ) {
	Halt ( ) ;
}

State ( L_hierarchy__H_surface ) {
	Fork ( L_hierarchy__H_A_surface , 4 ) ;
	Fork ( L_hierarchy__H_depth , 6 ) ;
}

State ( L_hierarchy__H_depth ) {
	Prio ( 6 ) ;
	Pause ( ) ;
	Prio ( 2 ) ;
	If ( L2 ) {
		Emit ( O ) ;
		Abort ( ) ;
		Trans ( L_hierarchy__D_surface ) ;
	} ;
	Trans ( L_hierarchy__H_depth ) ;
}

State ( L_hierarchy__H_B_surface ) {
	Prio ( 5 ) ;
	Trans ( L_hierarchy__H_B_depth ) ;
}

State ( L_hierarchy__H_B_depth ) {
	Halt ( ) ;
}

State ( L_hierarchy__H_A_surface ) {
	Prio ( 4 ) ;
	Trans ( L_hierarchy__H_A_depth ) ;
}

State ( L_hierarchy__H_A_depth ) {
	Prio ( 4 ) ;
	Pause ( ) ;
	If ( I ) {
		Emit ( L1 ) ;
		Trans ( L_hierarchy__H_B_surface ) ;
	} ;
	Trans ( L_hierarchy__H_A_depth ) ;
}

State ( L_hierarchy__C_surface ) {
	Prio ( 3 ) ;
	Trans ( L_hierarchy__C_depth ) ;
}

State ( L_hierarchy__C_depth ) {
	Prio ( 3 ) ;
	Pause ( ) ;
	If ( L1 ) {
		Emit ( L2 ) ;
		Trans ( L_hierarchy__C_surface ) ;
	} ;
	Trans ( L_hierarchy__C_depth ) ;
}