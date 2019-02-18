#==============================================================================
#                                   XLesar
#------------------------------------------------------------------------------
# xlesar.tcl
#------------------------------------------------------------------------------
# comme son nom l'indique ...
#==============================================================================
#
#

# ERREUR INITIALE
proc InitErrorBox { errorMsg } {
        global Utiles
        tk_messageBox \
                -icon error \
                -message "$errorMsg" \
                -type ok \
                -title "xlesar Error"
}
#==============================================================================
#   VARIABLES GLOBALES 
#==============================================================================
#---Version 
set XLESAR(version) "2.0"
#---Commandes
set COMMANDS(lusinfo) "lusinfo"
set COMMANDS(lus2ec)  "lus2ec"
set COMMANDS(ecverif) "ecverif"
set COMMANDS(lesar)   "lesar"
#---Version
set XLESAR(ecverif_version) ""
if {[catch "exec $COMMANDS(ecverif) -version" XLESAR(ecverif_version)]} {
   puts "bad installation: can't execute $COMMANDS(ecverif)"
   exit
}
set XLESAR(tool_name) \
   "XLesar V-$XLESAR(version) (ecverif V-$XLESAR(ecverif_version))"
#---Le fichier lustre (ou ec)
set PROJECT(main_type) "lus"
#---Le fichier lustre (ou ec)
set PROJECT(main_file) ""
#---Le noeud principal
set PROJECT(main_node) ""
#---Le nom du projet
set PROJECT(name) ""
#---Repertoire d'installation
set PROCESS(lib) [exec printenv XLESAR_PATH]
load "$PROCESS(lib)/ecwish.so" 
#---Le nom du fichier de sauvegarde
set PROCESS(save_file) ""
source "$PROCESS(lib)/estrings.tcl"
#REPERTOIRES
set PROCESS(start_dir) [pwd]
set p [pid]
cd /tmp
set PROCESS(tmp) [pwd]
cd $PROCESS(start_dir)
set PROCESS(run_dir) "$PROCESS(tmp)/xlesar$p"
set PROCESS(work_dir) "$PROCESS(run_dir)/work"
if {[file exist $PROCESS(run_dir)]} then {
        set rep [tk_messageBox \
                -icon question \
                -message \
"A \"[file tail $PROCESS(run_dir)]\" directory already exists\n Destroy it ?" \
      -type yesno \
      -default no \
   ]
   if {$rep == "yes"} {
      exec rm -rf $PROCESS(run_dir)
   }
}
if {![file exist $PROCESS(run_dir)]} then {
   set err [catch \
         "exec mkdir $PROCESS(run_dir) 2>@stdout"\
      ]
   if {$err} {
      InitErrorBox "Cannot create \"$PROCESS(run_dir)\""
      exit
   }
   set err [catch \
         "exec mkdir $PROCESS(work_dir) 2>@stdout"\
      ]
   if {$err} {
      InitErrorBox "Cannot create \"$PROCESS(work_dir)\""
      exit
   }
}
set PROCESS(config_file) "$PROCESS(work_dir)/config.tcl"
# RECUP DU SIGINT
sigint XlesarExit
set PROCESS(import_dir) "/$PROCESS(work_dir)/import"
set PROJECT(mainec) "mainec"
ecprg mainec
set PROJECT(proplist) {}
set PROCESS(down_arrow) [image create bitmap -data  {
   #define down_arrow_width 15
   #define down_arrow_height 15
   static char down_arrow_bits[] = {
      0x00,0x80,0x00,0x80,0x00,0x80,0x00,0x80,
      0x00,0x80,0xf8,0x8f,0xf0,0x87,0xe0,0x83,
      0xc0,0x81,0x80,0x80,0x00,0x80,0x00,0x80,
      0x00,0x80,0x00,0x80,0x00,0x80
   }
} ]
#== LES VALEURS DU PARAMETRE ALGO
set XLESAR(algo%0) [list "-enum" "$STRINGS(enum)"]
set XLESAR(algo%1) [list "-forward" "$STRINGS(forward)"]
set XLESAR(algo%2) [list "-backward" "$STRINGS(backward)"]
foreach algo [lsort [array names XLESAR {algo%[0-9]*}]] {
        array set XLESAR [list \
                "algoname[lindex $XLESAR($algo) 0]" \
                [lindex $XLESAR($algo) 1] \
        ]
}
#==============================================================================
#   VARIABLES ET PROCEDURES IMPORTEES
#==============================================================================
source "$PROCESS(lib)/utiles.tcl"
source "$PROCESS(lib)/select-lus.tcl"
#-------------------------------------------------------------
#Importation du package "combobox" de Bryan Oakley 
#-------------------------------------------------------------
source $PROCESS(lib)/combobox.tcl
package require combobox 1.06
catch {namespace import combobox::*}
#-------------------------------------------------------------
#Importation du package "mclistbox" de Bryan Oakley 
#-------------------------------------------------------------
source $PROCESS(lib)/mclistbox.tcl
package require mclistbox 1.0
catch {namespace import mclistbox::*}
#-------------------------------------------------------------
#Importation du package "pane" de ???
#-------------------------------------------------------------
source $PROCESS(lib)/pane.tcl
#==============================================================================
#   PROCEDURES
#==============================================================================
proc Help { } {
}
proc SelectMain { } {
   global XLESAR PROJECT STRINGS PROCESS
        cd $PROCESS(start_dir)
   SelectLus "$STRINGS(select_prg)" \
      {PROJECT} {main_file} {main_node} {main_type} \
                StaticCheckMain
}
proc SaveProject { savefile verb } {

        global XLESAR PROJECT PROCESS
        global STRINGS

   if { $savefile == "" } {
      ErrorBox $STRINGS(project_not_defined)
      return
   }

        # CONSTRUCTION DU FICHIER CONFIG 
   catch "exec rm -f $PROCESS(config_file)"
   if { [catch "open $PROCESS(config_file) w" conf] } {
      ErrorBox "$STRINGS(cannot_open) \"$PROCESS(config_file)\""
      puts "$conf"
      return
   }

        
        #==>RESTAURER XLESAR DANS UN ENV. GLOBAL
        puts $conf "global XLESAR"
        foreach field [array names XLESAR] {
                puts $conf "set XLESAR($field) \"$XLESAR($field)\""
        }

        #==>RESTAURER PROJECT DANS UN ENV. GLOBAL
        puts $conf "global PROJECT"
        foreach field [array names PROJECT] {
                puts $conf "set PROJECT($field) \"$PROJECT($field)\""
        }

        #== AUTRES SAUVEGARDES ....
        
        foreach prop $PROJECT(proplist) {
                global $prop
                puts $conf "global $prop"
                puts $conf "array set $prop \[list [array get $prop]\]" 
        }
        puts $conf "set PROJECT(proplist) \$PROJECT(proplist)"

        close $conf
        
        cd $PROCESS(work_dir)
        exec tar cf - . | gzip > $savefile

        if { $verb } {
        tk_messageBox \
                -icon info \
                -message "$STRINGS(project_saved_in) \"$savefile\"" \
                -type ok
        }
}
proc SaveProjectAs { } {

   global XLESAR PROJECT PROCESS
        global STRINGS

   if { $PROCESS(save_file) == "" } {
      set fil "$PROJECT(main_node).lesar"
      set dir "$PROCESS(start_dir)"
   } else {
      set fil [file tail $PROCESS(save_file)]
      set dir [file dirname $PROCESS(save_file)]
   }
        set filety [list "$STRINGS(lesar_project_files)" "*.lesar"]
   set res [ tk_getSaveFile \
      -defaultextension ".lesar" \
                -filetypes [list $filety] \
      -initialdir "$dir" \
      -initialfile "$fil" \
      -title "$STRINGS(select_a_project_file)"
   ]
        set nme [file rootname [file tail $res]]
   if { ($nme != "") } {
      set PROCESS(save_file) $res
      SaveProject $res 1
   } else {
      ErrorBox "$STRINGS(save_project_aborted)"
   }
}
proc LoadProject { } {
   global XLESAR PROJECT PROCESS
        global STRINGS

   set rep [ \
      tk_messageBox \
      -default no \
      -icon warning \
      -message "$STRINGS(save_current_project)" \
      -type yesnocancel ]

   if { $rep == "yes" } then {
      SaveProjectAs
   } elseif {$rep == "no" } then {
   } else {
      return
   }

        set filety [list "$STRINGS(lesar_project_files)" "*.lesar"]

   set res [ tk_getOpenFile \
                -filetypes [list $filety] \
      -initialdir "$PROCESS(start_dir)" \
      -title "$STRINGS(select_a_project_file)"
   ]
   if {$res != ""} {
                LoadProjectFile $res
   }
}
proc LoadProjectFile { pfile } {
   global XLESAR PROJECT PROCESS
        global STRINGS

   set PROCESS(save_file) $pfile
   catch { exec sh -c "rm -rf $PROCESS(work_dir)/*" }
   cd $PROCESS(work_dir)
   exec cat $pfile | gunzip - | tar xf -
   if { [ file exists $PROCESS(config_file) ] } {
                
                #==DESTRUCTIONS DES INFOS GLOBALES
                
                foreach prop $PROJECT(proplist) {
                        global $prop
                        unset $prop
                }
                set PROJECT(proplist) {}

                #==RESTAURATION DU CONTEXTE
                source $PROCESS(config_file)
                if { $PROJECT(main_node) != "" } {
                        #==LE FICHIER EXISTE-IL ENCORE ?
                        if { ! [ file exists $PROJECT(main_file) ] } {
                                ErrorBoxMsg "STRINGS(cannot_open) \"$PROJECT(main_file)\"" \
                                        "$STRINGS(HELP_load_error)"
                                set PROJECT(main_file) ""
                                set PROJECT(main_node) ""
                #puts "PROJECT(main_file)= $PROJECT(main_file)"
                #puts "PROJECT(main_node)= $PROJECT(main_node)"
                        } elseif { [StaticCheckMain $PROJECT(main_file) $PROJECT(main_node)] } {
                                #==IMPOSSIBLE DE CHARGER CE PROGRAMME ....
                                set PROJECT(main_file) ""
                                set PROJECT(main_node) ""
                        }
                } else {
                puts "PROJECT(mainec) = $PROJECT(mainec)"
                        $PROJECT(mainec) init
                        UpdateMainInfos 
                }
   } else {
      ErrorBox "$pfile : $STRINGS(bad_format)"
      return
   }
}
proc NewProject { } {

   global PROCESS
   global STRINGS

   set rep [ \
      tk_messageBox \
      -default no \
      -icon warning \
      -message "$STRINGS(save_current_project)" \
      -type yesnocancel ]

   if { $rep == "yes" } then {
      SaveProjectAs
   } elseif {$rep == "no" } then {
   } else {
      return
   }

        LoadProjectFile "$PROCESS(run_dir)/void.lesar"
}
proc Quit { } {

   global XLESAR
        global STRINGS

   set rep [ \
      tk_messageBox \
      -default no \
      -icon warning \
      -message "$STRINGS(save_current_project)" \
      -type yesnocancel ]

   if { $rep == "yes" } then {
      SaveProjectAs
   } elseif {$rep == "no" } then {
   } else {
      return
   }
        XlesarExit
}
proc XlesarExit { } {
        global XLESAR PROCESS
        global STRINGS

        cd $PROCESS(start_dir)

        puts "exec rm -rf $PROCESS(run_dir)"
        catch [exec rm -rf $PROCESS(run_dir)]
   exit
}
proc GetNodeProfile { srcfile node } {
        global COMMANDS
        ecprg tmpec
        set pipe "|$COMMANDS(lus2ec) $srcfile $node -no"
        if {
                [catch "set chnl [open $pipe r]" res ]
        } then {
                return -code error $res
        } else {
                set errload [catch {tmpec loadch $chnl} resload]
                if { ! $errload } {
                        set errload [catch {set profil [tmpec profile]} resload]
                }
                # PRIORITE A L'ERREUR DU CLOSE
                if { [catch {close $chnl} res ] } {
                        return -code error $res
                }
                # SINON A CELLE DU LOAD
                if { $errload } {
                        return -code error $resload
                }
                # SINON TOUT VA BIEN
                return $profil
        }
}
proc CheckImportNodes { srcfile } {
        global COMMANDS PROJECT PROCESS

        # LE FICHIER EST ANALYSE DANS LE REPERTOIRE IMPORT
        set dd [pwd]
        cd $PROCESS(import_dir)

        if {[catch {set nodelist [exec $COMMANDS(lusinfo) $srcfile nodes]} res ]
        } then {
                cd $dd
                return -code error $res
        }
        # PARCOURS DE LA LISTE DES NOEUDS
        foreach node $nodelist {
                if { [info exists PROJECT(import-node:$node)] } then {
                        set f [lindex $PROJECT(import-node:$node) 0]
                        cd $dd
                        return -code error "Node $node already defined in $f" 
                }
                if { [catch {set profile($node) [GetNodeProfile $srcfile $node]} res
                    ]
                } then {
                        cd $dd
                        return -code error $res
                }        
        }
        # PAS DE PROBLEME : ON ENREGISTRE
        foreach node $nodelist {
                set PROJECT(import-node:$node) [list $srcfile $profile($node)]
        }
        cd $dd
}
proc DeleteImportNodes { srcfile } {
        global COMMANDS PROJECT

        set nodelist [array names PROJECT "import-node:*"]
        foreach inode $nodelist {
                if { [lindex $PROJECT($inode) 0] == $srcfile } {
                        unset PROJECT($inode)
                }
        }
}
proc ImportManager { } {
        global PROCESS STRINGS WPATH
        # ON COMMENCE PAR DETRUIRE ?
        catch "destroy .importmng"

        # LA FENETRE
   toplevel .importmng
   wm positionfrom .importmng program
   wm sizefrom .importmng program
   wm title .importmng "XLesar $STRINGS(import_code)"

        # LE MENU
        frame .importmng.menu -borderwidth {2} -relief {raised}
        menubutton .importmng.menu.files \
                -menu .importmng.menu.files.m \
                -text $STRINGS(files)\
                -underline {0}

        menu .importmng.menu.files.m \
                -tearoff 0

        .importmng.menu.files.m add command \
                -command { ImportManagerAdd } \
                -label "$STRINGS(load_file)" \
                -underline {0}

        .importmng.menu.files.m add command \
                -command { ImportManagerDelete } \
                -label "$STRINGS(remove_selection)" \
                -underline {0}

        .importmng.menu.files.m add separator

        .importmng.menu.files.m add command \
                -command { ImportManagerOut } \
                -label "$STRINGS(close)" \
                -underline {0}

        pack .importmng.menu.files -side left -anchor center

   # LE FRAME PRINCIPAL
   frame .importmng.files

   # LA PARTIE COMMANDES
   frame .importmng.files.buttons
   button .importmng.files.buttons.add \
      -borderwidth {2} \
      -relief {raised} \
      -text $STRINGS(add) \
      -command "ImportManagerAdd"
   button .importmng.files.buttons.delete \
      -borderwidth {2} \
      -relief {raised} \
      -text $STRINGS(delete) \
      -command "ImportManagerDelete"
   button .importmng.files.buttons.close \
      -borderwidth {2} \
      -relief {raised} \
      -text $STRINGS(close) \
      -command "ImportManagerOut"

   pack append .importmng.files.buttons \
      .importmng.files.buttons.add {top frame center expand fill} \
      .importmng.files.buttons.delete {top frame center expand fill} \
      .importmng.files.buttons.close {top frame center expand fill}

   # LA LISTE DES FICHIERS 
        label .importmng.files.title \
                -text "$STRINGS(files)" \
                -anchor center \
                -bd 0
        pack .importmng.files.title -side top -fill x 

        frame .importmng.files.list 
        set WPATH(imported_files) ".importmng.files.list.items"
   listbox $WPATH(imported_files) \
      -exportselection false \
      -selectmode single \
                -width 15 \
      -relief sunken
   BuildScrolls .importmng.files.list $WPATH(imported_files)

   # LA LISTE DES NOEUDS 
        frame .importmng.nodes
        label .importmng.nodes.title \
                -text "$STRINGS(nodes)" \
                -anchor center \
                -bd 0
        pack .importmng.nodes.title -side top -fill x

        frame .importmng.nodes.list
        set WPATH(imported_nodes) ".importmng.nodes.list.items"
        listbox $WPATH(imported_nodes) \
                -exportselection false \
                -selectmode no \
                -relief sunken
        BuildScrolls .importmng.nodes.list $WPATH(imported_nodes)

   # PACK GENERAL
   pack append .importmng.files \
      .importmng.files.list {left frame center expand fill} 
      #.importmng.files.buttons {left frame center filly}
   pack append .importmng.nodes \
      .importmng.nodes.list {left frame center expand fill} \

   pack append .importmng \
                .importmng.menu {top frame center fillx} \
      .importmng.files {left frame center expand fill} \
      .importmng.nodes {left frame center expand fill}

        # SI LE REPERTOIRE N'EXISITE PAS, ON LE CREE :
        if { ! [file exist $PROCESS(import_dir)] } then {
                exec mkdir $PROCESS(import_dir)
        }

   ImportManagerUpdateList

}
proc ImportManagerOut { } {
   catch "destroy .importmng"
}
proc ImportManagerUpdateList { args } {
   global PROCESS WPATH PROJECT
   if { [winfo exists $WPATH(imported_files)] } {
      $WPATH(imported_files) delete 0 end
      set tlist [exec ls $PROCESS(import_dir)]
      foreach item $tlist {
         $WPATH(imported_files) insert end $item
      }
      $WPATH(imported_files) selection set 0
   }
        # ON MET AUSSI A JOUR LA LISTE DES NOEUDS
   if { [winfo exists $WPATH(imported_nodes)] } {
      $WPATH(imported_nodes) delete 0 end
                set nodelist [array names PROJECT "import-node:*"]
                foreach inode $nodelist {
                        set txt [lindex $PROJECT($inode) 1]
         $WPATH(imported_nodes) insert end $txt
      }
   }

}
proc ImportManagerDelete { } {
   global PROCESS STRINGS WPATH
   if { [winfo exists $WPATH(imported_files)] } {
      set index [$WPATH(imported_files) curselection]
      if { $index != "" } {
         set ifile [$WPATH(imported_files) get $index]
                        switch [ tk_messageBox \
                                -default no \
                                -icon warning \
                                -message "$STRINGS(remove) '$ifile' ?" \
                                -type yesnocancel
                        ] {
                                yes {
                                        DeleteImportNodes $ifile
                        catch "exec rm -f $PROCESS(import_dir)/$ifile"
                        ImportManagerUpdateList
                                }
                        }
      }
   }
}
set PROCESS(source_dir) $PROCESS(start_dir)

proc ImportManagerAdd { } {
   global PROCESS  STRINGS

   set res [ tk_getOpenFile \
      -title $STRINGS(select_import) \
      -initialdir "$PROCESS(source_dir)" \
      -filetypes {\
         {{Lustre Code}   {.lus .ec}}
      }
   ]
   if {$res != ""} {
      set fil [file tail $res]
      if { [file exists $PROCESS(import_dir)/$fil] } {
         ErrorBox "cannot add \"$fil\" : file exists"
         return
      }
      if { [catch "exec cp $res $PROCESS(import_dir)/$fil" err] } {
         ErrorBox $err
         return
      }

                if { [catch "CheckImportNodes $fil" err] } {
                        catch "exec rm -f $PROCESS(import_dir)/$fil"
                        ErrorBox $err
                }

      set PROCESS(source_dir) [file dirname $res]
      ImportManagerUpdateList
   }
}
proc StaticCheckMain { main_file main_node } {
#puts $main_file
#puts $main_node
        global COMMANDS XLESAR STRINGS PROJECT PROCESS WPATH

        set src_dir [file dirname $main_file]
        set src_file [file tail $main_file]
        set src_node $main_node
        set PROCESS(mainec_file) "$src_node.ec" 
        cd $src_dir

        if { [ catch {exec $COMMANDS(lus2ec) $src_file $src_node} res ] } then {
                ErrorBoxMsg "$STRINGS(cant_expand) '$src_node' $STRINGS(from) '$src_file'" \
                         $res
                return 1
        }

        if { ![file exists $PROCESS(mainec_file)]} then {
                ErrorBox "$STRINGS(cant_expand) node '$src_node' $STRINGS(from) file '$src_file'"
                return 1
        }

        exec mv $PROCESS(mainec_file) $PROCESS(work_dir)/$PROCESS(mainec_file)
        cd $PROCESS(work_dir)

        $PROJECT(mainec) load $PROCESS(mainec_file)

        UpdateMainInfos

        return 0
}
proc BuildVarList { title root this } {
        #====CONSTRUCTION DU CONTENANT
        if { $root == "." } {
                set rootpath ""
        } else {
                frame $root -bd 1 -relief raised
                set rootpath $root 
        }
        #====CONSTRUCTION DU TITRE
        label $rootpath.title -justify center -text $title \
                -relief flat -bd 0
        $rootpath.title configure -font {Helvetica 14 bold}
        #====L'ascenseur vertical
        scrollbar $rootpath.vsb \
                -relief raised -bd 1 \
                -orient vertical \
                -command [list $this yview]     
        #====La LISTE
        mclistbox $this \
                -bd 0 \
                -height 6 \
                -width 30 \
                -columnrelief flat \
                -labelanchor w \
                -columnborderwidth 0 \
                -labelborderwidth 2 \
                -fillcolumn name \
                -yscrollcommand [list $rootpath.vsb set]
        #====LES COLONNES
        $this column add name -label "Name" -width 20
        $this column add type -label "Type" -width 10

        #====PACK DE TOUT CA
        pack $rootpath.title -in $root -side top -fill x        
        pack $rootpath.vsb -in $root -side left -fill y 
        pack $this -in $root -side left -fill both -expand 1
}
proc UpdateMainInfos { } {
        global COMMANDS XLESAR STRINGS PROJECT PROCESS WPATH

        $WPATH(inlist) delete 0 end
        set max [$PROJECT(mainec) nb-ins]
        for {set i 0} {$i < $max} {incr i} {
                set nme [$PROJECT(mainec) in-name $i]
                set typ [$PROJECT(mainec) in-type $i]
                $WPATH(inlist) insert end [list $nme $typ]
        }

        $WPATH(outlist) delete 0 end
        set max [$PROJECT(mainec) nb-outs]
        for {set i 0} {$i < $max} {incr i} {
                set nme [$PROJECT(mainec) out-name $i]
                set typ [$PROJECT(mainec) out-type $i]
                $WPATH(outlist) insert end [list $nme $typ]
        }
}
proc UpdatePropList { vartab varfield op } {
        global PROJECT WPATH

        #APPELEE CHAQUE FOIS QUE PROJECT(proplist) EST MODIFIEE

        #==ON DETRUIT TOUTES LES INFOS DE WPATH(proplist)
        $WPATH(proplist) delete 0 end

        #==ON REAFFICHE TOUTE LA LISTE
        foreach prop $PROJECT(proplist) {
                global $prop
                $WPATH(proplist) insert end [list \
                        [lindex [array get $prop name] 1] \
                        [lindex [array get $prop comment] 1] \
                        [lindex [array get $prop status] 1] \
                ]
                #==ON TRACE LES VARIABLES AFFICHEES
                trace vdelete [format "%s(name)" $prop] w UpdatePropList
                trace vdelete [format "%s(comment)" $prop] w UpdatePropList
                trace vdelete [format "%s(status)" $prop] w UpdatePropList
                trace variable [format "%s(name)" $prop] w UpdatePropList
                trace variable [format "%s(comment)" $prop] w UpdatePropList
                trace variable [format "%s(status)" $prop] w UpdatePropList
        }
}
proc UpdateProp { prop } {
        global $prop
        #==ON TRACE LES VARIABLES AFFICHEES
        trace vdelete [format "%s(name)" $prop] w UpdatePropList
        trace vdelete [format "%s(comment)" $prop] w UpdatePropList
        trace vdelete [format "%s(status)" $prop] w UpdatePropList
        trace variable [format "%s(name)" $prop] w UpdatePropList
        trace variable [format "%s(comment)" $prop] w UpdatePropList
        trace variable [format "%s(status)" $prop] w UpdatePropList
        set [format "%s(name)" $prop] [lindex [array get $prop name] 1] 
}
proc NewProperty { } {
        global STRINGS PROJECT WPATH

        #RECHERCHE D'UN NOM DE PROPRIETE LIBRE
        set count 0
        set tabname "PROP_$count"
        global $tabname
        while { [array exist $tabname] } {
                incr count
                set tabname "PROP_$count"
                global $tabname
        }
        #ON VERIFIE (AU CAS OU) MAIS CA DOIT ETRE UNE ERREUR INTERNE !
        if { [lsearch -exact $PROJECT(proplist) $tabname] >= 0 } {
                ErrorBox "internal error $STRINGS(property) '$tabname' $STRINGS(already_declared)"
                return 1
        }

        #==VALEURS PAR DEFAUT
        array set $tabname [list \
                locked 0 \
                tabname "$tabname" \
                name "$STRINGS(unnamed) $count" \
                comment "" \
                status "$STRINGS(unknown)" \
        ] 

        #==INSERSION DANS LA LISTE
        lappend PROJECT(proplist) $tabname
        #==LA NOUVELLE PROP EST SELECTIONNEE AUTOMATIQUEMENT
        $WPATH(proplist) selection clear 0 end
        $WPATH(proplist) selection set end end

        return 0
}
proc DeleteProperty { } {
        global WPATH PROJECT STRINGS PROCESS
        #== ON RECUPERE LA SELECTION
        set ixlist [$WPATH(proplist) curselection]
        #== ON LA TRIE PAR ORDRE DECROISSANT
        set ixlist [lsort -integer -decreasing $ixlist] 
        #== ON DETRUIT UN PAR UN LES TABLEAUX CORRESPONDANT
        foreach ix $ixlist {
                set tabname [lindex $PROJECT(proplist) $ix]
                global $tabname
                set nme [lindex [array get $tabname name] 1]
                if { [info exists PROCESS(locked_$tabname)] } {
                        ErrorBox "$STRINGS(property) '$nme' $STRINGS(in_edition)"
                } else {
                        switch [ tk_messageBox \
                                -default yes \
                                -icon warning \
                                -message "$STRINGS(really_destroy) '$nme' ?" \
                                -type yesnocancel \
                        ] {
                                yes {
                                        #==DETRUIT LA VARIABLE
                                        unset $tabname
                                        #==MET LA LISTE A JOUR
                                        set PROJECT(proplist) [lreplace $PROJECT(proplist) $ix $ix]
                                }
                                cancel { return }
                        }
                }
        }
}
proc EditProperty { } {
        global WPATH PROJECT STRINGS
        global PROCESS
        #== ON RECUPERE LA SELECTION
        set ixlist [$WPATH(proplist) curselection]
        #== ON LANCE UN EDITEUR POUR CHAQUE PROP
        foreach ix $ixlist {
                set tabname [lindex $PROJECT(proplist) $ix]
                global $tabname
                if { [info exists PROCESS(locked_$tabname)] } {
                        #== DEJA BLOQUEE
                        EditPropertyMng $tabname
                } else {
                        #== ON BLOQUE
                        set PROCESS(locked_$tabname) 1
                        tkwait window [EditPropertyMng $tabname]
                        unset PROCESS(locked_$tabname)
                }
        }
}
proc EditPropertyMng { tabname } {
        global $tabname
        set top ".edit_$tabname"
        #== LA FENETRE EXISTE DEJA ?
        if { [winfo exists $top] } {
                wm deiconify $top
                return $top
        }
        #== RECOPIE $tabname DANS $prop
        set prop "TEMP$tabname"
        global $prop
        array set $prop [array get $tabname]

        #== AJOUT DE CHAMPS (EVENTUELLEMENT INCONNUS)

#ICI
#puts "prop=[array get $prop]"

        #== CREATION DU TOPLEVEL
        toplevel $top
        global XLESAR PROJECT STRINGS COMMANDS PROCESS
        frame $top.menu
        menubutton $top.files \
                -menu $top.files.m \
                -text $STRINGS(files) \
                -underline {0}

        menu $top.files.m -tearoff 0

        $top.files.m add command \
                -command "SaveProp $top $prop $tabname" \
                -label "$STRINGS(save)" \
                -underline {0}

        $top.files.m add command \
                -command "SaveCloseProp $top $prop $tabname" \
                -label "$STRINGS(save_close)" \
                -underline {0}

        $top.files.m add separator

        $top.files.m add command \
                -command "CloseProp $top $prop $tabname" \
                -label "$STRINGS(close)" \
                -underline {0}

        pack $top.files -in $top.menu -side left -anchor center
        pack $top.menu -in $top -side top -anchor center -fill x

        if {[array get $prop descr] == {} } {
                array set $prop [list descr ""]
        }
        if {[array get $prop comment] == {} } {
                array set $prop [list comment ""]
        }

        set descrfr "$top.descr"
        frame $descrfr
        frame $descrfr.title
        label $descrfr.title.lbl -text "$STRINGS(description)" \
                -anchor center
        entry $descrfr.title.comment \
                -fg blue -bg white \
                -textvariable [format "%s(comment)" $prop]

        $descrfr.title.comment configure -font {Times 16 bold}
        pack $descrfr.title.lbl -side left -fill x -expand 0
        pack $descrfr.title.comment -side left -fill x -expand 1

        SetReqSize $descrfr.title ew

        MiniText $descrfr $descrfr.title 40 10 $prop descr

        #ON CHANGE UN PEU LE LOOK ....
        set tt [MiniTextText $descrfr]
        $tt configure -fg blue
        $tt configure -font {Times 16}

        #AJOUT DU MENU EDIT 
        #ET DU BOUTON "Show Description"
        menubutton $top.edit \
                -menu $top.edit.m \
                -text $STRINGS(edit) \
                -underline {0}
        menu $top.edit.m -tearoff 0

        if {[array get $prop show_descr] == {} } {
                array set $prop [list show_descr 0]
        }
        set vv [format "%s(show_descr)" $prop]

        $top.edit.m add checkbutton \
                -label "$STRINGS(show_description)" \
                -variable $vv

        trace variable $vv w "ShowHideDescr $top $descrfr"
        #ON FORCE UNE PREMIERE ECRITURE ...
        set $vv [set $vv]

        if {[array get $prop def] == "" } {
                array set $prop [list def "true"]
        }
        set declfr $top.decl
        frame $declfr 
        set propfr $declfr.prop
        frame $propfr

        frame $propfr.title
        label $propfr.lbl -text "$STRINGS(property):" -anchor w -bd 0   

        entry $propfr.name \
                -textvariable [format "%s(name)" $prop] \
                -bg white

        $propfr.lbl configure -font {Helvetica 14 bold}
        $propfr.name configure -font {Helvetica 14 bold}

        pack $propfr.lbl -in $propfr.title -side left -fill x
        pack $propfr.name -in $propfr.title -side left -fill x -expand 1

        frame $propfr.edit

        #==CALCULE LA TAILLE DE $propfr.title
        SetReqSize $propfr.title ew

        MiniText $propfr.edit $propfr.title 40 3 $prop def

        pack $propfr.edit -in $propfr -side top -fill both -expand 1

        #== NOUVEAUTES DANS LE MENU EDIT
        $top.edit.m add command \
                -label "$STRINGS(add-assertion)" \
                -command "OpenAssertEditor $declfr $prop \[NewDeclId $prop assert\]" 

        $top.edit.m add command \
                -label "$STRINGS(add-input)" \
                -command "OpenInputEditor $declfr $prop \[NewDeclId $prop var\]"

        $top.edit.m add command \
                -label "$STRINGS(add-variable)" \
                -command "OpenVarEditor $declfr $prop \[NewDeclId $prop var\]"

        pack $top.edit -in $top.menu -side left -anchor center

        #==PANE L'EDITEUR DE LA PROPRIETE
        #lower $declfr $propfr
        SetReqSize $propfr ew
        PutInPane $propfr $declfr

        #puts "slave : $propfr"
        #puts "pan : $declfr"

        #==PUIS LES DECLARATIONS ACCESSOIRES
        InitDeclEditors $declfr $prop

        pack $declfr -in $top -side left -fill both -expand 1
        frame $top.paramfr -bd 2 -relief sunken
        set algofr "$top.paramfr.algo"
        frame $algofr
        set algovar [format "%s(_param#algo)" $prop]
        if {! [info exists $algovar] } {
                set $algovar [lindex $XLESAR(algo%0) 0]
        }
        label $algofr.lbl -text "$STRINGS(algorithm):"
        label $algofr.nme -bd 1 -relief sunken -bg white \
                -textvariable PROCESS($prop-algo)
        trace variable $algovar w "TraceAlgo"
        proc TraceAlgo { prop field op } {
        #==NB : field DOIT ETRE "_param#algo"
        #==NB : op DOIT ETRE "w"
                global PROCESS XLESAR
                global $prop
                set algoval [lindex [array get $prop $field] 1]
                set PROCESS($prop-algo) $XLESAR(algoname$algoval)       
        #ICI
        #puts "$prop $field = $algoval"
        }
        set $algovar [subst $$algovar]
        #===LE BOUTON
        menubutton $algofr.but -highlightthickness 0 \
              -borderwidth 1 \
              -highlightthickness 0 \
              -relief raised \
              -image $PROCESS(down_arrow) \
              -menu $algofr.but.m
        #===LE MENU 
        menu $algofr.but.m -tearoff 0
        set maxww 0
        foreach algo [lsort [array names XLESAR {algo%[0-9]*}]] {
                set ww [string length [lindex $XLESAR($algo) 1]]
                if { $ww > $maxww } { set maxww $ww }
                $algofr.but.m add radiobutton \
                -label [lindex $XLESAR($algo) 1] \
                -value [lindex $XLESAR($algo) 0] \
                -variable $algovar
        }
        $algofr.nme configure -width $maxww
        pack $algofr.lbl -in $algofr -side left -anchor w
        pack $algofr.nme -in $algofr -side left -anchor w -fill x -expand 1
        pack $algofr.but -in $algofr -side left -expand 0
        set par [format "%s(_param#verb)" $prop]
        if {! [info exists $par] } {
                set $par ""
        }
        checkbutton $top.paramfr.verb \
                -onvalue "-v" \
                -offvalue "" \
                -variable $par \
                -text "$STRINGS(verbose)"
        set par [format "%s(_param#noopt)" $prop]
        if {! [info exists $par] } {
                set $par ""
        }
        checkbutton $top.paramfr.noopt \
                -onvalue "-noopt" \
                -offvalue "" \
                -variable $par \
                -text "$STRINGS(noopt)"
        set par [format "%s(_param#diag)" $prop]
        if {! [info exists $par] } {
                set $par "-diag"
        }
        checkbutton $top.paramfr.diag \
                -onvalue "-diag" \
                -offvalue "" \
                -variable $par \
                -text "$STRINGS(diagnosis)"
        set par [format "%s(_param#poly)" $prop]
        if {! [info exists $par] } {
                set $par ""
        }
        checkbutton $top.paramfr.poly \
                -onvalue "-poly" \
                -offvalue "" \
                -variable $par \
                -text "$STRINGS(use_polyhedra)"
        set par [format "%s(_param#merge)" $prop]
        if {! [info exists $par] } {
                set $par ""
        }
        checkbutton $top.paramfr.merge \
                -onvalue "-merge" \
                -offvalue "" \
                -variable $par \
                -text "$STRINGS(improve_order)"
        set par [format "%s(_param#causal)" $prop]
        if {! [info exists $par] } {
                set $par ""
        }
        checkbutton $top.paramfr.causal \
                -onvalue "-causal" \
                -offvalue "" \
                -variable $par \
                -text "$STRINGS(compute_causal)"

        grid $top.paramfr.algo -in $top.paramfr \
                -row 0 -column 0 -columnspan 2 -sticky ew

        grid $top.paramfr.verb -in $top.paramfr \
                -row 1 -column 0 -sticky w
        grid $top.paramfr.poly -in $top.paramfr \
                -row 1 -column 1 -sticky w
        grid $top.paramfr.diag -in $top.paramfr \
                -row 2 -column 0 -sticky w
        grid $top.paramfr.merge -in $top.paramfr \
                -row 2 -column 1 -sticky w
        grid $top.paramfr.causal -in $top.paramfr \
                -row 3 -column 0 -sticky w
        grid $top.paramfr.noopt -in $top.paramfr \
                -row 3 -column 1 -sticky w

        grid rowconfigure $top.paramfr 0 -weight 1
        grid rowconfigure $top.paramfr 1 -weight 1
        grid rowconfigure $top.paramfr 2 -weight 1
        grid columnconfigure $top.paramfr 0 -weight 0
        grid columnconfigure $top.paramfr 1 -weight 0
        frame $top.right
        lower $top.right $top.paramfr
        pack $top.paramfr -in $top.right -side top -fill both -expand 1
        frame $top.runfr -bd 2 -relief sunken
        button $top.runfr.go -text "$STRINGS(run_proof)" \
                -command "RunProof $prop" \
                -fg red
        $top.runfr.go configure -font {Helvetica 14 bold}
        frame $top.runfr.stat
        label $top.runfr.stat.tit \
                -text "$STRINGS(status)"
        $top.runfr.stat.tit configure -font {Helvetica 14 bold} 
        label $top.runfr.stat.val \
                -relief raised -bd 1 -bg white \
                -textvariable [format "%s(status)" $prop]
        $top.runfr.stat.val configure -font {Helvetica 14 bold}
        pack $top.runfr.stat.tit -in $top.runfr.stat -side left \
                -anchor w -fill x
        pack $top.runfr.stat.val -in $top.runfr.stat -side left \
                -anchor c -fill x -expand 1
        set PROCESS($prop-runmng) [NewRunMng $top.runfr 50 10]
        pack $PROCESS($prop-runmng) -in $top.runfr \
                -side bottom -anchor center -fill both -expand 1
        pack $top.runfr.go -in $top.runfr \
                -side left -anchor center -fill x -expand 0
        pack $top.runfr.stat -in $top.runfr \
                -side left -anchor center -fill x -expand 1
        set code_var [RunMngCode $PROCESS($prop-runmng)]
        set code_tab [lindex $code_var 0] 
        set code_field [lindex $code_var 1] 
        global $code_tab
        set v [format "%s(%s)" $code_tab $code_field]
        #ICI
        #puts "$v = [set $v]"
        trace variable $v w "UpdateStatus $prop"
        pack $top.runfr -in $top.right -side top -fill both -expand 1
        #pane $top.right -orient horizontal -dynamic
        pack $top.right -in $top -side left -fill both -expand 1

        return $top
}
proc SaveProp { ewin ebuff eres } {
        global $ebuff $eres
        #==DETRUIT eres
        unset $eres
        #==RECOPIE ebuff DANS eres
        array set $eres [array get $ebuff]
        UpdateProp $eres
}
proc SaveCloseProp { ewin ebuff eres } {
        global $ebuff $eres
        #==DETRUIT eres
        unset $eres
        #==RECOPIE ebuff DANS eres
        array set $eres [array get $ebuff]
        UpdateProp $eres
        #==DETRUIT ebuff ...
        catch {unset $ebuff}
        #==ET LA FENETRE ...
        catch {destroy $ewin}
}
proc CloseProp { ewin ebuff eres } {
        global $ebuff $eres STRINGS
        # CHANGEMENTS ?
        # N.B.
        set ask 0
        if { [array size $ebuff] != [array size $eres] } {
                set ask 1
        } else {
                if { [array get $ebuff] != [array get $eres] } {
                        set ask 1
                }
        }

        if { $ask } {
                set nme [lindex [array get $ebuff name] 1]
                switch [ tk_messageBox \
                        -default no \
                        -icon warning \
                        -message "$STRINGS(discard) $nme?" \
                        -type yesnocancel
                ] {
                        no {
                                SaveCloseProp $ewin $ebuff $eres
                                return
                        }
                        cancel {
                                return
                        }
                }
        }
        #==DETRUIT ebuff ...
        catch {unset $ebuff}
        #==ET LA FENETRE ...
        catch {destroy $ewin}
}
proc ShowHideDescr { top descrfr prop field op } {
        global $prop

#puts "ShowHideDescr $top $descrfr $prop $field $op"
#puts "show = [lindex [array get $prop $field] 1]"

  #PACK SOUS LE MENU :
  if { [lindex [array get $prop $field] 1] } {
    pack $descrfr -in $top -after $top.menu -side top -fill both -expand 0
  } else {
    pack forget $descrfr
  }
}
proc NewDeclId { prop nat } {
#ON RECHERCHE UN ID QUI N"EXISTE PAS ENCORE
   global $prop
   set count 0
   while { [info exists [format "%s(decl$count:)" $prop]]} {
      incr count
   }
   set id "decl$count:"
   array set $prop [list $id $nat]
#puts [array get $prop]
   return $id
}
proc InitDeclEditors { cont prop } {
   #== RECHERCHE TOUTES LES DECL EXISTANTE
   global $prop
   foreach id [array names $prop {decl*:}] {
      switch [lindex [array get $prop $id] 1] {
         assert {
            OpenAssertEditor $cont $prop $id
         }
         var {
            OpenVarEditor $cont $prop $id
         }
         input {
            OpenInputEditor $cont $prop $id
         }
      }
   }
}
proc OpenAssertEditor {cont prop id } {
#puts "OpenAssertEditor"
   global STRINGS
   global $prop
   array set $prop [list $id "assert" ]

   #==INIT DES VARIABLES (SI N'EXISTENT PAS DEJA)
   set enabled [format "%s(%s:%s)" $prop $id "enabled"]
   if {! [info exists $enabled] } {
      set $enabled 1
   }
   set def [format "%s(%s:%s)" $prop $id "def"]
   if {! [info exists $def] } {
      set $def "true"
   }

   #==LE MINI-TEXT
   catch {destroy $cont.$id}
   frame $cont.$id

   #==LA BARRE DE TITRE
   frame $cont.$id.title
   label $cont.$id.title.lbl \
      -text "$STRINGS(assertion)" -anchor w -bd 0
   checkbutton $cont.$id.title.en \
      -text "$STRINGS(enabled)" \
      -variable $enabled
   button $cont.$id.title.kill -text "x" \
      -fg red -cursor pirate \
      -command "KillDeclEditor $cont $cont.$id $prop $id"
   pack $cont.$id.title.lbl -side left -anchor w -fill x -expand 1
   pack $cont.$id.title.en -side left
   pack $cont.$id.title.kill -side left

   #==POUR FORCER LA TAILLE DU MINITEXT
   SetReqSize $cont.$id.title ew

   #==CONSTRUCTION DU MINI-TEXT
   MiniText $cont.$id $cont.$id.title 40 3 $prop "$id:def"

   #pack $cont.$id -side top -fill both -expand 1
   PutInPane $cont.$id $cont

}
proc OpenVarEditor {cont prop id } {
#puts "OpenVarEditor"
   global STRINGS
   global $prop
   array set $prop [list $id "var" ]

   #==INIT DES VARIABLES (SI N'EXISTENT PAS DEJA)
   set enabled [format "%s(%s:%s)" $prop $id "enabled"]
   if {! [info exists $enabled] } {
      set $enabled 1
   }
#puts "$enabled = [set $enabled]"
   set def [format "%s(%s:%s)" $prop $id "def"]
   if {! [info exists $def] } {
      set $def "true"
   }
#puts "$def = [set $def]"
   set name [format "%s(%s:%s)" $prop $id "name"]
   if {! [info exists $name] } {
      set $name [string trimright $id :]
   }
#puts "$name = [set $name]"
   set type [format "%s(%s:%s)" $prop $id "type"]
   if {! [info exists $type] } {
      set $type "bool"
   }
#puts "$type = [set $type]"

   #==LE MINI-TEXT
   catch {destroy $cont.$id}
   frame $cont.$id

   #==LA BARRE DE TITRE
   frame $cont.$id.title
   label $cont.$id.title.lbl \
      -text "$STRINGS(var)" -anchor w -bd 0
   entry $cont.$id.title.name \
      -textvariable $name \
      -bg white -width 10
   label $cont.$id.title.coma \
      -text " : " -anchor w -bd 0
   #==CHOIX DU TYPE DANS UN COMBOBOX
   combobox $cont.$id.title.type \
      -textvariable $type \
      -background white -width 6
   $cont.$id.title.type list insert end "bool"
   $cont.$id.title.type list insert end "int"
   $cont.$id.title.type list insert end "real"

   checkbutton $cont.$id.title.en \
      -text "$STRINGS(enabled)" \
      -variable $enabled
   button $cont.$id.title.kill -text "x" \
      -fg red -cursor pirate \
      -command "KillDeclEditor $cont $cont.$id $prop $id"
   pack $cont.$id.title.lbl -side left -anchor w
   pack $cont.$id.title.name -side left -anchor w -fill x -expand 1
   pack $cont.$id.title.coma -side left -anchor w
   pack $cont.$id.title.type -side left -anchor w -fill x -expand 1
   pack $cont.$id.title.en -side left
   pack $cont.$id.title.kill -side left

   #==POUR FORCER LA TAILLE DU MINITEXT
   SetReqSize $cont.$id.title ew

   #==CONSTRUCTION DU MINI-TEXT
   MiniText $cont.$id $cont.$id.title 40 3 $prop "$id:def"

   #pack $cont.$id -side top -fill both -expand 1
   PutInPane $cont.$id $cont

}
proc OpenInputEditor {cont prop id } {
#puts "OpenInputEditor"
   global STRINGS
   global $prop
   array set $prop [list $id "input" ]

   #==INIT DES VARIABLES (SI N'EXISTENT PAS DEJA)
   set enabled [format "%s(%s:%s)" $prop $id "enabled"]
   if {! [info exists $enabled] } {
      set $enabled 1
   }
#puts "$enabled = [set $enabled]"
   set name [format "%s(%s:%s)" $prop $id "name"]
   if {! [info exists $name] } {
      set $name [string trimright $id :]
   }
#puts "$name = [set $name]"
   set type [format "%s(%s:%s)" $prop $id "type"]
   if {! [info exists $type] } {
      set $type "bool"
   }
#puts "$type = [set $type]"

   #==LE MINI-TEXT
   catch {destroy $cont.$id}
   frame $cont.$id

   #==LA BARRE DE TITRE
   frame $cont.$id.title
   label $cont.$id.title.lbl \
      -text "$STRINGS(input)" -anchor w -bd 0
   entry $cont.$id.title.name \
      -textvariable $name \
      -bg white -width 10
   label $cont.$id.title.coma \
      -text " : " -anchor w -bd 0
   #==CHOIX DU TYPE DANS UN COMBOBOX
   combobox $cont.$id.title.type \
      -textvariable $type \
      -background white -width 6
   $cont.$id.title.type list insert end "bool"
   $cont.$id.title.type list insert end "int"
   $cont.$id.title.type list insert end "real"

   checkbutton $cont.$id.title.en \
      -text "$STRINGS(enabled)" \
      -variable $enabled
   button $cont.$id.title.kill -text "x" \
      -fg red -cursor pirate \
      -command "KillDeclEditor $cont $cont.$id $prop $id"
   pack $cont.$id.title.lbl -side left -anchor w
   pack $cont.$id.title.name -side left -anchor w -fill x -expand 1
   pack $cont.$id.title.coma -side left -anchor w
   pack $cont.$id.title.type -side left -anchor w -fill x -expand 1
   pack $cont.$id.title.en -side left
   pack $cont.$id.title.kill -side left

   #==POUR FORCER LE CALCUL DE TAILLE
   SetReqSize $cont.$id.title ew

   #==PACK DU TITRE DANS LE FRAME PRINCIPAL
        #==(N.B. IL EST TOUT SEUL !)
        #==(ON FORCE ENCORE UN CALCUL DE TAILLE)
        pack $cont.$id.title -in $cont.$id -side top -fill x 
   SetReqSize $cont.$id ew

   #pack $cont.$id -side top -fill both -expand 1
   PutInPane $cont.$id $cont

}
proc KillDeclEditor { pan win prop id } {
#puts "KillDeclEditor $pan $win $prop $id"
   global $prop STRINGS

        set rep [tk_messageBox \
                -icon question \
                -message "$STRINGS(really_destroy_def)" \
                -type yesno \
                -default no \
        ]
        if { $rep == "no" } {
                return
        }
   foreach field [array names $prop "$id*"] {
      unset [format "%s(%s)" $prop $field]
   }
   destroy $win
}
proc UpdateStatus { prop vartab varfield op } {
#ICI
#puts "UpdateStatus $prop $vartab $varfield $op"
        global STRINGS
        global $vartab
        global $prop
        if { $varfield != "" } {
                set code [lindex [array get $vartab $varfield] 1]
        } else {
                set code [set $vartab]
        }
        switch $code {
                0 {
                        array set $prop [list status "$STRINGS(checked)"]
                }
                255 {
                        array set $prop [list status "$STRINGS(not_checked)"]
                }
                default {
                        array set $prop [list status "$STRINGS(unknown)"]
                }
        }
}
proc RunProof { prop } {
   global XLESAR PROJECT STRINGS COMMANDS PROCESS
   global $prop

        if { ! [StaticCheckProp $prop] } {
                return
        }
        set proof_file [BuildProofFile $prop ecprop ]

}
proc StaticCheckProp { prop } {
   global XLESAR PROJECT STRINGS COMMANDS PROCESS
   global $prop

        ecprg ecprop
        set nodelist [array names PROJECT "import-node:*"]
        foreach inode $nodelist {
                set profil [lindex $PROJECT($inode) 1]
                eval ecprop add-func "$profil"
        }
        set max [$PROJECT(mainec) nb-funcs]
        for {set i 0} {$i < $max} {incr i} {
                set decl [$PROJECT(mainec) func-decl $i]
                eval ecprop add-func $decl
        }       
        set max [$PROJECT(mainec) nb-ins]
        for {set i 0} {$i < $max} {incr i} {
                set nme [$PROJECT(mainec) in-name $i]
                set typ [$PROJECT(mainec) in-type $i]
                ecprop add-in $typ $nme
        }       
        set max [$PROJECT(mainec) nb-outs]
        for {set i 0} {$i < $max} {incr i} {
           set nme [$PROJECT(mainec) out-name $i]
           set typ [$PROJECT(mainec) out-type $i]
                ecprop add-loc $typ $nme
        }
        foreach id [array names $prop {decl*:}] {
          if { [lindex [array get $prop $id] 1] == "input" } {
            set en [lindex [array get $prop "$id:enabled" ] 1]
            if { $en } {
              set nme [lindex [array get $prop "$id:name" ] 1]
              set typ [lindex [array get $prop "$id:type" ] 1]
              if { [catch {ecprop add-in $typ $nme} res ] } {
                ErrorBoxMsg "$STRINGS(cant_add_input) '$nme'" \
                $res
                return 0
              }
            }
          }
        }
        if { [ecprop nb-ins] == 0 } {
                ErrorBoxMsg "$STRINGS(cant_run_proof)" \
                        "$STRINGS(HELP_need_input)"
                return 0
        }
        foreach id [array names $prop {decl*:}] {
          if { [lindex [array get $prop $id] 1] == "var" } {
            set en [lindex [array get $prop "$id:enabled" ] 1]
            if { $en } {
              set nme [lindex [array get $prop "$id:name" ] 1]
              set typ [lindex [array get $prop "$id:type" ] 1]
              if { [catch {ecprop add-loc $typ $nme} res ] } {
                ErrorBoxMsg "$STRINGS(cant_add_var) '$nme'" \
                $res
                return 0
              }
            }
          }
        }
        foreach id [array names $prop {decl*:}] {
          if { [lindex [array get $prop $id] 1] == "var" } {
            set en [lindex [array get $prop "$id:enabled" ] 1]
            if { $en } {
              set nme [lindex [array get $prop "$id:name" ] 1]
              set def [lindex [array get $prop "$id:name" ] 1]
                        #==PARSE DE L'EXPRESSION
              if { [catch {ecprop exp $def } res ] } {
                ErrorBoxMsg "$STRINGS(parse_error) '$nme' $STRINGS(equation)" \
                $res
                return 0
              }
                        set ecexp $res
                        #==PARSE DE L'EQUATION
              if { [catch {ecprop eq $nme $ecexp} res ] } {
                ErrorBoxMsg "$STRINGS(parse_error) '$nme' $STRINGS(equation)" \
                $res
                return 0
              }
            }
          }
        }
        foreach id [array names $prop {decl*:}] {
          if { [lindex [array get $prop $id] 1] == "assert" } {
            set en [lindex [array get $prop "$id:enabled" ] 1]
            if { $en } {
              set def [lindex [array get $prop "$id:def" ] 1]
                        #==PARSE DE L'EXPRESSION
              if { [catch {ecprop exp $def } res ] } {
                ErrorBoxMsg "$STRINGS(assert_parse_error) '$def' " \
                $res
                return 0
              }
                        set ecexp $res
                        #==VERIFIE LE TYPE
                        set typ [ecprop exp-type $ecexp]
                        if { $typ != "bool" } {
                ErrorBoxMsg "$STRINGS(bad_assert_type) '$typ' " \
                                $STRINGS(HELP_assert_type)
                return 0
              }
            }
          }
        }
        if { [catch {ecprop exp [lindex [array get $prop def] 1]} res ]} {
                ErrorBoxMsg "$STRINGS(parse_error) '[lindex [array get $prop name] 1]'" \
                        $res
                return 0
        }
        #==VERIFIE LE TYPE
        set ecexp $res
        set typ [ecprop exp-type $ecexp]
        if { $typ != "bool" } {
           ErrorBoxMsg "$STRINGS(bad_prop_type) '$typ' " \
                $STRINGS(HELP_prop_type)
           return 0
        } 

        return 1
}
proc BuildProofFile { prop ecp } {
   global XLESAR PROJECT STRINGS COMMANDS PROCESS
   global $prop
#puts $ecp
#puts "nbin = [$ecp nb-ins]"
#puts "nbloc = [$ecp nb-locs]"
#puts "nbout = [$ecp nb-outs]"

        cd $PROCESS(work_dir)
        set pfile_name $PROCESS(work_dir)/$prop.lus
        catch {exec rm -f $pfile_name}
        catch {exec echo "--XLESAR PROOF FILE" > $pfile_name}

        
        if { [file isdirectory $PROCESS(import_dir)] } {
           set tlist [exec ls $PROCESS(import_dir)]
           foreach item $tlist {
                   catch {exec echo "include \"./import/$item\"" >> $pfile_name}
           }
        }
        if { [info exists PROCESS(mainec_file)] } {
           if { [file exists $PROCESS(mainec_file)] } {
                   catch {exec echo "" >> $pfile_name}
                   catch {exec echo "--PROGRAM TO CHECK" >> $pfile_name}
                   catch {exec cat $PROCESS(mainec_file) >> $pfile_name}
           }
        }
        set pfile [open "$PROCESS(work_dir)/$prop.lus" a]
        puts $pfile "--PROOF NODE"
        puts $pfile "node $prop ("
        set nbins [$PROJECT(mainec) nb-ins]

        #===LES ENTREES DU NOEUD DE PREUVE
        #=====(D'ABORD CELLES DU MAIN)
        for {set i 0} {$i < $nbins} {incr i} {
           puts $pfile \
                        "   [$PROJECT(mainec) in-name $i] : [$PROJECT(mainec) in-type $i];"
        }
        #=====(PUIS LES AUXILLIAIRES)
        foreach id [array names $prop {decl*:}] {
          if { [lindex [array get $prop $id] 1] == "input" } {
            set en [lindex [array get $prop "$id:enabled" ] 1]
            if { $en } {
              set nme [lindex [array get $prop "$id:name" ] 1]
              set typ [lindex [array get $prop "$id:type" ] 1]
                        puts $pfile \
                                "   $nme : $typ;"
            }
          }
        }
        puts $pfile ") returns ("
        puts $pfile "   ok : bool"
        puts $pfile ");"

        #===LES LOCALES DU NOEUD DE PREUVE
        if { [$ecp nb-locs] != 0 } {
                puts $pfile "var"
        }
        #=====(D'ABORD LES SORTIES DU MAIN)
        set nbouts [$PROJECT(mainec) nb-outs]
        if { $nbouts } {
                for {set i 0} {$i < $nbouts} {incr i} {
                puts $pfile \
                                "   [$PROJECT(mainec) out-name $i] : [$PROJECT(mainec) out-type $i];"
                }
        }
        #=====(PUIS LES AUXILLIAIRES)
        foreach id [array names $prop {decl*:}] {
          if { [lindex [array get $prop $id] 1] == "var" } {
            set en [lindex [array get $prop "$id:enabled" ] 1]
            if { $en } {
              set nme [lindex [array get $prop "$id:name" ] 1]
              set typ [lindex [array get $prop "$id:type" ] 1]
                        puts $pfile \
                                "   $nme : $typ;"
            }
          }
        }
        #===DEBUT DES EQUATIONS
        puts $pfile "let"
        #===ASSERTIONS AUXILLIAIRES
        foreach id [array names $prop {decl*:}] {
          if { [lindex [array get $prop $id] 1] == "assert" } {
            set en [lindex [array get $prop "$id:enabled" ] 1]
            if { $en } {
              set def [lindex [array get $prop "$id:def" ] 1]
                        puts $pfile "assert $def;"
            }
          }
        }
        #===LOCALES AUXILLIAIRES
        foreach id [array names $prop {decl*:}] {
          if { [lindex [array get $prop $id] 1] == "var" } {
            set en [lindex [array get $prop "$id:enabled" ] 1]
            if { $en } {
              set nme [lindex [array get $prop "$id:name" ] 1]
              set def [lindex [array get $prop "$id:def" ] 1]
                        puts $pfile "$nme = $def;"
            }
          }
        }
        #===L'APPEL DU NOEUD A VALIDER
        if { $nbouts } {
                puts -nonewline $pfile "(  [$PROJECT(mainec) out-name 0]"
                for {set i 1} {$i < $nbouts} {incr i} {
                        puts $pfile ","
                        puts -nonewline $pfile "   [$PROJECT(mainec) out-name $i]"
                }
                puts -nonewline $pfile " ) = $PROJECT(main_node) ("
                if { $nbins } {
                        puts -nonewline $pfile "[$PROJECT(mainec) in-name 0]"
                        for {set i 1} {$i < $nbins} {incr i} {
                                puts $pfile ","
                                puts -nonewline $pfile "      [$PROJECT(mainec) in-name $i]"
                        }
                }
                puts $pfile "\n);"
        }
        #===LA DEFINITION DE LA PROPRIETE
        puts -nonewline $pfile "ok = "
        puts -nonewline $pfile "[lindex [array get $prop def] 1]"
        puts $pfile ";"

        #===FIN DES EQUATIONS
        puts $pfile "tel"

        #===FERMETURE DU FICHIER
        close $pfile 
        set comm "$COMMANDS(lesar) $pfile_name $prop -pipe"

        foreach par [array names $prop "_param#*"] {
                set par [lindex [array get $prop $par] 1]
                if { $par != "" } {
                        append comm " $par"
                }
        }
        #ICI
        #puts "$comm"
        StartRunMng "$PROCESS($prop-runmng)" "$comm" "FG"
}
#==============================================================================
#   RECUPERATION DES ARGUMENTS
#==============================================================================
foreach opt $argv {
        if { $opt == "-version" } {
                puts -nonewline $XLESAR(version)
                exit
        }
}
#==============================================================================
#   LE MAIN
#==============================================================================
        # WINDOW CONFIGURATION
        set WPATH(root) "."
        #wm positionfrom . ""
        wm sizefrom . ""
        #wm maxsize . 800 800
        wm title . "$XLESAR(tool_name)"

        wm positionfrom . "program"
        #========declaration
        set WPATH(menu) ".menu"
        frame $WPATH(menu) -borderwidth {2} -relief {raised}
        #========initialisation
        set WPATH(files) $WPATH(menu).files

        menubutton $WPATH(files) \
                -menu "$WPATH(files).m" \
                -text $STRINGS(files)\
                -underline {0}

        menu $WPATH(files).m \
                -tearoff 0

        $WPATH(files).m add command \
           -command { SaveProject "$PROCESS(save_file)" 1 } \
           -label "$STRINGS(save_project)" \
           -underline {0}
        $WPATH(files).m add command \
           -command { SaveProjectAs } \
           -label "$STRINGS(save_project_as)" \
           -underline {0}
        $WPATH(files).m add command \
           -command { LoadProject } \
           -label "$STRINGS(load_project)" \
           -underline {0}
        $WPATH(files).m add command \
           -command { NewProject } \
           -label "$STRINGS(new_project)" \
           -underline {0}

        $WPATH(files).m add separator

        $WPATH(files).m add command \
           -command { Help } \
           -label "$STRINGS(help)" \
           -underline {0}

        $WPATH(files).m add command \
           -command { Quit } \
           -label "$STRINGS(quit)" \
           -underline {0}

        pack $WPATH(files) -side left -anchor center
        set WPATH(import) $WPATH(menu).import
        button $WPATH(import) \
                -command { ImportManager } \
                -text "$STRINGS(import_code)" \
                -borderwidth {0} \
                -underline {0}

        pack $WPATH(import) -side left -anchor center

        #========pack
        pack $WPATH(menu) -side top -anchor center -fill x
        #========declaration
        set WPATH(main) ".main"
        frame $WPATH(main)
        #========initialisation
        #=== PARTIE "main file"
        set WPATH(main_file) $WPATH(main).file
        frame $WPATH(main_file) -borderwidth {2} -relief {raised}
        label $WPATH(main_file).title \
                -text $STRINGS(main_file) -anchor {center} -width {15}
        label $WPATH(main_file).var \
                -borderwidth {2} \
                -anchor {w} \
                -textvariable {PROJECT(main_file)} \
                -relief {sunken}
        pack $WPATH(main_file).title -side left -anchor center  
        pack $WPATH(main_file).var -side left  -anchor center -expand 1 -fill x

        #=== PARTIE "main node"
        set WPATH(main_node) $WPATH(main).node
        frame $WPATH(main_node) -borderwidth {2} -relief {raised}
        label $WPATH(main_node).title \
           -text $STRINGS(main_node) -anchor {center} -width {15}
        label $WPATH(main_node).var \
           -borderwidth {2} \
           -anchor {w} \
           -textvariable {PROJECT(main_node)} \
           -relief {sunken}
        button $WPATH(main_node).select \
           -borderwidth {2} \
           -anchor {w} \
           -relief {raised} \
           -text $STRINGS(browse) \
           -command "SelectMain"
        pack $WPATH(main_node).title -side left -anchor center
        pack $WPATH(main_node).var -side left -anchor center -expand 1 -fill x
        pack $WPATH(main_node).select -side left -anchor center

        #== PACK DU MAIN
        pack $WPATH(main_file) -side top -anchor center -fill x
        pack $WPATH(main_node) -side top -anchor center -fill x
        # pack
        #========pack
        pack $WPATH(main) -side top -anchor center -fill x
#======== DECLARATION
set WPATH(info) ".info"
frame $WPATH(info) -relief flat -bd 0
pack $WPATH(info) -in . -side top -fill x 
set WPATH(inlist) .inlist
BuildVarList "Inputs"  .inframe $WPATH(inlist)
set WPATH(outlist) .outlist
BuildVarList "Outputs" .outframe $WPATH(outlist)
pack .inframe -in $WPATH(info) -side left -fill x -expand 1
pack .outframe -in $WPATH(info) -side left -fill x -expand 1
#======== DECLARATION
set WPATH(propframe) ".propframe"
frame $WPATH(propframe) -relief flat -bd 0
pack $WPATH(propframe) -in . -side top -expand 1 -fill both
#======== LA MCLIST DES PROPRIETES
set WPATH(proplist) $WPATH(propframe).mclist
mclistbox $WPATH(proplist)\
        -bd 0 -height 8 \
        -columnrelief flat \
        -labelanchor w \
        -columnborderwidth 0 \
        -labelborderwidth 2 \
        -fillcolumn comment \
        -yscrollcommand [list $WPATH(propframe).vsb set] 
#======== L'ASCENSEUR DES PROPRIETES
scrollbar $WPATH(propframe).vsb \
        -relief raised -bd 1 \
        -orient vertical \
        -command [list $WPATH(proplist) yview] 
#======== LES COLONNES DE LA LISTE DE PROP
$WPATH(proplist) column add name -label "Property" -width 15
$WPATH(proplist) column add comment -label "Comment" -width 15
$WPATH(proplist) column add status -label "Status" -width 10
button $WPATH(propframe).new \
        -borderwidth 2 \
        -relief raised \
        -text $STRINGS(new) \
        -command NewProperty
button $WPATH(propframe).edit \
        -borderwidth 2 \
        -relief raised \
        -text $STRINGS(edit) \
        -command EditProperty
button $WPATH(propframe).delete \
        -borderwidth 2 \
        -relief raised \
        -text $STRINGS(delete) \
        -command DeleteProperty
#==== GRID DE L'ASCENSEUR DANS [0, 0-2]
grid $WPATH(propframe).vsb -in $WPATH(propframe) \
        -row 0 -rowspan 3 \
        -column 0 \
        -sticky ns
#==== GRID DE LA LISTE DANS [1,0-2]
grid $WPATH(proplist) -in $WPATH(propframe) \
        -row 0 -rowspan 3 \
        -column 1 \
        -sticky nsew \
        -padx 0 -pady 0
#==== GRID DES BOTONS DANS [2,xx]
grid $WPATH(propframe).edit -in $WPATH(propframe) \
        -row 0 -column 2 -sticky nsew
grid $WPATH(propframe).new -in $WPATH(propframe) \
        -row 1 -column 2 -sticky nsew
grid $WPATH(propframe).delete -in $WPATH(propframe) \
        -row 2 -column 2 -sticky nsew
grid columnconfigure $WPATH(propframe) 0 -weight 0
grid columnconfigure $WPATH(propframe) 1 -weight 1
grid columnconfigure $WPATH(propframe) 2 -weight 0 

grid rowconfigure $WPATH(propframe) 0 -weight 1
grid rowconfigure $WPATH(propframe) 1 -weight 1
grid rowconfigure $WPATH(propframe) 2 -weight 1
trace variable PROJECT(proplist) w UpdatePropList
set PROJECT(proplist) $PROJECT(proplist) 
#==============================================================================
#   L'EPILOGUE
#==============================================================================
#CREER LE FICHIER "void.lesar"
SaveProject "$PROCESS(run_dir)/void.lesar" 0
