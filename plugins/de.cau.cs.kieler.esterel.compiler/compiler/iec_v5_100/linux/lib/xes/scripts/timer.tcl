#
# timer_entry: 
# Creates a frame with label and entry for sequence control
# 
proc timer_entry {w lab} {
    set frame [frame $w]
    set label [label $frame.l -text $lab -width 8 -anchor e]
    set entry [entry $frame.e -relief sunken ]
    pack $label -side left -anchor w
    pack $entry -side left -anchor w
    return $frame
}
#
# Timer:
# Main timer constructor
#
proc Timer {} {
    set w .xesTimer

    # Create if does not exist
    if ![winfo exists $w] {

	# Create toplevel
	otherwin $w
	wm title $w {Xes timer}

	# Event frame
	set evtframe [frame $w.evt -bd 2 -relief sunken]
	pack $evtframe -side top -anchor n -fill x -expand 1
	set eventbutton [button $evtframe.b -text "Set Event"]

	set eventvalue  [entry  $evtframe.e -width 8 ] 
	pack $eventbutton    -side left -anchor w -fill x -expand 1
	pack $eventvalue     -side left -anchor w -fill x -expand 1
        $eventbutton configure -command "timerSetEvent $eventvalue"

	# Sequence frame
	set seqframe [frame $w.seq -bd 2 -relief sunken]
	pack $seqframe -expand y -fill both
	pack [label $seqframe.t -text Sequence -relief groove] \
		-side top -anchor n -fill x -expand 1
	set period [timer_entry $seqframe.p {Period}]
	set length [timer_entry $seqframe.l {Length}]
	set count  [timer_entry $seqframe.c {Count}]
	pack $period -expand y -fill x
	pack $length -expand y -fill x
	pack $count  -expand y -fill x

	# Control frame
	set ctrframe [frame $w.ctr -bd 2 -relief sunken]
	pack $ctrframe -expand y -fill both
	#    pack [label $ctrframe.t -text Control -relief groove] \
		#	    -side top -anchor n -fill x -expand 1
	set start [button  $ctrframe.start -text Start -command timerstart]
	set stop  [button  $ctrframe.stop  -text Stop  -command timerstop ]
	set reset [button  $ctrframe.reset -text Reset -command timerreset]

	pack $start -side left  -fill x -expand 1
	pack $stop  -side left  -fill x -expand 1
	pack $reset -side left  -fill x -expand 1

	wm deiconify $w
	raise $w
	global timerstatus sequence
	set timerstatus "stopped"
	set sequence -1
	timerreset
    }
    # Pop it anyway
    wm deiconify $w
    raise $w
    return

}
#
#  timerstart:
#  Callback routine for Start button
#
proc timerstart {{w .xesTimer}} {
    global timerstatus sequence
    if { $timerstatus != "stopped" } {
	timererror $timerstatus
	return
    }
    incr sequence
    set period [$w.seq.p.e get]
    set count  [$w.seq.c.e get]
    set length [$w.seq.l.e get]

    if ![ check_float $period period ] { return 0 }
    if ![ check_int $length length ] { return 0 }
    if ![ check_int $count count   ] { return 0 }

    # OK ready to go
    $w.ctr.start configure -state disabled
    $w.ctr.reset configure -state disabled
    set timerstatus $sequence
    resetpanelinputs
    timerrun $sequence
    return
}
#
#  timerstop:
#  Callback routine for Stop button
#
proc timerstop  {{w .xesTimer}} {
    global timerstatus
    set timerstatus "stopped"
    $w.ctr.start configure -state normal
    $w.ctr.reset configure -state normal
    return
}
#
#  timerreset:
#  Callback routine for Reset button
#
proc timerreset {{w .xesTimer}} {
    $w.seq.c.e delete 0 end
    $w.seq.c.e insert 0 0
}
#
# timerrun
# 
proc timerrun { seq {w .xesTimer} } {
    global timerstatus
    if { $timerstatus != $seq } return

    set period [$w.seq.p.e get]
    set count  [$w.seq.c.e get]
    set length [$w.seq.l.e get]

    if { $count >= $length } {
	timerstop
	timerreset
	return
    }

    # Incr count
    incr count
    $w.seq.c.e delete 0 end
    $w.seq.c.e insert 0 $count

    global  currentCompound 
    runsimulation $currentCompound
#    tick

    # Arm next tick for current seq
    after [expr "int(1000*$period)"] "timerrun $seq"
}    
#
# timererror:
# 
proc timererror { {message {}} } {
    puts stderr "" nonewline
    Alert  $message
}
#
# numeric_check:
# Check if a string encodes  a positive integer
#
proc check_float { val {item {}} } {
    if { [ scan "$val" "%f" x ] == 1  } {
	if { $x >= 0 } {
	    return 1
	}
    }
    set message "$val : bad $item value"
    timererror $message
    return 0
}
proc check_int { val {item {}} } {
    if { [ scan "$val" "%d" x ] == 1  } {
	if { $x >= 0 } {
	    return 1
	}
    }
    set message "$val : bad $item value"
    timererror $message
    return 0
}
proc numeric_check { val {item {}} } {
    if { [ scan "$val" "%f" x ] == 1  } {
	if { $x >= 0 } {
	    return 1
	}
    }
    set message "$val : bad $item value"
    timererror $message
    return 0
}

proc timerSetEvent { entry } {
    global currentCompound
    set currentCompound [seteventFromPanel]
    set csimulString [lindex $currentCompound 1]
    $entry delete 0 end
    $entry insert 0 $csimulString
}
