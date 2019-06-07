

proc got_remote_pure  num {
#  puts "Received pure $num"
  inputselpress $num
  inputselrelease $num
}

proc got_remote_pure_return  { num refvals } {
  global  exectable
#  puts "Received $num  $refvals"
    set execnum [lindex $refvals 0]
#    puts $execnum
    set exectable($execnum,values) [lindex $refvals 1]
#    puts $exectable($execnum,values)

  inputselpress $num
  inputselrelease $num
}

proc got_remote_valued { num val } {
  global sigtable
#  puts "Received valued $num $val"
  $sigtable($num,ival) delete 0 end
  $sigtable($num,ival) insert 0 "$val"
  inputselpress $num
  inputselrelease $num
}
 
proc got_remote_valued_return { num val refvals } {
  global sigtable exectable
#  puts "Received $num $val $refvals"
    set execnum [lindex $refvals 0]
#    puts $execnum
    set exectable($execnum,values) [lindex $refvals 1]
#    puts $exectable($execnum,values)
  $sigtable($num,ival) delete 0 end
  $sigtable($num,ival) insert 0 "$val"
  inputselpress $num
  inputselrelease $num
}
 
proc got_remote_sensor { num val } {
  global sigtable
#  puts "Received $num $val"
  $sigtable($num,ival) delete 0 end
  $sigtable($num,ival) insert 0 "$val"
}
 

proc got_remote_reset {} {
    reset
}

proc got_remote_run {} {
    runselection
}

proc got_remote_quit {} {
    after 500 quit
    return
}


proc createRemotes { } {
    global currentModule gList remote allowinputs

    foreach signal $gList(pureinput) {
	set name [lindex $signal 1]
	set num  [lindex $signal 0]
	proc I_$name { }              "got_remote_pure $num"
    }

    foreach signal $gList(purereturn) {
	set name [lindex $signal 1]
	set num  [lindex $signal 0]
	proc R_$name { {refvals {}} } "got_remote_pure_return $num \$refvals"
    }

    foreach signal $gList(valuedinput) {
	set name [lindex $signal 1]
	set num  [lindex $signal 0]
	proc I_$name { val  }        "got_remote_valued $num \$val "
    }

    foreach signal $gList(valuedreturn) {
	set name [lindex $signal 1]
	set num  [lindex $signal 0]
        proc R_$name { val {refvals {}} } \
		"got_remote_valued_return $num \$val \$refvals"
    }

    foreach signal $gList(sensor) {
	set name [lindex $signal 1]
	set num  [lindex $signal 0]
	proc S_$name { val }  "got_remote_sensor $num \$val"
    }

    proc ${currentModule}_run {}     "got_remote_run "

    proc ${currentModule}_reset {} "got_remote_reset"

    proc ${currentModule}_quit  {} "got_remote_quit"

}






