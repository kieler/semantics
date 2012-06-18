Synchronous Program syncchart ( 6 )

input signal I : pure ;
output signal O : pure ;
signal L : pure ;

State ( L_root_surface ) {
	Fork ( _syncchart__A_surface , 3 ) ;
	Fork ( _syncchart__C_surface , 2 ) ;
	Fork ( L_root_depth , 6 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( _syncchart__D_surface ) {
	Prio ( 5 ) ;
	Trans ( _syncchart__D_depth ) ;
}

State ( _syncchart__D_depth ) {
	Halt ( ) ;
}

State ( _syncchart__B_surface ) {
	Prio ( 4 ) ;
	Trans ( _syncchart__B_depth ) ;
}

State ( _syncchart__B_depth ) {
	Halt ( ) ;
}

State ( _syncchart__A_surface ) {
	Prio ( 3 ) ;
	Trans ( _syncchart__A_depth ) ;
}

State ( _syncchart__A_depth ) {
	Prio ( 3 ) ;
	Pause ( ) ;
	If ( I ) {
		Emit ( L ) ;
		Trans ( _syncchart__B_surface ) ;
	} ;
	Trans ( _syncchart__A_depth ) ;
}

State ( _syncchart__C_surface ) {
	Prio ( 2 ) ;
	Trans ( _syncchart__C_depth ) ;
}

State ( _syncchart__C_depth ) {
	Prio ( 2 ) ;
	Pause ( ) ;
	If ( not L ) {
		Emit ( O ) ;
		Trans ( _syncchart__D_surface ) ;
	} ;
	Trans ( _syncchart__C_depth ) ;
}