Synchronous Program ABRO2 ( 9 )

input signal A : pure ;
input signal B : pure ;
output signal O : pure ;

State ( L_root_surface ) {
	Fork ( L_WaitAB_surface , 7 ) ;
	Fork ( L_root_depth , 9 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( L_done_surface ) {
	Prio ( 8 ) ;
	Trans ( L_done_depth ) ;
}

State ( L_done_depth ) {
	Halt ( ) ;
}

State ( L_WaitAB_surface ) {
	Fork ( L_WaitAB__wA_surface , 4 ) ;
	Fork ( L_WaitAB__wB_surface , 3 ) ;
	Fork ( L_WaitAB_join , 7 ) ;
}

State ( L_WaitAB_join ) {
	Prio ( 2 ) ;
	Join ( L_WaitAB_depth ) ;
	If ( true ) {
		Emit ( O ) ;
		Abort ( ) ;
		Trans ( L_done_surface ) ;
	} ;
}

State ( L_WaitAB_depth ) {
	Prio ( 2 ) ;
	Trans ( L_WaitAB_join ) ;
}

State ( L_WaitAB__dB_surface ) {
	Prio ( 6 ) ;
	Trans ( L_WaitAB__dB_depth ) ;
}

State ( L_WaitAB__dB_depth ) {
	Term ( ) ;
}

State ( L_WaitAB__dA_surface ) {
	Prio ( 5 ) ;
	Trans ( L_WaitAB__dA_depth ) ;
}

State ( L_WaitAB__dA_depth ) {
	Term ( ) ;
}

State ( L_WaitAB__wA_surface ) {
	Prio ( 4 ) ;
	Trans ( L_WaitAB__wA_depth ) ;
}

State ( L_WaitAB__wA_depth ) {
	Prio ( 4 ) ;
	Pause ( ) ;
	If ( A ) {
		Emit ( B ) ;
		Trans ( L_WaitAB__dA_surface ) ;
	} ;
	Trans ( L_WaitAB__wA_depth ) ;
}

State ( L_WaitAB__wB_surface ) {
	Prio ( 3 ) ;
	Trans ( L_WaitAB__wB_depth ) ;
}

State ( L_WaitAB__wB_depth ) {
	Prio ( 3 ) ;
	Pause ( ) ;
	If ( B ) {
		Trans ( L_WaitAB__dB_surface ) ;
	} ;
	Trans ( L_WaitAB__wB_depth ) ;
}