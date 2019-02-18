# -----------------------------------------------------------------------
# luciolerc.tcl  for luciole version LUCIOLE_VERSION
# -----------------------------------------------------------------------
# Example of resource file for luciole (tcl/tk-based)
# You can copy this file and customize it.
#
# Luciole will load the first existing file in the following list:
#    $PWD/luciolerc.tcl
#    $PWD/.luciolerc.tcl
#    $HOME/luciolerc.tcl
#    $HOME/.luciolerc.tcl
#    $LUSTRE_INSTALL/lib/luciolerc.tcl
#
# WARNING: This file is a tcl-tk script and it will be loaded 
# without any verification! It is strongly recommended to use
# only the variables and procedures listed here, and to respect
# the access recommendations (in particular for read-only variables).
# 
# -----------------------------------------------------------------------
# Variables               Type      Acces     Description
# -----------------------------------------------------------------------
# Global(verbose)         bool        rw      verbose mode 
# Global(verbose_channel) channelid   rw      the verbose channel  
# Global(show_step_ctr)   bool        rw      show/hide the step counter 
# Global(show_step)       bool        rw      show/hide the step button 
# Global(auto_step)       bool        rw      auto step/compose mode
# Global(clocks_menu)     menu path   rw      Clocks menu
# Global(files_menu)      menu path   rw      Files menu
# Global(options_menu)    menu path   rw      Options menu
# Global(user_menu)       frame path  rw      a frame where to put
#                                             additionnal menus
#
# Global(step_ctr)      int           ronly   the current step
# Global(module_name)   string        ronly   the reactive module name
# Global(input_names)   string list   ronly   input's names 
# Global(input_types)   string list   ronly   input's types
# Global(output_names)  string list   ronly   output's names
# Global(output_types)  string list   ronly   output's types 
# InputVars(name)       array         rw      Direct acces to the current
#                                             input values. This array is
#                                             indexed by the stings from :
#                                             Global(input_names)
# -----------------------------------------------------------------------
# Procedures           Params        Effect
# -----------------------------------------------------------------------
# Quit                 none          Exit luciole
# Reset                none          Reset history
# TreatStep            none          Performs a step according to the 
#                                    current values in InputVars 
# -----------------------------------------------------------------------
# Extra Tcl commands   
# -----------------------------------------------------------------------
# add_timer <milliseconds> <script>  causes <script> to be executed 
#                                    <milliseconds> after (or more !)
#                                    returns a <timer-token> that can
#                                    used in the abort_timer command
#
# abort_timer  <timer-token>         causes the corresponding timed script
#                                    to be deleted (if it exists)
# -----------------------------------------------------------------------
#
# This example adds a new menu "Tools" in the luciole window, with :
# - a command that launches sim2chro
# - a command that read inputs from a (rif-compliant) file
# -----------------------------------------------------------------------
menubutton $Global(user_menu).tools \
   -menu $Global(user_menu).tools.m \
   -text {Tools} \
   -underline {0}
menu $Global(user_menu).tools.m
pack $Global(user_menu).tools -in $Global(user_menu) -side left

#-----------SIM2CHRO LAUNCHER--------------------------------------------
# New global variables :
# (pipe and pid associated to the the sim2chro process)
set Sim2chroVars(thepipe) ""
set Sim2chroVars(thepid) ""
set Sim2chroVars(verbose_bak) $Global(verbose)
set Sim2chroVars(verbose_channel_bak) $Global(verbose_channel)

# New procedures :
# (starts a new sim2chro process, kills the previous one if it exists)
proc StartSim2chro4 {} {
        global Sim2chroVars Global

        #prevent violent kill on some systems
        if { $Sim2chroVars(thepid) != "" } {
                catch [exec kill $Sim2chroVars(thepid)]
        }

        set command "sim2chrogtk -ecran /dev/null"
        catch "KillSim2chro"
        set Sim2chroVars(thepipe) [open |$command w+ ]
        set Sim2chroVars(thepid)  [pid $Sim2chroVars(thepipe)] 
        fconfigure $Sim2chroVars(thepipe) -blocking 0 -buffering line

        set Sim2chroVars(verbose_channel_bak) $Global(verbose_channel)
        set Global(verbose_channel) $Sim2chroVars(thepipe)
        set Sim2chroVars(verbose_bak) $Global(verbose)
        set Global(verbose) 1
}
proc StartSim2chro3 {} {
        global Sim2chroVars Global

        #prevent violent kill on some systems
        if { $Sim2chroVars(thepid) != "" } {
                catch [exec kill $Sim2chroVars(thepid)]
        }

        set command "sim2chro -ecran /dev/null"
        catch "KillSim2chro"
        set Sim2chroVars(thepipe) [open |$command w+ ]
        set Sim2chroVars(thepid)  [pid $Sim2chroVars(thepipe)] 
        fconfigure $Sim2chroVars(thepipe) -blocking 0 -buffering line

        set Sim2chroVars(verbose_channel_bak) $Global(verbose_channel)
        set Global(verbose_channel) $Sim2chroVars(thepipe)
        set Sim2chroVars(verbose_bak) $Global(verbose)
        set Global(verbose) 1
}
proc KillSim2chro {} {
        global Sim2chroVars Global
        #restaure original verbose mode
        set Global(verbose_channel) $Sim2chroVars(verbose_channel_bak)
        set Global(verbose) $Sim2chroVars(verbose_bak)
        #prevent violent kill on some systems
        if { $Sim2chroVars(thepid) != "" } {
                catch [exec kill $Sim2chroVars(thepid)]
        }
}
# Adds StartSim2chro command to the tools menu :
$Global(user_menu).tools.m add command \
   -command StartSim2chro4 \
   -label {sim2chro (gtk)} \
   -underline {0}

$Global(user_menu).tools.m add command \
   -command StartSim2chro3 \
   -label {sim2chro (x11)} \
   -underline {0}
#-----------LOAD INPUT FILE--------------------------------------------
# The tool rif2tcl must be available 
#
proc LoadInputFile { } {
   global Global InputVars

   #Ask for an input file
   set rep [tk_getOpenFile -title "Select input file" \
      -defaultextension ".rif" \
      -filetypes {\
         {{Reactive Input Format} {*.rif}}\
         {{All file} {*.*}}\
      }
   ]
   if {$rep == ""} {
      return
   }
   #open the pipe
   set command "rif2tcl $rep"
   set instream [open |$command r ]
   set nb_inputs [llength $Global(input_names)]
   set current_input 0
   while { ! [eof $instream] } {
      if { $current_input >= $nb_inputs } {
         #copy values to input vars
         #and make a step
         array set InputVars [array get cur_values]
#puts "run step proc"
#puts "current inputs are :"
#puts [array get InputVars]
#puts "perform a step ?"
#gets stdin
         TreatStep
         set current_input 0
      }
      set line [gets $instream]
#puts "read line : $line"
      eval $line
      switch $RifToken {
         EOF { return }
         VALUE {
            set cur_type [lindex $Global(input_types) $current_input]
            set cur_name [lindex $Global(input_names) $current_input]
#puts "expected type is : $cur_type"
            if { [info exists RifValue($cur_type)] } {
               set cur_values($cur_name) $RifValue($cur_type)
            } else {
               ERROR { tk_messageBox -icon error \
                      -message "unexpected input value" -type ok }
               return
            }
            incr current_input
         }
         ERROR { tk_messageBox -icon error -message $RifError -type ok }
      }
   }
}
# Adds LoadInputFile command to the tool menu :
$Global(user_menu).tools.m add command \
   -command LoadInputFile \
   -label {Load RIF file} \
   -underline {0}


set RTClock(period) 1000
set RTClock(buffperiod) $RTClock(period)
set RTClock(on) NO
set RTClock(token) ""
proc RealTimeStep { } {
   global RTClock
   #call a step
   if { $RTClock(on) } {
      TreatStep
      set RTClock(token) [add_timer $RTClock(period) RealTimeStep]
   }
}
proc RealTimeChPeriodOut { } {
   global RTClock

   if { [string is integer $RTClock(buffperiod)]
         && ($RTClock(buffperiod) >= 0)
   } {
      set RTClock(period) $RTClock(buffperiod); \
      catch [destroy .chperiod]; \
   } else {
      tk_messageBox -icon error -type ok \
      -message "Period must be a positive integer"
   }
}

proc RealTimeChPeriod { } {
   global RTClock
   toplevel .chperiod
   wm title .chperiod "Select a period"
   wm resizable .chperiod 0 0
   frame .chperiod.top
   entry .chperiod.top.en -textvariable RTClock(buffperiod) -justify right
   bind .chperiod.top.en <Return> RealTimeChPeriodOut
   label .chperiod.top.txt -text "ms" -relief flat
   frame .chperiod.buttons
   button .chperiod.buttons.ok -text "Ok" \
      -command RealTimeChPeriodOut
   button .chperiod.buttons.cancel -text Cancel \
      -command { catch [destroy .chperiod]; return }

   pack .chperiod.top -side top -fill x
   pack .chperiod.top.en -side left -fill x
   pack .chperiod.top.txt -side left -fill x
   pack .chperiod.buttons -side bottom -fill x
   pack .chperiod.buttons.ok -side left -anchor center -expand yes -fill x
   pack .chperiod.buttons.cancel -side left  -anchor center  -expand yes -fill x

   tkwait window .chperiod
}
$Global(clocks_menu) add checkbutton \
   -variable RTClock(on) \
   -onvalue "YES" \
   -offvalue "NO" \
   -label {Real time clock} \
   -command RealTimeStep \
   -underline {0}

$Global(clocks_menu) add command \
   -label {Change Period}\
   -command RealTimeChPeriod

#-----------Smart Inputs--------------------------------------------
# New global variables:
set SmartIns(list) {}
set SmartIns(buff) ""

menubutton $Global(user_menu).smartin \
   -menu $Global(user_menu).smartin.m \
   -text {Inputs} \
   -underline {0}
menu $Global(user_menu).smartin.m
pack $Global(user_menu).smartin -in $Global(user_menu) -side left

# Adds AddSmartIn command to the tool menu :
$Global(user_menu).smartin.m add command \
   -command AddSmartIn\
   -label {Save current inputs as ...} \
   -underline {0}

$Global(user_menu).smartin.m add separator 

proc GetDefaultSmartInName { } {
        set k 1
        set nme ins$k
        global SI$nme

        while { [info exists SI$nme] } {
                incr k
                set nme ins$k
                global SI$nme
        }

        return $nme
}
proc GetSmartInNameOut { } {
   global Global InputVars SmartIns
        variable ::tk::Priv
        set here $Priv(window)

        set nme $SmartIns(buff) 

        global SI$nme

        if { [info exists SI$nme] } {
                tk_messageBox -icon error \
                        -parent $here \
                        -message "name \"$nme\" already used" \
                        -type ok
                return
        }

        catch [destroy .gstn]
}

proc GetSmartInName { initname } {
   global Global InputVars SmartIns
        #pas propre ...
        variable ::tk::Priv

        set here $Priv(window)
        set X [winfo x $here]
        #set X [expr $X + [winfo width $here
        set Y [winfo y $here]
        #puts "$here at $X $Y"


   toplevel .gstn -takefocus yes
   wm title .gstn ""
   wm resizable .gstn 0 0
   wm geometry .gstn "+$X+$Y" 
   frame .gstn.top
   label .gstn.top.txt -text "Enter a name"
   entry .gstn.top.en -textvariable SmartIns(buff)
        set SmartIns(buff) $initname 
        .gstn.top.en selection range 0 end
        .gstn.top.en icursor end
        focus -force .gstn.top.en


   bind .gstn.top.en <Return> GetSmartInNameOut
   frame .gstn.buttons
   button .gstn.buttons.ok -text "Ok" \
      -command GetSmartInNameOut
   button .gstn.buttons.cancel -text Cancel \
      -command { set SmartIns(buff) ""; catch [destroy .gstn]; return }


   pack .gstn.top -side top -fill x
   pack .gstn.top.txt -side top -fill x
   pack .gstn.top.en -side top -fill x
   pack .gstn.buttons -side bottom -fill x
   pack .gstn.buttons.ok -side left -anchor center -expand yes -fill x
   pack .gstn.buttons.cancel -side left  -anchor center  -expand yes -fill x

        grab .gstn


   tkwait window .gstn

        return $SmartIns(buff) 
}
proc AddSmartIn { } {
   global Global InputVars SmartInNames
        # must be in compose mode

        if { $Global(auto_step) } {
                tk_messageBox -icon error -message "must be in compose mode" -type ok
                return
        }
        #ask for a name
        set name [ GetSmartInName [GetDefaultSmartInName

        if { $name == "" } return


        # adds a command $name
        $Global(user_menu).smartin.m add command \
                -command "LoadSmartInputs {$name}" \
        -label "$name"

        # sauvegarde la valeur de chaque inputs
        # dans SI$name

        lappend  SmartInNames $name

        global SI$name
        foreach  i $Global(input_names) {
                #puts $i
                array set SI$name [list $i $InputVars($i) ]
                #puts [array get SI$name $i ]
        }
}
proc LoadSmartInputs { name } {
   global Global InputVars SmartInNames
        global SI$name
        foreach  i $Global(input_names) {
                #puts $InputVars($i)
                set v [lindex [array get SI$name $i] 1]
                #puts "$i = $v"
                #array set InputVars [list $i $v]
                set InputVars($i) $v
                #puts $InputVars($i)
        }
}
bind $Global(user_menu).smartin.m <ButtonRelease-3> {
        SmartInputExtraMenu %X %Y       
        break
}
proc SmartInputExtraMenu { X Y } {
        global Global
        variable ::tk::Priv
        set here $Priv(window)
        set active [$here index active]

        #is it a valid input vector ?
        if {[string equal [$here type $active] "command"]} {
                set name [$here entrycget $active -label]
                puts $name      
                global SI$name
                if { [info exists SI$name] } {
                        # ok ...
                        catch { destroy .siextra }
                        menu .siextra -tearoff 0
                        .siextra add command \
                                -command "DeleteSmartInput $here $active {$name}" \
                        -label "Delete"
                        .siextra add command \
                                -command "RenameSmartInput $here $active {$name}" \
                        -label "Rename"
                        #post here near here ...
                        tk_popup .siextra $X $Y 
                }
        }
}
proc DeleteSmartInput { win active name } {
   global Global InputVars SmartInNames
        puts "$win $name"
        # warns ...
        set warn [tk_messageBox -title "Warning" \
                -parent $win \
                -message "really destroy $name?"\
                -type yesnocancel ]
        puts $warn
        if { [string equal $warn "yes"] } {
                #destroy all variables related to name
                global SI$name
                unset SI$name
#puts $SmartInNames
                set ix [lsearch $SmartInNames $name]
                puts $ix
                set SmartInNames [lreplace $SmartInNames $ix $ix]
#puts $SmartInNames
                $win delete $active
        }
} 
proc RenameSmartInput { win active name } {

        set newname [GetSmartInName $name]

        if { $newname == "" }  return

   global Global InputVars SmartInNames
        global SI$name
        global SI$newname

        # copy the array ...
        array set SI$newname [ array get SI$name ]
        # replace name by newname ...
        set ix [lsearch $SmartInNames $name]
        set SmartInNames [lreplace $SmartInNames $ix $ix $newname]
        # detroy name tab ...
        unset SI$name
        # replace the name button and command ...
        $win entryconfigure $active \
                        -command "LoadSmartInputs {$newname}" \
                        -label $newname 
} 
