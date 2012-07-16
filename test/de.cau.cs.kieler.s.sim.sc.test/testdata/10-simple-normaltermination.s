Synchronous Program simple ( 13 )

input signal I : pure ;
output signal O : pure ;
output signal
oSYNCCHARTSoTRANSITIONoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM107356065 :
pure ;
output signal
oSYNCCHARTSoTRANSITIONoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo860837186 : pure
;
signal terminated8032519 : pure ;
output signal
oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297 : pure ;
output signal
oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117820 : pure ;
output signal
oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117819 : pure ;

State ( L_root_surface ) {
	Fork ( L_init13072999_surface , 12 ) ;
	Fork ( L_root_depth , 13 ) ;
}

State ( L_root_depth ) {
	Halt ( ) ;
}

State ( L_init13072999_surface ) {
	Prio ( 12 ) ;
	If ( true ) {
		Emit ( oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297 )
		;
		Trans ( L_R_surface ) ;
	} ;
	Trans ( L_init13072999_depth ) ;
}

State ( L_init13072999_depth ) {
	Prio ( 12 ) ;
	Pause ( ) ;
	If ( true ) {
		Emit ( oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297 )
		;
		Trans ( L_R_surface ) ;
	} ;
	Trans ( L_init13072999_depth ) ;
}

State ( L_R_surface ) {
	Fork ( L_R__init3488265_surface , 9 ) ;
	Fork (
	L_R_null_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297_surface
	, 10 ) ;
	Fork ( L_R_depth , 11 ) ;
}

State ( L_R_depth ) {
	Prio ( 11 ) ;
	Pause ( ) ;
	Prio ( 2 ) ;
	If ( terminated8032519 ) {
		Emit ( O ) ;
		Emit (
		oSYNCCHARTSoTRANSITIONoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo860837186 ) ;
		Emit ( oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297 )
		;
		Abort ( ) ;
		Trans ( L_R_surface ) ;
	} ;
	Trans ( L_R_depth ) ;
}

State (
L_R_null_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297_surface
) {
	Prio ( 10 ) ;
	Trans (
	L_R_null_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297_depth
	) ;
}

State (
L_R_null_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297_depth
) {
	Prio ( 10 ) ;
	Pause ( ) ;
	If ( true ) {
		Emit ( oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297 )
		;
		Trans (
		L_R_null_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297_surface
		) ;
	} ;
	Trans (
	L_R_null_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo733279297_depth
	) ;
}

State ( L_R__init3488265_surface ) {
	Prio ( 9 ) ;
	If ( true ) {
		Emit ( oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117820
		) ;
		Trans ( L_R__S_surface ) ;
	} ;
	Trans ( L_R__init3488265_depth ) ;
}

State ( L_R__init3488265_depth ) {
	Prio ( 9 ) ;
	Pause ( ) ;
	If ( true ) {
		Emit ( oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117820
		) ;
		Trans ( L_R__S_surface ) ;
	} ;
	Trans ( L_R__init3488265_depth ) ;
}

State ( L_R__E_surface ) {
	Fork (
	L_R__E_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117819_surface
	, 7 ) ;
	Fork ( L_R__E_depth , 8 ) ;
}

State ( L_R__E_depth ) {
	Prio ( 8 ) ;
	Pause ( ) ;
	Prio ( 6 ) ;
	If ( true ) {
		Emit ( terminated8032519 ) ;
		Emit ( oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117819
		) ;
		Abort ( ) ;
		Trans ( L_R__E_surface ) ;
	} ;
	Trans ( L_R__E_depth ) ;
}

State (
L_R__E_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117819_surface
) {
	Prio ( 7 ) ;
	Trans (
	L_R__E_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117819_depth
	) ;
}

State (
L_R__E_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117819_depth
) {
	Prio ( 7 ) ;
	Pause ( ) ;
	If ( true ) {
		Emit ( oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117819
		) ;
		Trans (
		L_R__E_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117819_surface
		) ;
	} ;
	Trans (
	L_R__E_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117819_depth
	) ;
}

State ( L_R__S_surface ) {
	Fork (
	L_R__S_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117820_surface
	, 4 ) ;
	Fork ( L_R__S_depth , 5 ) ;
}

State ( L_R__S_depth ) {
	Prio ( 5 ) ;
	Pause ( ) ;
	Prio ( 3 ) ;
	If ( I ) {
		Emit (
		oSYNCCHARTSoTRANSITIONoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM107356065 ) ;
		Emit ( terminated8032519 ) ;
		Emit ( oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117819
		) ;
		Abort ( ) ;
		Trans ( L_R__E_surface ) ;
	} ;
	Trans ( L_R__S_depth ) ;
}

State (
L_R__S_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117820_surface
) {
	Prio ( 4 ) ;
	Trans (
	L_R__S_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117820_depth
	) ;
}

State (
L_R__S_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117820_depth
) {
	Prio ( 4 ) ;
	Pause ( ) ;
	If ( true ) {
		Emit ( oSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117820
		) ;
		Trans (
		L_R__S_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117820_surface
		) ;
	} ;
	Trans (
	L_R__S_stateoSYNCCHARTSoSTATEoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDoM1912117820_depth
	) ;
}