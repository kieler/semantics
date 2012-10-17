synchronous program _19_valued_signal_pre ( 6 )

output signal a : combine integer with * ;
output signal b : combine integer with * ;

state ( L_root_surface ) {
	emit ( a ( 5 ) ) ;
	pause();
	emit ( b(pre(?a)));
}