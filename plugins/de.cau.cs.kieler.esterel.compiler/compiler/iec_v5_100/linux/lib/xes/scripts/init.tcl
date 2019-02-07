xesDebug INIT IN

wm withdraw .

global sccausal
if { !$sccausal } {
    pleaseWait "Loading xes"
}
xesDebug INIT OUT
