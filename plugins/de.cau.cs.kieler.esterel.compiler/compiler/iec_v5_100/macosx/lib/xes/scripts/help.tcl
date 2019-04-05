xesDebug HELP IN
##########
# Procedures:  about and help
# Description: popup an information  message
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########
image create bitmap ensmp -data {
\#define ensmp_width 60
\#define ensmp_height 32
static char ensmp_bits[] = {
   0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
   0x00, 0x08, 0x04, 0x02, 0x00, 0x00, 0x00, 0xfc, 0x01, 0x06, 0x83, 0x01,
   0x00, 0x00, 0x80, 0x03, 0x87, 0xc3, 0x40, 0x00, 0x00, 0x00, 0xe0, 0x80,
   0xe3, 0x71, 0x30, 0x00, 0x00, 0x00, 0x30, 0xc0, 0xf9, 0x3c, 0x1c, 0x00,
   0x00, 0x00, 0x18, 0x70, 0x3c, 0x0f, 0x07, 0x00, 0x00, 0x00, 0x0c, 0x1c,
   0x8e, 0x87, 0x03, 0x00, 0x00, 0x00, 0x06, 0x06, 0xc3, 0xe3, 0x01, 0x00,
   0x00, 0x00, 0x06, 0xc1, 0xe1, 0x7b, 0x00, 0x00, 0x00, 0x00, 0xc3, 0x60,
   0x38, 0x3e, 0x00, 0x00, 0x00, 0x00, 0x33, 0x10, 0x1c, 0x1e, 0x00, 0x00,
   0x00, 0x80, 0x03, 0x0c, 0x06, 0x06, 0x00, 0x00, 0x00, 0x80, 0x03, 0x02,
   0x01, 0x0e, 0x00, 0x00, 0x00, 0x80, 0x01, 0x80, 0x00, 0x0e, 0x00, 0x00,
   0x00, 0x80, 0x03, 0x00, 0x00, 0x0e, 0x00, 0x00, 0x00, 0x80, 0x03, 0x08,
   0x00, 0x0c, 0x00, 0x00, 0x00, 0x80, 0x03, 0x04, 0x02, 0x0e, 0x00, 0x00,
   0x00, 0x00, 0x03, 0x83, 0x01, 0x0e, 0x00, 0x00, 0x00, 0xc0, 0xc3, 0x41,
   0x60, 0x06, 0x00, 0x00, 0x00, 0xe0, 0xe7, 0x30, 0x18, 0x06, 0x00, 0x00,
   0x00, 0xf0, 0x3e, 0x1c, 0x04, 0x03, 0x00, 0x00, 0x00, 0x3c, 0x1e, 0x06,
   0x03, 0x03, 0x00, 0x00, 0x00, 0x0e, 0x8f, 0xc3, 0x81, 0x01, 0x00, 0x00,
   0x00, 0x87, 0xe7, 0x71, 0xc0, 0x00, 0x00, 0x00, 0xc0, 0xe1, 0xf9, 0x1c,
   0x60, 0x00, 0x00, 0x00, 0x60, 0x70, 0x3c, 0x0e, 0x38, 0x00, 0x00, 0x00,
   0x10, 0x18, 0x0e, 0x07, 0x0e, 0x00, 0x00, 0x00, 0x0c, 0x06, 0x03, 0xfc,
   0x01, 0x00, 0x00, 0x00, 0x02, 0x81, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
   0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
   0x00, 0x00, 0x00, 0x00};
}

proc about {} {

    set message {
    Xes is a graphical simulator for the synchronous language Esterel developped at Ecole des Mines de Paris and INRIA.
    Xes interface is written in Tcl and Tk, John Ousterhout's tool command language and graphical toolkit.
    Authors: Jean-Paul Marmorat and Xavier Fornari.  Thanks to the many Esterel team and Esterel users contributors.
    Please send reports to: Xavier.Fornari@esterel-technologies.com
    }

    global font panelfontsize
    set fn $font(panel,medium)

    set top .about
    if ![winfo exists $top] {
	toplevel  $top
	wm title $top "About Xes"
	set w [frame $top.w -bg lightyellow]
	pack $w
	set fl  [frame $w.labels  -bg lightyellow -relief groove ]
	pack $fl -side top -fill x

	# ENSMP and INRIA logos
	#
#	set d /net/home/jpm/Images/Postscript
#	set INRIA [image create photo -file $d/inria.gif]
#	set ENSMP [image create photo -file $d/ensmp.gif]
#	pack [label $fl.le -image $ENSMP] -padx 2m -pady 6m -side left
#	pack [label $fl.li -image $INRIA] -padx 2m -pady 6m -side right
	#		$fl configure -background lightyellow
#	$fl.le config -relief raised
#	$fl.li config -relief raised

	#	pack [label $w.ensmp -image ENSMP] -side top -anchor w 
	pack [message $w.mes1 -text "$message" -aspect 800 -bd 3 -bg lightyellow] \
	    -padx 2m -pady 2m -side top -expand 1 -fill both
	pack [message $fl.mes2 -text "[xesinfo]" -aspect 800 -bd 3 -bg lightyellow] \
	    -padx 2m -pady 2m -side left -anchor c -expand 1 -fill both

#	$w.mes1 configure -bd 3 -relief groove

	pack [button $w.quit -text OK -relief flat -command "destroy $top" -bg lightyellow ] -side bottom -anchor e
    }

    # Center on screen
    CenterWindowOnScreen $top

    return
}

proc newhelpfontsize { { size {} } } {
    global helpfontsize panelfontsize
    if { $size == "" } {
	set helpfontsize $panelfontsize
    } else {
	set helpfontsize $size
    }
    set w .information
    set text $w.f.text
    if [winfo exists $w] {
	set currentview [$text yview]
	set geom [wm geometry $w]
	destroy $w
	help
	catch {
	    $text yview moveto [lindex $currentview 0]
	    wm geometry $w $geom
	}
    }
}

proc help {  {args  all} } {
    global DEFAULTFONT TEXTBACKGROUND HelpSection

    set w .information
    set text $w.f.text

    if { $args=={} } { set args all }
    if { ! [winfo exists $w] } {
	# The message to be displayed
	
	global texttable
	global infofiles

	global font helpfontsize 
	set fn $font(panel,$helpfontsize)
	otherwin $w $fn
	$w.t configure -bd 3 -relief groove
	wm title $w {Xes manual}

	# Font
	pack [menubutton $w.t.f  -menu $w.t.f.menu  -padx 2m\
		  -text Font  -font $fn ]   -side {right}
	menu $w.t.f.menu -tearoff 0

	global font fontsize fontlist
	foreach size $fontlist {
	    $w.t.f.menu add radio  -label $size -variable font(help) \
		-command "newhelpfontsize $size" -font $fn 
	}
	set font(help) $helpfontsize
	menubutton $w.t.c -menu $w.t.c.m -text Contents -font $fn
	menu $w.t.c.m
	
	text $text \
	    -font $font(panel,$helpfontsize) \
	    -selectbackground $TEXTBACKGROUND \
	    -selectborderwidth 0 \
	    -relief {raised} -wrap {none}  -setgrid true -width 70

	set currentindex 1.0
	foreach file $infofiles {
	    global $file
	    eval $text insert  $currentindex  $$file

	    $text tag add headers \
		"$currentindex linestart" "$currentindex lineend"
	    lappend contents [list $currentindex \
				  [$text get "$currentindex linestart" \
				       "$currentindex lineend"]
			     ]
	    set currentindex [expr [$text index end] - 1 ]
	}

	set hfn $font(header,$helpfontsize)
	foreach item $contents {
	    set subject [string trim [lindex $item 1]]
	    $w.t.c.m add command -label $subject -font $hfn\
		    -command "$text yview [lindex $item 0]"
	    set HelpSection($subject) [lindex $item 0]
	}
	set HelpSection(all) 0
	catch {
	    $text tag configure headers \
		    -font  $hfn \
		    -foreground red
	}

	set texttable(first,$w) 1
	scan [$text index end] "%d" lastline
	set texttable(last,$w) $lastline

	# Text is no more editable
	$text configure -state disabled 

        set scrollbar $w.f.scrollbar 
	scrollbar $scrollbar \
		-command "$text yview"\
		-relief {raised} -cursor double_arrow

	$text configure -yscrollcommand "$scrollbar set"  -cursor right_ptr

	pack $w.t.f  -side right
	pack $w.t.c  -side left 
	pack $w.f.scrollbar -side right -fill y
	pack $text -side top -expand yes -fill both

    }
    $text yview $HelpSection($args)
    RaiseWindow $w
}

proc HelpWindow { {what all} } {
  help $what
}

xesDebug HELP OUT
