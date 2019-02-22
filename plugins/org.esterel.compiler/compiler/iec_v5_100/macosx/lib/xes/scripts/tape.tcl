xesDebug TAPE IN

# Tape Recorder global state and variables
global TapePriv

proc TapeResetGlobalState {} {
    global TapePriv

    set TapePriv(tape_window)       .tape
    set TapePriv(tape_player)       .tape.player
    set TapePriv(tape_recorder)     .tape.recorder
    set TapePriv(tape_asker)        .tape_asker

    set TapePriv(start_timer)    0
    set TapePriv(timer_ctr)      0
    set TapePriv(input_events)   {}
    set TapePriv(recording)      0
    set TapePriv(playing)        0
    set TapePriv(loaded)         0

    # global settings
    set TapePriv(recorded,short) {}
    set TapePriv(recorded,full)  {}
    set TapePriv(played,full)    {}
    set TapePriv(played,short)   {}
    set TapePriv(playing)         0
    set TapePriv(ext)             [ClientTapeExtension]
    set TapePriv(recorder_saved)  0
    set TapePriv(recorder_ctr)    0

    set TapePriv(player_load_dir)         {.}
    set TapePriv(recorder_load_dir)       {.}
    set TapePriv(untitled)   	 {untitled}
    set TapePriv(default_tape)   {untitled}
    set TapePriv(selected_tape) {}
}
TapeResetGlobalState


#################################################################
#
#  INTERFACE PART
#

#----------------------------------------------------------------
# TapeRecorder
#
#    build the tape/recorder interface. 
# Args:
#
# Return:
#    
#    the name of the toplevel
#
# Side effects:
#    
#----------------------------------------------------------------
proc TapeRecorder {} {
    global TapePriv

    # Exists ?
    if {[winfo exists $TapePriv(tape_window)]} {
        RaiseWindow $TapePriv(tape_window)
        return $TapePriv(tape_window)
    }

    # Really build
    TapeResetGlobalState
    set TapePriv(player_load_dir)         [ SystemGetWorkingDirectory]
    set TapePriv(recorder_load_dir)       [ SystemGetWorkingDirectory]

    # ------------------------------------------------------------------   TOPLEVEL
    toplevel $TapePriv(tape_window) -class Taperecorder

    # Build but withdraw: must be invoked at beginning of session
    wm withdraw $TapePriv(tape_window) 

    wm geometry $TapePriv(tape_window) +500+500
    wm title $TapePriv(tape_window) "Xes Tape Recorder"

    # Font
    global font
    set fn $font(panel,$font(panel))

    # Menu bar
    set f [frame $TapePriv(tape_window).menubar -bd 2 -relief raised]

    # Mainpanel button
    set b [button $f.mainpanel]
    $b configure    \
        -relief flat \
        -text MainPanel \
        -command ClientRaiseMainWindow \
        -font $fn

    # Help button
    set h [button $f.help]
    $h configure \
        -relief flat \
        -text Help \
        -command "HelpWindow RECORDER" \
        -font $fn

    # Close button
    set q [button $f.close]
    $q configure \
        -relief flat \
        -text Close \
        -command { TapeRecorderClose {} } \
        -font $fn

    # Pack buttons and bar
    pack $b  -padx 4 -side left
    pack $h $q -side right
    pack $f -in $TapePriv(tape_window) -fill x

    # ------------------------------------------------------------------   PLAYER PART
    set f [frame $TapePriv(tape_player)]
    $f configure -bd 2 -relief raised 

    # Load,  Reload,  ResetOnReload buttons
    set up_bar [frame $f.up_bar]

    button $up_bar.load \
        -state normal \
        -text {Load} \
        -command TapePlayerLoad

    button $up_bar.reload \
        -state normal \
        -text {Reload}\
        -command TapePlayerReload

    checkbutton  $up_bar.reset \
	-variable TapePriv(reset_load) \
	-text {Reset on loading}

    set TapePriv(reset_load) 1

    button $up_bar.eject \
        -state normal \
        -text {Eject}\
        -command "TapeRecorderAppendInputEvent EJECT"

    set TapePriv(reload_button)        $up_bar.reload 
    set TapePriv(load_button)          $up_bar.load
    set TapePriv(reset_button)         $up_bar.reset

#    pack $up_bar.reload $up_bar.reset-reload  $up_bar.eject -in $up_bar -side left
    pack $up_bar.load $up_bar.reload -in $up_bar -side left
    pack $up_bar.reset  -in $up_bar -side right

    # 'Stop', 'Step', 'Play', and 'Silent play' buttons
    set bot_bar [frame $f.bot_bar]

    button $bot_bar.stop \
        -text {Stop} \
        -state disabled \
        -width 4 \
        -command {
    		TapeRecorderAppendInputEvent STOP;
    		updatedisplay
		xesConnectMode panel
	}

    button $bot_bar.play \
        -text {Play} \
        -state disabled \
        -width 4 \
	-command {
             xesConnectMode play
             TapeRecorderAppendInputEvent PLAY;
         }

    button $bot_bar.step \
        -text {Step} \
        -state disabled \
        -width 4 \
	-command {
    		xesConnectMode play
                TapeRecorderAppendInputEvent STEP
    		xesConnectMode panel
         }

    button $bot_bar.silent \
        -text {Silent play} \
        -state disabled \
	-command {
    		xesConnectMode silentplay
    		TapeRecorderAppendInputEvent SILENT_PLAY;
          }

    set TapePriv(play_button)       $bot_bar.play
    set TapePriv(stop_button)       $bot_bar.stop
    set TapePriv(step_button)       $bot_bar.step
    set TapePriv(silent_button)     $bot_bar.silent


    pack \
        $bot_bar.stop \
        $bot_bar.step \
        $bot_bar.play \
        $bot_bar.silent \
        -in $bot_bar \
        -side left 

    # Tape name
    set info [frame $f.info -relief groove -bd 2]
#    set label [button $info.l1 -text "Filename:" -command TapePlayerBrowse ]
    set label [label $info.l1 -text "Filename:" ]
    set current [entry $info.current]
    WidgetUnbind $current 
    $current configure \
        -textvariable TapePriv(played,short) -fg grey  \
        -relief sunken \
        -state disabled -cursor right_ptr
    bind $current <Shift-Button-1> {%W scan mark %x}
    bind $current <Shift-B1-Motion> {%W scan dragto %x}
    set TapePriv(played,short) $TapePriv(untitled)
    set TapePriv(played,full)  \
	$TapePriv(player_load_dir)/$TapePriv(untitled)$TapePriv(ext)
     set TapePriv(player_info)    $current

    bind $current <ButtonPress-1>  "showtape played %X %Y "
    bind $current <ButtonRelease-1>  "unshow"
#    bind $current <Enter>  "showtape played %X %Y "
#    bind $current <Leave>  "unshow"

#    set TapePriv(played,short) {}
#    set TapePriv(played,full) {}
    set ctr [label  $info.play_ctr]
    $ctr configure\
        -textvariable TapePriv(play_ctr) \
        -bd 2 -relief ridge \
        -width 6
    set TapePriv(play_ctr) 0

    pack $label $current $ctr \
        -in $info \
        -side left

    pack $ctr -padx 4
    set TapePriv(play_ctr_widget) $ctr

    # Title 
    set label [label $f.label -text {Input sequence}]

    # Pack info part
    pack $label $info $up_bar  $bot_bar -in $f 
    pack $info -fill x -ipady 2 -pady 2

    pack $up_bar -padx 4 -anchor  w -fill x
    pack $bot_bar -padx 4 -pady 4 
    global server_mode

    if !$server_mode {
	pack $f -padx 10 -pady 10 -fill x -expand 1
    }
    
    # play delay
    set TapePriv(delay_scale) $TapePriv(tape_player).delay
    scale $TapePriv(delay_scale)  \
	    -orient horizontal \
	    -width 10 -sliderlength 20 \
	    -showvalue 0 \
	    -from 15 -to 1  \
	    -command TapePlayerSetSpeed

    pack $TapePriv(delay_scale) -side right \
	    -expand 1 -anchor w

    pack [label $TapePriv(tape_player).lbl -text {speed}] \
	    -side right -expand 1 -anchor e
    set TapePriv(delay_label) $TapePriv(tape_player).lbl
    $TapePriv(delay_scale) set 10

    # Record display
    set w .record_display
    set TapePriv(record_display)    $w
    if [winfo exist $w] {
	wm deiconify $w
	raise $w
    } else {
	toplevel $w
	wm title $w {Xes tape current record}
	set text [text $w.text -height 4 -font { medium 12 bold} -fg red]
	set TapePriv(record_display)    $w
	pack $text
	wm withdraw $w
    }

    # ------------------------------------------------------------------   RECORDER PART
    set f [frame $TapePriv(tape_recorder)]
    $f configure -bd 2 -relief raised

    # commands
    set command [frame $f.command]
    button $command.save \
        -text {Save} \
        -state normal\
        -command TapeRecorderSave
    button $command.saveas \
        -text {Save as} \
        -state normal \
        -command TapeRecorderSaveAs
    button $command.erase \
        -text {Erase} \
        -state normal \
        -command TapeRecorderErase
    button $command.eject \
        -text {Eject} \
        -state normal \
        -command TapeRecorderEject

    pack    $command.save 	\
	    $command.saveas  	\
	    $command.erase  	\
	    -in $command   -side left

    set TapePriv(save_button)       $command.save
    set TapePriv(saveas_button)     $command.saveas  
    set TapePriv(erase_button)      $command.erase  

    # infos
    set info  [frame $f.info -relief groove -bd 2]
    set label [label $info.l1 -text "Filename:" ]
    set current [entry $info.current]
    WidgetUnbind $current 
    $current configure \
        -textvariable TapePriv(recorded,short) -fg blue\
        -relief sunken \
        -state disabled -cursor right_ptr
    bind $current <Shift-Button-1> {%W scan mark %x}
    bind $current <Shift-B1-Motion> {%W scan dragto %x}

    bind $current <ButtonPress-1>    "showtape recorded %X %Y "
    bind $current <ButtonRelease-1>  "unshow"
#    set TapePriv(recorder_browser) $label
    set TapePriv(recorder_info)    $current

#    bind $current <Enter>    "showtape recorded %X %Y "
#    bind $current <Leave>  "unshow"

    # Always recording
    TapeRecorderStartRecording

    set ctr [label  $info.record_ctr]
    $ctr configure\
        -textvariable TapePriv(recorder_ctr) \
        -bd 2 -relief ridge \
        -width 6
    
    set TapePriv(recorder_ctr)   0
    set TapePriv(recorder_saved) 0

    pack $label $current $ctr \
        -in $info \
        -side left

    pack $ctr -padx 4

    set label [label $f.label -text {Session recording}]
    pack $label  $info  $command -in $f 
    pack $info -fill x -ipady 2 -pady 2
    pack $label 
    pack $command -pady 2 -padx 4 -anchor w -fill x -expand 1
    pack $f -padx 10 -pady 10 -fill x -expand 1

    wm protocol $TapePriv(tape_window) \
        WM_DELETE_WINDOW { TapeRecorderClose {} }
    
#    FocusBinding $TapePriv(tape_window)
    bind $TapePriv(tape_window) <Control-m> \
	    ClientRaiseMainWindow
    bind $TapePriv(tape_window) <Control-q> \
	{ TapeRecorderClose {} }
    bind $TapePriv(tape_window) <Control-h> \
	    {HelpWindow Recorder}
    update idletasks	    
	    
    if {[info command TAPE_PLAYER] != ""} {
	TAPE_PLAYER_reset
	TAPE_PLAYER
	TAPE_PLAYER
    } 

    XesHook XesRecorderLastWishes

    return $TapePriv(tape_window)
}




################################################################
#
#   PLAYER PART
#
#----------------------------------------------------------------
# TapePlayerLoad
#
#  open and load a tape into the . Tapes have extension 
#  $TapePriv(ext)
#
# Return:
#    none
#
# Side effects:
#----------------------------------------------------------------
proc TapePlayerReload {} {
    global TapePriv
    TapeRecorderAppendInputEvent EJECT 
    set TapePriv(selected_tape) $TapePriv(played,full)
    if $TapePriv(reset_load) { reset; TapeRecorderAppendInputEvent RESET }
    TapeRecorderAppendInputEvent  LOAD
}

proc TapePlayerLoad {} {
    global TapePriv
    set TapePriv(selected_tape) {}
    set tape [tk_getOpenFile \
		  -title "Xes reader: select tape name" \
		  -parent $TapePriv(tape_window) \
		  -defaultextension $TapePriv(ext) \
		  -initialfile $TapePriv(played,short)$TapePriv(ext)\
		  -initialdir $TapePriv(player_load_dir) \
		  -filetypes [list \
				  [list \
				       {Esterel Simulation Input} \
				       [list $TapePriv(ext) .csimul]] \
				  [list {All} {*.*}]]]
			      


# SOLUTION 1
     if { $tape != "" } {
	# Names
	set stape [file rootname $tape]
	set TapePriv(played,full) 	$tape
	set TapePriv(played,short) 	[file tail $stape]
        set TapePriv(player_load_dir)   [file dirname $tape]
        set TapePriv(selected_tape) 	$tape

	TapeRecorderAppendInputEvent LOAD
	if $TapePriv(reset_load) { reset; TapeRecorderAppendInputEvent RESET }
	$TapePriv(player_info)       configure -fg blue
	TapeRecorderAppendInputEvent tick
    }
}

proc TapePlayerDisplayRecord { } {
    global TapePriv
    set w $TapePriv(record_display)
    set text $w.text
    catch {
	$text delete 1.0 end
	$text insert 1.0 [tape_record]
    }
}

proc TapePlayerSetSpeed {speed} {
    global TapePriv
    if {$speed <= 10 } {
	set val [expr $speed*100]
    } else {
	set val [expr ($speed%10)*1000]
    }
    set TapePriv(delay) $val
}

proc TapePlayerEject {} {
    global TapePriv

    $TapePriv(player_info) configure -fg grey
    set TapePriv(play_ctr)      {}  
    set TapePriv(loaded)        0
    set TapePriv(playing)       0
}


#################################################################
#
#   RECORDER PART
#

#----------------------------------------------------------------
#  TapeRecorderStartRecording
#
#  starts recording
#
# Return:
#    none
#
# Side effects:
#
#----------------------------------------------------------------
proc TapeRecorderStartRecording {} {
    global TapePriv
    set TapePriv(recorder_ctr) 0
    set TapePriv(record_last_filepos) 0

    set TapePriv(recording) 0

    # Open temporary file ?
    set tempFile [ SystemMakeTemporaryFileName ]
    if {[catch {ClientOpenTapeForWriting $tempFile} fd]} {
	Alert "Cannot open temporary file $tempFile\nCheck your writing rights"
	return 0
    }

    # OK
    set TapePriv(recorded,short) $TapePriv(untitled)
    set TapePriv(recorded,full)  \
	$TapePriv(recorder_load_dir)/$TapePriv(untitled)$TapePriv(ext)
    set TapePriv(record_fd) $fd
    flush $TapePriv(record_fd)     
    set TapePriv(temp_file) $tempFile
    set TapePriv(recording) 1
    return 1
}


#---------------------------------------------------------------
# TapeRecorderPrintRecord
#
#  prints a record REC. 
#
# Return:
#    none
# Side effects:
#
#----------------------------------------------------------------
proc TapeRecorderPrintRecord {ctroption rec} {
    global TapePriv

    puts $TapePriv(record_fd) $rec
    flush $TapePriv(record_fd)
    case $ctroption {
	"-incr"   {
	    incr TapePriv(recorder_ctr)
	}
	"-noincr" {  }
    }
    $TapePriv(recorder_info) configure -fg red
}
#---------------------------------------------------------------
# TapeRecorderSave,  TapeRecorderSaveAs
#
#  save current tape in specified filename
#
# Return:
#    none
# Side effects:
#
#----------------------------------------------------------------
proc TapeRecorderSave {} {
    global TapePriv

    set choice -1

    # If current tape is untitled, then Save = SaveAs !
    if { $TapePriv(recorded,full)  == $TapePriv(played,full) && $TapePriv(loaded) } {
	set choice [
	  Alert "File '$TapePriv(played,short)' currently loaded for playing" \
	    -type warning 				\
	    -choice { 				\
		{{Save record & Reload for playing} {}}  	\
		{{Eject of player & Save record} {}}   	\
		{CANCEL {}}           	\
	  }				\
		   ]
        case $choice {  2 { return } 	}
    }

    case $choice {
	1 { 	TapeRecorderAppendInputEvent tick EJECT }
    }

    set tempFile $TapePriv(temp_file)
    SystemCopyFile $tempFile $TapePriv(recorded,full)
    set TapePriv(recorder_saved) $TapePriv(recorder_ctr)
    $TapePriv(recorder_info) configure -fg blue

    case $choice {
	0 { TapePlayerReload }
    }
}

proc TapeRecorderSaveAs {} {
    global TapePriv

    set choice -1

    # Browse
    set fullname [tk_getSaveFile \
		      -title "Xes recorder: select tape name" \
		      -parent $TapePriv(tape_window) \
		      -defaultextension $TapePriv(ext) \
		      -initialfile $TapePriv(recorded,short)$TapePriv(ext)\
		      -initialdir $TapePriv(recorder_load_dir) \
		      -filetypes [list [list {Esterel Simulation Input} $TapePriv(ext)]\
				      [list {Xes Tapes - old suffix} .csimul] \
				     ]]

    if { $fullname == {} } {
	return
    } 

    # SOLUTION 2 (no name conflict)
    if { $fullname == $TapePriv(played,full) } {
	set choice [
	  Alert "File '$TapePriv(played,short)' currently loaded for playing" \
	    -type warning 				\
	    -choice { 				\
		{{Save record & Reload for playing} {}}  	\
		{{Eject of player & Save record} {}}   	\
		{CANCEL {}}           	\
	  }				\
		   ]
        case $choice {  2 { return } 	}
    }
 
    case $choice {
	1 { 	TapeRecorderAppendInputEvent tick EJECT }
    }
    regsub "$TapePriv(ext)$" $fullname {} sname
    set TapePriv(recorded,full)  $fullname
    set TapePriv(recorded,short) [file tail $sname]
    set TapePriv(recorder_load_dir)       [file dirname $fullname]
    set tempFile $TapePriv(temp_file)
    SystemCopyFile $tempFile $fullname
    set TapePriv(recorder_saved) $TapePriv(recorder_ctr)
    $TapePriv(recorder_info) configure -fg blue

    case $choice {
	0 { TapePlayerReload }
    }
}

proc TapeRecorderErase {} {
    global TapePriv

    # Close and reopen
    close $TapePriv(record_fd)
    set tempFile $TapePriv(temp_file) 

    if {[catch {ClientOpenTapeForWriting $tempFile} fd]} {
	Alert "Cannot open temporary file $tempFile\nCheck your writing rights"
	return 0
    }

    set TapePriv(record_fd) $fd
    flush $TapePriv(record_fd)     

    set TapePriv(recorder_ctr) 0
    set TapePriv(record_last_filepos) 0
}
proc TapeRecorderEject {} { 
   global TapePriv
   set TapePriv(recorded,short) $TapePriv(untitled)
   set TapePriv(recorded,full)  $TapePriv(temp_file)
   set TapePriv(recording) 0
}

#---------------------------------------------------------------
# TapeRecorderEnableRecording, TapeRecorderDisableRecording
#
#  Allow or disallow saving of tapes
#
# Return:
#    none
# Side effects:
#
#----------------------------------------------------------------
proc TapeRecorderEnableRecording {} {
    global TapePriv
    $TapePriv(saveas_button) configure -state normal
    $TapePriv(erase_button)  configure -state normal
    $TapePriv(save_button)   configure -state normal
#    $TapePriv(recorder_browser)   configure -state normal
#
#    # Special case: conditionnal enable for  SAVE 
#    if { $TapePriv(recorded,full) != $TapePriv(played,full)  } {
#	$TapePriv(save_button)   configure -state normal
#    } else {
#	$TapePriv(save_button)   configure -state disabled
#    }
}
proc TapeRecorderDisableRecording {} {
    global TapePriv
    $TapePriv(save_button)   configure -state disabled
    $TapePriv(saveas_button) configure -state disabled
    $TapePriv(erase_button)  configure -state disabled
#    $TapePriv(recorder_browser)  configure -state disabled
}

##################################################################
#
#   INTERFACE WITH ESTEREL AUTOMATON

set TapePriv(running) 0
#----------------------------------------------------------------------
# NAME
#    TapeRecorderAppendInputEvent - appends event to event fifo
#
# SYNOPSIS
#    TapeRecorderAppendInputEvent ARGS
#
# DESCRIPTION
#    ARGS: (list) events to send
#    
#    TapeRecorderAppendInputEvent appends events found in ARGS to the
#    event fifo. If one event is pending, then it is not added. 
#
#    Then, if the automaton is not running, call TapeRecorderSendEvents.
#
# SIDE EFFECTS
#    Modifies TapePriv(input_events)
#
# RETURN
#----------------------------------------------------------------------
proc TapeRecorderAppendInputEvent {args} {
    global TapePriv
    foreach event $args {
	if {[lsearch $TapePriv(input_events) $event]==-1} {
	    lappend TapePriv(input_events) $event
	}
    }
    if  {$TapePriv(running)} {
	return
    }
    TapeRecorderSendEvents
}

#----------------------------------------------------------------------
# NAME
#    TapeRecorderSendEvents - send events to automaton
#
# SYNOPSIS
#    TapeRecorderSendEvents
#
# DESCRIPTION
#    Send events in TapePriv(input_events) to the automaton, then run
#    automaton. When it finished, looks at the event fifo, and possibly
#    resend new events.
#
# SIDE EFFECTS
#    run the automaton and flushes TapePriv(input_events)
#
# RETURN
#    
#
#----------------------------------------------------------------------
proc TapeRecorderSendEvents {} {
    global TapePriv

    set TapePriv(running) 1
    
    while {[llength $TapePriv(input_events)]} {
	# flushing events
	foreach event $TapePriv(input_events) {
	    if {$event != {tick}} {
		TAPE_PLAYER_I_$event
	    }
	}
	set TapePriv(input_events) {}
	# run 
	TAPE_PLAYER
	# may be start a timer. To ensure new timer is started
	# after last play.
	if {$TapePriv(start_timer)} {
	    set TapePriv(start_timer) 0
	    set TapePriv(timer_ctr) [expr "($TapePriv(timer_ctr)+1)%1000"]
	    after $TapePriv(delay) TapeRecorderEndTimer $TapePriv(timer_ctr)
	}
	# events may have been stored. loop back
	update
    }
    set TapePriv(running) 0
}


proc TapeRecorderEndTimer {ctr} {
# ctr is used to differentiate several instance of counters
# ex: START_TIMER, STOP, PLAY,
#  => first time must be discarded
    global TapePriv
    if { ! ($TapePriv(playing) && ($TapePriv(timer_ctr) == $ctr)) } {
        return 
    }
    TapeRecorderAppendInputEvent END_TIMER
}



# ==================================================================== RECORDER



##################################################################
#
# OTHERS
# 

proc TapeRecorderClose { {level  {}}  } {
    global TapePriv
    if {$TapePriv(playing)} {
	Alert "You must stop playing before closing"
	return
    }

    if { $TapePriv(recorder_saved) != $TapePriv(recorder_ctr) &&
          $TapePriv(recorded,short) != $TapePriv(default_tape) } {
	Alert "Want to save your session ?" \
	    -type warning \
	    -choice { {OK {TapeRecorderSave}} {NO {} }}
    }
    
    if {[winfo exist $TapePriv(tape_asker)]} {
	destroy $TapePriv(tape_asker)
    }
    catch { wm protocol $TapePriv(tape_window) WM_DELETE_WINDOW {} }
    catch "wm withdraw $TapePriv(tape_window)"
    catch "wm withdraw  $TapePriv(record_display)"
    ClientEnableUserInput

    if { $level == "clean" } {
	catch { SystemRemoveFile $TapePriv(temp_file) } 
    }
}


proc TapeRecorderIsPlaying {} {
    global TapePriv
    return $TapePriv(playing)
}

proc TapeRecorderIsRecording {} {
    global TapePriv
    return $TapePriv(recording)
}

proc TapeRecorderExternalStop {} {
    TapeRecorderAppendInputEvent STOP
    updatedisplay
}

proc TapeRecorderExist {} {
    global TapePriv
    return [winfo exists $TapePriv(tape_window)]
}

proc showtape {type  x y } {
    global font TapePriv
    if { $TapePriv($type,full) == "" } {
	return
    }
    set size  $font(panel)
    set fn $font(panel,$size)
    genericshow .fantom  $TapePriv($type,full) $x $y $fn
}


#####################
# SYSTEM  UTILITIES #
#####################
# Temprary tapes may be huge and have 
# to be handled by the file system
# So we need mktemp, copy, remove
#
proc SystemCopyFile  { orig  dest } {
    if {[catch {file copy -force -- $orig $dest} error]} {
	Alert "Cannot copy file $orig to $dest"
    }

}
proc SystemRemoveFile filename {
    file delete $filename
}

proc SystemMakeTemporaryFileName {} {
    global tcl_platform
    case $tcl_platform(platform) {
	"unix" {
	    set tmp "/tmp/xes[pid]"
	}
	"windows" {
	    set tmp "C:/TEMP/xes[pid]"
	}
    }
    return $tmp
}

proc SystemGetWorkingDirectory {} {
    return [pwd]
}


xesDebug TAPE OUT
