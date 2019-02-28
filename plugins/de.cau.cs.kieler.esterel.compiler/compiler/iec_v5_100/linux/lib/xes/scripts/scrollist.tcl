xesDebug SCROLLIST IN
#----------------------------------------------------------------------
# MakeListOfWidget
#
# SYNOPSIS
#    MakeListOfWidget CANVAS FRAME MAX_ITEMS [SIDE]
#
# DESCRIPTION
#    MakeListOfWidget creates a scrollable list of widgets. The main widget
#    is WIDGET and is a canvas. FRAME is must be a child of CANVAS.
#    MAX_ITEM it the maximum number of visible items in the list. The items
#    must have nearly the same height.
#    A scrollbar is added whenever the number of items if greater than MAX_ITEMS
#
#    SIDE is an optional arg that specify the place of the possible scrollbar
#    It may be "left" or "right"
#
# BUGS
#    FRAME must have been constructed before. Call to update idletasks may
#    be necessary.
# SIDE EFFECTS
#    Set the width of canvas to the width of FRAME + the scrollbar width
#    Set the height of the canvas to MAX_ITEMS*sizeof(item) or FRAME height
# RETURN
#    Returns the average height of items
#
pleaseWait "Scrollist"
proc MakeListOfWidget {canvas frame max_items {side right}} {
    if {[winfo parent $frame] != $canvas} {
	error "bad parent" "$canvas is not parent of $frame"
    }
    
    set children [llength [winfo children $frame]]

    if {$children == 0} {
	error "Missing children" "set children \[winfo children $frame\]"
    }

    set width [winfo reqwidth $frame]
    set height [winfo reqheight $frame]

    if { $side != "left" && $side != "right" } {
	error "bad side specification" "side = $side, must be left or right"
    }

xesDebug MKLIST 0
    
    if {![regexp {^[1-9][0-9]*} $max_items]} {
	error "Bad number" "max_item : $max_item is not a valid number"
    }
    set x_win 0
    # Creates the scrollbar
    set scroll $canvas.s
    if { ![winfo exists $scroll] } {
	scrollbar $scroll \
	    -orient vertical \
	    -relief raised   \
	    -command "$canvas yview"
    }
xesDebug MKLIST 1
    # Configure the canvas
    pack propagate $canvas false
    set item_height [expr $height/$children]
xesDebug MKLIST 2
    $canvas configure \
	    -scrollregion "0 0 1 $height" \
	    -yscrollincrement $item_height \
	    -yscrollcommand "$scroll set"


    # Set the width
    incr width [winfo reqwidth $scroll]
    # set the height. NB : this is the minimal height
    if {$children > $max_items} {
	set height [expr $item_height * $max_items]
    }
    # Set the window item pos
    if {$side == {left} } {
	set x_win [winfo reqwidth $scroll]
    } 
    # Set the window item
    $canvas create window $x_win 0 -window $frame -anchor nw
    
    $canvas configure -width $width -height $height
    # follow vertical resizing
    bind $canvas <Configure> \
	    "WidgetListShowScroll $canvas %h $children $item_height $side"
xesDebug MKLIST 3
    return $item_height
}

#----------------------------------------------------------------------
# WidgetListShowScroll
#
# SYNOPSIS
#    WidgetListShowScroll CANVAS REQ_HEIGHT ITEMS ITEM_HEIGHT SIDE
#
# DESCRIPTION
#    CANVAS contains a list of widget. WidgetListShowScroll uses REQ_HEIGHT
#    to determine the number of visible items. 
#    If this number if greater than or equal to ITEMS, then the scrollbar
#    CANVAS.s is removed, else it is shown at place SIDE
#
proc WidgetListShowScroll {canvas req_height items item_height side} {
    set visibles [expr $req_height/$item_height]
    if { $visibles < $items } {
	pack $canvas.s -side $side -fill y
    } else {
	pack forget $canvas.s
    }
}

#  catch "destroy .c"
#  
#  canvas .c
#  frame .c.f
#  for {set i 0} {$i<10} {incr i} {
#      pack [button .c.f.b$i -text "Bouton $i"]
#  }
#  update idletasks
#  set max 4
#  set h [MakeListOfWidget .c .c.f $max]
#  pack propagate . false
#  pack .c -side left -fill y
#  
#  
#  . configure -height [expr $max * $h]
#  update idletasks
#  # Say to window manager that the current size correspond to
#  # the following gridding:
#  #         # of pixels   # of visibles  x incr  y incr
#  wm grid . [winfo width .] $max           1       $h
#  # WARNING : in term of grid now
#  # . will be resized to show max elements.
#  wm minsize . [winfo width .] $max

xesDebug SCROLLIST OUT
pleaseWait
