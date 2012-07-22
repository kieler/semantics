Synchronous Program sequential_concurrent_simple ( 10 )

output signal S : pure ;

State ( L_root_surface ) {
	Fork ( L_sequential_concurrent_simple__A_surface , 7 ) ;
	Fork ( L_sequential_concurrent_simple__D2_surface , 4 ) ;
	Fork ( L_sequential_concurrent_simple__F2_surface , 5 ) ;
	Fork ( L_root_depth , 10 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( L_sequential_concurrent_simple__H_surface ) {
	Prio ( 9 ) ;
	Trans ( L_sequential_concurrent_simple__H_depth ) ;
}

State ( L_sequential_concurrent_simple__H_depth ) {
	Halt ( ) ;
}

State ( L_sequential_concurrent_simple__E_surface ) {
	Prio ( 8 ) ;
	Trans ( L_sequential_concurrent_simple__E_depth ) ;
}

State ( L_sequential_concurrent_simple__E_depth ) {
	Halt ( ) ;
}

State ( L_sequential_concurrent_simple__A_surface ) {
	Prio ( 7 ) ;
	Trans ( L_sequential_concurrent_simple__A_depth ) ;
}

State ( L_sequential_concurrent_simple__A_depth ) {
	Prio ( 7 ) ;
	Pause ( ) ;
	If ( not S ) {
		Emit ( S ) ;
		Trans ( L_sequential_concurrent_simple__B_surface ) ;
	} ;
	Trans ( L_sequential_concurrent_simple__A_depth ) ;
}

State ( L_sequential_concurrent_simple__G2_surface ) {
	Prio ( 6 ) ;
	Trans ( L_sequential_concurrent_simple__G2_depth ) ;
}

State ( L_sequential_concurrent_simple__G2_depth ) {
	Prio ( 6 ) ;
	Pause ( ) ;
	If ( not S ) {
		Trans ( L_sequential_concurrent_simple__H_surface ) ;
	} ;
	Trans ( L_sequential_concurrent_simple__G2_depth ) ;
}

State ( L_sequential_concurrent_simple__F2_surface ) {
	Prio ( 5 ) ;
	Trans ( L_sequential_concurrent_simple__F2_depth ) ;
}

State ( L_sequential_concurrent_simple__F2_depth ) {
	Prio ( 5 ) ;
	Pause ( ) ;
	If ( not S ) {
		Trans ( L_sequential_concurrent_simple__G2_surface ) ;
	} ;
	Trans ( L_sequential_concurrent_simple__F2_depth ) ;
}

State ( L_sequential_concurrent_simple__D2_surface ) {
	Prio ( 4 ) ;
	Trans ( L_sequential_concurrent_simple__D2_depth ) ;
}

State ( L_sequential_concurrent_simple__D2_depth ) {
	Prio ( 4 ) ;
	Pause ( ) ;
	If ( S ) {
		Trans ( L_sequential_concurrent_simple__E_surface ) ;
	} ;
	Trans ( L_sequential_concurrent_simple__D2_depth ) ;
}

State ( L_sequential_concurrent_simple__B_surface ) {
	Prio ( 3 ) ;
	If ( S ) {
		Trans ( L_sequential_concurrent_simple__C_surface ) ;
	} ;
	Trans ( L_sequential_concurrent_simple__B_depth ) ;
}

State ( L_sequential_concurrent_simple__B_depth ) {
	Prio ( 3 ) ;
	Pause ( ) ;
	If ( S ) {
		Trans ( L_sequential_concurrent_simple__C_surface ) ;
	} ;
	Trans ( L_sequential_concurrent_simple__B_depth ) ;
}

State ( L_sequential_concurrent_simple__C_surface ) {
	Prio ( 2 ) ;
	Trans ( L_sequential_concurrent_simple__C_depth ) ;
}

State ( L_sequential_concurrent_simple__C_depth ) {
	Halt ( ) ;
}