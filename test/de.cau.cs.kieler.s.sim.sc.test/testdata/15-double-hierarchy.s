synchronous program DVDPlayer ( 8 )

input signal POWER ;
output signal O ; ''

state ( L_root_surface ) {
	fork ( L_Off_surface , 2 ) ;
	fork ( L_root_depth , 8 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_On_ClosedTray_PAUSE___surface ) {
	prio ( 7 ) ;
	if ( true ) {
		emit ( O ) ;
		trans ( L_On_ClosedTray_PAUSE__2_surface ) ;
	} ;
	trans ( L_On_ClosedTray_PAUSE___depth ) ;
}

state ( L_On_ClosedTray_PAUSE___depth ) {
	prio ( 7 ) ;
	pause ( ) ;
	if ( true ) {
		emit ( O ) ;
		trans ( L_On_ClosedTray_PAUSE__2_surface ) ;
	} ;
	trans ( L_On_ClosedTray_PAUSE___depth ) ;
}

state ( L_On_ClosedTray_PAUSE__2_surface ) {
	prio ( 6 ) ;
	trans ( L_On_ClosedTray_PAUSE__2_depth ) ;
}

state ( L_On_ClosedTray_PAUSE__2_depth ) {
	halt ( ) ;
}

state ( L_On_ClosedTray_PAUSE_surface ) {
	fork ( L_On_ClosedTray_PAUSE___surface , 7 ) ;
	fork ( L_On_ClosedTray_PAUSE_depth , 5 ) ;
}

state ( L_On_ClosedTray_PAUSE_depth ) {
	halt ( ) ;
}

state ( L_On_ClosedTray_surface ) {
	fork ( L_On_ClosedTray_PAUSE_surface , 5 ) ;
	fork ( L_On_ClosedTray_depth , 4 ) ;
}

state ( L_On_ClosedTray_depth ) {
	halt ( ) ;
}

state ( L_On_surface ) {
	fork ( L_On_ClosedTray_surface , 4 ) ;
	fork ( L_On_depth , 3 ) ;
}

state ( L_On_depth ) {
	halt ( ) ;
}

state ( L_Off_surface ) {
	prio ( 2 ) ;
	trans ( L_Off_depth ) ;
}

state ( L_Off_depth ) {
	prio ( 2 ) ;
	pause ( ) ;
	if ( POWER ) {
		trans ( L_On_surface ) ;
	} ;
	trans ( L_Off_depth ) ;
}