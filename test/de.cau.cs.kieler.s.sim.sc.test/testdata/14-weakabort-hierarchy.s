synchronous program DVDPlayer2 ( 12 )

input signal POWER ;
input signal PLAY ;
output signal O ; ''

state ( L_root_surface ) {
	fork ( L_Off_surface , 2 ) ;
	fork ( L_root_depth , 12 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L_On_H__S_surface ) {
	prio ( 11 ) ;
	trans ( L_On_H__S_depth ) ;
}

state ( L_On_H__S_depth ) {
	term ( ) ;
}

state ( L_On_H__Playing_surface ) {
	prio ( 10 ) ;
	trans ( L_On_H__Playing_depth ) ;
}

state ( L_On_H__Playing_depth ) {
	prio ( 10 ) ;
	pause ( ) ;
	if ( PLAY ) {
		trans ( L_On_H__PAUSE_surface ) ;
	} ;
	prio ( 9 ) ;
	if ( true ) {
		trans ( L_On_H__S_surface ) ;
	} ;
	trans ( L_On_H__Playing_depth ) ;
}

state ( L_On_H__PAUSE_surface ) {
	prio ( 8 ) ;
	trans ( L_On_H__PAUSE_depth ) ;
}

state ( L_On_H__PAUSE_depth ) {
	prio ( 8 ) ;
	pause ( ) ;
	if ( PLAY ) {
		trans ( L_On_H__Playing_surface ) ;
	} ;
	trans ( L_On_H__PAUSE_depth ) ;
}

state ( L_On_H__French_surface ) {
	prio ( 7 ) ;
	trans ( L_On_H__French_depth ) ;
}

state ( L_On_H__French_depth ) {
	prio ( 7 ) ;
	pause ( ) ;
	if ( true ) {
		emit ( O ) ;
		trans ( L_On_H__German_surface ) ;
	} ;
	trans ( L_On_H__French_depth ) ;
}

state ( L_On_H__German_surface ) {
	prio ( 6 ) ;
	trans ( L_On_H__German_depth ) ;
}

state ( L_On_H__German_depth ) {
	prio ( 6 ) ;
	pause ( ) ;
	if ( true ) {
		emit ( O ) ;
		trans ( L_On_H__English_surface ) ;
	} ;
	trans ( L_On_H__German_depth ) ;
}

state ( L_On_H__English_surface ) {
	prio ( 5 ) ;
	trans ( L_On_H__English_depth ) ;
}

state ( L_On_H__English_depth ) {
	prio ( 5 ) ;
	pause ( ) ;
	if ( true ) {
		emit ( O ) ;
		trans ( L_On_H__French_surface ) ;
	} ;
	trans ( L_On_H__English_depth ) ;
}

state ( L_On_H_surface ) {
	fork ( L_On_H__English_surface , 5 ) ;
	fork ( L_On_H__PAUSE_surface , 8 ) ;
	fork ( L_On_H_depth , 4 ) ;
}

state ( L_On_H_depth ) {
	halt ( ) ;
}

state ( L_On_surface ) {
	fork ( L_On_H_surface , 4 ) ;
	fork ( L_On_depth , 3 ) ;
}

state ( L_On_depth ) {
	prio ( 3 ) ;
	pause ( ) ;
	if ( POWER ) {
		abort ( ) ;
		trans ( L_Off_surface ) ;
	} ;
	trans ( L_On_depth ) ;
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