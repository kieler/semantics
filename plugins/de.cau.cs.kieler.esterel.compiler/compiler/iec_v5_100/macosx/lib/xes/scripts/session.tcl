xesDebug SESSION IN

proc register { inputline {usesemicolumn true} } {
    if {[TapeRecorderIsRecording]} {
	if { $usesemicolumn } {
	    TapeRecorderPrintRecord -incr [concat $inputline {;} ]
	} else {
	    TapeRecorderPrintRecord -noincr $inputline
	}
    }
}

xesDebug SESSION OUT
