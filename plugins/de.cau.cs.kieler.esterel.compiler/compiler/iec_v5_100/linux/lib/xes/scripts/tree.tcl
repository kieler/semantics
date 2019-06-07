xesDebug TREE IN

proc __tag_width tag {
    global MT_Module
    set bbox [$MT_Module(canvas:hidden) bbox $tag]
    return   [expr [lindex $bbox 2] - [lindex $bbox 0] ]
}

# Tree font redefinition : borrowed from  Xavier's code 
proc MT_SetFont { size } {
    global MT_Module font
    set w  $MT_Module(toplevel)
    set fn $font(source,$size)
    set font(tree) $size
    set MT_Module(tree:font) $fn

    # Configure all buttons
    $w.t.ok configure -font $fn
    $w.t.m  configure -font $fn
    $w.t.f  configure -font $fn

    catch {
	$MT_Module(tree:levels).label configure -font $fn
	for {set depth 0} {$depth < $MT_Module(max_depth)} {incr depth} {
	    $MT_Module(tree:levels).b$depth  configure -font $fn
	}
    }

    # Some font dependant constants redefinition
    set bbox [$MT_Module(canvas:hidden) bbox \
		  [$MT_Module(canvas:hidden) create text -20 -20 \
		       -text "M" -font $MT_Module(tree:font)]]
    $MT_Module(canvas:hidden) delete all

    # x and y additionnal offsets
    set MT_Module(canvas:x_offset) 5
    set MT_Module(canvas:y_offset) 5
    # x indentation level from text example
    set MT_Module(canvas:delta_x) \
	[expr [lindex $bbox 2] - [lindex $bbox 0] + 1]
    # y indentation level from text example
    set MT_Module(canvas:delta_y) \
	[expr [lindex $bbox 3] - [lindex $bbox 1] + 1]
    # length of horizontal connection line 
    set MT_Module(canvas:h_line) 25

    # Change y scroll increment of both canvases
    $MT_Module(canvas:visible) configure \
	-yscrollincrement $MT_Module(canvas:delta_y)
    $MT_Module(canvas:hidden) configure \
	-yscrollincrement $MT_Module(canvas:delta_y)

    set MT_Module(button:box)  $MT_Module(button:box,$size) 
    set MT_Module(button:plus) $MT_Module(button:plus,$size)
    set MT_Module(button:minus) $MT_Module(button:minus,$size)

    # Resize tree
    global numberofinstances
    set MT_Module(width)  \
	[ expr ( $MT_Module(max_len) * $MT_Module(canvas:delta_x) ) + \
	       ( $MT_Module(max_depth) * $MT_Module(canvas:x_offset) )  ]
    set MT_Module(height) \
	[ expr ( $numberofinstances ) * $MT_Module(canvas:delta_y) ]


    if { [$MT_Module(canvas:visible) cget -width] > $MT_Module(width) } {
	$MT_Module(canvas:visible) configure -width $MT_Module(width) 
    }

    if { [$MT_Module(canvas:visible) cget -height] > $MT_Module(height) } {
	$MT_Module(canvas:visible) configure -height $MT_Module(height) 
    }

    if { [$MT_Module(canvas:hidden) cget -width] > $MT_Module(width) } {
	$MT_Module(canvas:hidden) configure -width $MT_Module(width) 
    }

    if { [$MT_Module(canvas:hidden) cget -height] > $MT_Module(height) } {
	$MT_Module(canvas:hidden) configure -height $MT_Module(height) 
    }

    # Redraw tree
    MT_DrawTree
}

xesDebug # global definitions
# global definitions
#-------------------
global MT_Module
set MT_Module(toplevel) .xestree

set MT_Module(tree:background) white

#set MT_Module(tree:font) [list "MS Sans Serif" 8]

#global font
#set MT_Module(tree:font) $font(panel,small)

xesDebug image create

# Create "+" and "-" bitmaps for each fontsize
set MT_Module(button:box,tiny) 4
set MT_Module(button:plus,tiny) [image create bitmap -foreground grey -data {
\#define plus_width 5
\#define plus_height 5
static unsigned char plus_bits[] = {
   0x04, 0x04, 0x1f, 0x04, 0x04};
}]

set MT_Module(button:box,small) 5
set MT_Module(button:plus,small) [image create bitmap -foreground grey -data {
\#define plus_width 7
\#define plus_height 7
static unsigned char plus_bits[] = {
   0x08, 0x08, 0x08, 0x7f, 0x08, 0x08, 0x08};
}]

set MT_Module(button:box,medium) 6
set MT_Module(button:plus,medium) [image create bitmap -foreground grey -data {
\#define plus_width 9
\#define plus_height 9
static unsigned char plus_bits[] = {
0x10,    0x00, 0x10,    0x00, 0x10,    0x00, 0x10,    0x00,
0xff,    0x01, 0x10,    0x00, 0x10,    0x00, 0x10,    0x00,
0x10,    0x00
};
}]

set MT_Module(button:box,big) 7
set MT_Module(button:plus,big) [image create bitmap -foreground grey -data {
\#define plus_width 11
\#define plus_height 11
static unsigned char plus_bits[] = {
0x70,   0x00,
0x70,    0x00,
0x70,    0x00,
0x70,     0x00,
0xff,   0x07,
0xff,    0x07,
0xff,     0x07,
0x70,   0x00,
0x70,    0x00,
0x70,    0x00,
0x70    0x00,
};
}]

set MT_Module(button:box,huge) 8
set MT_Module(button:plus,huge) [image create bitmap -foreground grey -data {
\#define plus_width 13
\#define plus_height 13
static unsigned char plus_bits[] = {
0xe0,   0x00,
0xe0,    0x00,
0xe0,    0x00,
0xe0,    0x00,
0xe0,     0x00,
0xff,   0x1f,
0xff,    0x1f,
0xff,    0x1f,
0xe0,   0x00,
0xe0,    0x00,
0xe0,    0x00,
0xe0,    0x00,
0xe0,    0x00
};
}]

set MT_Module(button:minus,tiny) [image create bitmap -foreground grey -data {
\#define minus_width 5
\#define minus_height 5
static unsigned char minus_bits[] = {
   0x00, 0x00, 0x1f, 0x00, 0x00};
}]
set MT_Module(button:minus,small) [image create bitmap -foreground grey -data {
\#define minus_width 7
\#define minus_height 7
static unsigned char minus_bits[] = {
   0x00, 0x00,0x00, 0x7f, 0x00,0x00, 0x00};
}]
set MT_Module(button:minus,medium) [image create bitmap -foreground grey -data {
\#define minus_width 9
\#define minus_height 9
static unsigned char minus_bits[] = {
   0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
0xff,    0x01,
   0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
}]
set MT_Module(button:minus,big) [image create bitmap -foreground grey -data {
\#define minus_width 11
\#define minus_height 11
static unsigned char minus_bits[] = {
   0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 
0xff,   0x07,
0xff,    0x07,
0xff,      0x07,
   0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
}]
set MT_Module(button:minus,huge) [image create bitmap -foreground grey -data {
\#define minus_width 13
\#define minus_height 13
static unsigned char minus_bits[] = {
   0x00, 0x00, 0x00, 0x00, 0x00, 0x00,0x00,0x00,0x00,0x00,
0xff,   0x1f,
0xff,    0x1f,
0xff,    0x1f,
   0x00, 0x00, 0x00, 0x00, 0x00, 0x00,0x00,0x00,0x00,0x00};
}]


set MT_Module(button:box)  $MT_Module(button:box,$fontsize) 
set MT_Module(button:plus) $MT_Module(button:plus,$fontsize)
set MT_Module(button:minus) $MT_Module(button:minus,$fontsize)

set MT_Module(module)          -1
set MT_Module(tree:draw_to_depth) -1
#====================================================
# Edit MT_DrawEntry and MT_EntryConfigure procedures
# to modify an entry.
#====================================================

#----------------------------------------------------------------------
# NAME
#    MT_DrawEntry - Draw a new leaf
#
# SYNOPSIS
#    MT_DrawEntry index x y
#
# DESCRIPTION
#    index: entry index
#    x    : x position
#    y    : y position
#    
#    Draw entry index at position (x,y). If entry has child, draw a box 
#    containing a "+" if the entry should be fold else "-". This is
#    defined by the MT_Module($index:unfold) and $MT_Module($index,sub) 
#    variables. The sign is bind with the MT_FoldUnfoldEntry function on <1>.
#    A rectangle is drawn behind the entry name to handle background colors.
#    
#
# SIDE EFFECTS
#    Define tags:
#       $index:name   : refer to the entry name
#       $index:bg     : refer to a rectangle of the the bounding box of 
#                       the name
#
# RETURN
#    
#
# SEE ALSO
#    MT_EntryConfigure, MT_FoldUnfoldEntry
#
#----------------------------------------------------------------------
xesDebug MT_DrawEntry 
proc MT_DrawEntry {index x y} {
    global MT_Module font

    if { $MT_Module($index:sub) != "" } {
	# Module has sons

	# fold/unfold button
 	if { $MT_Module($index:unfold) } {
 	    set button $MT_Module(button:minus)
 	} else {
 	    set button $MT_Module(button:plus)
 	}
 	$MT_Module(canvas:hidden) create image $x $y \
 	    -image $button  \
 	    -tags $index:button \

	
	# 4 is button_size/2 + 2
	set four $MT_Module(button:box)
	set box [$MT_Module(canvas:hidden) create rectangle \
		     [expr $x - $four] [expr $y - $four] \
		     [expr $x + $four] [expr $y + $four] \
		     -outline grey \
		     -fill [$MT_Module(canvas:hidden) cget -background]]
	$MT_Module(canvas:hidden) lower $box

 	$MT_Module(canvas:hidden) bind $index:button <1> \
 	    "MT_FoldUnfoldEntry $index"

	$MT_Module(canvas:hidden) create line \
	    [expr $x + $four] $y [incr x $MT_Module(canvas:h_line)] $y \
	    -fill grey
	
	
    } else {
	# no sons
	$MT_Module(canvas:hidden) create line \
	    $x $y [incr x $MT_Module(canvas:h_line)] $y \
	    -fill grey
    }

    incr x $MT_Module(canvas:x_offset)

    # text tag: lbkp 
    # First, insert a space character for local breakpoints
    set text " "
    set tag  $index:lbkp
    $MT_Module(canvas:hidden) create text \
	$x $y -text $text -anchor w -tags $tag:fg \
	-font $MT_Module(tree:font)
    eval $MT_Module(canvas:hidden) create rectangle \
	[$MT_Module(canvas:hidden) bbox $tag:fg] \
	-tags $tag:bg
    $MT_Module(canvas:hidden) itemconfigure $tag:bg -outline {} 
    incr x [ __tag_width $tag:bg ]

    # text tag: name 
    # Insert actual name of the module
    set text $MT_Module($index:name) 
    set tag  $index:name
    $MT_Module(canvas:hidden) create text \
	$x $y -text $text -anchor w -tags $tag:fg \
	-font $MT_Module(tree:font)
    eval $MT_Module(canvas:hidden) create rectangle \
	[$MT_Module(canvas:hidden) bbox $tag:fg] \
	-tags $tag:bg
    $MT_Module(canvas:hidden) itemconfigure $tag:bg -outline {} 
    incr x [ __tag_width $tag:bg ]

    # text tag: rbkp 
    # Insert a space character for downstream breakpoints
    set text " "
    set tag  $index:rbkp
    $MT_Module(canvas:hidden) create text \
	$x $y -text $text -anchor w -tags $tag:fg \
	-font $MT_Module(tree:font)
    eval $MT_Module(canvas:hidden) create rectangle \
	[$MT_Module(canvas:hidden) bbox $tag:fg] \
	-tags $tag:bg
    $MT_Module(canvas:hidden) itemconfigure $tag:bg -outline {} 
    incr x [ __tag_width $tag:bg ]

    # text tag: index
    # Insert the #num of the module instance
    set text "\#$index"
    set tag  $index:index
    $MT_Module(canvas:hidden) create text \
	$x $y -text $text -anchor w -tags $tag:fg \
	-font $MT_Module(tree:font)
    eval $MT_Module(canvas:hidden) create rectangle \
	[$MT_Module(canvas:hidden) bbox $tag:fg] \
	-tags $tag:bg
    $MT_Module(canvas:hidden) itemconfigure $tag:bg -outline {} 
    incr x [ __tag_width $tag:bg ]


    # Binding: raise module instance
    $MT_Module(canvas:hidden) bind $index:lbkp:fg  <Button-1> \
	    "raiseinstance $index"
    $MT_Module(canvas:hidden) bind $index:name:fg  <Button-1> \
	    "raiseinstance $index"
    $MT_Module(canvas:hidden) bind $index:rbkp:fg  <Button-1> \
	    "raiseinstance $index"
    $MT_Module(canvas:hidden) bind $index:index:fg <Button-1> \
	    "raiseinstance $index"

    $MT_Module(canvas:hidden) lower $index:lbkp:bg
    $MT_Module(canvas:hidden) lower $index:name:bg
    $MT_Module(canvas:hidden) lower $index:rbkp:bg
    $MT_Module(canvas:hidden) lower $index:index:bg

}


#----------------------------------------------------------------------
# NAME
#    MT_EntryConfigure - Configure a tree entry 
#
# SYNOPSIS
#    MT_EntryConfigure index args
#
# DESCRIPTION
#    index: entry index
#    args : list of arguments
#    
#    Use to modify entry aspect of entry of index index. Available
#    arguments are:
#    -foreground <color> : entry name color.
#    -background <color> : entry name background color. An empty color
#                          value resets the background color.
#    -outline <color>    : defines a color for the entry name frame. An 
#			  empty color resets the outline color.
#
# SIDE EFFECTS
#    
#
# RETURN
#    
#
# SEE ALSO
#    MT_DrawEntry
#
#----------------------------------------------------------------------
xesDebug MT_EntryConfigure 
proc MT_EntryConfigure {index option {value {}} } {
    global MT_Module color

#xesDebug MT_EntryConfigure $index $option $value
    switch -- $option {
	-resetbg {
	    set value $MT_Module(tree:background)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:lbkp:bg  -fill $value
	    $MT_Module(canvas:visible) itemconfigure \
		$index:name:bg  -fill $value
	    set MT_Module($index:name:lastbg) $value
	    $MT_Module(canvas:visible) itemconfigure \
		$index:rbkp:bg  -fill $value
	    $MT_Module(canvas:visible) itemconfigure \
		$index:index:bg  -fill $value
	    set MT_Module($index:index:lastbg) $value
	}
	-isactive {
	    set value $color(inst,active)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:name:fg  -fill $value
	    $MT_Module(canvas:visible) itemconfigure \
		$index:index:fg  -fill $value
	}
	-isinactive {
	    set value $color(inst,inactive)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:name:fg  -fill $value
	    $MT_Module(canvas:visible) itemconfigure \
		$index:index:fg  -fill $value
	}
	-hasbreak {
	    set value $color(inst,broken)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:lbkp:bg  -fill $value
	}
	-hasheritedbreak {
	    set value $color(inst,broken)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:rbkp:bg  -fill $value
	}
	-isbroken {
	    set value $color(inst,broken)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:name:bg  -fill $value
	    set MT_Module($index:name:lastbg) $value
	}
	-isheritedbroken {
	    set value $color(inst,broken)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:index:bg  -fill $value
	    set MT_Module($index:index:lastbg) $value
	}
	-hasknownnets {
	    set value $color(net,1)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:name:bg  -fill $value
	    set MT_Module($index:name:lastbg) $value
	}
	-hasunknownnets {
	    set value $color(net,unknown)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:name:bg  -fill $value
	    set MT_Module($index:name:lastbg) $value
	}
	-hasheritedknownnets {
	    set value $color(net,1)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:index:bg  -fill $value
	    set MT_Module($index:index:lastbg) $value
	}
	-hasheritedunknownnets {
	    set value $color(net,unknown)
	    $MT_Module(canvas:visible) itemconfigure \
		$index:index:bg  -fill $value
	    set MT_Module($index:index:lastbg) $value
	}
	-sigflag {
	    if { $value == "on" } {
		$MT_Module(canvas:visible) itemconfigure \
		    $index:name:bg  -fill $color(sigbrowse,on)
	    } else {
		$MT_Module(canvas:visible) itemconfigure \
		    $index:name:bg  -fill $MT_Module($index:name:lastbg)
	    }
	}
	-heritedsigflag {
	    if { $value == "on" } {
		$MT_Module(canvas:visible) itemconfigure \
		    $index:index:bg  -fill $color(sigbrowse,on)
	    } else {
		$MT_Module(canvas:visible) itemconfigure \
		    $index:index:bg  -fill $MT_Module($index:index:lastbg)
	    }
	}
	default {
	    trace_or_error_message "MT_EntryConfigure: bad option  $option"
	}
    }
}



#----------------------------------------------------------------------
# NAME
#    MT_Build - build the tree window
#
# SYNOPSIS
#    MT_Build index
#
# DESCRIPTION
#    index: root module index
#
#    if tree already exists, show it if it correspond to current
#    module, else rebuild it
#    
#
# SIDE EFFECTS
#    Affects a lot of global MT_Module(...) entries
#
# RETURN
#    
#
# SEE ALSO
#    
#
#----------------------------------------------------------------------
proc MT_Build {module} {
    global MT_Module

    if {[winfo exist $MT_Module(toplevel)]} {
	if {$MT_Module(module) == $module} {
	    # same module
	    wm deiconify $MT_Module(toplevel)
	    raise $MT_Module(toplevel)
	    # fixing geometry. 
	    tkwait visibility $MT_Module(toplevel)
	    pack propagate $MT_Module(toplevel) false

	    return
	} else {
	    # build from a new module : first remove anyrhing
	    # save top module
	    set top $MT_Module(toplevel)
	    # destroy entire array
	    unset MT_Module
	    destroy $top
	    set MT_Module(toplevel) $top
	    set MT_Module(module) -1
	}
    }

    if {[catch {MT_InitializeModuleTree $module} error]} {
	set MT_Module(module) -1
	error $error
    }

    set w $MT_Module(toplevel)
    otherwin $w
    wm title $MT_Module(toplevel) "Esterel program tree"
    # useless to recall tree in tree ....
    destroy $MT_Module(toplevel).t.w

    # Font
    pack [menubutton $w.t.f  -menu $w.t.f.menu  -padx 2m\
	      -text Font]   -side {right}
    menu $w.t.f.menu -tearoff 0
    global font fontsize fontlist
    foreach size $fontlist {
	$w.t.f.menu add radio  -label $size -variable font(tree) \
	    -command "MT_SetFont $size"
    }

    set MT_Module(tree:frame) $MT_Module(toplevel).f.tree
    set MT_Module(tree:levels) $MT_Module(toplevel).f.level
    # the Tree
    pack [frame $MT_Module(tree:frame)] -expand 1 -fill both

    # scrollbars
    set MT_Module(canvas:v_scroll) $MT_Module(tree:frame).v_scroll
    set MT_Module(canvas:h_scroll) $MT_Module(tree:frame).h_scroll
    scrollbar $MT_Module(canvas:v_scroll) -orient vertical
    scrollbar $MT_Module(canvas:h_scroll) -orient horizontal

    # 2 canvases, for double buffering
    canvas $MT_Module(tree:frame).c1 \
	-xscrollincrement 1 \
	-yscrollincrement 1
    canvas $MT_Module(tree:frame).c2 \
	-xscrollincrement 1 \
	-yscrollincrement 1

    grid $MT_Module(tree:frame).c1 -row 0 -column 0 -sticky nswe
    grid $MT_Module(tree:frame).c2 -row 0 -column 0 -sticky nswe
    grid $MT_Module(canvas:v_scroll) -row 0 -column 1 -sticky ns
    grid $MT_Module(canvas:h_scroll) -row 1 -sticky we

    # to allow expansion
    grid columnconfigure $MT_Module(tree:frame) 0 -weight 1
    grid rowconfigure $MT_Module(tree:frame) 0 -weight 1

    
    $MT_Module(tree:frame).c1 configure -background $MT_Module(tree:background)
    $MT_Module(tree:frame).c2 configure -background $MT_Module(tree:background)

    $MT_Module(button:minus) configure -background $MT_Module(tree:background)
    $MT_Module(button:plus) configure -background $MT_Module(tree:background)

    # define visible and hidden 
    set MT_Module(canvas:visible) $MT_Module(tree:frame).c1
    set MT_Module(canvas:hidden)  $MT_Module(tree:frame).c2


    raise $MT_Module(canvas:visible)

    if {$MT_Module(max_depth)} {
	# max_depth == 0 means only one module.
	incr MT_Module(max_depth)
	frame $MT_Module(tree:levels)
	pack [label $MT_Module(tree:levels).label -text {Level:}] -side left
	pack $MT_Module(tree:levels) -before $MT_Module(tree:frame) \
	    -anchor w
	for {set depth 0} {$depth < $MT_Module(max_depth)} {incr depth} {
	    set button [button $MT_Module(tree:levels).b$depth]
	    $button configure \
		-padx 0 \
		-pady 0 \
		-highlightthickness 0 \
		-text [expr $depth + 1] \
		-command "MT_UnfoldToDepth $depth"
	    pack $button -side left
	}
    }

    global fontsize
    MT_SetFont  $fontsize
    XesHook XesTreeLastWishes
}

#----------------------------------------------------------------------
# NAME
#    MT_RaiseCanvas - Update drawing
#
# SYNOPSIS
#    MT_RaiseCanvas
#
# DESCRIPTION
#    Make canvas:hidden visible.
#
# SIDE EFFECTS
#    Exchange canvas:hidden and canvas:visible. Update view and
#    scrollbars. 
#
# RETURN
#    
#
# SEE ALSO
#    
#
#----------------------------------------------------------------------
proc MT_RaiseCanvas {} {
    global MT_Module
    
    set visible_bbox [$MT_Module(canvas:visible) bbox all]
    set hidden_bbox  [$MT_Module(canvas:hidden)  bbox all]

#puts stderr "visible_bbox $visible_bbox "
#puts stderr "hidden_bbox $hidden_bbox "


    if { $visible_bbox == ""} {
	set visible_bbox $hidden_bbox
    }
    set visible_height \
	[expr  [lindex $visible_bbox 3] - [lindex $visible_bbox 1] ]
    set hidden_height  \
	[expr  [lindex $hidden_bbox  3] - [lindex $hidden_bbox  1] ]
    
#puts stderr "visible_height $visible_height"
#puts stderr "hidden_height $hidden_height"

    $MT_Module(canvas:hidden)  configure  -scrollregion  $hidden_bbox
    $MT_Module(canvas:visible) configure  -scrollregion  $visible_bbox

    set visible_yview  [$MT_Module(canvas:visible) yview]
    set hidden_yview   [$MT_Module(canvas:hidden) yview]
#puts stderr "visible_yview $visible_yview "
    # possible off-screen to the top.
    set visible_off_screen [lindex $visible_yview 0]
#puts stderr "visible_off_screen $visible_off_screen "
    # xh invariant
    set xh [expr  $visible_off_screen * $visible_height ]
#puts stderr "xh $xh "

    # Height of visible window
    set w [winfo height $MT_Module(canvas:visible)]
#puts stderr "w $w "

    # (x,y) candidate pair for next yview result 
    set x [expr  $xh / $hidden_height ]
#puts stderr "x $x "
    set y [expr  $w / ( (1 - $x) * $hidden_height)]
#puts stderr "y $y "

    # y must be < 1  otherwise modify hidden_bbox and update x
    if { $y > 1.0 } {
	set newh [expr round($xh + $w) ]
	set hidden_bbox [lreplace $hidden_bbox 3 3 \
			     [expr $newh  + [lindex $hidden_bbox 1]]]
	

	set x [expr $xh / $newh ]
#puts stderr "Y>1 xh $xh newh $newh x $x"
	# Write empty char at end of text (for next call to be correct)
	$MT_Module(canvas:hidden) create text \
	    [expr [lindex $hidden_bbox 2] - 2 ] \
	    [expr [lindex $hidden_bbox 3] - 2 ] 
    } else {
#puts stderr "Y<1 xh $xh hidden_height $hidden_height x $x"
    }
    set last_yview $x

    # width
    set visible_width [expr  [lindex $visible_bbox 2] \
			    - [lindex $visible_bbox 0] ]
    set hidden_width [expr  [lindex $hidden_bbox 2] \
			    - [lindex $hidden_bbox 0] ]

    set last_xview  [expr \
			 [lindex [$MT_Module(canvas:visible) xview] 0] \
			 * $visible_width / $hidden_width ]


    # change scrollcommand of canvases
    $MT_Module(canvas:visible) configure \
	-xscrollcommand {} \
	-yscrollcommand {}

    $MT_Module(canvas:hidden) configure \
	-xscrollcommand "$MT_Module(canvas:h_scroll) set" \
	-yscrollcommand "$MT_Module(canvas:v_scroll) set" 

    
    # Fix new visible canvas view according old visible view
#    $MT_Module(canvas:hidden) yview moveto $last_yview
#    $MT_Module(canvas:hidden) xview moveto $last_xview

    # switch visible <-> hidden
    set visible $MT_Module(canvas:hidden)
    set MT_Module(canvas:hidden) $MT_Module(canvas:visible)
    set MT_Module(canvas:visible) $visible
    $MT_Module(canvas:visible) configure \
	-xscrollcommand "$MT_Module(canvas:h_scroll) set" \
	-yscrollcommand "$MT_Module(canvas:v_scroll) set" 
    set visible_bbox [$MT_Module(canvas:visible) bbox all]
    $MT_Module(canvas:visible) configure  -scrollregion  $visible_bbox


    # change command of scrollbars
    $MT_Module(canvas:v_scroll) configure \
	-command "$MT_Module(canvas:visible) yview"
    $MT_Module(canvas:h_scroll) configure \
	-command "$MT_Module(canvas:visible) xview"

    raise $visible
#    $MT_Module(canvas:visible) yview moveto $last_yview
#    $MT_Module(canvas:visible) xview moveto $last_xview
}




#----------------------------------------------------------------------
# NAME
#    MT_FoldUnfoldEntry - Fold/Unfold tree entry
#
# SYNOPSIS
#    MT_FoldUnfoldEntry index
#
# DESCRIPTION
#    index: entry index
#    
#    Show /hide the children of entry of index index, according to
#    state variable MT_Module($index:unfold)
#
# SIDE EFFECTS
#    Modify MT_Module($index:unfold)
#    Redraw the tree.
#
# RETURN
#    
#
# SEE ALSO
#    
#
#----------------------------------------------------------------------
proc MT_FoldUnfoldEntry {index} {
    global MT_Module
    if { $MT_Module($index:unfold) } {
	set MT_Module($index:unfold) 0
    } else {
	set MT_Module($index:unfold) 1
    }
    MT_DrawTree
}


#----------------------------------------------------------------------
# NAME
#    MT_DrawTree - recursively draws module tree
#
# SYNOPSIS
#    MT_DrawTree [index]
#
# DESCRIPTION
#    index: entry index
#    
#    Draws tree from instance of index INDEX. if INDEX == -1, then
#    starts from root intance index.
#
# SIDE EFFECTS
#
# RETURN
#    
#
# SEE ALSO
#    
#
#----------------------------------------------------------------------
proc MT_DrawTree { {root -1} } {
    global MT_Module
    set first_call 0

    if { $root == -1 } {
	# Start call. Reset hidden canvas.
	$MT_Module(canvas:hidden) delete all
	set root $MT_Module(root)
	# used to compute x, y positions
	set MT_Module(canvas:dx) 0
	set MT_Module(canvas:dy) 0
	set MT_Module(tree:current_depth) 0
	set first_call 1
    }


    # Draw entry
    set x [expr $MT_Module(canvas:delta_x)*$MT_Module(canvas:dx) \
	       + $MT_Module(canvas:x_offset)] 
    set y [expr $MT_Module(canvas:delta_y)*$MT_Module(canvas:dy) \
	       + $MT_Module(canvas:y_offset)]

    # forced (un)folding
    if {$MT_Module(tree:draw_to_depth) != -1} {
	if { $MT_Module(tree:current_depth) == $MT_Module(tree:draw_to_depth) } {
	    # stop at that depth
	    set MT_Module($root:unfold) 0
	} else {
	    # possibly gone
	    set MT_Module($root:unfold) 1
	}
    }

    MT_DrawEntry $root $x $y

    # if entry has children and should be unfold, then
    # draw children
    # note that if stop, MT_Module($root:unfold) == 0
    if { $MT_Module($root:unfold) && $MT_Module($root:sub) != "" } {
	incr MT_Module(tree:current_depth)
	incr MT_Module(canvas:dx)
	foreach son $MT_Module($root:sub) {
	    incr MT_Module(canvas:dy)
	    set last_y $MT_Module(canvas:dy)
	    MT_DrawTree $son
	}

	# Draw a global link between
	incr x $MT_Module(canvas:delta_x)
	set link [$MT_Module(canvas:hidden) create line \
		      $x $y $x \
		      [expr $MT_Module(canvas:delta_y)*$last_y \
			   + $MT_Module(canvas:y_offset)] \
		      -fill grey]
	$MT_Module(canvas:hidden) lower $link
	    
	incr MT_Module(canvas:dx) -1
	incr MT_Module(tree:current_depth) -1
    }


    if { $first_call } {
	MT_RaiseCanvas
	
	updatetree
    }
}


#----------------------------------------------------------------------
# NAME
#    MT_UnfoldToDepth - unfold modules
#
# SYNOPSIS
#    MT_UnfoldToDepth depth
#
# DESCRIPTION
#    depth: module depth
#    
#    Force the unfolding of the hierarchy upto modules of depth $depth
#
# SIDE EFFECTS
#    
#
# RETURN
#    
#
# SEE ALSO
#    
#
#----------------------------------------------------------------------
proc MT_UnfoldToDepth {depth} {
    global MT_Module
    set MT_Module(tree:draw_to_depth) $depth
    MT_DrawTree
    set MT_Module(tree:draw_to_depth) -1
}



#========================================================
#========================================================

# Patches between module tree and xes code.
proc MT_InitializeModuleTree {module} {
    global no_source
#    if $no_source return
    tree $module
}

proc showtree { {aspect folded} } {
    global no_source
#    if $no_source return

    global MT_Module
    if {[winfo exist $MT_Module(toplevel)]} {
	wm deiconify $MT_Module(toplevel)
	raise $MT_Module(toplevel)
    } else {
	if {[catch {MT_Build 0} err]} {
	    xesDebug $err
	}
    }
    if { $aspect == "unfolded" }  {
	MT_UnfoldToDepth $MT_Module(max_depth)
    }
    updatetree
}

#
# Sensible function: updatetree
# Precedence in increasing order:
#  active/inactive
#  nets
#  breakpoints reached
#  signal browsing

proc updatetree {} {
    # Reset backgrounds
    global numberofinstances
    for {set inst 0} { $inst < $numberofinstances } { incr inst }   {
	MT_EntryConfigure $inst -resetbg
    }
    # Set active/inactive foregrounds
    foreach inst [activeinstances] {
	MT_EntryConfigure $inst -isactive
    }
    foreach inst [inactiveinstances] {
	MT_EntryConfigure $inst -isinactive
    }
    # Nets
    updatetreenets 

    # Set breakpoints backgrounds
    foreach inst [havebreakinstances] {
	MT_EntryConfigure $inst -hasbreak
    }
    foreach inst [haveheritedbreakinstances] {
	MT_EntryConfigure $inst -hasheritedbreak
    }
    foreach inst [areheritedbrokeninstances] {
	MT_EntryConfigure $inst -isheritedbroken
    }
    foreach inst [brokeninstances] {
	MT_EntryConfigure $inst -isbroken
    }

    update
}


proc updatetreenets {} {
    global no_source last_preference
    if $no_source return
    global color

    case $last_preference {
	"greenonly" {
	    foreach inst [greeninstances] {
		MT_EntryConfigure $inst -hasknownnets
	    }
	    foreach inst [heritedgreeninstances] {
		MT_EntryConfigure $inst -hasheritedknownnets
	    }
	}
	"pinkonly" {
	    foreach inst [pinkinstances] {
		MT_EntryConfigure $inst -hasunknownnets
	    }
	    foreach inst [heritedpinkinstances] {
		MT_EntryConfigure $inst -hasheritedunknownnets
	    }
	}
	"greenandpink" {
	    foreach inst [greeninstances] {
		MT_EntryConfigure $inst -hasknownnets

	    }
	    foreach inst [heritedgreeninstances] {
		MT_EntryConfigure $inst -hasheritedknownnets
	    }

	    foreach inst [pinkinstances] {
		MT_EntryConfigure $inst -hasunknownnets
	    }
	    foreach inst [heritedpinkinstances] {
		MT_EntryConfigure $inst -hasheritedunknownnets
	    }
	}
	"pinkandgreen " {
	    foreach inst [pinkinstances] {
		MT_EntryConfigure $inst -hasunknownnets
	    }
	    foreach inst [heritedpinkinstances] {
		MT_EntryConfigure $inst -hasheritedunknownnets
	    }
	    foreach inst [greeninstances] {
		MT_EntryConfigure $inst -hasknownnets

	    }
	    foreach inst [heritedgreeninstances] {
		MT_EntryConfigure $inst -hasheritedknownnets
	    }
	}
    }
}

proc setbrowsetree { color } {
    global MT_Module
    foreach inst [flaggedinstances] {
	MT_EntryConfigure $inst -sigflag on
    }
    foreach inst [heritedflaggedinstances] {
	MT_EntryConfigure $inst -heritedsigflag on
    }
}


proc resetbrowsetree {  } {
    global MT_Module  
    foreach inst [flaggedinstances] {
  	MT_EntryConfigure $inst -sigflag off
    } 
    foreach inst [heritedflaggedinstances] {
  	MT_EntryConfigure $inst -heritedsigflag off
    } 
}

### Local Variables: 
### tcl-application: "wish8.0"
### End: 
