Synchronous Program ABRO ( 11 )

input signal A : pure ;
input signal B : pure ;
input signal R : pure ;
output signal O : pure ;

State ( L_root_surface ) {
	Fork ( L_ABO_surface , 10 ) ;
	Fork ( L_root_depth , 11 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( L_ABO_surface ) {
	Fork ( L_ABO_WaitAB_surface , 8 ) ;
	Fork ( L_ABO_depth , 10 ) ;
}

State ( L_ABO_depth ) {
	Prio ( 10 ) ;
	Pause ( ) ;
	If ( R ) {
		Abort ( ) ;
		Trans ( L_ABO_surface ) ;
	} ;
	Prio ( 2 ) ;
	Trans ( L_ABO_depth ) ;
}

State ( L_ABO_done_surface ) {
	Prio ( 9 ) ;
	Trans ( L_ABO_done_depth ) ;
}

State ( L_ABO_done_depth ) {
	Halt ( ) ;
}

State ( L_ABO_WaitAB_surface ) {
	Fork ( L_ABO_WaitAB__wA_surface , 4 ) ;
	Fork ( L_ABO_WaitAB__wB_surface , 6 ) ;
	Fork ( L_ABO_WaitAB_join , 8 ) ;
}

State ( L_ABO_WaitAB_join ) {
	Prio ( 3 ) ;
	Join ( L_ABO_WaitAB_depth ) ;
	If ( true ) {
		Emit ( O ) ;
		Abort ( ) ;
		Trans ( L_ABO_done_surface ) ;
	} ;
}

State ( L_ABO_WaitAB_depth ) {
	Prio ( 3 ) ;
	Trans ( L_ABO_WaitAB_join ) ;
}

State ( L_ABO_WaitAB__dB_surface ) {
	Prio ( 7 ) ;
	Trans ( L_ABO_WaitAB__dB_depth ) ;
}

State ( L_ABO_WaitAB__dB_depth ) {
	Term ( ) ;
}

State ( L_ABO_WaitAB__wB_surface ) {
	Prio ( 6 ) ;
	Trans ( L_ABO_WaitAB__wB_depth ) ;
}

State ( L_ABO_WaitAB__wB_depth ) {
	Prio ( 6 ) ;
	Pause ( ) ;
	If ( B ) {
		Trans ( L_ABO_WaitAB__dB_surface ) ;
	} ;
	Trans ( L_ABO_WaitAB__wB_depth ) ;
}

State ( L_ABO_WaitAB__dA_surface ) {
	Prio ( 5 ) ;
	Trans ( L_ABO_WaitAB__dA_depth ) ;
}

State ( L_ABO_WaitAB__dA_depth ) {
	Term ( ) ;
}

State ( L_ABO_WaitAB__wA_surface ) {
	Prio ( 4 ) ;
	Trans ( L_ABO_WaitAB__wA_depth ) ;
}

State ( L_ABO_WaitAB__wA_depth ) {
	Prio ( 4 ) ;
	Pause ( ) ;
	If ( A ) {
		Trans ( L_ABO_WaitAB__dA_surface ) ;
	} ;
	Trans ( L_ABO_WaitAB__wA_depth ) ;
}