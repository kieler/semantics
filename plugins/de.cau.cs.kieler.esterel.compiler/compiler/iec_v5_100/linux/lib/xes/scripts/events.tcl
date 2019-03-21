#-------------------------------------------------------#
# Event manager: 'store last' or 'set next' input event #
#-------------------------------------------------------#

# Toplevel listbox
#-----------------
proc evtraise {} {
    wm withdraw .

    set w .evtlist 

    if [winfo exist $w] {
	wm deiconify $w
	raise $w
	return
    } 

    # Create the non existing toplevel
    otherwin $w
    wm title $w "Event manager"

    # Create list box and scrollbar
    set list      $w.list
    set scrollbar $w.scrollbar 
    listbox   $list      \
            -relief sunken \
            -yscrollcommand "$scrollbar set"
    scrollbar $scrollbar \
	    -command "$list yview"\
	    -relief {raised} -cursor double_arrow

    # Bottom buttons in frame
    set frame [frame $w.frame]
    set LAST [ button $frame.last -text "Store last"  \
                                    -command "evtstore last $list" ]
    set CURRENT [ button $frame.current -text "Store current"  \
                                    -command "evtstore current $list" ]
    set DELETE [ button $frame.delete -text "Delete"  \
                                    -command "evtset delete $list" ]
    set SET   [ button $frame.set   -text "Set next"    \
	                            -command "evtset send $list"   ]

    # Pack everybody
    pack $frame -side bottom -expand y -fill x
    pack $scrollbar -side right  -fill both
    pack $list -side left -expand y -fill both
    pack $CURRENT -side left  -expand y -fill x
    pack $LAST -side left  -expand y -fill x
    pack $DELETE -side left  -expand y -fill x
    pack $SET   -side left  -expand y -fill x
    bind $list <ButtonRelease> "setsel $list %y"

   
    wm deiconify $w
    raise $w
}
proc setsel { l y } {
    puts "setsel $l $y"
    set index [$l nearest $y]
    puts $index
}

# Event list manager
#-------------------
##############################
# Utilities: for testing purpose only
#proc setevent {} {
#  global current
#  set evt [concat evt $current]
#  incr current
#  return $evt
#}
#proc beep {} {
#  puts stderr  nonewline}
##############################

set evtList {}

set current 0

proc evtstore { what l } {
    global evtList inputevent
    case $what {
	last {
	    set evt $inputevent
	}
	current {
	    set compound [setevent]
	    set evt [lindex $compound 0]
	}
    }

    $l insert end $evt
}

proc evtset { what l } {
    set index [$l curselection]
    if { $index == "" } {
	beep
	return
    }
    case $what {
	delete {
	    set first [lindex $index 0]
	    set last  [expr $first + [llength $index] - 1 ]
	    $l delete $first $last
	}
	send {
	    set selectedevent [$l get [lindex $index 0]]
	    puts "$selectedevent $what"
	}
    }
}




