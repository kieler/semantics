Synchronous Program hierarchy ( 9 )

input signal I : pure ;
output signal O : pure ;
signal L1 : pure ;
signal L2 : pure ;
signal L3 : pure ;

State ( L_root_surface ) {
	Fork ( L_hierarchy__H_surface , 7 ) ;
	Fork ( L_hierarchy__D_surface , 5 ) ;
	Fork ( L_root_depth , 9 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( L_hierarchy__E_surface ) {
	Prio ( 8 ) ;
	Trans ( L_hierarchy__E_depth ) ;
}

State ( L_hierarchy__E_depth ) {
	Halt ( ) ;
}

State ( L_hierarchy__H_surface ) {
	Fork ( L_hierarchy__H_A_surface , 6 ) ;
	Fork ( L_hierarchy__H_depth , 7 ) ;
}

State ( L_hierarchy__H_depth ) {
	Prio ( 7 ) ;
	Pause ( ) ;
	Prio ( 2 ) ;
	If ( L3 ) {
		Emit ( O ) ;
		Abort ( ) ;
		Trans ( L_hierarchy__E_surface ) ;
	} ;
	Trans ( L_hierarchy__H_depth ) ;
}

State ( L_hierarchy__H_A_surface ) {
	Prio ( 6 ) ;
	Trans ( L_hierarchy__H_A_depth ) ;
}

State ( L_hierarchy__H_A_depth ) {
	Prio ( 6 ) ;
	Pause ( ) ;
	If ( I ) {
		Emit ( L1 ) ;
		Trans ( L_hierarchy__H_B_surface ) ;
	} ;
	Trans ( L_hierarchy__H_A_depth ) ;
}

State ( L_hierarchy__D_surface ) {
	Prio ( 5 ) ;
	Trans ( L_hierarchy__D_depth ) ;
}

State ( L_hierarchy__D_depth ) {
	Prio ( 5 ) ;
	Pause ( ) ;
	If ( L1 ) {
		Emit ( L2 ) ;
		Trans ( L_hierarchy__D_surface ) ;
	} ;
	Trans ( L_hierarchy__D_depth ) ;
}

State ( L_hierarchy__H_B_surface ) {
	Prio ( 4 ) ;
	If ( L2 ) {
		Emit ( L3 ) ;
		Trans ( L_hierarchy__H_C_surface ) ;
	} ;
	Trans ( L_hierarchy__H_B_depth ) ;
}

State ( L_hierarchy__H_B_depth ) {
	Prio ( 4 ) ;
	Pause ( ) ;
	If ( L2 ) {
		Emit ( L3 ) ;
		Trans ( L_hierarchy__H_C_surface ) ;
	} ;
	Trans ( L_hierarchy__H_B_depth ) ;
}

State ( L_hierarchy__H_C_surface ) {
	Prio ( 3 ) ;
	Trans ( L_hierarchy__H_C_depth ) ;
}

State ( L_hierarchy__H_C_depth ) {
	Halt ( ) ;
}