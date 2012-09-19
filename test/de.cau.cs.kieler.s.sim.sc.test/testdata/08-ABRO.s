synchronous program ABRO ( 9 )

input signal A ;
input signal B ;
input signal R ;
output signal O ; ''

state ( L_root_surface ) {
	fork ( L_ABO_surface , 8 ) ;
	fork ( L_root_depth , 9 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_ABO_surface ) {
	fork ( L_ABO_WaitAB_surface , 2 ) ;
	fork ( L_ABO_depth , 8 ) ;
}

state ( L_ABO_depth ) {
	pause ( ) ;
	prio ( 8 ) ;
	if ( R ) {
		abort ( ) ;
		trans ( L_ABO_surface ) ;
	} ;
	trans ( L_ABO_depth ) ;
}

state ( L_ABO_done_surface ) {
	prio ( 7 ) ;
	trans ( L_ABO_done_depth ) ;
}

state ( L_ABO_done_depth ) {
	halt ( ) ;
}

state ( L_ABO_WaitAB__dB_surface ) {
	prio ( 6 ) ;
	trans ( L_ABO_WaitAB__dB_depth ) ;
}

state ( L_ABO_WaitAB__dB_depth ) {
	term ( ) ;
}

state ( L_ABO_WaitAB__wB_surface ) {
	prio ( 5 ) ;
	trans ( L_ABO_WaitAB__wB_depth ) ;
}

state ( L_ABO_WaitAB__wB_depth ) {
	prio ( 5 ) ;
	pause ( ) ;
	if ( B ) {
		trans ( L_ABO_WaitAB__dB_surface ) ;
	} ;
	trans ( L_ABO_WaitAB__wB_depth ) ;
}

state ( L_ABO_WaitAB__dA_surface ) {
	prio ( 4 ) ;
	trans ( L_ABO_WaitAB__dA_depth ) ;
}

state ( L_ABO_WaitAB__dA_depth ) {
	term ( ) ;
}

state ( L_ABO_WaitAB__wA_surface ) {
	prio ( 3 ) ;
	trans ( L_ABO_WaitAB__wA_depth ) ;
}

state ( L_ABO_WaitAB__wA_depth ) {
	prio ( 3 ) ;
	pause ( ) ;
	if ( A ) {
		trans ( L_ABO_WaitAB__dA_surface ) ;
	} ;
	trans ( L_ABO_WaitAB__wA_depth ) ;
}

state ( L_ABO_WaitAB_surface ) {
	fork ( L_ABO_WaitAB__wA_surface , 3 ) ;
	fork ( L_ABO_WaitAB__wB_surface , 5 ) ;
	fork ( L_ABO_WaitAB_join , 2 ) ;
}

state ( L_ABO_WaitAB_join ) {
	prio ( 2 ) ;
	join ( L_ABO_WaitAB_depth ) ;
	if ( true ) {
		emit ( O ) ;
		abort ( ) ;
		trans ( L_ABO_done_surface ) ;
	} ;
}

state ( L_ABO_WaitAB_depth ) {
	prio ( 2 ) ;
	trans ( L_ABO_WaitAB_join ) ;
}