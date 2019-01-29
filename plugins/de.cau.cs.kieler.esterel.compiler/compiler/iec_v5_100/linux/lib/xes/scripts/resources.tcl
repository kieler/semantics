xesDebug RESOURCES IN HOO
#####################################
# File resources.tcl
#
# Defines graphical choices
#####################################


# Possibly override resources by user script
global user_script sourcedir keepinputs hiloinputs
    
xesDebug  "Sourcing $user_script"

if { $user_script != "" } {
  if { [ catch { source $user_script } message ]  } {
    trace_or_error_message $message
    XesExit 1
  }
}

global tcl_platform
set system $tcl_platform(platform)


set fontsize      $defaultfontsize($system)
set panelfontsize $defaultfontsize($system)
set helpfontsize  $defaultfontsize($system)

# FONTS 
global font
set DEFAULT_FONT           fixed


set fontlist {tiny small medium big huge}

set font(header,tiny)    $font(panel,small)  
set font(header,small)   $font(panel,medium) 
set font(header,medium)  $font(panel,big)    
set font(header,big)     $font(panel,huge)   
set font(header,huge)    $font(panel,huge)   

# Scale sizes : {width length sliderlength}
set panelscale(size,tiny)	{ 4  6 2}
set panelscale(size,small)      { 6  9 3}
set panelscale(size,medium)     { 8 12 4}
set panelscale(size,big)	{10 15 5}
set panelscale(size,huge)       {12 18 6}


# Check if fonts exist
label .check_font
foreach a_font [array names font] {
    if {[catch {.check_font configure -font $font($a_font)}]} {
	puts stderr "*** Cannot find font:"
	puts stderr "     \"$font($a_font)\""
        puts stderr "Use $DEFAULT_FONT instead"
	set font($a_font) $DEFAULT_FONT
    }
}
destroy .check_font

xesDebug RESOURCES IN

#==============================
# GRAPHICAL OBJECTS LAST WISHES
#==============================

## Recorder Last Wishes
#proc XesRecorderLastWishes {} {
#    # Tape browsing
#    XesRecorderEnableTapeBrowsing
#}

