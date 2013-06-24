synchronous program Example ( 13 )

input signal S ;
input signal I ;
output signal O ;
signal R ;
signal A ;

state ( L_root_surface ) {
	fork ( L___surface , 2 ) ;
	fork ( L_root_depth , 13 ) ;
}

state ( L_root_depth ) {
	halt ( ) ;
}

state ( L__ParallelState_surface ) {
	fork ( L__ParallelState_19438027_3_surface , 4 ) ;
	fork ( L__ParallelState_801190_6_surface , 10 ) ;
	fork ( L__ParallelState_depth , 12 ) ;
}

state ( L__ParallelState_depth ) {
	prio ( 12 ) ;
	pause ( ) ;
	if ( S ) {
		abort ( ) ;
		trans ( L__ParallelState_surface ) ;
	} ;
	trans ( L__ParallelState_depth ) ;
}

state ( L__ParallelState_801190__surface ) {
	prio ( 11 ) ;
	trans ( L__ParallelState_801190__depth ) ;
}

state ( L__ParallelState_801190__depth ) {
	prio ( 11 ) ;
	pause ( ) ;
	if ( true ) {
		trans ( L__ParallelState_801190_2_surface ) ;
	} ;
	trans ( L__ParallelState_801190__depth ) ;
}

state ( L__ParallelState_801190_6_surface ) {
	prio ( 10 ) ;
	trans ( L__ParallelState_801190_6_depth ) ;
}

state ( L__ParallelState_801190_6_depth ) {
	prio ( 10 ) ;
	pause ( ) ;
	if ( true ) {
		trans ( L__ParallelState_801190__surface ) ;
	} ;
	trans ( L__ParallelState_801190_6_depth ) ;
}

state ( L__ParallelState_19438027_SustainState2_surface ) {
	fork ( L__ParallelState_19438027_SustainState2__surface , 7 ) ;
	fork ( L__ParallelState_19438027_SustainState2_surface2 , 9 ) ;
}

state ( L__ParallelState_19438027_SustainState2_surface2 ) {
	prio ( 3 ) ;
	if ( A ) {
		emit ( O ) ;
		abort ( ) ;
		trans ( L__ParallelState_19438027_4_surface ) ;
	} ;
	trans ( L__ParallelState_19438027_SustainState2_depth ) ;
}

state ( L__ParallelState_19438027_SustainState2_depth ) {
	prio ( 9 ) ;
	pause ( ) ;
	prio ( 3 ) ;
	if ( A ) {
		emit ( O ) ;
		abort ( ) ;
		trans ( L__ParallelState_19438027_4_surface ) ;
	} ;
	trans ( L__ParallelState_19438027_SustainState2_depth ) ;
}

state ( L__ParallelState_19438027_SustainState2_2_surface ) {
	prio ( 8 ) ;
	trans ( L__ParallelState_19438027_SustainState2_2_depth ) ;
}

state ( L__ParallelState_19438027_SustainState2_2_depth ) {
	prio ( 8 ) ;
	pause ( ) ;
	if ( true ) {
		emit ( R ) ;
		trans ( L__ParallelState_19438027_SustainState2_2_surface ) ;
	} ;
	trans ( L__ParallelState_19438027_SustainState2_2_depth ) ;
}

state ( L__ParallelState_19438027_SustainState2__surface ) {
	prio ( 7 ) ;
	trans ( L__ParallelState_19438027_SustainState2__depth ) ;
}

state ( L__ParallelState_19438027_SustainState2__depth ) {
	prio ( 7 ) ;
	pause ( ) ;
	if ( true ) {
		emit ( R ) ;
		trans ( L__ParallelState_19438027_SustainState2_2_surface ) ;
	} ;
	trans ( L__ParallelState_19438027_SustainState2__depth ) ;
}

state ( L__ParallelState_801190_2_surface ) {
	prio ( 6 ) ;
	if ( R ) {
		emit ( A ) ;
		trans ( L__ParallelState_801190_6_surface ) ;
	} ;
	prio ( 5 ) ;
	if ( not R ) {
		trans ( L__ParallelState_801190_6_surface ) ;
	} ;
	trans ( L__ParallelState_801190_2_depth ) ;
}

state ( L__ParallelState_801190_2_depth ) {
	prio ( 6 ) ;
	pause ( ) ;
	if ( R ) {
		emit ( A ) ;
		trans ( L__ParallelState_801190_6_surface ) ;
	} ;
	prio ( 5 ) ;
	if ( not R ) {
		trans ( L__ParallelState_801190_6_surface ) ;
	} ;
	trans ( L__ParallelState_801190_2_depth ) ;
}

state ( L__ParallelState_19438027_3_surface ) {
	prio ( 4 ) ;
	trans ( L__ParallelState_19438027_3_depth ) ;
}

state ( L__ParallelState_19438027_3_depth ) {
	prio ( 4 ) ;
	pause ( ) ;
	if ( I ) {
		trans ( L__ParallelState_19438027_SustainState2_surface ) ;
	} ;
	trans ( L__ParallelState_19438027_3_depth ) ;
}

state ( L___surface ) {
	prio ( 2 ) ;
	trans ( L___depth ) ;
}

state ( L___depth ) {
	prio ( 2 ) ;
	pause ( ) ;
	if ( S ) {
		trans ( L__ParallelState_surface ) ;
	} ;
	trans ( L___depth ) ;
}

state ( L__ParallelState_19438027_4_surface ) {
	trans ( L__ParallelState_19438027_4_depth ) ;
}

state ( L__ParallelState_19438027_4_depth ) {
	term ( ) ;
}