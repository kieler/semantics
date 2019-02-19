# xes loader
set d [file dirname [info script]]
foreach f {
manual.tcl utils.tcl xes_res.tcl resources.tcl init.tcl browser.tcl fileview.tcl scrollist.tcl xspanels.tcl tree.tcl help.tcl client.tcl tape_strl.tcl tape.tcl events.tcl session.tcl timer.tcl connect.tcl xsmain.tcl
} {
    if {[catch {source [file join $d $f]} err]} {
	  set win [xesDebug "$f:$err"]
	  if { $win == "" } {
	      error "$f:$err"
	  } else {
	      tkwait window .debug_win
	      exit 1
	  }
    }
}
