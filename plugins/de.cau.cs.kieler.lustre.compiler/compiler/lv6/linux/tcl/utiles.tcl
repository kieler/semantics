#==============================================================================
#                     PWISH (initialement dans  XLesar)
#------------------------------------------------------------------------------
# utiles.tcl
#------------------------------------------------------------------------------
# Quelques procedures Tcl bien pratiques ... 
#==============================================================================
proc GrabColor { flag } {
	set b ._______UtilesButton
	button $b
	switch $flag {
   	disabledforeground {
			set res [$b cget -disabledforeground ]
		}
   	activeforeground {
			set res [$b cget -activeforeground ]
		}
   	activebackground {
			set res [$b cget -activebackground ]
		}
   	foreground {
			set res [$b cget -foreground ]
		}
   	background {
			set res [$b cget -background ]
		}
		default {
			set res pink
		}
	}
   destroy $b
	return $res
}
proc OpenTopLevel { w mode } {
	wm withdraw $w
	update idletasks
	switch $mode {
		midscreen {
			set x [expr [winfo screenwidth $w]/2 - [winfo reqwidth $w]/2 \
				- [winfo vrootx [winfo parent $w]]]
			set y [expr [winfo screenheight $w]/2 - [winfo reqheight $w]/2 \
				- [winfo vrooty [winfo parent $w]]]
			wm geometry $w +$x+$y
		}
		neartop {
			set x [expr [winfo rootx .] + 20]
			set y [expr [winfo rooty .] + 20]
			wm geometry $w +$x+$y
		}
		default {
		}
	}
	wm deiconify $w
}
proc BuildScrolls { root this } {
	if { $root == "." } then {
		set base ""
	} else {
		set base "$root"
	}
	scrollbar $base.vscroll \
		-relief raised  \
		-command "$this yview"
	scrollbar $base.hscroll  \
		-orient horiz  \
		-relief raised  \
		-command "$this xview"
	$this configure -xscrollcommand "$base.hscroll set"
	$this configure -yscrollcommand "$base.vscroll set"
	grid $base.vscroll -row 0 -column 0 -sticky ns
	grid $base.hscroll -row 1 -column 1 -sticky ew
	grid $this -in $root -row 0 -column 1 -sticky nsew
	grid rowconfigure $root 0 -weight 1
	grid columnconfigure $root 1 -weight 1
}
# MODE VERBEUX SUR STDOUT 
set Utiles(verbose) 0
set Utiles(toolName) {}

proc SetVerboseMode { } {
	global Utiles
	set Utiles(verbose) 1
}

proc Verbose { msg } {
	global Utiles
	if { $Utiles(verbose) } {
		puts $msg
	}
}
# BOITE ERREUR
proc ErrorBox { errorMsg } {
	global Utiles
	tk_messageBox \
		-icon error \
		-message "$errorMsg" \
		-type ok \
		-title "$Utiles(toolName) Error"
}
proc ErrorBoxMsg { errorMsg errorTxt } {
	global Utiles
	global _ErrorBoxMsgVar

	set w ._error_box_msg	
	catch {destroy $w}
	toplevel $w
	wm title $w "$Utiles(toolName) Error"
	wm transient $w .
	
	frame $w.top -relief raised -bd 1
	pack $w.top -side top -fill x 
	frame $w.mid -relief raised -bd 1
	pack $w.mid -side top -fill both -expand 1
	frame $w.bot -relief raised -bd 1
	pack $w.bot -side top -fill both

	#LE DESSUS
	label $w.msg -justify center -text $errorMsg
	#ScaleFont $w.msg "1.5"
	catch {$w.msg configure -font \
		-Adobe-Times-Medium-R-Normal--*-180-*-*-*-*-*-*
	}
	pack $w.msg -in $w.top \
		-side right -expand 1 -fill both -padx 3m -pady 3m
	label $w.bitmap -bitmap error
	pack $w.bitmap -in $w.top -side left -padx 3m -pady 3m

	#LE MILIEU
	#text $w.txt -relief sunken -bd 2 
	#ScaleFont $w.txt "1.5"
	#$w.txt configure -width 30 -height 5 -wrap none
	#$w.txt configure -fg red -bg white
	#$w.txt insert 0.0 $errorTxt
	#$w.txt configure -state disabled
	#BuildScrolls $w.mid $w.txt
	#pack $w.txt -in $w.mid -fill both -expand 1 -padx 3m -pady 3m

	label $w.txt -relief sunken -bd 2
	$w.txt configure -fg red -bg white -justify left
	$w.txt configure -text $errorTxt
	pack $w.txt -in $w.mid -fill both -expand 1 -padx 3m -pady 3m

	#LE BAS
	button $w.ok -text "OK" \
		-default active \
      -command _ErrorBoxMsgExit 

	pack $w.ok -in $w.bot -side left -expand 1 -padx 3m -pady 2m
	# Binding du return
	bind $w <Return> "tkButtonInvoke $w.ok"

	#OUVERTURE DU TOPLEVEL
	OpenTopLevel $w midscreen	

	grab $w
	tkwait window $w
}

proc _ErrorBoxMsgExit { } {
	global _ErrorBoxMsgVar
	set w ._error_box_msg	
	set _ErrorBoxMsgVar 1
	catch {destroy $w}
}
# BOITE SELECTION DANS UNE LISTE
set Utiles(selectBoxRes) {}

proc SelectBox { inList {inMsg "Select item:"} } {
	global Utiles
	toplevel .selectBox
	wm title .selectBox {Item select box}	
	label .selectBox.msg -anchor c  -relief raised  -text "$inMsg"
	frame .selectBox.frm -borderwidth 0  -relief raised
	button .selectBox.frm.ok  -text "OK"  -command "
		set res \[.selectBox.items.items curselection\]
		if { \$res != \"\" } {
			SelectBoxOut
		}"
	button .selectBox.frm.cancel  -text "Cancel"  -command "
		global Utiles
		.selectBox.items.items selection clear 0 \[.selectBox.items.items size\]
		SelectBoxOut"
	frame .selectBox.items  -borderwidth 0  -relief raised
	listbox .selectBox.items.items  \
		-exportselection false \
		-relief raised 
	BuildScrolls ".selectBox.items" ".selectBox.items.items"
	bind .selectBox.items.items <Double-Button-1> "SelectBoxOut"
	pack append .selectBox.frm \
		.selectBox.frm.ok {left fill expand} \
		.selectBox.frm.cancel {left fill expand}
	pack append .selectBox  \
		.selectBox.msg {top fill} \
		.selectBox.frm {bottom fill} \
		.selectBox.items {left fill expand}
	foreach item $inList {
		.selectBox.items.items insert end $item
	}
	update idletask
	grab .selectBox
	tkwait window .selectBox

	if { $Utiles(selectBoxRes) != "" } {
		return [lindex $inList $Utiles(selectBoxRes)]
	} else {
		return ""
	}
}

proc SelectBoxOut { } {
	global Utiles
	set Utiles(selectBoxRes) [.selectBox.items.items curselection] 
	catch {destroy .selectBox}
}
set Utiles(nbTextWindow) 0

proc NewTextWindow { winPath width height} {
	global Utiles
	set txtPath $winPath.txt$Utiles(nbTextWindow)
	frame $txtPath
	text $txtPath.txt \
		-relief sunken \
		-width $width \
		-height $height \
		-wrap none
	BuildScrolls $txtPath $txtPath.txt
	pack append $winPath \
		$txtPath {top frame center expand fill}

	return $txtPath.txt
}
#
# Run manager : lance et tue des commandes
# 
# Quand on cree un RunMng dans 'winPath' : 
# => cree un widget : run = $winPath.run$Utiles(nbRunMng)
# => une variable ``pipe'' : Utile(pipe:$run)
# => une variable ``text'' : Utile(text:$run)
#

set Utiles(nbRunMng) 0

proc NewRunMng { winPath width height } {
	global Utiles

	set ix $Utiles(nbRunMng)
	incr Utiles(nbRunMng)

	set runPath $winPath.run$ix

#Le frame principal
	frame $runPath

#La variable pour le pipe (valeur bidon)
	set Utiles(pipe:$runPath) -1 

#La partie echo (avec variable pour le texte)
	frame $runPath.echo
	set Utiles(text:$runPath) [NewTextWindow $runPath.echo $width $height]

	$Utiles(text:$runPath) tag configure tagerr -foreground red

#La partie status
	frame $runPath.status

	set Utiles(status:$runPath) "not running ..."

	entry $runPath.status.label \
		-textvariable Utiles(status:$runPath) \
		-state disabled \
		-relief sunken

	button $runPath.status.kill \
		-relief raised \
		-cursor pirate \
		-text "STOP" \
		-command "EndRunMng $runPath" \
		-disabledforeground [GrabColor disabledforeground] \
		-background [GrabColor background] \
		-foreground white \
		-state disabled

	button $runPath.status.clear \
		-relief raised \
		-text "Clear" \
		-command "ClearRunMng $runPath"

 	set Utiles(time:$runPath) ""
	checkbutton $runPath.status.time \
		-text "Time" \
		-onvalue "/usr/bin/time -p" \
		-offvalue "" \
		-variable Utiles(time:$runPath)

	pack $runPath.status.label \
		-side left -fill x -expand 1
	pack $runPath.status.time \
		-side right
	pack $runPath.status.clear \
		-side right
	pack $runPath.status.kill \
		-side right

	pack append $runPath \
		$runPath.status {top frame center fillx} \
		$runPath.echo {top frame center expand fill}

#	pack append $winPath \
#		$runPath {top frame center expand fill}

	set Utiles(code:$runPath) 0

	return $runPath
}
proc EndRunMng { runPath } {
	global Utiles

#puts [pid $Utiles(pipe:$runPath)]

	if { $Utiles(pipe:$runPath) > 0 } {
		catch [close $Utiles(pipe:$runPath)]
	}
	$runPath.status.kill configure \
		-state disabled \
		-background [GrabColor background]

	set Utiles(status:$runPath) "not running ..."
}
# EXECUTION D'UNE COMMANDE

proc _RunMngPipeEvent { runPath } {
	global Utiles
	set p $Utiles(pipe:$runPath)

	set txt $Utiles(text:$runPath)
	if { [eof $p] } {
		EndRunMng $runPath 
		return
	}
	#ON TRAQUE LA CHAINE EXIT
	set ll [gets $p]
	set code 0 
	if {[scan $ll "exit %d" code] == 1} {
		set Utiles(code:$runPath) $code
		return
	} else {
		#COMMENCE PAR ``^R''
		if { [string range $ll 0 1] == "^R" } {
			$txt delete {end -1 line linestart} end
			set ll [string range $ll 2 end]
			$txt insert end "\n$ll" {tagerr}
			$txt yview end
		} else {
			$txt insert end "$ll\n" {tagerr}
			$txt yview end
		}
	}
	update idletasks
}

proc StartRunMng {runPath comm mode} {
	global Utiles
#puts $comm
	if { [$runPath.status.kill cget -state] != "disabled" } {
		ErrorBox "A process is still running"
		return
	}

	#== LA COMMANDE QUI AFFICHE LE CODE DE RETOUR
	set mkpipe "sh -c \"$Utiles(time:$runPath) $comm ; echo exit \$? >&2 \""

	#set p [open "|$mkpipe |& cat -u" r]
	set p [open "|$mkpipe |& cat -u" r]

	set Utiles(pipe:$runPath) $p

	$runPath.status.kill configure \
		-state normal \
		-background red

	set Utiles(status:$runPath) "running: $comm"

	fileevent $p readable "_RunMngPipeEvent $runPath"
}

proc EchoRunMng { runPath msg } {
	global Utiles
	set txt $Utiles(text:$runPath)

	$txt insert end "$msg\n"
	$txt yview end
}

proc ClearRunMng { runPath } {
	global Utiles
	set txt $Utiles(text:$runPath)
	
	$txt delete 1.0 end
}
proc RunMngCode { runPath } {
	return [list "Utiles" "code:$runPath"]
}
proc MiniTextText { fpath } {
	if { [winfo exists "$fpath.txt"] } {
		return "$fpath.txt"
	} else {
		return ""
	}
}

proc MiniText { fpath titlewin width height vartab varfield } {

#frame $fpath -bd 0 
	$fpath configure -bd 0 
	text $fpath.txt \
		-bd 1 \
		-bg white \
		-height $height \
		-width $width \
		-yscrollcommand "$fpath.sb set"
	scrollbar $fpath.sb \
		-width 10 \
		-bd 1 \
		-elementborderwidth 1 \
		-orient vertical \
		-command "$fpath.txt yview"

	if {$titlewin != "" } {
		#REND LE CONTENANT PLUS VIEUX !!
		lower $fpath $titlewin
		grid $titlewin -in $fpath -row 0 -column 0 -columnspan 2 -sticky ew
	}
	grid $fpath.sb -in $fpath -row 1 -column 0 -sticky ns
	grid $fpath.txt -in $fpath -row 1 -column 1 -sticky nsew 

	grid rowconfigure $fpath 0 -weight 0 
	grid rowconfigure $fpath 1 -weight 1
	grid columnconfigure $fpath 0 -weight 0
	grid columnconfigure $fpath 1 -weight 1

	set ww [expr [winfo reqwidth $fpath.sb] + [winfo reqwidth $fpath.txt]]
	set hh [winfo reqheight $fpath.txt]
	if { $titlewin != "" } {
		set hh [expr $hh + [winfo reqheight $titlewin]]
	}
	$fpath configure -width $ww -height $hh 
#puts "minitext :  $ww x $hh"

	#LE TEXTE DOIT REFLETER LA VARIABLE
	set vv [format "%s(%s)" $vartab $varfield]
	set cc "MiniTextUpdateTrace $fpath.txt"
	trace variable $vv w $cc

	#FORCE UNE PREMIERE MISE A JOUR
	array set $vartab [list $varfield [lindex [array get $vartab $varfield] 1]]

	#LA VARIABLE DOIT CONTENIR LE TEXTE
	bind $fpath.txt <KeyRelease> \
		"+MiniTextUpdateVar $fpath.txt $vartab $varfield"
}
proc MiniTextUpdateTrace { textpath vartab varfield op } {
	global $vartab
	$textpath delete 0.0 end
	$textpath insert end [lindex [array get $vartab $varfield] 1]
}
proc MiniTextUpdateVar { textpath vartab varfield } {
	global $vartab

	#SUPPRIME LA TRACE !
	set vv [format "%s(%s)" $vartab $varfield]
	set cc "MiniTextUpdateTrace $textpath"
	trace vdelete $vv w $cc

	array set $vartab [list $varfield [$textpath get 0.0 end]]

	#REMET LA TRACE ...
	trace variable $vv w $cc
}
proc ForgetPaned { pan win } {
	if { [winfo exists $pan ] } {
		pane forget $pan $win
	}
}
proc ForgetAllPaned { pan } {
	pane forget $pan
}
proc PutInPane { win pan } {

	pane $win -parent $pan -orient vertical -dynamic 

	#==LA DESTRUCTION N'EST PAS PRISE EN COMPTE DANS PANE !
	bind $win <Destroy> "ForgetPaned $pan $win"
	bind $pan <Destroy> "ForgetAllPaned $pan"

	#MAX DES LARGEUR
	set ww [$pan cget -width]
#puts "width = $ww"
	set nww [winfo reqwidth $win]
#puts "reqwidth = $nww"
	if { $nww > $ww } { set ww $nww }
#puts $ww

	#SOMME DES HAUTEURS
	set hh [expr [$pan cget -height] + [winfo reqheight $win]]
#puts "height = $hh"
	$pan configure -width $ww -height $hh
} 
# retourne le couple ww hh de dimension
# minimale pour satisfaire la demande des
# widgets packe dans $frame.
# !! ne marche que s'ils sont tous packes
# orizontallement (orient = ns)
# ou verticallement (orient = ew)

proc SetReqSize { frame orient } {
   set sumres 0
   set maxres 0
   if { $orient == "ns" } {
      set sumopt "reqheight"
      set maxopt "reqwidth"
   } else {
      set sumopt "reqwidth"
      set maxopt "reqheight"
   }
   foreach slave [pack slaves $frame] {
      incr sumres [winfo $sumopt $slave]
      set x [winfo $maxopt $slave]
      if { $x > $maxres } { set maxres $x }
   }
   if { $orient == "ns" } {
		$frame configure -width $maxres -height $sumres 
      return [list $maxres $sumres]
   } else {
		$frame configure -width $sumres -height $maxres 
      return [list $sumres $maxres]
   }
}
