# Tcl relay to the C xes_exit procedure
# Close children before exiting
proc XesExit args  {
    global server_info_file
    if {[info exists server_info_file]} {
	catch {file delete -force -- $server_info_file}
    }
    TapeRecorderClose clean
    xes_exit $args
}

global debug_flag

if $debug_flag {
    proc xesDebug {args} {
	# print args in a list box and returns listbox path
	set debug  .debug_win
	set list   $debug.list
	set scroll $debug.scroll

	if ![winfo exist $debug] {
	    toplevel $debug
	    pack [listbox   $list  ] -side left -expand y -fill both
	    pack [scrollbar $scroll] -side right -fill y
	    $scroll configure -command "$list yview"
	    $list configure -yscrollcommand "$scroll set" 
	}

	$list insert end "$args"
	return .debug_win
    }
} else {
    proc xesDebug {args} {}
}



xesDebug UTILS IN
# $Id: utils.tcl,v 1.2 2001/03/09 13:22:29 fornari Exp $

# To make it easy for Charles Andre...
proc Proc_Void_ifndef {proc args} {
  if { [info procs $proc] == "" } {
     eval proc $proc \{ $args \} {{}}
  }
}

proc XesHook { { hook_name {} } args } {
    if { [info procs $hook_name] != {} } {
	eval $hook_name $args
    }
}


#--------------------------------------------------------------------
# optargs
# Written by Karl Lehenbauer (karl@NeoSoft.com).  Technical input provided
# by Mark Diekhans (markd@grizzly.com)
#
#     parses the list of args arguments given an option descriptor
#     array create by defargs.
#     a boolean argument doesn't need a value: it sets the option
#     to the opposite to the default
#  Return:
#     none
#  Side Effects:
#     creates at the level where it is called variable with the
#     same name as the corresponding option if 1) this option is set
#     2) or it as a default value. If an option is not set AND it has no
#     default value, check with info exist option
#--------------------------------------------------------------------

proc optargs {arguments descriptorArrayName} {
    upvar #0 $descriptorArrayName argInfo

    # while there are any arguments, make sure they're in the array,
    # process according to rules there

    while {$arguments != ""} {
	set fieldId [lindex $arguments 0]
	if {[string index $fieldId 0] != "-"} {
	    error "option '$fieldId' didn't start with dash"
	}
	set fieldId [string range $fieldId 1 end]
	if ![info exists argInfo($fieldId)] {
	    error "tried to set argument '$fieldId' which did not exist."
	}
	set fieldDef $argInfo($fieldId)
	set type [lindex $fieldDef 0]
	set default [lindex $fieldDef 1]
	if {$type == "boolean"} {
	    uplevel "set $fieldId [expr !$default]"
	    set arguments [lrange $arguments 1 end]
	} else {
	    if {[llength $arguments] == 1} {
		error "missing argument to option '$fieldId'"
	    }
	    set value [lindex $arguments 1]
	    if {$type == "integer"} {
		if {![regexp {[0-9]*} $value]} {
		    error "'$fieldId' integer field isn't integer - '$value'"
		}
	    }
	    uplevel "set $fieldId [list $value]"
	    set arguments [lrange $arguments 2 end]
	}
    }

    # if any elements in the descriptor array have defaults and they
    # don't already exist with a user-set value, set them up

    foreach element [array names argInfo] {
	set fieldDef $argInfo($element)
	if {[llength $fieldDef] == 1} continue

	if ![uplevel "info exists $element"] {
	    uplevel "set $element [list [lindex $fieldDef 1]]"
	}
    }
}

#-----------------------------------------------------------------------
#
#  defargs
#
#   define a global array optArgsArrayName which defines possible options
#   definitionList is a list of the form {-option type [defaultvalue]}
#   where type is text, integer or boolean (Note: for boolean option
#   default value is required).
#
#  Return:
#    none
#
#  Side Effects:
#    creates a global variable at level#0 with name ${optArgsArrayName
#----------------------------------------------------------------------

proc defargs {optArgsArrayName definitionList} {
    upvar #0 $optArgsArrayName parseArray

    foreach optionInfo $definitionList {
	# -option type [option]
	set len [llength $optionInfo]
	if {($len < 2) || ($len > 3)} {error "bad # elements in '$optionInfo'"}
	set option [lindex $optionInfo 0]
	set type [lindex $optionInfo 1]
	if {($type == "boolean") && ($len < 3)} {
	    error \
                "boolean option defs must have a default value ('$optionInfo')"
	}
	if {[string index $option 0] != "-"} {
	    error \
                "option text in option def '$optionInfo' doesn't start with -"
	}
	set parseArray([string range $option 1 end]) [lrange $optionInfo 1 end]
    }
}

#########################################################################

#----------------------------------------------------------------
# WidgetUnbind
#
#    delete all bindings
#
# Return:
#    none
#
# Side effects:
#    set bindings
#----------------------------------------------------------------

proc WidgetUnbind w {
    foreach b [bind $w] {
        bind $w $b { }
    }
    if {[regexp {^\.} $w]} {
        foreach b [bind [winfo class $w]] {
            bind $w $b { }
        }
    }
}

#
# from xf code by Sven Dalmas garfield@cs.tu-berlin.de
#

#----------------------------------------------------------------
# EntryBindings
#
#    set some bindings "a` la" emacs
#
# Return:
#    none
#
# Side effects:
#    set bindings
#----------------------------------------------------------------

proc EntryBindings { entry } {
    return
  bind $entry <Return> { }
  bind $entry <Delete> {EntryBS %W} 
  bind $entry <BackSpace> {EntryBS %W} 
  bind $entry <Right> {%W icursor [expr [%W index insert]+1]; EntryV2C %W } 
  bind $entry <Left> {%W icursor [expr [%W index insert]-1]; EntryV2C %W } 
  bind $entry <Control-a> {%W icursor 0; %W view 0} 
  bind $entry <Control-b> {%W icursor [expr [%W index insert]-1]; EntryV2C %W} 
  bind $entry <Control-d> {
      %W delete insert
      EntryV2C %W
      set tk_priv(modifiedText%W) 1
  } 
  bind $entry <Control-Mod1-d> {
      %W delete sel.first sel.last
      EntryV2C %W
      set tk_priv(modifiedText%W) 1
  } 
  bind $entry <Control-e> {%W icursor end; EntryV2C %W} 
  bind $entry <Control-f> {%W icursor [expr [%W index insert]+1]; EntryV2C %W} 
  bind $entry <Control-h> {EntryBS %W} 
  bind $entry <Control-Mod1-h> {
      %W delete 0 insert
      %W view insert
      set tk_priv(modifiedText%W) 1
  } 
  bind $entry <Control-k> {
      %W delete insert end
      EntryV2C %W
      set tk_priv(modifiedText%W) 1
  } 
  bind $entry <Control-l> {EntryV2C %W} 
  bind $entry <space> {
      %W insert insert " "
      EntryV2C %W
      set tk_priv(modifiedText%W) 1
  } 
  bind $entry <Any-Key> {
      %W insert insert "%A"
      EntryV2C %W
      set tk_priv(modifiedText%W) 1
  } 
}




#----------------------------------------------------------------
# EntryXBindings
#
#
#
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc EntryXBindings entry {
    bind $entry <1> {
        %W icursor @%x
        %W select from @%x
    }
    bind $entry <B1-Motion> {%W select to @%x}
    bind $entry <Double-Button-1> {%W select from 0; %W select to end}
    bind $entry <2> {
        %W icursor @%x 
        %W insert @%x [GetSelection]
        set tk_priv(modifiedText%W) 1
    } 

    bind $entry <Shift-Button-1> {%W select adjust @%x}
    bind $entry <Shift-B1-Motion> {%W select to @%x}
    bind $entry <3> {%W scan mark %x}
    bind $entry <B3-Motion> {%W scan dragto %x}
    bind $entry <Any-Enter> {
        %W icursor end 
        %W select from end
        if {[lindex [%W config -state] 4] == "normal"} {
	    global entry_old_focus
	    set entry_old_focus [focus]
	    focus %W
	}
    }
    bind $entry <Any-Leave> {
	global entry_old_focus
	if {[info exist entry_old_focus]} {
	    focus $entry_old_focus
	}
    }
}



#----------------------------------------------------------------
# GetSelection
#    
#    get the tk selection
#
# Return:
#    the selection
#
# Side effects:
#    none
#----------------------------------------------------------------

proc GetSelection {} {
  set xfSelection ""
  if {[catch "selection get" xfSelection]} {
      set xfSelection ""
  }
  return $xfSelection
}




#----------------------------------------------------------------
# EntryV2C
#
#    set the view from the cursor position
#
# Return:
#    none
#
# Side effects:
#    change the display
#----------------------------------------------------------------

proc EntryV2C { xfW} {
  set xfLeftExtent [$xfW index @0]
  set xfRightExtent [$xfW index @[winfo width $xfW]]
  set xfCursorPos [$xfW index insert]
  set xfEntryLen [expr "$xfRightExtent-$xfLeftExtent"]

  if {$xfCursorPos > $xfLeftExtent} {
    if {$xfCursorPos > $xfRightExtent} {
      #handle cursor too far to the right
      $xfW view [expr "$xfCursorPos-$xfEntryLen+1"]
    }
  } { 
    #handle cursor too far to the left
    $xfW view [expr "$xfCursorPos-1"]
  }
}




#----------------------------------------------------------------
# EntryBS
#
#    delete the previous car
#
# Return:
#    none
#
# Side effects:
#    change the display and the entry's value
#     set tk_priv(modifiedText$xfW) 
#----------------------------------------------------------------

proc EntryBS { xfW} {
    global tk_priv
    set xfX [expr {[$xfW index insert]-1}]

    if {$xfX != -1} {
        $xfW delete $xfX
        set tk_priv(modifiedText$xfW) 1
    }
    EntryV2C $xfW
}

#----------------------------------------------------------------
# FocusBinding
#
#    set focus bindings
# Return:
#    none
#
# Side effects:
#    none
#----------------------------------------------------------------

proc FocusBinding w {
    bind $w  <FocusIn> {            
        if {[string match "%d" "NotifyVirtual"]} {
            focus  %W
        }
    }
}

#----------------------------------------------------------------
# ButtonBindings
#
#    set the standard bindings of a button
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc ButtonBindings {b} {
    bind $b <Any-Enter> {tk_butEnter %W}
    bind $b <Any-Leave> {tk_butLeave %W}
    bind $b <1> {tk_butDown %W}
    bind $b <ButtonRelease-1> {tk_butUp %W}
}

#================================================================
# special button bindings

#----------------------------------------------------------------
# ButtonEnter
#    w : button
#
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc ButtonEnter {w } {
    global tk_priv private  tk_strictMotif
    if {$private(user_input) && !$tk_strictMotif} {
        $w config -state active
    }
    set tk_priv(window) $w

}

#----------------------------------------------------------------
# ButtonLeave
#    w : button
#
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc ButtonLeave {w} {
    global tk_priv private  tk_strictMotif
    if {$private(user_input)  && !$tk_strictMotif} {
        $w config -state normal
    }
    set tk_priv(window) ""
}

#----------------------------------------------------------------
# ButtonDown
#    w : button
#    cmd : a command updating the relief. The window name will be appended
#          to the call
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc ButtonDown {w cmd} {
    global tk_priv private
    set tk_priv(relief) [lindex [$w config -relief] 4]
    set tk_priv(background) [lindex [$w config -background] 4]
    set tk_priv(buttonWindow) $w
    if {$private(user_input)} {
        uplevel #0 $cmd $w
    }
}

#----------------------------------------------------------------
# ButtonUp
#    w : button
#    cmd : a cmd to execute
#    the relief is reset by the cmd if the mouse is in the button
#    when released. 
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc ButtonUp {w cmd} {
    global tk_priv private
    if {$w == $tk_priv(buttonWindow)} {
	if {($w == $tk_priv(window))
		&& $private(user_input)} {
	    uplevel #0 $cmd $w
	} else {
            $w config -relief $tk_priv(relief)
            $w config -background $tk_priv(background)
        }
	set tk_priv(buttonWindow) ""
    }
}


# some functions associated with buttons
# set the relief

proc buttonRelief {r w} {
    $w configure -relief $r
}

# call the command associated with the button  and set the relief

proc buttonInvoke {r w } {
    uplevel #0 $w invoke
    $w configure -relief $r
}
# set the global var private(user_input).

proc EnableUserInput {} {
    global private
    set private(user_input) 1
}


proc DisableUserInput {} {
    global private
    set private(user_input) 0
}

#----------------------------------------------------------------
# NoFunction
#
#    do nothing
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc NoFunction args {
}

#----------------------------------------------------------------
# MenuPopupHandle
#
#   
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc MenuPopupHandle { xfMenu xfW xfX xfY} {
 if {[winfo ismapped $xfMenu]} {
   set xfPopMinX [winfo rootx $xfMenu]
   set xfPopMaxX [expr "$xfPopMinX + [winfo width $xfMenu]"]
   if {($xfX >= $xfPopMinX) &&  ($xfX <= $xfPopMaxX)} {
     $xfMenu activate @[expr "$xfY - [winfo rooty $xfMenu]"]
   } {
     $xfMenu activate none}
   }
}


#----------------------------------------------------------------
# CenterWindowOnScreen
#
#   obvious ...
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc CenterWindowOnScreen { w { pos {} } } {
    wm withdraw $w
    set x [lindex $pos 0]
    set y [lindex $pos 1]
    if { $x == {} } { set x [expr [winfo screenwidth  $w]/2] }
    if { $y == {} } { set y [expr [winfo screenheight $w]/2] }
    update idletasks
    set x [expr $x - [winfo reqwidth $w]/2  - [winfo vrootx [winfo parent $w]]]
    set y [expr $y - [winfo reqheight $w]/2 - [winfo vrooty [winfo parent $w]]]

    wm positionfrom $w user
    wm geom $w +$x+$y
    wm deiconify $w


}

#------------------------------------------------------------------
# RaiseWindow
#
#  raised a window 
#
# Returns:
#  none
#
# Side effects:
#   none
#-----------------------------------------------------------------

proc RaiseWindow w {
    switch [wm state $w] {
        normal {
            raise $w
        }
        default {
            wm deiconify $w
        }
    }
}

defargs _AlertOptions {
    {-type text error}
    {-best boolean 0}
    {-remanent boolean 0}
    {-window text .alert}
    {-choice text { { OK { } } { Quit { XesExit 1 } } } }
    {-help text ""}
    {-additionnal text ""}
}
#----------------------------------------------------------------
# Alert
#
#   pop an an alert window
#   args:
#    msg : message
#   optionnal:
#   -type type : severity info warning error fatal (default error)
#   -best boolean : try to find the best aspect. default 0
#   -window name, default .alert
#   if type = fatal, then exit
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc Alert {msg args} {
    optargs $args _AlertOptions
    set w $window
    global tk_priv private color
    set title ""
    set bg $color(bg,error)
    set fg black
    switch $type {
        info {
            set title "Info Window"
            set bg $color(bg,info)
        }
	BP {
            set title "Warning Window"
            set bg $color(halt,broken)
	    set fg red
	}
        warning {
            set title "Warning Window"
            set bg $color(bg,warning)
        }
        error {
            set title "Error"
        }
        fatal {
            set title "Fatal Error"
        }
        default {
            set title "Fatal Error"
            set type fatal
        }
    }
    if { !$remanent } {
	catch {destroy $w}
    }

    global font panelfontsize
    set fn $font(panel,$panelfontsize)

    if { ![winfo exists $w] } {
	toplevel $w -class Dialog -bg $bg

	wm title $w $title
	wm positionfrom $w program
	wm iconname $w Dialog
	frame $w.top -relief raised -bd 1 -bg $bg 
	pack $w.top -side top -fill both 
	frame $w.bot -relief raised -bd 1 
	pack $w.bot -side bottom -fill both
        if { $help != "" } {
	    button $w.help -text Help -font $fn -command "help  $help"
	    pack $w.help -side bottom -expand y -fill x
	}

	if { $additionnal != "" } {
	    pack $additionnal -in $w.top -side bottom -expand 1 -fill y
	}

	if {$msg==""} {
	    set msg "Nothing to say ..."
	}
	message $w.msg -text $msg -aspect 2000 -fg $fg -bg $bg
	$w.msg configure -font $fn 

	if {$best} {
	    set max_len 0
	    set nb_line 0
	    foreach line [split $msg "\n"] {
		set len [string length $line]
		set max_len [expr {$max_len < $len ? $len : $max_len}]
		incr nb_line
	    }
	    $w.msg configure -aspect [expr "100 * $max_len / $nb_line"]
	} else {
#	    $w.msg configure -width 3i
	}
	pack $w.msg -in $w.top -side right -expand 1 \
		-fill both -padx 5m -pady 5m

	label $w.bitmap -bg $bg
	if {$type=={fatal}} {
	    $w.bitmap configure -bitmap error
	} elseif {$type=={BP}} {
	    $w.bitmap configure -bitmap warning
	} else {
	    $w.bitmap configure -bitmap $type
	}
	pack $w.bitmap -in $w.top -side left -padx 5m -pady 5m
	
	set nitem 0
	foreach item $choice {
	    set wdn $w.default$nitem
	    frame $wdn 
	    frame $wdn.border -relief sunken -bd 1 
	    button $wdn.border.button \
		-text [lindex $item 0] -font $fn \
		-command "[lindex $item 1];set tk_priv(button,$type) $nitem" 

	    pack $wdn.border.button  -padx 4 -pady 4 \
		    -ipadx 2m -ipady 1m
	    pack $wdn.border -padx 2 -pady 2
	    pack $wdn -in $w.bot -side left -expand 1 -padx 3m -pady 2m
	    incr nitem
	}
	bind $w <Return> \
		"$w.default0.border.button flash; set tk_priv(button,$type) 0"
	bind $w <Any-Enter> "$w.default0 configure -bg black"
	bind $w <Any-Leave> "$w.default0 configure -bg $color(bg,default)"

	wm withdraw $w
	update idletasks
	#    set x [expr [winfo screenwidth $w]/2 - [winfo reqwidth $w]/2 \
		#	    - [winfo vrootx [winfo parent $w]]]
	#    set y [expr [winfo screenheight $w]/2 - [winfo reqheight $w]/2 \
		#	    - [winfo vrooty [winfo parent $w]]]
	#    wm geom $w +$x+$y
	CenterWindowOnScreen $w
	wm minsize $w [winfo reqwidth $w] [winfo reqheight $w]
	wm deiconify $w
    }

    $w.msg  configure -text $msg

    global allowinputs currentpopup
    set allowinputs 0
    set currentpopup $w
    tkwait variable tk_priv(button,$type)
    set allowinputs 1

    if { !$remanent } { destroy $w }

    if {$type=={fatal}} {
        XesExit 1
    }
    return $tk_priv(button,$type)

}



defargs _AskerOptions {
    {-window text .asker}
    {-len integer 40}
    {-text text Cancel}
}
#----------------------------------------------------------------
# Asker
#
#   pop a window asking for an user input
#   args:
#   - msg : message
#   - var : the variable where the result will be stored. The value of this
#           variable is also used as initial value of the entry
#   options
#   -window : the window name default to .asker
#   -len : the length of the entry
#  
# Return:
#    1 : the result is available
#    0 :  cancel
#
# Side effects:
#    set grab
#----------------------------------------------------------------

proc Asker {msg var args} {
    optargs $args _AskerOptions 
    set w $window
    global asker
    upvar $var _var
    if {[catch {set asker(reply) $_var}]} {
        set asker(reply) {}
    }

    catch "destroy $w"
    toplevel $w -class Asker 
    wm title $w Asker
    wm positionfrom $w program
    frame $w.top -relief raised -bd 1 
    frame $w.bot -relief raised -bd 1
    frame $w.default -relief sunken -bd 1
    label $w.bitmap -bitmap questhead
    message $w.msg -text $msg -width 3i 
    global font panelfontsize
    $w.msg configure -font $font(panel,$panelfontsize)

    entry $w.entry \
        -relief sunken \
        -width $len \
        -textvariable asker(reply)
    $w.entry icursor end
    button $w.ok -text "OK" -padx 3m -pady 3m -command {set asker(button) 1}
    button $w.cancel -text $text  -padx 3m -pady 3m \
	    -command  {set asker(button) 0}

    # packing order
    pack $w.top $w.bot -fill both
    pack $w.bitmap -in $w.top -side left -fill y -padx 3m
    pack $w.msg -in $w.top -padx 3m -pady 3m -fill both 
    pack $w.entry -in $w.top -padx 3m -pady 3m -ipadx 1m -ipady 1m
    
    pack $w.ok -in $w.default -padx 1m -pady 1m -ipadx 1 -ipady 1
    pack $w.default $w.cancel -in $w.bot -expand 1 -padx 3m -pady 2m -side left
    
    # bindings
    EntryBindings $w.entry
    EntryXBindings $w.entry
    $w.entry icursor 0
#    bind $w.entry <Return> "$w.ok invoke"

    # centerings
    CenterWindowOnScreen $w


    # wait for the response.
    global allowinputs currentpopup
    set allowinputs 0
    set currentpopup $w
    tkwait variable asker(button)
    set allowinputs 1

    destroy $w
    if {$asker(button)} {
        set _var $asker(reply)
    }
    return $asker(button)
}


#----------------------------------------------------------------
# TextBindings
#
#    set some bindings a la emacs
#
# Return:
#    
#
# Side effects:
#    
#----------------------------------------------------------------

proc TextBindings {w} {
    proc tk_textSeeCaret w {
	$w yview -pickplace insert
    }
    proc tk_textCaretMoved {w} {
	global tk_priv
	set tk_priv(cursorMovedSinceKillIn[set w]) 1
    }
    bind $w <Control-a> {
	%W mark set insert "insert linestart"
	tk_textCaretMoved %W
    }
    bind $w <Control-e> {
	%W mark set insert "insert lineend"
	tk_textCaretMoved %W
    }
    bind $w <Control-p> {
	%W mark set insert "insert - 1 lines"
	tk_textSeeCaret %W
	tk_textCaretMoved %W
    }
    bind $w <Control-n> {
	%W mark set insert "insert + 1 lines"
	tk_textSeeCaret %W
	tk_textCaretMoved %W
    }
    bind $w <Control-f> {
	%W mark set insert "insert + 1 chars"
	tk_textSeeCaret %W
	tk_textCaretMoved %W
    }
    bind $w <Control-b> {
	%W mark set insert "insert - 1 chars"
	tk_textSeeCaret %W
	tk_textCaretMoved %W
    }
    bind $w <Control-h> {
	tk_textBackspace %W
	tk_textSeeCaret %W
	tk_textCaretMoved %W
        set tk_priv(modifiedText%W) 1
    }
    bind $w <Delete> {
	tk_textBackspace %W
	tk_textSeeCaret %W
	tk_textCaretMoved %W
        set tk_priv(modifiedText%W) 1
    }
    bind $w <BackSpace> {
	tk_textBackspace %W
	tk_textSeeCaret %W
	tk_textCaretMoved %W
        set tk_priv(modifiedText%W) 1
    }
    bind $w <Control-d> {
	if [catch {%W delete sel.first sel.last}] {
	    %W delete insert
            set tk_priv(modifiedText%W) 1
	}
	tk_textSeeCaret %W
	tk_textCaretMoved %W
    }
    bind $w <Control-k> {
	global tk_priv
	if {[string trim [%W get insert "insert lineend"]] == {}} {
	    set killed [%W get insert "insert linestart + 1 lines"]
	    %W delete insert "insert linestart + 1 lines"
            set tk_priv(modifiedText%W) 1
	} else {
	    set killed [%W get insert "insert lineend"]
	    %W delete insert "insert lineend"
            set tk_priv(modifiedText%W) 1
	}
	if [info exists tk_priv(cursorMovedSinceKillIn%W)] {
	    set tk_priv(killBufferFor%W) $killed
	    unset tk_priv(cursorMovedSinceKillIn%W)
	} else {
	    append tk_priv(killBufferFor%W) $killed
	}
	tk_textSeeCaret %W
    }
    bind $w <Control-y> {
	global tk_priv
	if [info exists tk_priv(killBufferFor%W)] {
	    %W insert insert $tk_priv(killBufferFor%W)
            set tk_priv(modifiedText%W) 1
	}
    }
    bind $w <Any-KeyPress> {
        if {"%A" != ""} {
            %W insert insert %A
            %W yview -pickplace insert
            set tk_priv(modifiedText%W) 1
        }
    }
    bind $w <Return> {
        %W insert insert \n
        %W yview -pickplace insert
        set tk_priv(modifiedText%W) 1
    }
}


#----------------------------------------------------------------
# TextXBindings
#
#    set some mouse bindings 
#
# Return:
#    none
#
# Side effects:
#    set bindings
#----------------------------------------------------------------

proc TextXBindings text {
    bind $text <1> {
        set tk_priv(selectMode) char
        %W mark set insert @%x,%y
        %W mark set anchor insert
        if {[lindex [%W config -state] 4] == "normal"} {focus %W}
    }
    bind $text <Double-1> {
        set tk_priv(selectMode) word
        %W mark set insert "@%x,%y wordstart"
        tk_textSelectTo %W insert
    }
    bind $text <Triple-1> {
        set tk_priv(selectMode) line
        %W mark set insert "@%x,%y linestart"
        tk_textSelectTo %W insert
    }
    bind $text <B1-Motion> {tk_textSelectTo %W @%x,%y}
    bind $text <2> {
        %W insert @%x,%y [GetSelection]
        set tk_priv(modifiedText%W) 1
    }
    bind $text <3> {
        tk_textResetAnchor %W @%x,%y
        tk_textSelectTo %W @%x,%y
    }
    bind $text <B3-Motion> {tk_textSelectTo %W @%x,%y}
    bind $text <Shift-Button-1> {%W scan mark %y}
    bind $text <Shift-B1-Motion> {%W scan dragto %y}
}



proc dump {} {
    set fd [open "debug.dmp" w]
    foreach proc [info procs] {
        puts $fd "====================================="
        puts $fd $proc
        puts $fd [info body $proc]
        puts $fd "====================================="
    }
    close $fd
}


#----------------------------------------------------------------
# Causality
#
#   pop an an causality window
#   args:
#    msg : message
#   optionnal:
#   -type type : severity info warning error fatal (default error)
#   -best boolean : try to find the best aspect. default 0
#   -window name, default .causality
#   if type = fatal, then exit
# Return:
#    none
#
# Side effects:
#    
#----------------------------------------------------------------

proc Causality {{reset_flag -noreset}} {
    set w .causality
    global tk_priv private color

    set title "Error"
    set bg $color(bg,error)

    catch {destroy $w}
    toplevel $w -class Dialog 
    wm title $w $title
    wm iconname $w Causality
    frame $w.top -relief raised -bd 1  -bg $bg
    pack $w.top -side top -fill both 
    frame $w.bot -relief raised -bd 1   
    pack $w.bot -side bottom -fill both
    set msg "Causality error"
    message $w.msg -text $msg 
    global font panelfontsize
    set fn $font(panel,$panelfontsize)

    $w.msg configure -font $fn -background $bg


    global kn un
    set un 1
    set kn 1
    frame $w.f -relief flat
    button $w.h -text Help -font $fn -command {help CAUSALITY ERRORS}
    checkbutton $w.kn -text "Show/Hide Green" -font $fn  \
	    -variable kn -command "setpref kn" -relief raised -bd 2
    checkbutton $w.un -text "Show/Hide Pink" -font $fn\
	    -variable un -command "setpref un"  -relief raised -bd 2
    pack $w.h -in $w.f -side top  -expand 1 -fill both
    pack $w.kn -in $w.f -side left  -expand 1 -fill both
    pack $w.un -in $w.f -side left -expand 1 -fill both
    global numberofinstances 
    if {  $numberofinstances > 1 } {
     button $w.st -text "Show tree" -font $fn \
	 -relief raised -bd 2 -command showtree
     pack $w.st -in $w.f -side left -expand 1 -fill x
    }

    pack $w.f -in $w.bot -side top  -expand 1 -fill x 

    $w.msg configure -width 3i
    pack $w.msg -in $w.top -side right -expand 1 -fill both -padx 5m -pady 5m

    label $w.bitmap -bg $bg -bitmap error
    pack $w.bitmap -in $w.top -side left -padx 5m -pady 5m

    set nitem 0


    if {$reset_flag=="-noreset"}  {
        set button_list {}
    } else {
	set button_list { {Reset { reset 1 }  } }
    }
    lappend button_list  {Quit {XesExit 1} }  

    foreach item $button_list   {
	set wdn $w.default$nitem
	frame $wdn 
	frame $wdn.border -relief sunken -bd 1   
	button $wdn.border.button \
		-text [lindex $item 0] -font $fn \
		-command "[lindex $item 1];set tk_priv(causality) $nitem"  

	pack $wdn.border.button  -padx 4 -pady 4 \
		-ipadx 2m -ipady 1m
	pack $wdn.border -padx 2 -pady 2
	pack $wdn -in $w.bot -side left -expand 1 -padx 3m -pady 2m
	incr nitem
    }
    bind $w <Return> "$w.default0.border.button flash; set tk_priv(causality) 0"
    bind $w <Any-Enter> "$w.default0 configure -bg black"
    bind $w <Any-Leave> "$w.default0 configure -bg $color(bg,default)"

    wm withdraw $w
    update idletasks
    set x [expr [winfo screenwidth $w]/2 - [winfo reqwidth $w]/2 \
	    - [winfo vrootx [winfo parent $w]]]
    set y [expr [winfo screenheight $w]/2 - [winfo reqheight $w]/2 \
	    - [winfo vrooty [winfo parent $w]]]
    wm geom $w +$x+$y
    wm minsize $w [winfo reqwidth $w] [winfo reqheight $w]
    wm deiconify $w
    setpref un


    global allowinputs
    set allowinputs 0
    tkwait variable tk_priv(causality)
    set allowinputs 1
    destroy $w


    return $tk_priv(causality)
}

##########################################
# Green or Pink nets preference function
##########################################
global last_preference
set last_preference greenandpink
proc setpref { what } {
    global un kn last_preference
    case $kn$un {
	00 { set last_preference none }
	10 { set last_preference greenonly }
	01 { set last_preference pinkonly  }
	11 {
	    case $what {
		kn { set last_preference pinkandgreen }
		un { set last_preference greenandpink }
	    }
	}
    }
    colorsp "$last_preference"
    shownets
    updatetree
}
###############
# Waiting popup
###############
proc pleaseWait { {mes ""} } {
    set w .wait
return
    if { $mes == "" } {
	catch { wm withdraw $w }
	return
    }

    set label $w.lab
    if [ winfo exists $w ] {
	$label configure -text "Xes : $mes ..."
	wm deiconify $w
	raise $w
	update
	return
    }

    toplevel $w
    label $label -text $mes -width 40 -padx 3m -pady 3m
    pack $label -expand 1 -fill both
    wm title $w "Please wait"
    wm geometry $w +400+300
    update
}


#####
# Toplevel windows
#####

proc otherwin { name { fn {} } } {
    global font fontsize sccausal
    if { $fn == {} } {
	set size $fontsize
	set fn $font(panel,$size)
    }
    wm withdraw [toplevel $name]
    # Main Panel and close
    pack [ frame $name.t ] -side top -fill x 
    pack [ button $name.t.ok  -relief flat -text Close -font $fn -padx 2m\
	    -command "wm withdraw $name"] -side right
    pack [ button $name.t.m \
            -command raisePanel \
	    -relief flat -text "MainPanel" -font $fn  -padx 2m ] -side right
    pack [ button $name.t.w \
            -command "showtree" \
	    -relief flat -text "Tree" -font $fn  -padx 2m ] -side right
#    if $sccausal { $name.t.m   configure -state disabled }
    pack [frame $name.f] -side left -fill both -expand 1
    wm protocol $name WM_DELETE_WINDOW  "$name.t.ok invoke"
}

proc winfont { name fn } {
    catch {
	$name.t.ok configure -font $fn
	$name.t.m  configure -font $fn
	$name.t.w  configure -font $fn
    }
}



#puts stderr "xsmain raisePanel"

###############
# raisePanel
###############
proc raisePanel {} {
    global sccausal sccausalWins
    if $sccausal {
	set winList { .sccausalError .causality .alert }
    } else {
	set winList .mainpanel
    }
    foreach win $winList {
	catch {
	    wm deiconify $win
	    raise $win
	}
    }
}


xesDebug UTILS OUT
