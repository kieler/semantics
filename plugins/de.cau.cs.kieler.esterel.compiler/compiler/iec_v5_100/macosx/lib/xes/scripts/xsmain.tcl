xesDebug XSMAIN IN
##########
# File: xs.tcl
# A Tcl-Tk version of xsimul the Esterel automaton simulator
# 
##########

# 
##########
# Procedure:   Main Program
# Description: Set variables and panel
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########

# choose current module
set moduleList          [modules]
set currentModule       [lindex $moduleList 0]

if [catch { currentmodule $currentModule } message] {
    pleaseWait
    Alert $message -choice {{Quit {XesExit 1}}}
    XesExit 1
}


if !$sccausal {pleaseWait "Get signal lists"}

xesDebug GET LISTS
set gList(pureinput)       [pureinputs]
set gList(valuedinput)     [valuedinputs]
set gList(sensor)          [sensors]
set gList(pureoutput)      [pureoutputs]
set gList(valuedoutput)    [valuedoutputs]
set gList(purelocal)       [purelocals]
set gList(valuedlocal)     [valuedlocals]
set gList(purereturn)      [purereturns]
set gList(valuedreturn)    [valuedreturns]
set gList(puretrap)        [puretraps]
set gList(valuedtrap)      [valuedtraps]
set gList(exec)            [execs]
set gList(halt)            [halts]
set gList(variable)        [variables]
set gList(counter)         [counters]


set gList(signal) \
    [ concat                   \
	$gList(pureinput)       \
	$gList(valuedinput)     \
	$gList(sensor)          \
	$gList(pureoutput)      \
	$gList(valuedoutput)    \
        $gList(purelocal)       \
        $gList(valuedlocal)     \
        $gList(purereturn)      \
        $gList(valuedreturn)    \
        $gList(puretrap)   \
        $gList(valuedtrap) \
   ]

set valuedsignallist [ concat \
  $gList(valuedreturn) \
  $gList(valuedinput)  \
  $gList(sensor) ]



createRemotes

xesDebug anyvariable
proc anyvariable {} {
    global gList

    if { [llength $gList(variable)  ] != 0  } {
	return 1
    } else {
	return 0
    }
}
xesDebug anylocal
proc anylocal {} {
    global gList
    if {[llength $gList(purelocal)] != 0 || [llength $gList(valuedlocal)] != 0} {
	return 1
    } else {
	return 0
    }
}
xesDebug anytrap
proc anytrap {} {
    global gList

    if {[llength $gList(puretrap)] != 0 || \
	    [llength $gList(valuedtrap)] != 0  } {
	return 1
    } else {
	return 0
    }
}
xesDebug anyexec
proc anyexec {} {
    global gList

    if { [llength $gList(exec)] != 0 } {
	return 1
    } else {
	return 0
    }
}



# source windows
scan [instances] "%d %d" numberofinstances rootinstance

xesDebug numberofinstances = $numberofinstances rootinstance = $rootinstance
if !$sccausal {pleaseWait "Get program tree"}

xesDebug  Done


global anysource
set anysource 0
set gList(watching) {}
for {set i 0} {$i < $numberofinstances} { incr i } {
    set gList(halt,$i) {}
}




foreach item $gList(halt) {
    set num  [lindex $item 0]
    set inst [lindex $item 2]
    lappend gList(halt,$inst) $num
}


# initialize breakpoint status
global status
foreach item $gList(halt) {
    set hlt [lindex $item 0]
    set status(halt,$hlt) 0
}


xesDebug XSMAIN RAISEPANEL

# get net status
# last_preference defined in utils.tcl
global last_preference

colorsp "$last_preference"

# Special invocation from sccausal
if { $sccausal == 1 } {

    pleaseWait ""
    set nb_modules [llength $moduleList]
    set win .sccausalError

    Alert "sccausal: $nb_modules compilation error(s)" -type error \
	    -choice {{Show {}} {Quit {XesExit 1}}}


    global code
    set reason [ error_code ]

    showsource $rootinstance
    if !$anysource  {XesExit 1}
    showtree

    if { $reason == $code(__CAUSALITY_ERROR_CODE) }  {

	Causality -noreset
    }

    if { $reason == $code(__SINGLE_SIGNAL_EMITTED_TWICE_ERROR_CODE) } {
	if $nb_modules==1 {
	    set choice { { Quit {XesExit 1} } }
	} else {
	    set choice {
		{ {Next Single Signal} {} }
		{ {Previous Single Signal} {} }
		{ Quit {XesExit 1} }
	    }
	}
	set i 0
	while 1 {
	    module_index $i
	    colorsp "none"
	    colorsp "pinkandgreen"
	    updatesource
	    updatetree
	    set answer [ 
	    Alert  "Error [expr $i + 1] of $nb_modules: [error_text]"    \
		    -choice $choice      \
		    -window $win  -remanent  \
		    -help "MULTIPLE EMISSIONS OF SINGLE SIGNALS"
	    ]
	    if { $answer==0} {
		incr i
		if { $i >= $nb_modules } { set i 0 }
	    }  else {
		incr i -1
		if { $i < 0 } { set i [expr $nb_modules - 1] }
	    }
	    resetnets
	}
    }

    if { $reason == $code(__ACTION_ORDER_CYCLES_ERROR_CODE) } {

	if $nb_modules==1 {
	    set choice { { Quit {XesExit 1} } }
	} else {
	    set choice {
		{ {Next Component} {} }
		{ {Previous Component} {} }
		{ Quit {XesExit 1} }
	    }
	}

	set i 0
        while 1 {
	    module_index $i
	    colorsp "$last_preference"
	    showtree unfolded
	    updatesource
	    set answer [
	    Alert \
	     "Action dependency cycle error\n" \
		    -choice $choice      \
		    -window $win  -remanent \
		    -help "ACTION DEPENDENCY CYCLES"
	    ]
	    if { $answer==0} {
		incr i
		if { $i >= $nb_modules } { set i 0 }
	    }  else {
		incr i -1
		if { $i < 0 } { set i [expr $nb_modules - 1] }
	    }
	    resetnets
	}
    }
    if { $reason == $code(__STATIC_CYCLES_ERROR_CODE) } {

	if $nb_modules==1 {
	    set choice { { Quit {XesExit 1} } }
	} else {
	    set choice {
		{ {Next Component} {} }
		{ {Previous Component} {} }
		{ Quit {XesExit 1} }
	    }
	}

	set i 0
        while 1 {
	    module_index $i
	    colorsp "$last_preference"
	    showtree unfolded
	    updatesource
	    set answer [
	    Alert \
	     "Show strongly connected component [expr $i+1] of $nb_modules\n" \
		    -choice $choice      \
		    -window $win  -remanent \
		    -help "STATIC CYCLES"
	    ]
	    if { $answer==0} {
		incr i
		if { $i >= $nb_modules } { set i 0 }
	    }  else {
		incr i -1
		if { $i < 0 } { set i [expr $nb_modules - 1] }
	    }
	    resetnets
	}
    }

    # To abort the compilation process
    XesExit 1

}

global  user_script keepinputs
# puts stderr  $no_source
# puts stderr  $keepinputs
# puts stderr  $user_script
# puts stderr SHOWSOURCE

if { !$no_source }  {
    showsource $rootinstance 
}

# create main panel and wait
pleaseWait "Create panel"
xesDebug mainpanel
global panelfontsize helpfontsize
mainpanel $panelfontsize
update idletasks
update 
xesDebug done
#if $anysource resetbreakpoints
set onbrk 0


# No more waiting
pleaseWait ""


# Update geometry
proc updategeometry {} {
    update idletasks


    catch {  pack propagate .mainpanel  false }
    catch {  pack propagate .locals     false }
    catch {  pack propagate .traps false }
    catch {  pack propagate .variables  false }



    update idletasks

    global gGridParams 


    catch { .mainpanel.ioframe.o.pureoutputpanel.c configure -height 1}
    catch { .mainpanel.ioframe.i.pureinputpanel.c  configure -height 1}
    catch { .mainpanel.ioframe.o.valuedoutputpanel.c configure -height 1}
    catch { .mainpanel.ioframe.i.valuedinputpanel.c  configure -height 1}
    catch { .mainpanel.ioframe.i.sensorpanel.c  configure -height 1}


    catch { .locals.f.purelocalpanel.c configure -height 1}
    catch { .locals.f.valuedlocalpanel.c configure -height 1}

    catch { .traps.f.puretrappanel.c configure -height 1}
    catch { .traps.f.valuedtrappanel.c configure -height 1}

    catch { .variables.f.variablepanel.c configure -height 1}



    foreach target { io locals traps variables } {
	if { $gGridParams($target,max_item) > 10 } {
	    set items 10
	} else {
	    set items $gGridParams($target,max_item)
	}
	if { $target == "io" } { 
	    set top .mainpanel
	    global split_panel
	    if $split_panel {
		wm minsize $top [winfo width $top] [winfo height $top]
		wm maxsize $top [winfo width $top] [winfo height $top]
		return
	    }
	} else {
	    set top .$target
	}

	if [winfo exists $top ]  {
	    wm  grid $top \
		[winfo width $top] $items 1 $gGridParams($target,item_height)
	    wm minsize $top [winfo width $top] 2
	    wm maxsize $top \
		[winfo width $top] [expr $gGridParams($target,max_item) + 1]
	}
    }
}
updategeometry

xesDebug "xsmain updategeometry"

#################
# xesConnectMode
#################
global _xesConnectMode allowinputs remote connect_mode
proc xesConnectMode { { mode  panel } } {
    global _xesConnectMode allowinputs remote connect_mode TapePriv
    #    puts stderr "xesConnectMode $mode"

    case $mode {
	"panel" {
	    set TapePriv(playing) 0
	    set allowinputs 1
	    set remote 0
	    set connect_mode panel
	}
	"play" {
	    set TapePriv(playing) 1
	    set allowinputs 0
	    set remote 1
	    set connect_mode play
	}
	"silentplay" {
	    set TapePriv(playing) 1
	    set allowinputs 0
	    set remote 1
	    set connect_mode silent
	}
	"remote" {
	    set TapePriv(playing) 0
	    set allowinputs 0
	    set remote 1
	    set connect_mode remote
	}
	"file"  {
	    set TapePriv(playing) 0
	    set allowinputs 0
	    set remote 1
	    set connect_mode remote
	}
	default {
	    Alert "$mode : bad connection mode" \
		-type error -choice {{Reset reset} {Quit quit}}
	}
    }


    set _xesConnectMode $mode


    #    puts stderr "xesConnectMode $mode"
}

###################
# Toplevel bindings
###################
bind . <Control-r>  reset
bind . <Control-q>  quit
bind . <Control-m>  raisePanel
bind . <Control-j>  raisePanel


##############################
# Begin session in panel mode
##############################
raisePanel

xesDebug "xsmain END0"

global xesinputmode 
xesConnectMode $xesinputmode



xesDebug "xsmain END1"

showtree
TapeRecorder


###################################
# End of Tcl code
###################################
XesHook XesUserLastWishes


global server_mode remote color
if $server_mode {
    set remote 1
}

xesDebug XSMAIN OUT


