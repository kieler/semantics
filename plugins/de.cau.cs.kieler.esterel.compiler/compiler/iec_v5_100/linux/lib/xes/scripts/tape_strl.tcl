xesDebug TAPE_STRL IN
proc TAPE_PLAYER_O_EMPTY_CONFIG {} {
    global TapePriv

    $TapePriv(step_button)            configure -state disabled -relief raised
    $TapePriv(stop_button)            configure -state disabled -relief raised
    $TapePriv(play_button)            configure -state disabled -relief raised 
    $TapePriv(silent_button)          configure -state disabled -relief raised 

#    $TapePriv(reset-reload_button)    configure -state normal   -relief raised
    $TapePriv(reload_button)          configure -state normal   -relief raised
#    $TapePriv(eject_button)           configure -state disabled -relief raised

    $TapePriv(player_info)            configure -fg grey
    $TapePriv(play_ctr_widget)        configure -fg grey
 
#    $TapePriv(player_browser)         configure -state normal

    TapeRecorderEnableRecording
}

proc TAPE_PLAYER_O_LOAD_CONFIG {tapeName} {
    global TapePriv
    set TapePriv(play_ctr)     0
    regsub "$TapePriv(ext)$"   $tapeName {} tape
    set TapePriv(played,full)  $tapeName
    set TapePriv(played,short) [file tail $tape]

    set TapePriv(loaded)        1
    set TapePriv(play_ctr)      0
    $TapePriv(play_ctr_widget)   configure -foreground black

    $TapePriv(step_button)       configure -state normal   -relief raised
    $TapePriv(stop_button)       configure -state disabled  -relief raised
    $TapePriv(play_button)       configure -state normal  -relief raised
    $TapePriv(silent_button)     configure -state normal  -relief raised
    $TapePriv(player_info)       configure -fg blue
#    $TapePriv(player_browser)    configure -state normal  -relief raised

    TapeRecorderEnableRecording
}

proc TAPE_PLAYER_O_EJECT_TAPE {} {
    global TapePriv
    TapePlayerEject

#    set TapePriv(played,short) {}
#    set TapePriv(played,full) {}

#    $TapePriv(player_info) configure -fg grey

    # after an eject, the automaton waits for a tick before
    # setting EMPTY_CONFIG
    TapeRecorderAppendInputEvent tick
}



proc TAPE_PLAYER_O_PLAY_CONFIG {} {
    global TapePriv

    if { ! $TapePriv(playing) } {
	set TapePriv(playing) 1
	ClientDisableUserInput
    }

    $TapePriv(stop_button)       configure -state normal
    $TapePriv(step_button)       configure -state disabled

    $TapePriv(silent_button)     configure -state normal
    $TapePriv(silent_button)     configure -relief raised

    $TapePriv(play_button)       configure -state disabled
    $TapePriv(play_button)       configure -relief sunken

#    $TapePriv(eject_button)        configure -state disabled
    $TapePriv(reload_button)         configure -state disabled
#    $TapePriv(reset-reload_button)     configure -state disabled

    $TapePriv(player_info)       configure -fg blue
#    $TapePriv(player_browser)    configure -state disabled

    TapeRecorderDisableRecording
}

proc TAPE_PLAYER_O_PLAY_RECORD {} {
    global TapePriv
    incr TapePriv(play_ctr)
}

proc TAPE_PLAYER_O_SILENT_PLAY_CONFIG {} {
    global TapePriv

    if { ! $TapePriv(playing) } {
	set TapePriv(playing) 1
	DisableUserInput
    }

    $TapePriv(stop_button)       configure -state normal
    $TapePriv(step_button)       configure -state disabled

    $TapePriv(silent_button)     configure -state disabled
    $TapePriv(silent_button)     configure -relief sunken

    $TapePriv(play_button)       configure -state normal
    $TapePriv(play_button)       configure -relief raised

#    $TapePriv(eject_button)      configure -state disabled
    $TapePriv(reload_button)       configure -state disabled
#    $TapePriv(reset-reload_button)     configure -state disabled

    $TapePriv(player_info)       configure -fg blue
#    $TapePriv(player_browser)    configure -state disabled
    TapeRecorderDisableRecording
}


proc TAPE_PLAYER_O_STOP_CONFIG {} {
    global TapePriv

    set TapePriv(playing) 0
    ClientEnableUserInput

    $TapePriv(stop_button)       configure -state disabled
    $TapePriv(step_button)       configure -state normal

    $TapePriv(silent_button)     configure -state normal
    $TapePriv(silent_button)     configure -relief raised

    $TapePriv(play_button)       configure -state normal
    $TapePriv(play_button)       configure -relief raised

#    $TapePriv(eject_button)         configure -state normal
    $TapePriv(reload_button)        configure -state normal
#    $TapePriv(reset-reload_button)  configure -state normal

    $TapePriv(player_info)       configure -fg blue
#    $TapePriv(player_browser)    configure -state normal

    TapeRecorderEnableRecording

}

proc TAPE_PLAYER_O_END_OF_TAPE {} {
    global TapePriv

    xesConnectMode panel
    global connect_mode

    updatesource
    updatedisplay
    setpanelinputs
}

proc TAPE_PLAYER_O_START_TIMER {} {
    global TapePriv
    set TapePriv(start_timer) 1
}

proc TAPE_PLAYER_O_CALL_BACK {} {
    TapeRecorderAppendInputEvent tick
}

proc TAPE_PLAYER_O_ERROR {error} {
    ClientError $error
}

proc TAPE_PLAYER_O_RESET_SIMULATOR {} {
    ClientReset
}

proc TAPE_PLAYER_O_UNSELECT_TAPE {tapeName} {
    global TapePriv
#    $TapePriv(library) delete [$TapePriv(library) curselection]
}

proc TAPE_PLAYER_O_SELECT_TAPE {tapeName} {
    global TapePriv tk_version
    regsub "$TapePriv(ext)$" $tapeName {} tape
}

proc TAPE_PLAYER_S_SELECTED_TAPE {} {
    global TapePriv

#    Alert "Currently selected: $TapePriv(selected_tape)"
    return $TapePriv(selected_tape)

}
xesDebug TAPE_STRL OUT
