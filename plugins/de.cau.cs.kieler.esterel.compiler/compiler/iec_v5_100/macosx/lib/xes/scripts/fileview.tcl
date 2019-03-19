xesDebug FILEVIEW IN
pleaseWait Fileview
##########################################################################
#  Global tables : proposal  (to be done)
#    - textroot           (ex tagwintable)
#    - signalwindow       (ex sigtable)
#    - execwindow         (ex exectable)
#    - watchings          (ex watchtable)
#
#  Global lists
#    -  moduleList          [modules]
#    -  pureInputList       [pureinputs]
#    -  valuedInputList     [valuedinputs]
#    -  sensorList          [sensors]
#    -  pureOutputList      [pureoutputs]
#    -  valuedOutputList    [valuedoutputs]
#    -  pureLocalList       [purelocals]
#    -  valuedLocalList     [valuedlocals]
#    -  pureReturnList      [purereturns]
#    -  valuedReturnList    [valuedreturns]
#    -  pureTrapList        [puretraps]
#    -  valuedTrapList      [valuedtraps]
#    -  execList            [execs]
#    -  breakpointList   
##########################################################################
set NEED_SCROLL   40
set SCROLL_HEIGHT 30
set MINTEXTWIDTH  40
set MAXTEXTWIDTH 120


##########
# Procedure:   genericshow
# Description: show a  value in a popup label
# Arguments:   win         - name of the popup window
#              attributes  - string to show
#              x,y         - coordinates of the tag
# Returns:     none
# Sideeffects: none
##########
proc genericshow {win attributes x y { fn {} } { bgcolor {} }  } {
    global color
    catch { destroy $win}
    set y [expr $y-22]
    wm withdraw [toplevel $win]
   
    if { $bgcolor == {} } { set bgcolor $color(bg,info) }
    frame $win.f -bd 1 -bg black
    label $win.f.mes -text  "$attributes" -bg $bgcolor
    if { $fn != {} } {
	$win.f.mes configure -font $fn
    }
    pack $win.f
    pack $win.f.mes

    # Position - manage to be visible
    update
    set xmax [ expr [winfo screenwidth $win] - [winfo reqwidth $win] ]
    if { $xmax < 0 } {
	# Overflow !
	set xmax 0
    }
    if { $x > $xmax } {
	set x $xmax
    }
    set geom "=+$x+$y"
    wm geometry $win $geom
    wm overrideredirect $win true
    wm deiconify $win ; raise $win
}

proc showtaskargs { type num x y } {
    global sccausal
    if $sccausal return
    global font globalfontsize code
    set size  $font(panel)
    set fn $font(panel,$size)
    set status [ catch {  taskargs $type $num } arglist  ]
    if { $status == $code(__NO_ERROR_CODE) } {
	set color {}
    } else {
	set color orange
    }
    set message {}
    foreach item $arglist {
	if { [llength $item] == 2 } {
	    set name  [lindex $item 0]
	    set value [lindex $item 1]
	    set item [concat $name "=" $value]
	}
	lappend message $item
    }
    genericshow .fantom $message $x $y $fn $color
}

proc showvar {var x y text} {
    global sccausal
    if $sccausal return
    global font
    set size  $font($text)
    set fn $font(source,$size)
    genericshow .fantom  [variablevalue $var] $x $y $fn
}

proc showsig {sig x y text} {
    global sccausal
    if $sccausal return
    global font
    set size  $font($text)
    set fn $font(source,$size)
    genericshow .fantom  [signalvalue $sig] $x $y $fn
}

proc unshow {} {
    catch {destroy .fantom}
}

##########
# Procedure:   raiseinstance
# Description: makes visible a source window 
# Arguments:   instance  - the instance index 
# Returns:     none
# Sideeffects: none
##########
proc raiseinstance { instance } {
    global no_source
    if $no_source return

    # Window name (see also createinstance)
    set w .f$instance

    global TEXTBACKGROUND

    # It must exist
    if {[winfo exists $w]} {
	wm deiconify $w
	raise $w
	set text $w.f.text
	$text configure -bg lightblue
	update
	$text configure -bg $TEXTBACKGROUND
        update
    } else {
        if {[createinstance $instance]} {
	    updatesource
	    wm deiconify $w
	    update
	}
    }  
}

##########
# Procedure:   createinstance
# Description: create a non visible source window 
# Arguments:   instance  - the instance index
# Returns:     { 0 filename } if error or { 1 filename } if no error
# Sideeffects: create a withdrawn window containing text (if no error)
##########
proc set_text_font {w fn} {
    global texttable
    set width $texttable(width,$w)
    set height $texttable(height,$w)
    $w.f.text  configure -font $fn 
    $w.t.f configure -font $fn
    $w.t.fath configure -font $fn
    $w.t.ok configure -font $fn
    $w.t.m configure -font $fn
    $w.t.w configure -font $fn
    $w.t.brk configure -font $fn
    $w.t.brk.m configure -font $fn
}

set windowlist {}

proc createinstance { instance } {
    global NEED_SCROLL SCROLL_HEIGHT   MINTEXTWIDTH MAXTEXTWIDTH
    global gList
    global textroot  watchingindex  watchtable
    global DEFAULTFONT
    global TEXTBACKGROUND
    global texttable sourcedir
    global windowlist
    
    # Source file informations
    set infos [sourceinfo $instance]

    set dirname    [lindex $infos 0]
    set filename   [lindex $infos 1]
    set modulename [lindex $infos 2]
    set firstline  [lindex $infos 3]
    set lastline   [lindex $infos 4]
    set absfilename [file join $dirname $filename]

# trace_or_error_message "$modulename : $dirname $filename $firstline $lastline"

    if { ! ([file exist $absfilename ] && [file readable $absfilename]) } {
	if { [info exists sourcedir] && $sourcedir != "" } {
	    set dirname    $sourcedir
	    set absfilename [file join $dirname $filename]
	    while { ! ([file exist $absfilename ] \
			   && [file readable $absfilename])} {
		set mes "Can't read $filename - Browse ?"
		set answer [ tk_messageBox 		\
				 -icon question 	\
				 -message $mes 	\
				 -parent . 		\
				 -type okcancel	\
				]
		if { "$answer" == "cancel" } { return 0 }
		set mes "Browsing for $absfilename"
		set answer [tk_getOpenFile 			\
				-defaultextension ".strl" 	\
				-filetypes {{"Esterel" .strl}}\
				-initialdir $dirname 	\
				-initialfile $filename	\
				-parent . 			\
				-title $mes 		\
			       ]
		if { "$answer" == "" } {
		    return 0
		} else {
		    set dirname [file dirname $answer]
		    set absfilename $answer
		}
	    }
	}
    }

    set fid [open "$absfilename" r]
    set module_text [read $fid]
    close $fid

    if ![info exists watchingindex] {	set watchingindex     0    }

    global anysource
    set anysource 1

    # Window, scrollbar, and text name 
    set w .f$instance
    global font fontsize
    otherwin $w $font(source,$fontsize)
    $w.t configure -bd 3 -relief groove
    set text $w.f.text
    set scrollbar $w.f.scrollbar
    set hscroll   $w.f.hscroll

    set texttable(last,$w) [expr "$lastline-$firstline+1"]

    # Breakpoint button

    menubutton $w.t.brk -text "Breakpoints" -relief flat -menu $w.t.brk.m 

    menu $w.t.brk.m -tearoff 0
    $w.t.brk.m add command \
         -command "resetinstancebreakpoints -local $instance" \
         -label "Remove" 
    $w.t.brk.m add command \
         -command "resetinstancebreakpoints -recursive $instance" \
         -label "Remove recursively" 
    pack $w.t.brk -side left

    # Father button (exception is made with the root instance)
    set father_button [button $w.t.fath  -relief flat -padx 2m -text Father] 
    pack $father_button -side right

    # Font
    pack [menubutton $w.t.f  -menu $w.t.f.menu  -padx 2m\
		-text Font]   -side {right}
    menu $w.t.f.menu -tearoff 0
    global font fontsize fontlist
    foreach size $fontlist {
       $w.t.f.menu add radio  -label $size -variable font($text) \
	  -command "set_text_font $w $font(source,$size)"
    }

    # build widget text
    text $text \
	    -selectbackground $TEXTBACKGROUND \
	    -selectborderwidth 0 \
	    -relief {raised} -wrap {none}  -setgrid true

    # build scrollbars
    scrollbar $scrollbar \
	    -command "$text yview"\
	    -relief {raised} -cursor double_arrow
    

    scrollbar $hscroll -orient horizontal \
	    -command "$text xview"\
	    -relief {raised} 
    
    
    $text configure -cursor right_ptr 
    $text configure -yscrollcommand "$scrollbar set" 
    $text configure -xscrollcommand "$hscroll   set"  
    $text configure -bd 5 -relief flat

    # pack scrollbars and  text
    #pack $scrollbar -side right  -fill y
    #pack $hscroll -side bottom  -fill x
    #pack $text -side left -expand yes -fill both
    grid $text      -row 0 -column 0 -sticky nswe
    grid $scrollbar -row 0 -column 1 -sticky ns
#    grid $hscroll   -row 1 -column 0 -sticky we
    # to allow expansion
    grid columnconfigure $w.f 0 -weight 1
    grid rowconfigure    $w.f 0 -weight 1
   
    
    # Insert file
    $text  insert 1.0 $module_text
    set strlprog [$text get $firstline.0 [expr $lastline+1 ].0 ]

    # Parse for watchings !
    global no_parse
    global no_parse_error
    set wlists {}
    if !$no_parse  {
	pleaseWait "Parsing $modulename - File $absfilename"
	global errorInfo
	if {[catch {set wlists [watchings $instance $absfilename] }] \
		&& !$no_parse_error } {
	    Alert \
   "File $absfilename\n\n[last_error_message]\nCheck your Esterel code or use -np option" \
		-type error -choice \
		[list \
		     [list \
			  {No parsing} \
			  {global no_parse; set no_parse 1 } ] \
		     [list \
			  {Ignore parse errors} \
			  {global no_parse_error; set no_parse_error 1} ] \
		     [list \
			  Continue \
			  {} ] \
		     [list \
			  Quit \
			  {XesExit 1}] ]
            set wlists {}
	}
    }
# FXF
#    set gList(wlist,$modulename) $wlists

# FXF
#     foreach item  $wlists {
# 	set tag      [lindex $item 0]
# 	set haltlist [lindex $item 1]
# 	set runlist  [lindex $item 2]
# 	if { [llength $haltlist] || [llength $runlist] } {
# 	    set tagname TAGwatch$watchingindex
# 	    $text tag add  $tagname  "$tag  wordstart" "$tag wordend"
# 	    set textroot(watch,$watchingindex) $instance
# 	    set watchingname  [$text get "$tag  wordstart" "$tag wordend"]


#             lappend gList(watching)  "$watchingindex $watchingname"
# 	    foreach hlt $haltlist {
# 		lappend watchtable(halt,$hlt) $watchingindex
# 	    }
# 	    foreach run $runlist {
# 		lappend watchtable(run,$run) $watchingindex
# 	    }
# 	    underlinesourcepoint watch $watchingindex inactive
# 	}
# 	incr watchingindex
#     }

    foreach tag  $wlists {
	set index $tag.$instance
	set tagname TAGwatch$index
	$text tag add  $tagname  "$tag  wordstart" "$tag wordend"

	# used for general reset
	set watchingname  [$text get "$tag  wordstart" "$tag wordend"]
	lappend gList(watching)  "$index $watchingname"

	# used by underlinesourcepoint
	set textroot(watch,$index) $instance

	underlinesourcepoint watch $index inactive
    }
# END FXF

    # Tag variables
    foreach item [concat $gList(counter) $gList(variable)] {
	if {[lindex $item 2] == $instance } {
	    set num [lindex $item 0]
	    set tag [lindex $item 3]
	    set tagname TAGvar$num
	    $text tag add $tagname "$tag  wordstart" "$tag wordend"
	    $text tag bind $tagname <ButtonPress-1> "showvar $num %X %Y $text"
	    $text tag bind $tagname <ButtonRelease-1> "unshow"
	    set textroot(var,$num) $instance
	    colorsourcepoint var $num inactive
	}
    }

    # Tag signals
    foreach item $gList(signal) {
	if {[lindex $item 2] == $instance } {
	    set num [lindex $item 0]
	    set tag [lindex $item 3]
	    set tagname TAGsig$num
	    #	    lappend instanceTable($instance,signal) $num
	    $text tag add $tagname "$tag  wordstart" "$tag wordend"
	    $text tag bind $tagname <ButtonPress-1> "showsig $num %X %Y $text"
	    $text tag bind $tagname <ButtonRelease-1> "unshow"
            $text tag bind $tagname <ButtonRelease-3> "startsignalbrowse  $num"
            set textroot(sig,$num) $instance
	    colorsourcepoint sig $num inactive
	}
    }

    #
    # SIGNAL BROWSING
    #

    
    # Tag declarations, emissions, tests, and accesses of signals
    global color
    foreach index [instance_declarations $instance ] {
	set tagname TAGbrowse$index
	set defname TAGdefault$index
	$text tag add $defname  "$index wordstart"  "$index wordend"
	$text tag configure $defname  \
	    -background $TEXTBACKGROUND 
	$text tag add $tagname  "$index wordstart"  "$index wordend"
    }
    foreach index [instance_emissions $instance ] {
	set tagname TAGbrowse$index
	set defname TAGdefault$index
	$text tag add $defname  "$index wordstart"  "$index wordend"
	$text tag configure $defname  \
	    -background $TEXTBACKGROUND
	set linecol [split $index .]
        if ![isHalt [lindex $linecol 0] [lindex $linecol 1] $instance ] {
	    $text tag configure $defname  \
		-foreground $color(sig,inactive)
	}
	$text tag add $tagname  "$index wordstart"  "$index wordend"
	$text tag bind $tagname  <ButtonRelease-3> \
	    "startsignalbrowse $instance $index"
	#      puts "Instance  $instance : emission $index"
    }
    foreach index [instance_tests $instance ] {
	set tagname TAGbrowse$index
	set defname TAGdefault$index
	$text tag add $defname  "$index wordstart"  "$index wordend"
	$text tag configure $defname   \
	    -background $TEXTBACKGROUND 
	$text tag add $tagname  "$index wordstart"  "$index wordend"
	$text tag bind $tagname  <ButtonRelease-3> \
	    "startsignalbrowse $instance $index"
	#      puts "Instance  $instance : test $index"
    }
    ###
    ### Very special case: access token = '?'
    ###
    foreach index [instance_accesses $instance ] {
#	puts stderr "Access:  $index"
	set tagname TAGbrowse$index
	set defname TAGdefault$index
	case [$text get $index] in {
	    { "?" } {
		$text tag add $defname  $index  "$index + 1 chars"
		$text tag add $tagname  $index  "$index + 1 chars"
	    }
	    default {
		$text tag add $defname "$index wordstart"  "$index wordend"
		$text tag add $tagname "$index wordstart"  "$index wordend"
	    }
	}
	$text tag configure $defname   \
	    -background $TEXTBACKGROUND \
	    -foreground $color(sig,inactive)
	$text tag bind $tagname  <ButtonRelease-3> \
	    "startsignalbrowse $instance $index"
	#  puts "Instance  $instance : access $index"
    }

    # Tag copymodules
    foreach  son [sons $instance]  {
	set index [lindex $son 0]
	set inst  [lindex $son 1]
	set tagname TAGinst$inst
	$text tag add $tagname  "$index wordstart"  "$index wordend"
	$text tag bind $tagname  <ButtonRelease-1> "+raiseinstance $inst"
	set textroot(inst,$inst) $instance
	set tagname TAGinstBP$inst
        $text tag add $tagname "$index wordstart" "$index wordstart + 1 chars"
	set tagname TAGbrowse$index
	set defname TAGdefault$index
	$text tag add $defname  "$index wordstart"  "$index wordend"
	$text tag configure $defname  -background $TEXTBACKGROUND
	$text tag add $tagname  "$index wordstart"  "$index wordend"
	#        colorsourcepoint inst $inst inactive
	#        colortreeinstance $inst inactive
    }

    ###
    ### Very special case: source points token = '||' or ':='
    ###
    # Tag source points
    foreach item [sourcepoints $instance] {
	set lig [lindex $item 0]
	set col [lindex $item 1]
	set index $lig.$col
	set tagname TAGsp$instance.$index
	case [$text get $index] in {
	    { ":" "|" } {
		$text tag add $tagname $index  "$index + 2 chars"
	    }
	    default {
		$text tag add $tagname "$index wordstart"  "$index wordend"
	    }
	}
    }

    # Tag halts
    foreach item $gList(halt) {
	if {[lindex $item 2] == $instance } {
	    set num [lindex $item 0]
	    set tag [lindex $item 3]
	    set tagname TAGhalt$num
	    $text tag add $tagname "$tag wordstart" "$tag wordend"
	    $text tag add TAGbrk$num "$tag" "$tag +1 chars"
	    $text tag bind $tagname <ButtonPress-1> "togglebreakpoint $num"
            set textroot(halt,$num) $instance
#	    colorsourcepoint halt $num inactive
	}
    }

    # Destroy exceeding lines in text 
    # ( END OF TEXT FIRST TO KEEP CORRECT LINE NUMBERING !)
    $text delete [expr "$lastline + 1"].0  end
    $text delete 1.0 $firstline.0

    set textheight [expr "$lastline - $firstline + 1"]

    # On ne veut plus pouvoir modifier le texte affiche
    $text configure -state disabled
    
    # Le titre (ameliorer foo #1 file p.strl)
    set title \
	    [format "%s  #%s  -  File %s" $modulename $instance $filename]

    global others rootinstance sccausal
    if { $instance == $rootinstance } {
	$father_button configure -state disabled
    } else {
	$father_button configure -command "raiseinstance [father $instance]"
	catch { 
	    $others add command -label \
                [format "%s  #%s" $modulename $instance] \
                -command "raiseinstance $instance"
	}
    }
    lappend windowlist $instance

    # On calcule la largeur max
    set width $MINTEXTWIDTH
    set curwidth [expr "[string length $title] + 15"]
    if { $curwidth>$width } { set width $curwidth }
    for { set i 1} { $i<$textheight } { incr i } {
	set curwidth [string length [$text get $i.0 "$i.0 lineend"]]
	if { $curwidth>$width } { set width $curwidth }
    }
    set width [ expr "$width + 1" ]
    set texttable(height,$w) $textheight
    set texttable(width,$w) $width

    # Set panel global font size    
    $w.t.f.menu invoke [lsearch $fontlist $fontsize] 

    # On n'oublie pas de placer le texte dans la toplevel window
    #    pack  append $w $w.frame  {top fillx}
    
    # On informe le window manager
    wm title $w $title
    #    wm aspect $w "" "" "" ""

    #    wm minsize $w 0 0

#    bind $text <ButtonRelease-2> "+ raiseinstance $instance "
    bind $text <Double-ButtonPress-1> {break}
    pack $w.f -expand true -fill both
#    pack propagate $w.f false
#    $text configure -width 1 -height 1
    if { $textheight>$NEED_SCROLL } then {
	$text configure -height $SCROLL_HEIGHT 
    } else {
	$text configure -height [expr $textheight + 1 ] 
    }
    if { $width>$MAXTEXTWIDTH } then {
	$text configure -width $MAXTEXTWIDTH
    } else {
	$text configure -width [expr $width + 1 ]
    }

    XesInstanceEnableHorizontalScrollBar $instance
    XesHook XesInstanceLastWishes $instance $text

#FX
    bind $text <Alt-Button-3> [format {
	set index [split [%1$s index @%2$s,%3$s] .]
	set line [lindex $index 0]
	set col [lindex $index 1]
	incr col
	showspinfo $line $col %4$s
    } %W %x %y $instance]

#FX
    return 1
}

# Instances Last Wishes
#proc XesInstanceLastWishes { instance text } {
#    # Horizontal scrollbar
#    XesInstanceEnableHorizontalScrollBar $instance
#    # Cursors
#    XesInstanceSetTextCursors $text
#}


#===================================================================
# UTILITIES: modify carefully....

# ==================================================================== INSTANCES
proc XesInstanceEnableHorizontalScrollBar instance {
    set w .f$instance
    set hscroll   $w.f.hscroll
    set hscroll   $w.f.hscroll
    grid $hscroll   -row 1 -column 0 -sticky we
}

proc XesInstanceSetTextCursors { text }  {
    set default_cursor [$text cget -cursor]
#    bind $text  <ButtonPress-2>   "set_hand_cursor  $text"
    bind $text  <ButtonRelease-2> "$text config -cursor $default_cursor"
    proc set_hand_cursor { w } {
	set lib /usr/lib/TkDesk/images
	$w  config -cursor "@$lib/hand.xbm $lib/hand.mask.xbm black white"

    }
}


##########
# Procedure:   showhalt
# Description: makes a halt sourcepoint visible
# Arguments:   num  - halt index
# Returns:     none
# Sideeffects: none
##########
proc showhalt { num } {
    global gList

    set item [lindex $gList(halt) $num]
    set inst [lindex $item  2 ]
    set tag  [lindex $item  3 ]
    raiseinstance $inst
    .f$inst.f.text  yview -pickplace $tag
    colorsourcepoint halt $num active
}


########## NETS #############

##########
# Procedure:   shownets
# Description: set nets in texts
# Arguments:   none
# Returns:     none
# Sideeffects: none
##########

proc shownets {  { instance {} } }  {
    global numberofinstances windowlist

    if { $instance != {} } {
	setinstsp $instance
    } else {
	foreach i $windowlist  {
	    if [winfo exists .f$i] {
		setinstsp $i
	    }
	}
    }
}

proc  resetnets {  }  {
    global numberofinstances windowlist

    foreach i $windowlist  {
	if [winfo exists .f$i] {
	    resetinstsp $i
	}
    }
}

proc setinstsp {instnum} {
    # text window
    set text .f$instnum.f.text
    set newItems [getnewsp $instnum]
    foreach item   $newItems {
        # tag name
	set lig [lindex $item 0]
	set col [lindex $item 1]
	set index $lig.$col
	set tagname TAGsp$instnum.$index

	# attributes
	set attr    [lindex $item 2]

        # color
	global color
	set tagcolor $color(net,$attr)
        # painting
	$text tag configure $tagname -background $tagcolor
	$text tag raise $tagname
    }
}

proc resetinstsp {instnum} {
    # text window
    set text .f$instnum.f.text

    foreach item  [sourcepoints $instnum] {
        # tag name
	set lig [lindex $item 0]
	set col [lindex $item 1]
	set index $lig.$col
	set tagname TAGsp$instnum.$index

	# attributes
	set attr    0

        # color
	global color
        set tagcolor $color(net,$attr)

        # painting
	$text tag configure $tagname -background $tagcolor
	$text tag raise $tagname
    }
}

##########
# Procedures:  colorsourcepoint, colorpanel, underlinesourcepoint 
# Description: set color or underline to given source point
# Arguments:   type  - must be : sig, halt, var or inst
#              num   - num in the list of type
#              status - active or inactive
# Returns:     none
# Sideeffects: changes color of some characters in some source window
##########
proc colorsourcepoint { type num status } {
    global textroot color 
    set col $color($type,$status)
    if [info exists textroot($type,$num)] {
	set text .f$textroot($type,$num).f.text
	$text  tag configure TAG$type$num -foreground $col
    }
}

proc colorpanel { type num status } {
        global sigtable color 
	set col $color($type,$status)
	catch {
	    $sigtable($num,ilab) configure  -foreground  $col 
	    $sigtable($num,ilab) configure  -activeforeground $col
	}
}


proc underlinesourcepoint { type num status } {
        global textroot color
	set col $color($type,$status)
    catch {
        .f$textroot($type,$num).f.text tag configure TAG$type$num \
		-underline true -underlinefg $col
    }
}

##########
# Procedures:  setsourcepoint
# Description: set graphical aspect to given source point
# Arguments:   type  - must be : sig, halt, var, break, or inst
#              num   - num in the list of type
#              status - active or inactive
# Returns:     none
# Sideeffects: changes color of some characters in some source window
##########
proc setsourcepoint { type num status } {
    global anysource
    if $anysource {
        global textroot color
	set col $color($type,$status)
	switch $type {
	    break {
		catch {
		    set text  .f$textroot(halt,$num).f.text
		    set tagname   TAGbrk$num
		    $text  tag configure $tagname -background $col
		    if { $status == "active" } {
			$text tag raise $tagname
		    } else {
			$text tag lower $tagname
		    }
		}
	    }		
	    sig  -
	    halt -
	    var  -
	    inst  {
		catch {
		    set text  .f$textroot($type,$num).f.text 
		    set tagname  TAG$type$num 
		    $text tag configure $tagname -foreground $col
		    $text tag raise $tagname
		}
	    }
	}
    }
}

proc setbgsourcepoint { type num status } {
    global anysource
    if $anysource {
        global textroot color
	set col $color($type,$status)
	switch $type {
	    break {
		catch {
		    set text  .f$textroot(halt,$num).f.text
		    set tagname   TAGbrk$num
		    $text  tag configure $tagname -background $col
		    if { $status == "active" } {
			$text tag raise $tagname
		    } else {
			$text tag lower $tagname
		    }
		}
	    }		
	    sig  -
	    halt -
	    var  -
	    inst  {
		catch {
		    set text  .f$textroot($type,$num).f.text 
		    set tagname  TAG$type$num 
		    $text tag configure $tagname -background $col
		    $text tag raise $tagname
		}
	    }
	}
    }
}


##########
# Procedure:   refargedit
# Description: pop up a window to edit referenced arguments of a task
# Arguments:   execnum  - num of exec
#              arglist  - pairs {name value}
# Return:      a list of values
# Sideeffects: none
##########
proc refargedit {execnum arglist answer} {
    upvar $answer _answer
    set _answer {}
    global gList asker

    if { [llength "$arglist"] == 0 } { return 1 }

    set w  .refargedit_$execnum
    if [winfo exists $w] {
	wm deiconify $w
	raise $w
    } else {
	set taskname [lindex [lindex $gList(exec) $execnum] 0]
	toplevel  $w -relief ridge
	wm title $w "Reference arguments edition"

	global font 
	set size  $font(panel)
	set fn $font(panel,$size)

	frame $w.top -relief raised -bd 1 
	frame $w.bot -relief raised -bd 1
	frame $w.default -relief sunken -bd 1
	button $w.ok -text "OK" -padx 3m -pady 3m  -font $fn  \
		-command {set asker(button) 1 }
	button $w.cancel -text "Cancel" -padx 3m -pady 3m  -font $fn \
		-command {set asker(button) 0}
	label $w.title -font $fn -text "$taskname (#$execnum)"
	# packing order
	pack $w.top $w.bot -fill both
	pack $w.title -in $w.top -padx 3m -pady 3m -fill both 
	pack $w.ok -in $w.default -padx 1m -pady 1m -ipadx 1 -ipady 1
	pack $w.default $w.cancel \
		-in $w.bot -expand 1 -padx 3m -pady 2m -side left 

	set i 0
	foreach item $arglist {
	    pack [frame $w.$i -relief flat -bd 0] -in $w.top -side top
	    pack [entry $w.$i.val -font $fn -relief sunken] -side right
	    EntryBindings  $w.$i.val
	    EntryXBindings $w.$i.val
	    $w.$i.val icursor 0	
	    $w.$i.val insert 0 [lindex $item 1]
	    pack [label $w.$i.lab -font $fn -text [lindex $item 0]] -side right
	    incr i
	}

	pack [label $w.mes -padx 3m -pady 3m -font $fn \
		-text "Edit arguments values"]\
		-in $w.top -fill both -expand 1
	# centerings
	CenterWindowOnScreen $w
    }
    # wait for the response.

    global allowinputs exectable currentpopup
    set allowinputs 0
    set currentpopup $w
    set ok 0 ;    while { $ok == 0 } {
	tkwait variable asker(button)
	if {$asker(button)} {
	    set i 0
	    set _answer {}
	    foreach item $arglist {
		$w.$i.lab configure -fg black
		lappend _answer [$w.$i.val get]
		incr i
	    }
#	    puts $_answer
	    set check [catch {checktaskrefargs $execnum $_answer} message]
	    if { $check == 0 } {
		set exectable($execnum,values) $_answer
		set ok 1
	    } else {
		foreach item $message {
		    $w.$item.lab configure -fg orange
		}
		if {[llength $message]==1} {
		    set what value
		} else {
		    set what values
		}
		set message \
		"Task referenced arguments\nBad returned $what\nPlease correct"
#		$w.mes configure -text $message -bg orange
		Alert $message -type warning  -choice { {OK {}} }
		beep
	    }
	} else {
	    set ok 1
	}
	
    }


    # return sequence
    set allowinputs 1
    wm withdraw $w
    return $asker(button)
}


# pleaseWait fileview

xesDebug FILEVIEW OUT
pleaseWait

