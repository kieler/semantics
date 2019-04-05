#xesDebug SIGNAL BROWSER
set currentFlaggedSignum {}
set browsecolor1 orange
set browsecolor2 $DEFAULTBACKGROUND
set browsecolor $browsecolor1
set browseperiod 500
set browsestarted 0
set signalbrowser 0

proc setbrowsesp {instnum tagcolor} {
# pleaseWait setbrowsesp
    # text window
    set text .f$instnum.f.text

    foreach topic { declarations emissions tests accesses runs } {
	set taglist  [eval instance_flagged_$topic $instnum]
	foreach index  $taglist {
	    # tag name
	    set tagname TAGbrowse$index
	    $text tag configure $tagname -background $tagcolor
	    $text tag raise $tagname

	}
    }
    global sigtable currentFlaggedSignum

    foreach signal $currentFlaggedSignum {
	catch {
	    $sigtable($signal,ilab) configure -background $tagcolor
	}
	catch {
	    $sigtable($signal,olab) configure -background $tagcolor
	}
    }
# pleaseWait
}

proc resetbrowsesp {instnum } {
# pleaseWait resetbrowsesp
    # text window
    set text .f$instnum.f.text

    foreach topic { declarations emissions tests accesses runs } {
	set taglist  [eval instance_flagged_$topic $instnum]
	foreach index  $taglist {
	    # tag name
	    set tagname TAGbrowse$index
	    $text tag lower $tagname
	}
    }
    global sigtable currentFlaggedSignum
    foreach type {ilab olab} {
	foreach signal $currentFlaggedSignum {
	    catch {
		$sigtable($signal,$type) \
		    configure -background \
		    [lindex \
			 [$sigtable($signal,$type) \
			      configure -background] \
			 3]
	    }
	}
    }
# pleaseWait 
}

proc runsignalbrowse {  } {
# pleaseWait runsignalbrowse
    global windowlist browsecolor browseperiod browsestarted 
    global  browsecolor1 browsecolor2 signalbrowser

    # Allowed to continue ?
    if { !$signalbrowser } {
	foreach inst $windowlist {
	    resetbrowsesp $inst 
	}
	resetbrowsetree 
	set  browsestarted 0
	return
    }

    if { $browsecolor == $browsecolor1 }  {
	foreach inst $windowlist {
	    setbrowsesp $inst $browsecolor
	}
	setbrowsetree $browsecolor1
	set browsecolor $browsecolor2
    } else {
	foreach inst $windowlist {
	    resetbrowsesp $inst 
	}
	resetbrowsetree 
	set browsecolor $browsecolor1
    }
    after $browseperiod  { runsignalbrowse }
# pleaseWait 
}

proc startsignalbrowse { num { index {} } } {
# pleaseWait startsignalbrowse
    global  browsestarted windowlist signalbrowser 

    # Reset current signal browsing
    foreach inst $windowlist {
	resetbrowsesp $inst 
    }
    resetbrowsetree
    signalbrowseflag

    # Allowed to continue ?
    if { !$signalbrowser } {
	set  browsestarted 0
	return
    }

    # Set new signal browsing
    if { $index == "" }  {
	signalbrowseflag $num
    } else {
	signalbrowseflag $num $index
    }

    # Do nothing more if already running
    if $browsestarted return

    # Start periodic painting
    set browsestarted 1
    runsignalbrowse
# pleaseWait 
}

proc stopsignalbrowse { } {
# pleaseWait stopsignalbrowse
    global  browsestarted
    set browsestarted 0
    signalbrowseflag
# pleaseWait 
}
