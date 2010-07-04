Synchronous Program ABRO ( 2 )

Signals
	A : PURE ,
	B : PURE ,
	R : PURE ,
	O : PURE
;

L_ABO :
	FORK ( L_ABO_WaitAB , 3 ) ;
	FORKE ( L_ABO_main ) ;

L_ABO_WaitAB :
	FORK ( L_ABO_WaitAB_R0_wA , 5 ) ;
	FORK ( L_ABO_WaitAB_R1_wB , 7 ) ;
	FORKE ( L_ABO_WaitAB_main ) ;

L_ABO_WaitAB_R0_wA :
	PRIO ( 5 ) ;

L_ABO_WaitAB_R0_wA_intern :
	PAUSE ( ) ;
	PRESENT ( A ) {
			GOTO ( L_ABO_WaitAB_R0_dA ) ;
	} ;
	PRIO ( 5 ) ;
	GOTO ( L_ABO_WaitAB_R0_wA_intern ) ;

L_ABO_WaitAB_R0_dA :

L_ABO_WaitAB_R0_dA_intern :
	TERM ( ) ;

L_ABO_WaitAB_R1_wB :
	PRIO ( 7 ) ;

L_ABO_WaitAB_R1_wB_intern :
	PAUSE ( ) ;
	PRESENT ( B ) {
			GOTO ( L_ABO_WaitAB_R1_dB ) ;
	} ;
	PRIO ( 7 ) ;
	GOTO ( L_ABO_WaitAB_R1_wB_intern ) ;

L_ABO_WaitAB_R1_dB :

L_ABO_WaitAB_R1_dB_intern :
	TERM ( ) ;

L_ABO_WaitAB_main :
	JOIN ( ) ;
	EMIT ( O ) ;
	GOTO ( L_ABO_done ) ;

L_ABO_WaitAB_main_intern :
	PAUSE ( ) ;
	GOTO ( L_ABO_WaitAB_main_intern ) ;

L_ABO_done :

L_ABO_done_intern :
	Halt ( ) ;

L_ABO_main :
	PRIO ( 2 ) ;

L_ABO_main_intern :
	PAUSE ( ) ;
	PRESENT ( R ) {
			ABORT ( ) ;
			PRIO ( 2 ) ;
			GOTO ( L_ABO ) ;
	} ;
	PRIO ( 2 ) ;
	GOTO ( L_ABO_main_intern ) ;

L_main :

L_main_intern :
	Halt ( ) ;