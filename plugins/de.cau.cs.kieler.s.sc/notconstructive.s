Synchronous Program not_constructive ( 8 ) Signals reset : PURE , abort : PURE ;
L_Initial : FORK ( L_Initial_Initial , 5 ) ; FORKE ( L_Initial_main ) ;
L_Initial_Initial : PRIO ( 5 ) ; L_Initial_Initial_intern : PAUSE ( ) ; EMIT (
abort ) ; GOTO ( L_Initial_S0 ) ; PRIO ( 5 ) ; GOTO ( L_Initial_Initial_intern
) ; L_Initial_S0 : L_Initial_S0_intern : Halt ( ) ; L_Initial_main : PRIO ( 2 )
; PRIO ( 8 ) ; L_Initial_main_intern : PAUSE ( ) ; PRESENT ( abort ) { GOTO (
L_S0 ) ; } ; PRIO ( 7 ) ; PRIO ( 2 ) ; PRESENT ( reset ) { ABORT ( ) ; PRIO ( 8
) ; GOTO ( L_Initial ) ; } ; PRIO ( 7 ) ; GOTO ( L_Initial_main_intern ) ; L_S0
: L_S0_intern : Halt ( ) ; L_main : L_main_intern : Halt ( ) ;