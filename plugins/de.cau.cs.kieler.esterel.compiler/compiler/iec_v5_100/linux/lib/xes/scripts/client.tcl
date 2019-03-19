xesDebug CLIENT IN

#---------------------------------
# - ClientTapeExtension
#
# returns the tape files extension
#
proc ClientTapeExtension {} {
    # CAUTION: No leading or trailing SPACES in the extension !
    return ".esi"

}

#-------------------------------------------
# - ClientOpenTapeForWriting tapeName
#
# Opens file with name tapeName for writing
# Returns a tcl file descriptor or an error
proc ClientOpenTapeForWriting {tapeName} {
    if {[catch {open $tapeName w} fd]} {
	# error
	return -code error
    } else {
	# specific actions
    }
    return $fd
}

#------------------------
# - ClientEnableUserInput
#
# Shoud enable user input
#
proc ClientEnableUserInput {} {
}

#-------------------------
# - ClientDisableUserInput
#
# Should disable user input
#
proc ClientDisableUserInput {} {
}


#-----------------------------------------
# - ClientError errNum
#
# Called when a error occurs. Argument is
# an error number defined by the client.
proc ClientError {errNum} {
    case $errNum {
	2 {
	    set message  "Must select a tape for loading"
	    set type warning
	    return
	}
	default {
	    global errorCode
	    set message  [lindex $errorCode 2]
	    set type warning
	}
    }
    Alert "$message"    -type $type \
	-choice { {CONTINUE {}} {STOP {TapeRecorderExternalStop}} }
#    TapePlayerEject
}

#------------------------
# - ClientReset
#
# Should reset the client.
proc ClientReset {} {
    global TapePriv
    set w $TapePriv(record_display)
    set text $w.text
    $text delete 1.0 end
    reset
}

#------------------------------------
# - ClientRaiseMainWindow
#
# Should raise the client main window
proc ClientRaiseMainWindow {} {
    wm  deiconify .mainpanel 
    raise .mainpanel
}




xesDebug CLIENT OUT
