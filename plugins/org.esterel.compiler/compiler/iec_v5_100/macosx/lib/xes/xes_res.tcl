# PANEL FONTS
set font(panel,tiny)   \
    -adobe-courier-medium-r-normal--10-100-75-75-m-60-iso8859-1
set font(panel,small)  \
    -adobe-courier-bold-r-normal--12-120-75-75-m-70-iso8859-1
set font(panel,medium) \
    -adobe-courier-bold-r-normal--14-140-75-75-m-90-iso8859-1
set font(panel,big)    \
    -adobe-courier-bold-r-normal--18-180-75-75-m-110-iso8859-1
set font(panel,huge)   \
    -adobe-courier-bold-r-normal--24-240-75-75-m-150-iso8859-1

# SOURCE FONTS
set font(source,tiny)   \
    -adobe-courier-medium-r-normal--10-100-75-75-m-60-iso8859-1
set font(source,small)  \
    -adobe-courier-bold-r-normal--12-120-75-75-m-70-iso8859-1
set font(source,medium) \
    -adobe-courier-bold-r-normal--14-140-75-75-m-90-iso8859-1
set font(source,big)    \
    -adobe-courier-bold-r-normal--18-180-75-75-m-110-iso8859-1
set font(source,huge)   \
    -adobe-courier-bold-r-normal--24-240-75-75-m-150-iso8859-1

# INFO and HELP FONTS
set font(info,small)       -adobe-courier-medium-r-normal--12-*
set font(info,medium)      -adobe-courier-medium-r-normal--14-*
set font(info,big)         -adobe-courier-medium-r-normal--17-*

# Default OS font values
set defaultfontsize(unix)    small
set defaultfontsize(windows) medium

# COLORS
# CHANGE BUT DO NOT REMOVE THE FOLLOWING VARIABLES
set DEFAULTBACKGROUND           \#d9d9d9
set TEXTBACKGROUND       	white

option add *Text.background     $TEXTBACKGROUND
option add *Entry.background    $TEXTBACKGROUND

option add *highlightThickness 0
option add *borderWidth 1
option add *Pady 0

# Nets: color(net,unknown|value)
set color(net,unknown)      	pink
set color(net,0)            	$TEXTBACKGROUND 
set color(net,1)            	PaleGreen1

# Signals: color(sig,status)
set color(sig,active)       	red
set color(sig,inactive)     	blue

# Instances: color(inst,status)
set color(inst,active)      	red
set color(inst,broken)      	#b0b0b0
set color(inst,lightlybroken)  	grey90
set color(inst,inactive)    	blue
set color(inst,default)    	$TEXTBACKGROUND
set color(run,active)      	red
set color(run,broken)      	#b0b0b0
set color(run,inactive)    	blue
set color(run,default)    	$TEXTBACKGROUND

# Halts: color(halt,status)
set color(halt,active)      	red
set color(halt,inactive)    	blue
set color(halt,broken)    	#b0b0b0
set color(halt,default)    	$TEXTBACKGROUND

# Variables: color(var,status)
set color(var,active)      	red
set color(var,inactive)    	blue

# Watchings: color(watch,status)
set color(watch,active)     	red
set color(watch,inactive)   	blue

# Breakpoints: color(break,status)
set color(break,active)     	#b0b0b0
set color(break,inactive)   	$TEXTBACKGROUND

# Execs color(exec,status)
set color(exec,active)     	red
set color(exec,waiting)     	orange
set color(exec,inactive)   	black
set color(exec,killed)   	black
set color(exec,idle)   	        $DEFAULTBACKGROUND

# Tasks: color(task,status/signal)
set color(task,active)		green
set color(task,inactive)	blue
set color(task,suspended)	orange
set color(task,start)		red
set color(task,kill)		black

# Popups
set color(bg,default)         	$DEFAULTBACKGROUND
set color(bg,warning)       	orange
set color(bg,error)         	coral1
set color(bg,info)          	yellow

# Signal browsing
set color(sigbrowse,on)         orange

# Tree
set color(tree)         	lightgrey

