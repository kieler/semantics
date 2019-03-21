xesDebug XSPANELS IN
pleaseWait Xspanel
##########
# File: xspanels.tcl
# A Tcl-Tk version of xsimul the Esterel automaton simulator
# Procedures for window creation popup etc...
##########
global private   allowinputs server_mode
set allowinputs 1

set private(user_input) 1
global gGridParams
foreach target {io locals traps variables} {
  set gGridParams($target,max_item)    0
  set gGridParams($target,item_height) 0
}

pleaseWait getdefault
proc getdefault {signum} {
    global  sigtable
    return  $sigtable($signum,default)
}

set sigtable(default_buttons) {}
pleaseWait sethiloinputs
proc sethiloinputs {} {
    global hiloinputs sigtable 

xesDebug sethiloinputs
    foreach item  $sigtable(default_buttons) {
	set but    [lindex $item 0]
	set signum [lindex $item 1]
        $but set 0
xesDebug sethiloinputs $signum
	if ![ info exist sigtable($signum,default) ] {
	    set sigtable($signum,default) 0
	}
	if ![ info exist sigtable($signum,var) ] {
	    set sigtable($signum,var)     0
	}

	if !$hiloinputs {
	    set sigtable($signum,var) 0
	}
	Input_ChangeDefault $but $signum $sigtable($signum,var) 
    }
}


pleaseWait Input
proc Input_ChangeDefault {scale signum defaultvalue} {
    global allowinputs hiloinputs sigtable color DEFAULTBACKGROUND 

    if { !$allowinputs } {
	beep
	if { $defaultvalue == 1 } {
	    $scale set 0
	} else {
	    $scale set 1
	}
	return
    }

xesDebug ChangeDefault $scale $signum $defaultvalue    

    # OK, set slider color
    $scale set $defaultvalue
    set sigtable($signum,default) $defaultvalue
    set sigtable($signum,var)     $defaultvalue
    if !$hiloinputs {
	$scale configure -state disabled \
	    -background $DEFAULTBACKGROUND \
	    -activebackground $DEFAULTBACKGROUND
    } else  {
	$scale configure -state normal 
	if { $defaultvalue == 0 } {
	    $scale configure \
		-background $color(sig,inactive) \
		-activebackground $color(sig,inactive)
	} else {
	    $scale configure \
		-background $color(sig,active)  \
		-activebackground $color(sig,active)
	}
    }
    setpreselection $signum
}

pleaseWait defaultbutton
proc defaultbutton {frame signum} {
    global sigtable
    global DEFAULTBACKGROUND
    # nom de la scale
    set default_button $frame.defaultbutton
    # creation attention a -background
    global panelscale panelfontsize
    set scalesizes $panelscale(size,$panelfontsize)
    set swidth        [lindex $scalesizes 0]
    set slength       [lindex $scalesizes 1]
    set ssliderlength [lindex $scalesizes 2]
    scale $default_button \
	    -from 1 -to 0 \
	    -width $swidth -length $slength -sliderlength $ssliderlength \
	    -showvalue no -bd 0
#	    -background $DEFAULTBACKGROUND


    # la command magique
    $default_button configure \
	    -command "Input_ChangeDefault $default_button $signum" 

    #  initialisee a ce qu'elle valait deja sinon 0 !!!!!
    if { ![info exists sigtable($signum,default)] } {
	set sigtable($signum,default) 0
    }
    Input_ChangeDefault $default_button $signum $sigtable($signum,default)

# BUG
    # activeforeground = sliderforeground
    $default_button configure \
	    -activebackground [$default_button cget -background]

    # bindings
    # si user_input autorise alors binding standard
    # sinon on deactive
    bind $default_button <Any-Enter>  [ format {
	global tk_priv private  tk_strictMotif
	if { $private(user_input) } {
	    %s
	} else {
	    %%W config -activebackground \
		    [lindex [%%W config -background] 4]
	    %%W configure -state disabled
	}
    }  [bind Scale <Any-Enter>]]

    # bindings
    # si user_input autorise alors binding standard
    # sinon on reactive
    bind $default_button <Any-Leave> [format {
	    global tk_priv private  tk_strictMotif
	    if { $private(user_input) } {
		%s
	    } else {
		%%W configure -state normal
	    }
    } [bind Scale <Any-Leave>]]
    return $default_button
}

##########
# Procedure:   genericpanel
# Description: generic set up of a panel of widgets
# Arguments:   parent    - name of the parent widget
#              siglist   - a list of items {signame signum [value] }
#              wname     - name of the widget panel
#              title     - title 
#              widget    - type of widget (checkbutton, label, ... )
#              iotype    - input or output
#              valuetype - pure  or valued
# Returns:     none
# Sideeffects: create and pack a new widget tree in parent widget
##########

pleaseWait genericpanel
proc genericpanel {
    target parent siglist wname title widget iotype valuetype fn 
} {


  # return if empty list
  set numberofitems [llength $siglist]
  if {$numberofitems == 0} { return }

  # the global signal table
  global sigtable vartable 

  # the panel absolute path
  set panel $parent.$wname

  # it is a frame
  frame  $panel -relief raised -bd 2

  # with a title
  pack [label $panel.title -bd 1  -relief sunken -text $title -font $fn ] \
                    -side top -fill x 

  set maxlen 0
  foreach item $siglist {
      set name  [lindex $item 1]
      set ln [string length $name]
      if {$maxlen < $ln} { set maxlen $ln}
  }

  set pad 0
  if {$maxlen < 5} { set pad [expr "(6-$maxlen)/2"]m }

  # and  columns of signal buttons or labels with an optional value entry
  set canvas $panel.c
  set frame $canvas.f

#  pack [frame $panel.f$i -bd 0 -relief flat] \
#                -side left -fill both -expand 1 -anchor nw

  canvas $canvas 
  frame $frame
#  pack $frame
  pack $canvas -fill y  -expand 1

  set nitem 1

  foreach item $siglist {
    incr nitem
    set name  [lindex $item 1]
    set num   [lindex $item 0]
    set sigtable($num,var)  0
    set f     $frame.$num
    pack [frame $f] -side top -fill x -expand y

      if { $widget == "button" } {
	  set defbut [defaultbutton $f $num]
	  pack $defbut  -side left -fill x
	  lappend sigtable(default_buttons) "$defbut $num"
      }

      pack [label $f.name -text "$name  " -relief flat -bd 0  \
             -font $fn -anchor w ]  -side left -fill x 
#      pack [$widget $f.name -text "$name  " -relief flat -bd 0  \
#             -font $fn -anchor w ]  -side left -fill x 

#      if { $widget == "button" } {
	  $f.name configure -bd 0 -pady 0 -padx 1m -highlightthickness 0
#      } 

    case $iotype in {
	"input" {
	    set sigtable($num,ilab) $f.name
	    bind $f.name <ButtonRelease-3> "startsignalbrowse  $num"
        }
	"output" {
	    set sigtable($num,olab) $f.name
	    bind $f.name <ButtonRelease-3> "startsignalbrowse  $num"
	}
    }



#autohelp $f.name $valuetype$iotype

      if { $valuetype == "valued" } {

#	  pack [entry $f.val -font $fn ] -side right -fill x 

	  #        WidgetUnbind   $f.val
	  #	EntryXBindings $f.val
	  case $iotype in {
	      "variable" {
#		  set vartable($num,lab) $f.name
#		  set vartable($num,val) $f.val
#		  set val [variablevalue $num]
#		  label $f.val -font $fn -text $val -bd 0 -anchor w
#		  $f.val configure -width 20
#		  bind $f.val <2> { }
		  entry $f.val -font $fn
		  set vartable($num,val) $f.val
		  set val [variablevalue $num]
		  $f.val insert 0 "$val"
		  $f.val configure -state disabled
	      }
	      "input" {
		  entry $f.val -font $fn 
		  set sigtable($num,ival) $f.val
		  set val [signalvalue $num]
		  $f.val configure -relief groove
		  $f.val insert 0 "$val"
		  if { $widget == "button" } {
		      bind $f.val <Return> "preselect $num"
		  }
	      }
	      "output" {
#		  set sigtable($num,oval) $f.val
#		  set val [signalvalue $num]
#		  label $f.val -font $fn -text "$val" -bd 0 -anchor w
#		  $f.val configure -width 20
#		  bind $f.val <2> { }
		  entry $f.val -font $fn
		  set sigtable($num,oval) $f.val
		  set val [signalvalue $num]
		  $f.val insert 0 "$val"
		  $f.val configure -state disabled
	      }
	  }
	  $f.val configure -cursor right_ptr
	  pack $f.val -side right 
	  bind $f.val <ButtonPress-1>     "showpanelvalue $iotype $num  %X %Y"
	  bind $f.val <ButtonRelease-1>   "unshow"
      }

    if { $widget == "button" } {
	setpreselection $num
        bind $f.name <ButtonRelease-1>  "panelinputselrelease  $num"  
        bind $f.name <ButtonPress-1>    "panelinputselpress    $num"
        bind $f.name <Double-Button-1>  "dblinputsel $num"
    }  
  }
  update idletasks

  # Set grid
    global gGridParams 
    set item_height [MakeListOfWidget $canvas $frame 10]

    if { $item_height > $gGridParams($target,item_height) } {
	set gGridParams($target,item_height) $item_height
    }
    if { [llength $siglist] > $gGridParams($target,max_item) } {
	set gGridParams($target,max_item) [llength $siglist]
    }
  return $panel
}

pleaseWait showpanelvalue
proc showpanelvalue { iotype num  x y } {
    global sccausal
    if $sccausal return
    global font panelfontsize
    set fn $font(panel,$panelfontsize)    
    case $iotype in {
	"variable" {
	    set val [variablevalue $num]
	}
	default	{
	    set val [signalvalue $num]
	}
    }
    genericshow .fantom $val  $x $y $fn
}

#pleaseWait preselect
proc preselect num {
 global sigtable
 set sigtable($num,var) 1
 setpreselection $num
}

pleaseWait setpreselection
proc setpreselection num {
    global sigtable
    if { ![info exists sigtable] || ![info exists sigtable($num,var)] }  {
	set sigtable($num,var) 0
    }

    if $sigtable($num,var) {
#	catch {
#	    $sigtable($num,ilab) configure -relief sunken \
#		    -background plum   \
#		    -activebackground plum 
#	}
       colorpanel sig $num   active
    } else {
#	global DEFAULTBACKGROUND
#        catch {
#	    $sigtable($num,ilab) configure -relief flat \
#	       -background $DEFAULTBACKGROUND \
#	       -activebackground $DEFAULTBACKGROUND
#	}
       colorpanel sig $num inactive
    }
}
    
##########
# Procedure:   execpanel
# Description: set up a panel of exec composite widget
# Arguments:   parent    - name of the parent window
#              execlist  - list of records :
#                             {taskname execindex returnname returnindex}      
# Returns:     none
# Sideeffects: none
##########

pleaseWait execpanel
proc execpanel { parent execlist fn } {

  # the global exec and signal tables
  global exectable sigtable color

  # the panel absolute path
  set panel   $parent.execpanel

  # it is a frame
  frame $panel -relief raised -bd 2
  pack $panel  -side top -fill x -expand 1
  # with a title
  pack [label $panel.title -bd 1 -relief sunken -text Execs -font $fn ] \
	  -side top -fill x

  # compute max widths
  set task_length   0
  set return_length 0
  foreach item $execlist {
    set cur_task_length       [string length [lindex $item 0]]
    set cur_return_length     [string length [lindex $item 2]]
    if { $task_length < $cur_task_length } {
	set task_length $cur_task_length
    }
    if { $return_length < $cur_return_length } {
	set return_length $cur_return_length
    }
  }

  # and a column of composite widgets
  global xes_bitmap color
  set xes_bitmap(start_kill) \
      [image create bitmap \
	   -foreground $color(exec,killed) \
	   -background $color(exec,active) -data {
\#define sk_width 16
\#define sk_height 16
static char sk_bits[] = {
   0x00, 0x80, 0x00, 0xc0, 0x00, 0xe0, 0x00, 0xf0, 0x00, 0xf8, 0x00, 0xfc,
   0x00, 0xfe, 0x00, 0xff, 0x80, 0xff, 0xc0, 0xff, 0xe0, 0xff, 0xf0, 0xff,
   0xf8, 0xff, 0xfc, 0xff, 0xfe, 0xff, 0xff, 0xff};
}]


  set xes_bitmap(start) \
    [image create bitmap \
	 -foreground $color(exec,active) \
         -background $color(exec,active) -data {
\#define s_width 16
\#define s_height 16
static char s_bits[] = {
   0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff,
   0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff,
   0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff};
}]

  set xes_bitmap(kill) \
    [image create bitmap \
	 -foreground $color(exec,killed) \
          -background $color(exec,killed) -data {
\#define s_width 16
\#define s_height 16
static char s_bits[] = {
   0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff,
   0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff,
   0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff};
}]

  set xes_bitmap(idle) \
    [image create bitmap \
	 -foreground $color(exec,idle) \
         -background $color(exec,idle) -data {
\#define s_width 16
\#define s_height 16
static char s_bits[] = {
   0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff,
   0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff,
   0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff};
}]

  foreach item $execlist {
    set task_name      [lindex $item 0]
    set exec_index     [lindex $item 1]
    set return_name    [lindex $item 2]
    set num            [lindex $item 3]
    set f     $panel.$exec_index
    pack [frame $f] -side top -fill x
    pack [label $f.sigsk -image $xes_bitmap(start)  \
	    -fg $color(bg,default) \
	    -bg $color(bg,default) \
	    -relief ridge ] -side left
    pack [label $f.task   -text $task_name  -font $fn -anchor e \
                   -relief flat -width [expr $task_length + 2] \
                   ] -side left
    set exectable($exec_index,lab)   $f.task
    set exectable($exec_index,sigsk) $f.sigsk
    set exectable($exec_index,return) $num

    pack [button $f.refargs -relief flat -text "(.)" -font $fn -fg blue] \
	    -side left
    pack [button $f.valargs -relief flat -text "(.)" -font $fn -fg blue] \
	    -side left
    bind $f.valargs <ButtonPress-1>   "showtaskargs val $exec_index %X %Y"
    bind $f.valargs <ButtonRelease-1> "unshow"
    bind $f.refargs <ButtonPress-1>   "showtaskargs ref $exec_index %X %Y"
    bind $f.refargs <ButtonRelease-1> "unshow"
      
    pack [label $f.label  -text "->"  -font $fn  -relief flat ] -side left

    button $f.return -text "$return_name  " -anchor w -font $fn -relief flat \
	    -width $return_length

    pack $f.return    -side left

    set sigtable($num,ilab) $f.return 
    set sigtable($num,var)  0
#   setpreselection $num
#
#    bind $f.return <ButtonRelease-1>  \
#	    "panelinputselrelease  $num ret $exec_index"  
#    bind $f.return <ButtonPress-1>    \
#	    "panelinputselpress    $num ret $exec_index"
#    bind $f.return <Double-Button-1>    \
#	    "dblinputsel   $num "

      if { [isvaluedinput $num] } {
	  pack [entry $f.val -relief groove -font $fn] -side left
	  WidgetUnbind   $f.val
	  EntryXBindings $f.val
	  EntryBindings  $f.val
	  set sigtable($num,ival) $f.val
	  set val [signalvalue $num]
	  $f.val insert 0 "$val"
      }

  }
}


pleaseWait isvaluedinput
proc isvaluedinput num {
    global gList
    foreach  sig  $gList(valuedreturn) {
	if { $num == [lindex $sig 0] } {
	    return 1
	}
    }
    foreach  sig  $gList(valuedinput) {
	if { $num == [lindex $sig 0] } {
	    return 1
	}
    }
    return 0
}
##########
# Procedure:   panel
# Description: set up a panel of signals
# Arguments:   type      - must be pureinput, valuedinput, ...
#              parent    - name of the parent window
#              siglist   - a list of pairs {signame signum}
# Returns:     none
# Sideeffects: none
##########
pleaseWait panel
proc panel { type parent siglist font} {
    case $type {
	pureinput {
            return [genericpanel io $parent $siglist \
                    pureinputpanel "Pure Inputs" button input pure $font]
	}
	pureoutput {
	    return [genericpanel io $parent $siglist \
		    pureoutputpanel "Pure Outputs" label output pure $font]
	}
	valuedinput {
	    return [genericpanel io $parent $siglist \
		    valuedinputpanel "Valued Inputs" button input valued $font]
	}
	sensor {
	    return [genericpanel io $parent $siglist \
		    sensorpanel "Sensors" label input valued $font]
	}
	valuedoutput {
	    return [genericpanel io $parent $siglist \
		    valuedoutputpanel "Valued Outputs" label output valued $font]
	}
	purelocal {
	    return [genericpanel locals $parent $siglist \
		    purelocalpanel "Pure Locals" label output pure $font]
	}
	valuedlocal {
	    return [genericpanel locals $parent $siglist \
		    valuedlocalpanel "Valued Locals" label output valued $font]
	}
	puretrap {
	    return [genericpanel traps $parent $siglist \
		    puretrappanel "Pure Traps" label output pure $font]
	}
	valuedtrap {
	    return [genericpanel traps $parent $siglist \
		valuedtrappanel "Valued Traps" label output valued $font]
	}
	variable {
	    return [genericpanel variables $parent $siglist \
		variablepanel "Variables" label variable valued $font]
	}
    }
}

##########
# Procedure:   setevent
# Description: build current input event from panel state
# Arguments:   none
# Returns:     the event as a list of {num [value]}
# Sideeffects: none
##########
set tapePlaying 0
pleaseWait setevent
proc setevent {} {
    global tapePlaying
    if { $tapePlaying } {
        seteventFromFile
    }   else {
	seteventFromPanel
    }
}

pleaseWait seteventFromFile
proc seteventFromFile {} {
  Alert "seteventFromFile not yet implemented" -type error
}

pleaseWait  seteventFromPanel
proc  seteventFromPanel {} {
    global sigtable gList exectable

    # Two flags to manage the special feature of csimul:
    # IF anysensor AND NOT anyinput THEN ';' is not a tick and must be repeated
    set nbErrors 0
    set anyinput 0;
    set anysensor 0;

    set compound {}
    set inputevent {}
    set stringline {}
    foreach sig $gList(pureinput) {
        set num  [lindex $sig 0]
        set name [lindex $sig 1]
        if "$sigtable($num,var)"  {
	    checkandsetinput $num -pure ""
	    lappend inputevent $num
            set stringline [concat $stringline $name]
	    incr anyinput
	}
    }

    foreach sig $gList(valuedinput) {
        set num  [lindex $sig 0]
        set name [lindex $sig 1]
        if "$sigtable($num,var)"  {
	    set val [$sigtable($num,ival) get]
	    if {$val == ""} {set val {}}
	    set status [catch {checkandsetinput $num -valued "$val"} message]
	    if { $status != 0 } {
		Alert "$message" -type warning -choice { { OK { } } }
		incr nbErrors
	    }
	    lappend inputevent [list $num $val]
	    set val [quotestring $val]
	    set stringline [concat $stringline $name=$val]
	    incr anyinput
	}
    }

    foreach sig $gList(exec) {
        set execnum    [lindex $sig 1]
        set returnname [lindex $sig 2]
        set returnnum  [lindex $sig 3]
        if "$sigtable($returnnum,var)"  {
	    incr anyinput
	    if [ info exist sigtable($returnnum,ival) ] {
		set kind -valued
		set val [$sigtable($returnnum,ival) get]
	        if {$val == ""} {set val {}}
		lappend inputevent [list $returnnum $val]
		set stringline [concat $stringline \
				    $returnname=[quotestring $val] ]
	    } else {
		set kind -pure
		set val {}
		lappend inputevent $returnnum 
                set stringline [concat $stringline $returnname ]
	    }
	    if [info exist exectable($execnum,values)] {
		set vallist ""
		foreach value $exectable($execnum,values) {
		    if { $vallist != "" } {
			set vallist [concat $vallist ","]
		    }
		    set vallist [concat $vallist \"$value\"]
		}
		if {$vallist != ""} {
		    set stringline \
			    [concat $stringline  "return (" $vallist ")"]
		}
		set taskArgs $exectable($execnum,values)
	    } else {
		set taskArgs {}
	    }
	    set status [catch {checkandsetreturn \
				   $returnnum \
				   $kind \
				   "$val" \
				   $taskArgs} message]
	    if { $status != 0 } {
		Alert "$message" -type warning -choice { { OK { } } }
		incr nbErrors
	    }
        }
    }

    foreach sig $gList(sensor) {
        set num  [lindex $sig 0]
        set name [lindex $sig 1]
        set val [$sigtable($num,ival) get]
	if {$val == ""} {set val {}}
	if {$val != [signalvalue $num]} {
	    set status [catch {checkandsetinput $num -valued "$val"} message]
	    if { $status != 0 } {
		Alert "$message" -type warning -choice { { OK { } } }
		incr nbErrors
	    }
	    lappend inputevent [list $num $val]
	    set val [quotestring $val]
	    set stringline [ concat $stringline $name=$val ]
	    incr anysensor
	}
    }
    if { $anysensor && !$anyinput } {
	set stringline [concat $stringline  " ;"]
    }
    lappend compound $inputevent 
    lappend compound $stringline
    lappend compound $nbErrors
    return $compound
}


##########
# Procedure:   resetinstancebreakpoints
# Description: resets all breakpoints in a module instance
# Arguments:   instance - the instance index
# Returns:     none
# Sideeffects: modifies breakpointstatus and graphical aspect
##########
pleaseWait  resetinstancebreakpoints
proc  resetinstancebreakpoints { mode instance  } {
    global tk_priv
    resetBP $mode $instance
    updatesource
    updatetree
    checkAlertBP
}

pleaseWait checkAlertBP
proc checkAlertBP {} {
    global tk_priv
    if { [llength [brokeninstances]] == 0 } {
	set tk_priv(button,BP) 1
    }
}

##########
# Procedures:  setbreakpoint, resetbreakpoint, togglebreakpoint
# Description: set, reset, or toggle a breakpoint
# Arguments:   num of halt
# Returns:     none
# Sideeffects: modifies breakpointstatus and graphical aspect
##########
set blinkFlag 0
pleaseWait startBPblinking
proc startBPblinking {} {
    global windowlist color

    foreach inst $windowlist {
	foreach num [instance_halts $inst] {
             setbgsourcepoint halt $num default
	}
	foreach num [brokenhalts $inst] {
             setbgsourcepoint halt $num broken
	}
	foreach num [instance_runs $inst] {
             setbgsourcepoint inst $num default
	}
	foreach num [brokeninstances $inst] {
             setbgsourcepoint inst $num broken
	}
    }

#    foreach num [brokeninstances] {
#	bgcolortreeinstance $num  $color(inst,broken)
#    }


    #  Hack to disable blinkink
    set anyBlink 0
    if $anyBlink {
	set blinkFlag 1
	case $activity {
	    "active" { set next broken }
	    "broken" { set next active }
	}
	eval after 500 { continueBPblinking $next }
    } else {
	set blinkFlag 0
	raisebreakpoints
    }	
}

pleaseWait stopBPblinking
proc stopBPblinking {} {

}

pleaseWait  raisebreakpoints
proc  raisebreakpoints {  } {
    global  gList sccausal status textroot
    if $sccausal return
return

    foreach hlt $gList(halt) {
	set num [lindex $hlt 0]
	if $status(halt,$num) {
            setbgsourcepoint break $num  active
	}
    }
}

pleaseWait  setbreakpoint
proc  setbreakpoint { hlt } {
    global  status sccausal server_mode
    if { $sccausal | $server_mode } return

    # Inform C code
    setbreak $hlt 1

#    activebreakbutton $hlt 
     set status(halt,$hlt) 1
#    setsourcepoint break $hlt active
#    startBPblinking
    updatesource
    updatetree
}

pleaseWait  resetbreakpoint
proc  resetbreakpoint { hlt } {
    global  status textroot sccausal server_mode gList
    if { $sccausal | $server_mode } return

    # Inform C code
    setbreak $hlt 0

    set status(halt,$hlt) 0
#    if [info exists textroot(halt,$hlt)] {
#	setsourcepoint break $hlt inactive
#	if [hasNoBreakPoints $textroot(halt,$hlt) ] {
#	    inactivebreakbutton $hlt
#	}
#    }
#    startBPblinking
    updatesource
    updatetree
}

pleaseWait togglebreakpoint
proc togglebreakpoint {hlt} {
    global status  sccausal server_mode
    if { $sccausal | $server_mode } return

    if $status(halt,$hlt) {
	resetbreakpoint $hlt
	checkAlertBP
    } else {
	setbreakpoint $hlt
    }
}



# proc hasNoBreakPoints { inst } {
#     global gList status
#     foreach hlt $gList(halt,$inst) {
# 	if $status(halt,$hlt) { return 0 } 
#     }
#     return 1
# }

pleaseWait activebreakbutton
proc activebreakbutton { hlt } {
    global  textroot
    catch [.f$textroot(halt,$hlt).t.brk configure -relief raised -state normal]
}


pleaseWait inactivebreakbutton
proc inactivebreakbutton { hlt } {
    global  textroot
    catch [.f$textroot(halt,$hlt).t.brk configure -relief flat -state disabled]
}

##########
# Procedure:   resetinputs
# Description: reset panel input buttons
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
pleaseWait  resetsourceinputs
proc  resetsourceinputs {} {
    global  sigtable gList 

    foreach sig $gList(pureinput) {
        set num  [lindex $sig 0]
        colorsourcepoint sig $num inactive
    }
    foreach sig $gList(valuedinput) {
        set num  [lindex $sig 0]
        colorsourcepoint sig $num inactive
    }
    foreach sig $gList(purereturn) {
        set num  [lindex $sig 0]
        colorsourcepoint sig $num inactive
    }
    foreach sig $gList(valuedreturn) {
        set num  [lindex $sig 0]
        colorsourcepoint sig $num inactive
    }
}

pleaseWait  resetpanelinputs
proc  resetpanelinputs {} {
    global  sigtable gList 

    foreach sig $gList(pureinput) {
        set num  [lindex $sig 0]
        set sigtable($num,var) [getdefault $num]
        setpreselection $num
#        colorpanel       sig $num inactive
    }
    foreach sig $gList(valuedinput) {
        set num  [lindex $sig 0]
        set sigtable($num,var) [getdefault $num]
        setpreselection $num
#        colorpanel       sig $num inactive
    }
    foreach sig $gList(purereturn) {
        set num  [lindex $sig 0]
        set sigtable($num,var) 0
        setpreselection $num
        colorpanel       sig $num inactive
    }
    foreach sig $gList(valuedreturn) {
        set num  [lindex $sig 0]
	set sigtable($num,var) 0
        setpreselection $num
        colorpanel       sig $num inactive
    }
    resetbutton inactive
}

pleaseWait resetbutton
proc resetbutton {state} {
    global private color server_mode
    if !$server_mode {
	$private(resetbutton)  configure -fg $color(sig,$state)
    }
}


pleaseWait  resetinputs
proc  resetinputs {} {
    resetpanelinputs
}

##########
# Procedure:   resetoutputs
# Description: reset panel output buttons
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
pleaseWait  resetoutputs
proc  resetoutputs {} {
    global sigtable gList

    foreach sig $gList(pureoutput) {
        set num  [lindex $sig 0]
	catch {  $sigtable($num,olab) configure -fg black }
    }
    foreach sig $gList(valuedoutput) {
        set num  [lindex $sig 0]
	catch { $sigtable($num,olab) configure -fg black }
    }
}

##########
# Procedure:   resetlocals
# Description: reset panel local buttons
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
pleaseWait  resetlocals
proc  resetlocals {} {
    global sigtable gList

    if { ![winfo exists .locals] } {
	return
    }

    foreach sig $gList(purelocal) {
        set num  [lindex $sig 0]
	catch {  $sigtable($num,olab) configure -fg black }
    }
    foreach sig $gList(valuedlocal) {
        set num  [lindex $sig 0]
	catch {  $sigtable($num,olab) configure -fg black }
    }
}

##########
# Procedure:   setvariables
# Description: set variables values
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
pleaseWait  setvariables
proc  setvariables {} {
    global vartable gList

    foreach item $gList(variable) {
        set num    [lindex $item 0]
	set val    [variablevalue $num]
	set widget $vartable($num,val)  

	$widget configure -state normal
	$widget delete 0 end
	$widget insert 0 "$val"
	$widget configure -state disabled
    }
}
pleaseWait setoutputs
proc setoutputs {} {
    global outputevent sigtable color

    foreach sig $outputevent {
	set num [lindex $sig 0]
        catch { $sigtable($num,olab) configure -fg $color(sig,active) }
#        catch { $sigtable($num,ilab) configure -fg $color(sig,active) }
    }
}

##########
# Procedure:   setexecs
# Description: set execs status
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
pleaseWait makereturnactive
proc makereturnactive { exec_index  } {
    global exectable sigtable color
    set num $exectable($exec_index,return)

    set sigtable($num,var) 0

    set returnlabel $sigtable($num,ilab) 
    $returnlabel configure -fg $color(sig,inactive) \
	-activeforeground $color(sig,inactive)
    $returnlabel configure -state normal
    bind $returnlabel <ButtonRelease-1>  \
	    "panelinputselrelease  $num ret $exec_index"  
    bind $returnlabel <ButtonPress-1>    \
	    "panelinputselpress    $num ret $exec_index"
    bind $returnlabel <Double-Button-1>    \
	    "dblinputsel   $num "

}
pleaseWait makereturninactive
proc makereturninactive { exec_index  } {
    global exectable sigtable
    set num $exectable($exec_index,return)

    set sigtable($num,var) 0

    set returnlabel $sigtable($num,ilab) 
    $returnlabel configure -fg black  -activeforeground black
    $returnlabel configure -state disabled
    bind $returnlabel <ButtonRelease-1>  {}
    bind $returnlabel <ButtonPress-1>    {}
    bind $returnlabel <Double-Button-1>  {}
}
pleaseWait  setexecs
proc  setexecs {} {
    global exectable gList color

    foreach item $gList(exec) {
        set execnum  [lindex $item 1]
        set status [execstatus $execnum]
	set sigsk [lindex $status 0]
	set state [lindex $status 1]

	case $state {
	    A {set col $color(exec,active);   makereturnactive    $execnum  }
	    W {set col $color(exec,waiting);  makereturninactive  $execnum  }
	    I {set col $color(exec,inactive); makereturninactive  $execnum  }
	}
	global xes_bitmap
	case $sigsk {
	    S       {
		set bitmap $xes_bitmap(start)
	    }
	    K       {
		set bitmap $xes_bitmap(kill)
	    }
	    SK      {
		set bitmap $xes_bitmap(start_kill)
	    }
	    default {
		set bitmap $xes_bitmap(idle)
	    }
	}
	global panelfontsize
	case $panelfontsize {
	    huge     { set width 14; set height 14 }
	    big      { set width 12; set height 12 }
	    medium   { set width 10; set height 10 }
	    small    { set width  8; set height  8 }
	    tiny     { set width  6; set height  6 }
	}
	$exectable($execnum,sigsk) configure \
	    -image  $bitmap -width  $width  -height  $height
	$exectable($execnum,lab)   configure -fg   $col
    }
}

##########
# Procedure:   resettraps
# Description: reset panel trap buttons
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
pleaseWait  resettraps
proc  resettraps {} {
    global sigtable gList

    # Nothing to do if no trap window
    if { ![winfo exists .traps] }  {
	return
    }

    foreach sig $gList(puretrap) {
        set num  [lindex $sig 0]
	catch {  $sigtable($num,olab) configure -fg black }
    }
    foreach sig $gList(valuedtrap) {
        set num  [lindex $sig 0]
	catch {  $sigtable($num,olab) configure -fg black }
    }
}

##########
# Procedure:   resethalts
# Description: reset source halts, watchings and runs
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
pleaseWait  resethalts
proc  resethalts {} {
    global gList  numberofinstances rootinstance

    # reset halts
    foreach item $gList(halt) {
        set num              [lindex $item 0]
        colorsourcepoint     halt  $num inactive
    }
    # reset watchings
    foreach item $gList(watching) {
        set num                  [lindex $item 0]
        underlinesourcepoint watch  $num inactive
    }

    # reset copymodules
    for {set inst 0} { $inst < $numberofinstances } { incr inst } {
	if { $inst != $rootinstance } {
	    colorsourcepoint inst $inst inactive
#	    colortreeinstance     $inst inactive

# puts "	    colortreeinstance     $inst inactive"
	}
    }
}

##########
# Procedure:   resetpanel
# Description: general graphic reset 
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
pleaseWait resetpanel
proc resetpanel {} {
    global   gList
    resetinputs
    resetoutputs
    resetlocals
    resettraps
#    resethalts
    setivalues $gList(valuedinput)
    setivalues $gList(valuedreturn)
    setivalues $gList(sensor)
    setovalues $gList(valuedoutput)
    setovalues $gList(valuedlocal)
    setovalues $gList(valuedtrap)
    setvariables
    setexecs
    raisebreakpoints
}

##########
# Procedure:   setovalues
# Description: set panel values  
# Arguments:   siglist - a list of {name num value}
# Returns:     none
# Sideeffects: none
##########
pleaseWait  setovalues
proc  setovalues {  siglist } {
    global sigtable
    foreach sig $siglist {
	set num [lindex $sig 0]
	set val [signalvalue $num]
	set widget $sigtable($num,oval) 

	$widget configure -state normal
	$widget delete 0 end
	$widget insert 0 "$val"
        $widget configure -state disabled
    }
}


##########
# Procedure:   setivalues
# Description: set panel values  
# Arguments:   siglist - a list of {name num value}
# Returns:     none
# Sideeffects: none
##########
pleaseWait  setivalues
proc  setivalues {  siglist } {
    global sigtable
    foreach sig $siglist {
	set num [lindex $sig 0]
	set val [signalvalue $num]
	$sigtable($num,ival) delete 0 end
	$sigtable($num,ival) insert 0 "$val"
xesDebug setivalues $num "$val"
    }
}


##########
# Procedure:   inputsel
# Description: call runselection if in autosend mode
# Arguments:   widget name
# Returns:     none
# Sideeffects: none
##########
pleaseWait beep
proc beep {} {
    bell
    catch { raise .alert }
}



pleaseWait dblinputsel
proc dblinputsel {num }  {
    global allowinputs sigtable   remote server_mode
    if { $allowinputs && !$remote } {
	set  sigtable($num,var) 1
        setpreselection $num
#	colorpanel sig $num active
	runsimulation
    }
}

pleaseWait panelinputselpress
proc panelinputselpress {num {typ sig} {exec_index {}} } {
    global remote
    if !$remote { inputselpress $num $typ $exec_index  }
}

pleaseWait inputselpress
proc inputselpress {num {typ sig} {exec_index {}} } {
    global  sigtable  color allowinputs currentpopup remote connect_mode

    set w $sigtable($num,ilab)
    if { !$allowinputs && !$remote }  {
	beep
        catch {
	    wm deiconify $currentpopup
	    raise $currentpopup
	}
	return
    }

#    catch { $w configure -relief sunken }

    if $sigtable($num,var) {
        set  sigtable($num,var) 0
	if { $connect_mode != "silent" } {
        setpreselection $num
#	    colorpanel sig $num inactive
	}
    } else {
        set  sigtable($num,var) 1
	if { $connect_mode != "silent" } {
        setpreselection $num
#	   colorpanel sig $num active
	}
    } 
}

pleaseWait panelinputselrelease
proc panelinputselrelease {num {typ sig} {exec_index {}} } {
    global remote
    if !$remote { inputselrelease $num $typ $exec_index  }
}

pleaseWait inputselrelease
proc inputselrelease { num {typ sig} {exec_index {}}} {
    global  color allowinputs sigtable currentpopup remote
    set w $sigtable($num,ilab)
    if { !$allowinputs && !$remote } { return }

#    catch { $w configure  -relief flat }

    if { $typ=="ret" && ![isactiveexec $exec_index] } { 
#	    colorpanel sig $num inactive
	    set  sigtable($num,var) 0
        setpreselection $num
	    return 
    }
    if { $typ=="ret" && [isactiveexec $exec_index] } {
	set refarglist [taskargs ref $exec_index]

	if { ![refargedit  $exec_index "$refarglist"  newlist] } {
#	    colorpanel sig $num inactive
	    set  sigtable($num,var) 0
        setpreselection $num
	    return
	}
    }

#    catch { $w configure  -relief flat }

}


##########
# Procedure:   runselection
# Description: run the automaton with the current inputevent
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
pleaseWait tick
proc tick {} {
    global allowinputs remote
    if { $allowinputs && !$remote }  {
	runselection
    } else {
	beep
    }
}

 
# The real instant from panel
pleaseWait runselection
proc runselection {} {
    global allowinputs remote

    if { !$allowinputs && !$remote  } {
	beep
	return
    }

    set event [seteventFromPanel]
    XesHook userBeforeRun
    runsimulation $event
    XesHook userAfterRun
}

pleaseWait doubletick
proc doubletick {} {
# NOTHING
}
pleaseWait inactiverun
proc inactiverun {} {
    if { [TapeRecorderIsPlaying] } {
	TapeRecorderExternalStop
    }
    Alert "Breakpoint reached" -type BP  \
	-choice  { {OK {global onbrk;set onbrk 0} } }
}

pleaseWait disarmrun
proc disarmrun {} {
    global rootinstance
#    colortreeinstance $rootinstance inactive
    Alert "End of module reached" -type warning \
	-choice  { {Reset {reset 1} } {Quit quit} }
}

##########
# Procedure:   resetbreakpoints
# Description: resets all breakpoints in all module instances
# Arguments:   none
# Returns:     none
# Sideeffects: modifies breakpointstatus and graphical aspect
##########
pleaseWait  resetbreakpoints
proc  resetbreakpoints {   } {
    global gList sccausal status
    if $sccausal return

    foreach item  $gList(halt) {
	set hlt [lindex $item 0]
        # Inform C code
        setbreak $hlt 0
	set status(halt,$hlt) 0
    }
    updatesource
    updatetree
    checkAlertBP
}

##########
# Procedure:   isinput
# Description: check for a signal to be an input
# Arguments:   none
# Returns:     true/false
# Sideeffects: none
##########
pleaseWait isinput
proc isinput { num } {
    global gList
    foreach sig "$gList(pureinput)" {
	if { $num == [lindex $sig 0] } { return 1}
    }
    foreach sig "$gList(valuedinput)" {
	if { $num == [lindex $sig 0] } { return 1}
    }
    foreach sig "$gList(purereturn)" {
	if { $num == [lindresetbreakpointex $sig 0] } { return 1}
    }
    foreach sig "$gList(valuedreturn)" {
	if { $num == [lindex $sig 0] } { return 1}
    }
    return 0
}

##########
# Procedure:   runsimulation
# Description: run the automaton with the current inputevent
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
# return codes -- See interface.h and tclproc.c --
set code(__MODULE_TERMINATED)                     -1
set code(__NO_ERROR_CODE)                          0
set code(__UNINITIALIZED_VARIABLE_ERROR_CODE)      1
set code(__SINGLE_SIGNAL_EMITTED_TWICE_ERROR_CODE) 2
set code(__CAUSALITY_ERROR_CODE)                   3
set code(__STATIC_CYCLES_ERROR_CODE)		   4
set code(__BAD_SENSOR_VALUE_ERROR_CODE)		   5
set code(__ACTION_ORDER_CYCLES_ERROR_CODE)	   6

#set keepinputs 0


set outputevent {}

pleaseWait xspanel1

pleaseWait updatesource
proc updatesource {} {

    global windowlist  status   onbrk   gList watchtable
    set onbrk 0
    set gList(activebreak) {}

    setsourceinputs
    shownets

    # For all visible instances
    foreach inst $windowlist {
	set menu .f$inst.t.brk.m
	set text .f$inst.f.text
	# Reset signals
	foreach signal [instance_signals $inst] {
	    colorsourcepoint sig $signal inactive
	}
	# Reset halts and their watchings
	foreach halt [instance_halts $inst] {
	    colorsourcepoint halt  $halt inactive
	}
	# Reset runs and their watchings
	foreach run [instance_runs $inst] {
	    colorsourcepoint inst  $run inactive
	    $text  tag configure TAGinstBP$run -background {}
	}

	# Reset watchings
	foreach watch [instance_watchings $inst] {
	    underlinesourcepoint watch $watch.$inst inactive
	}

	# Set active signals
	foreach signal [instance_activesignals $inst] {
	    colorsourcepoint sig $signal active
	}
	# Set active halts and their watchings
	foreach halt [instance_activehalts $inst] {
	    colorsourcepoint halt $halt active
	    if {  $status(halt,$halt)  } {
		set onbrk 1
		lappend gList(activebreak) $halt
	    }
	}
	# Set active runs and their watchings
	foreach run [instance_activeruns $inst] {
	    colorsourcepoint inst $run  active
	}

	# Set active watchings
	foreach watch [instance_activewatchings $inst] {
	    underlinesourcepoint watch $watch.$inst active
	}

	# Breakpoints
	foreach num [instance_halts $inst] {
	    set status(halt,$num) 0
	     setsourcepoint  break $num inactive
             setbgsourcepoint halt $num default
	     $text  tag lower  TAGhalt$num
	}
	foreach num [breakpoints $inst] {
	    set status(halt,$num) 1
	     setsourcepoint  break $num active
	}
	foreach num [brokenhalts $inst] {
             setbgsourcepoint halt $num broken
	     $text  tag raise  TAGhalt$num
	}
	# Disable or enable breakpoints menu items
	set BPflag [hasBreakPoints $inst]
	foreach nitem {0 1} {
	    if [lindex $BPflag $nitem] {
		$menu entryconfigure $nitem -state normal
	    } else {
		$menu entryconfigure  $nitem -state disabled
	    }
	}
    }
}

set inputevent {}
pleaseWait setpanelinputs
proc setpanelinputs {} {
  global inputevent
  foreach sig $inputevent {
      inputselpress [lindex $sig 0]
  }
}

pleaseWait setsourceinputs
proc setsourceinputs {} {
  global inputevent
  foreach sig $inputevent {
	    colorsourcepoint sig $sig active
  }
}

pleaseWait preselected
proc preselected {} {
    global  sigtable gList 

    set any 0

    foreach sig $gList(pureinput) {
        set num  [lindex $sig 0]
        if $sigtable($num,var) {
	    set any 1
	}
    }
    foreach sig $gList(valuedinput) {
        set num  [lindex $sig 0]
        if $sigtable($num,var) {
	    set any 1
	}
    }
    foreach sig $gList(purereturn) {
        set num  [lindex $sig 0]
        if $sigtable($num,var) {
	    set any 1
	}
    }
    foreach sig $gList(valuedreturn) {
        set num  [lindex $sig 0]
        if $sigtable($num,var) {
	    set any 1
	}
    }
    return $any
}


pleaseWait runsimulation
proc runsimulation { {compoundevent {} } } {
    global sigtable hlttable watchtable status color code keepinputs
    global outputevent onbrk remote connect_mode inputevent stringline
    global last_preference

    if {[onbrk]} inactiverun

    # build current input event
    if { $compoundevent == {} } {
	set compound  [setevent]
    } else {
	set compound  $compoundevent
    }
    set inputevent [lindex $compound 0]
    set stringline [lindex $compound 1]
    if { [llength $compound] == 3 } {
	set nbErrors   [lindex $compound 2]
	if { $nbErrors > 0 } {
	    inputeventreset
	    return   
	}
    }

    # check input event
    set checkstatus [ catch checkrelations  message ]
    if { $checkstatus != $code(__NO_ERROR_CODE) } {
	Alert " BAD INPUT EVENT :\n\n$message" -type warning \
		-choice { {OK {} }}
	if [TapeRecorderIsPlaying] TapeRecorderExternalStop
	inputeventreset
	return
    }


    # Automaton call
    set runstatus [catch run runmessage ]
    endrunsimulation $runstatus $runmessage
}

pleaseWait endrunsimulation
proc endrunsimulation {runstatus runmessage} {
    global sigtable hlttable watchtable status color code keepinputs
    global outputevent onbrk remote connect_mode inputevent stringline
    global last_preference

    # Write to recorder
    register $stringline

    inputeventreset
    # reset task referenced args
    global gList exectable
    foreach item $gList(exec) {
        set execnum  [lindex $item 1]
	set exectable($execnum,values) {}
    }

    # Write to recorder
    register [concat {% Outputs: } [xescsimuloutput output]] false
#    register [concat {% Locals : } [xescsimuloutput local ]] false
#    register [concat {% Traps  : } [xescsimuloutput trap  ]] false
    register {%} false

    if {$runstatus == $code(__CAUSALITY_ERROR_CODE)} {
	global un kn
	set un 1
	set kn 1
	setpref un
	shownets
	Causality -reset
	if [TapeRecorderIsPlaying] {
	    TapeRecorderExternalStop
	} else {
	    #	    xesDebug Tape Is Not Playing
	}
	return
    }

    if { $connect_mode != "silent" } {

	# turn inputs off first

	# reset panels
	if { !$keepinputs && !$remote } resetpanelinputs
	resetoutputs
	resetlocals
	resettraps

    }

    # Set source color
    colorsp "$last_preference"
    
    # check runtime error
    # Normal completion
    global connect_mode
    if { $runstatus == $code(__NO_ERROR_CODE) ||
        $runstatus == $code(__MODULE_TERMINATED)    } {
	if { $connect_mode == "silent" } return
	updatedisplay
	if {[onbrk]} inactiverun

	# check module termination
	if { $runstatus == $code(__MODULE_TERMINATED) }  { disarmrun }
	return
    }

    if {$runstatus == $code(__UNINITIALIZED_VARIABLE_ERROR_CODE) } {
	shownets
	Alert $runmessage -type error \
	    -choice {{{Reset whole simulation} {reset 1} } }
	if [TapeRecorderIsPlaying] TapeRecorderExternalStop
	return
    }

    if {$runstatus == $code(__SINGLE_SIGNAL_EMITTED_TWICE_ERROR_CODE)} {
	shownets
	Alert $runmessage -type error \
	    -choice {{{Reset whole simulation} {reset 1} } }
	if [TapeRecorderIsPlaying] TapeRecorderExternalStop
	return
    }

    if {$runstatus == $code(__BAD_SENSOR_VALUE_ERROR_CODE)} {
	Alert $runmessage -type error -choice { {OK {}} }
	if [TapeRecorderIsPlaying] TapeRecorderExternalStop
	return
    }
}

pleaseWait updatedisplay
proc updatedisplay {} {

    global gList outputevent

    # color outputs ( including input or returns !)
    set outputevent [getoutputs]
    setoutputs

    updatesource 
    updatetree

    setivalues $gList(valuedinput)

    setovalues $gList(valuedoutput)
    setovalues $gList(valuedlocal)
    setovalues $gList(valuedtrap)

    # update variables
    setvariables

    # update execs
    setexecs

    # raise breakpoints
#    raisebreakpoints

}

##########
# Procedures:  Control button
# Description: Menu button associated commands
# Arguments:   none
# Returns:     none
# Sideeffects: Pop up or down windows, create files , etc..
##########
pleaseWait showlocals
proc showlocals {} {
    wm deiconify .locals
    raise .locals
}
pleaseWait showvariables
proc showvariables {} {
    wm deiconify .variables
    raise .variables
}
pleaseWait showtraps
proc showtraps {} {
    wm deiconify .traps
    raise .traps
}
pleaseWait showsource
proc showsource {rootinstance} {
    raiseinstance $rootinstance
}

pleaseWait reset
proc reset { { forced 0 } } {
    global allowinputs remote last_preference
   if { !$allowinputs && !$remote && !$forced }  {
	beep
	return
    }

    global rootinstance sessionfile inputevent
    XesHook userReset ;# CA's patch
    set inputevent {}
    resetautomaton
    resetpanel
    register "! reset"
    colorsp $last_preference
    updatesource
    updatetree
}

# Exit code is 1 if for sccausal
pleaseWait quit
proc quit {} {
    global sccausal
    if { [TapeRecorderExist] } {
	TapeRecorderExternalStop
    }
    XesExit $sccausal
}
  


##########
# Procedure:   newfontsize
# Description: change source font
# Arguments:   none
# Returns:     none
# Sideeffects: change aspect of source windows
##########
pleaseWait  newfontsize
proc  newfontsize { } {
    global numberofinstances fontsize font fontlist
    
    set fn [lsearch $fontlist $fontsize]
    for {set inst 0} { $inst < $numberofinstances } { incr inst } {
        set menu .f$inst.t.f.menu
	if [winfo exists $menu] { $menu invoke $fn }
    }
    set menu .xestree.t.f.menu
    $menu invoke $fn

}



##########
# Procedure:   Main Panel
# Description: Set variables and panel
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
pleaseWait mainpanel
proc mainpanel { {size {}} { where {} } } {

    global autosend keepinputs geometry
    global font panelfontsize

    if { $size == {} } {
	set size $panelfontsize
    } else {
	set panelfontsize $size
    }
    set fn $font(panel,$size)
xesDebug Using panel font $fn
   set font(panel) $size
    set w [toplevel .mainpanel]
    wm withdraw $w
    wm protocol $w WM_DELETE_WINDOW quit


    # the two frames menubar and ioframe
    set menubar     [frame $w.menubar -cursor right_ptr ]
    set ioframe     [frame $w.ioframe -cursor right_ptr ]


    # Split panel in multiple windows ?
    global split_panel
    if { !$split_panel } {
	set inputframe  [frame $ioframe.i  -cursor right_ptr ]
	set outputframe [frame $ioframe.o  -cursor right_ptr ]
    } else {
	set w1 .inputs
	catch { destroy $w1 }
	otherwin $w1; wm deiconify $w1 ; raise $w1
	set inputframe  [frame $w1.i  -cursor right_ptr ]
        wm protocol $w1  WM_DELETE_WINDOW  "wm withdraw $w1"

	set w2 .outputs
	catch { destroy $w2 }
	otherwin $w2; wm deiconify $w2 ; raise $w2
	set outputframe [frame $w2.o  -cursor right_ptr ]
        wm protocol $w2  WM_DELETE_WINDOW  "wm withdraw $w2"
    }



    bind $menubar <Triple-ButtonPress-1> {
	if {[namespace children :: ::MiniDebug] != "" } {
	    MiniDebug::View
	} else {
	    if {[file exist minidbg.tcl]} {
		catch {
		    source minidbg.tcl
		    MiniDebug::View
		}
	    }
	}
    }

    # the exec frame (if any)
    if [anyexec] {
	set execframe [frame $w.execframe -cursor right_ptr ]
    }

    
    set bottomframe [frame $w.bot]
    # run button bottom in root window
    global color
    set runbutton [button $w.bot.run  -text tick \
		       -fg $color(sig,inactive)  -pady 3 \
	    -font $fn 	-cursor right_ptr]
    
    bind $runbutton <Double-Button-1>  doubletick

    # reset button bottom in root window
    set resetbutton [button $w.bot.reset  -text reset \
			 -fg $color(sig,inactive)  -pady 3 \
	    -font $fn 	-cursor right_ptr]
    global server_mode
    if !$server_mode {
	$runbutton configure   -command tick
	$resetbutton configure -command reset
    } else {
	$runbutton   configure -fg grey
	$resetbutton configure -fg grey
    }

    # recorder button bottom in root window
    set recorderbutton [button $w.bot.recorder  -text recorder \
			 -fg $color(sig,inactive)  -pady 3 \
	    -command TapeRecorder  -font $fn 	-cursor right_ptr]
  
    global private
    set private(resetbutton) $w.bot.reset
    

    # packing
    # title label center in top frame
    global currentModule server_mode

    if { $server_mode } {
	pack [label $w.status] -anchor w
    }

    pack $menubar      -side top   -fill x
    pack $ioframe      -side top  -expand yes -fill y
    pack $inputframe   -side left -expand yes -fill y
    pack $outputframe  -side left -expand yes -fill y

    pack $bottomframe  -fill x -side bottom 
    pack $recorderbutton -side right
    pack $resetbutton -side right
    pack $runbutton -side right -fill x -expand yes
    if [anyexec] {
	pack  $execframe -side bottom    -fill x 
    }
    

    global gList
    # signal panels in inputframe
    set sigtable(default_buttons) {}

    catch { pack [panel pureinput   $inputframe $gList(pureinput) $fn ] \
	    -anchor nw -side left  -expand yes -fill y}
    catch { pack [panel valuedinput $inputframe $gList(valuedinput)  $fn ] \
	    -anchor nw -side left  -expand yes -fill y}
    sethiloinputs

    catch { pack [panel sensor      $inputframe $gList(sensor)   $fn ] \
	    -anchor nw -side left  -expand yes -fill y}

    # signal panels in outputframe
    catch { pack [panel valuedoutput $outputframe $gList(valuedoutput)  $fn ] \
	    -anchor nw -side right  -expand yes -fill y}

    catch { pack [panel pureoutput   $outputframe $gList(pureoutput)   $fn ] \
	    -anchor nw -side right -expand yes -fill y}

    # the exec frame (if any)
    if [anyexec] {    execpanel $execframe $gList(exec) $fn ; setexecs}


    # Set up control menu
    pack [menubutton $menubar.cont -menu $menubar.cont.menu \
	    -text Commands -padx 2m  -font $fn 	]   -side {left}

    set tearoff 1

    set m   [menu $menubar.cont.menu -font $fn  -tearoff $tearoff ]
#    set me  [menu $m.eventmenu -font $fn]
#
#    $me add command -label "Store Current" -command storeevent
#    $me add command -label Recall          -command recallevent

    set nitem $tearoff

    #    $m add command     -label "Events"              -command evtraise
    #    incr nitem

    
    $m add checkbutton  -label "Signal Browser"  -variable signalbrowser
    incr nitem


##     $m add command  -label "Split Main Panel" \
## 	-command "global split_panel ; set split_panel 1 ; newpanelfontsize"
##     incr nitem
## 


    global hiloinputs server_mode
    if !$server_mode {
	$m add checkbutton -label "High/Low Inputs"      -variable hiloinputs\
	    -command sethiloinputs
	incr nitem
    }


    $m add checkbutton -label "Keep Inputs"      -variable keepinputs 
    incr nitem

    $m add command     -label "Clear Inputs"       -command  resetpanelinputs  
    incr nitem

    $m add command     -label "Remove Breakpoints" -command  resetbreakpoints
    incr nitem

    $m add command     -label "Recorder"           -command  {if {[catch TapeRecorder err]} { Alert "$err \n$errorInfo"}}
    incr nitem

#    $m add command     -label "Timer"              -command  Timer
#    incr nitem

    $m add separator
    incr nitem


    $m add command     -label "Quit"     -command  quit   -font $fn 	         
    incr nitem



    # Set up Font menu
    pack [ menubutton $menubar.font -menu $menubar.font.menu\
	    -text Fonts -padx 2m  -font $fn 	] -side left

    set fs [menu $menubar.font.menu -tearoff $tearoff]

xesDebug Mainpanel 2

    global panelfontsize fontlist
    $fs add separator
    $fs add command  -label "PANELS FONT" -font $fn 	
    $fs add separator
    foreach size $fontlist {
	$fs add radio  -label $size -variable panelfontsize \
		-command "newpanelfontsize $size" -font $fn 	
    }

    global fontsize
    $fs add separator
    $fs add command  -label "SOURCE FONT" -font $fn 	
    $fs add separator
    foreach size $fontlist {
	$fs add radio  -label $size -variable fontsize \
		-command "newfontsize" -font $fn 	
    }

xesDebug Mainpanel 3

    # Set up Other Windows menu
    set nitem $tearoff
    pack [menubutton $menubar.others -menu $menubar.others.menu \
	    -text Windows -padx 2m  -font $fn 	]   -side {left}

    global others split_panel
    set others [menu $menubar.others.menu -font $fn -tearoff $tearoff]

    if $split_panel {
	$others add command     -label "Inputs"     \
	    -command  "catch {wm deiconify .inputs; raise .inputs}"
	$others add command     -label "Outputs"     \
	    -command  "catch {wm deiconify .outputs; raise .outputs}"
	incr nitem 2
    }

    $others add command     -label "Program Tree"     \
	    -command  "showtree"  -font $fn 	
    global anysource
#    if !$anysource  { $others  entryconfigure $nitem -state disabled}
    incr nitem

    $others add command     -label "Locals"     \
	    -command  showlocals -font $fn 	     
    if ![anylocal] { $others  entryconfigure $nitem -state disabled}
    incr nitem

    $others add command     -label "Traps"     \
	    -command  showtraps -font $fn 	
    if ![anytrap] { $others  entryconfigure $nitem -state disabled}
    incr nitem

    $others add command     -label "Variables"     \
	    -command  showvariables  -font $fn 	    
    if ![anyvariable] { $others  entryconfigure $nitem -state disabled}
    incr nitem

    $others add separator
    incr nitem

    global rootinstance
    $others add command     -label "$currentModule #$rootinstance"     \
	    -command  "showsource $rootinstance"   -font $fn 	
    if !$anysource  { $others  entryconfigure $nitem -state disabled}
    incr nitem

    # about button right in top frame
    button $menubar.about -text Info -font $fn \
	    -padx 2m  -command about -relief flat


    # help button right in top frame
    button $menubar.help -text Help  \
	    -font $fn -padx 2m -command help -relief flat 

    pack $menubar.help   -side right
    pack $menubar.about  -side right

    # other windows (if any)
    global ismapped
    if [anylocal] {
	set ismapped(.locals) 0
	if [winfo exists .locals] {
	    if  [winfo ismapped .locals] {
		set ismapped(.locals) 1
	    } 
	    destroy .locals
	}
	otherwin .locals $fn
	catch {
	    pack [panel   purelocal  .locals.f   $gList(purelocal) $fn]\
		    -anchor nw -side left -fill y -expand 1
	}
	catch {
	    pack [panel   valuedlocal   .locals.f   $gList(valuedlocal) $fn]\
		    -anchor nw -side left -fill y -expand 1
	}
	wm positionfrom .locals program
	wm title .locals locals
	XesHook XesLocalsLastWishes
    } 
    if [anytrap] {
	set ismapped(.traps) 0
	if [winfo exists .traps] {
	    if [winfo ismapped .traps] {
		set ismapped(.traps) 1
	    } 
	    destroy .traps
	}
	otherwin .traps $fn
	catch {
	    pack [panel   puretrap    .traps.f $gList(puretrap) $fn]\
		    -anchor nw -side left -fill y -expand 1
	}

	catch {
	    pack [panel   valuedtrap  .traps.f $gList(valuedtrap) $fn ]\
		    -anchor nw -side left -fill y -expand 1
	}


	wm  positionfrom .traps program
	wm title .traps traps
	XesHook XesTrapsLastWishes
    }
xesDebug Mainpanel 5

    if [anyvariable] {
	set ismapped(.variables) 0
	if [winfo exists .variables] {
	    if [winfo ismapped .variables] {
		set ismapped(.variables) 1
	    }
	    destroy .variables
	}
	otherwin .variables $fn
	pack [panel   variable        .variables.f     $gList(variable) $fn]\
		-anchor nw -side left -fill y -expand 1
	wm positionfrom .variables program
	wm title .variables variables
	XesHook XesVariablesLastWishes
    } 

xesDebug Mainpanel 5

    # window manager
#    wm title .mainpanel  "$currentModule simulation main panel"
# FXF
    wm title .mainpanel  "$currentModule TEST"
    if { $where == {} } {
	if { [info exists geometry]  } {
	    wm positionfrom .mainpanel user
	} else {
	    wm positionfrom .mainpanel program
	}
    } else {
	wm positionfrom .mainpanel user
	wm geometry .mainpanel $where
    }
} 


pleaseWait getName
proc getName { instance } {
    set infos [sourceinfo $instance]
    return  [lindex $infos 2]
}

pleaseWait  newpanelfontsize
proc  newpanelfontsize { { size {}} } {
    global ismapped others windowlist panelfontsize
    if { $size == {}  } {
	set size $panelfontsize
    }

    set selectedSignals [getselectionstate]
    geteditionstate
    scan   [wm geometry .mainpanel] "%dx%d+%d+%d" w h x y
    set where "+$x+$y"
    if [ winfo exists .mainpanel ] {
	destroy .mainpanel
    }

    mainpanel $size $where
    updategeometry
    wm deiconify .mainpanel
    raise .mainpanel
    foreach win { .locals .traps .variables } {
	if [info exists ismapped($win)] {
	    if { $ismapped($win) } { wm deiconify $win ; raise $win }
	}
    }
    global rootinstance
    foreach instance $windowlist {
	if { $instance != $rootinstance } {
	    set modulename [getName $instance] 
	    set instance $instance
	    $others add command -label \
		[format "%s  #%s" $modulename $instance] \
                -command "raiseinstance $instance"
	}
    }
    setoutputs
    setexecs
    setvariables
    seteditionstate
    setselectionstate $selectedSignals

    #    newhelpfontsize
}

pleaseWait getselectionstate
proc getselectionstate {}  {
    global gList  sigtable
    set siglist {}
    foreach sig [concat \
		     $gList(pureinput)   \
		     $gList(valuedinput) \
		     $gList(purereturn)  \
		     $gList(valuedreturn)\
		    ] {
        set num  [lindex $sig 0]
	if $sigtable($num,var) {
	    lappend siglist $num
	}
    }
    return $siglist
}

pleaseWait setselectionstate
proc setselectionstate { siglist } {
    global sigtable
    foreach num $siglist {
	set sigtable($num,var) 1
	setpreselection $num
    }
}

pleaseWait geteditionstate
proc geteditionstate {} {
    global valuedsignallist sigtable
    foreach  sig  $valuedsignallist {
	set num [lindex $sig 0]
	set sigtable($num,edit) [$sigtable($num,ival) get]
    }
}

pleaseWait seteditionstate
proc seteditionstate {} {
    global valuedsignallist sigtable
    foreach  sig  $valuedsignallist {
	set num [lindex $sig 0]
	$sigtable($num,ival) delete 0 end
	$sigtable($num,ival) insert 0 "$sigtable($num,edit)"
    }
}

proc panelStatus { string } {
    set w .mainpanel
    $w.status configure -text $string
    update
}

pleaseWait 

xesDebug XSPANELS OUT
