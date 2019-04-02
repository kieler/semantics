#==============================================================================
#      PWISH (ex     XLesar)
#------------------------------------------------------------------------------
# select-lus.tcl
#------------------------------------------------------------------------------
# Selection d'un fichier lustre et d'un noeud principal
#
#==============================================================================
set SelectLusStrings(lustre_files) "Academic Lustre Files"
set SelectLusStrings(unknown_ft) "Unknown File Type"
set SelectLusStrings(browse) "Browse"
set SelectLusStrings(ok) "OK"
set SelectLusStrings(cancel) "Cancel"

#==========================================
#VARIABLES ``PRIVEES'' DE SelectLus
#==========================================
set SelectLusVars(file) {}
set SelectLusVars(node) {}
set SelectLusVars(type) {}
set SelectLusVars(static_check) {} 
set SelectLusVars(_lasttype) {}
set SelectLusVars(_nodelist) {}
#==========================================
#PROCEDURES ``PRIVEES'' DE SelectLus
#==========================================
#==========================================
#SOUS-PROCEDURE SelectLusChType
#=>Appellee quand on selectionne un type
#==========================================
proc SelectLusChType { } {
	global SelectLusVars
	if { $SelectLusVars(_lasttype) != $SelectLusVars(type) } {
		set SelectLusVars(file) {}
		set SelectLusVars(node) {}
		set SelectLusVars(_nodelist) {}
		set SelectLusVars(_lasttype) $SelectLusVars(type)
	}
}
#==========================================
#SOUS-PROCEDURE SelectLusUpdateNodes
#=> Recalcule et reaffiche la liste des
#noeuds correspondant au couple 
#type/fichier courant.
#N.B. APPELEE CHAQUE FOIS QU'ON MODIFIE
#LE FICHIER PRINCIPAL, VIA LA PROC.
#``SelectLusTraceFile''
#==========================================
proc SelectLusUpdateNodes { } {
# Rafraichit la liste SelectLusVars(_nodelist)
	global LUVARS SelectLusVars
	if {$SelectLusVars(file) == ""} then {
		set SelectLusVars(_nodelist) {}
#	} elseif {$SelectLusVars(type) == "sao"} then {
#		set SelectLusVars(_nodelist) [GetNodesInSaofdm "$SelectLusVars(file)"]
	} elseif {$SelectLusVars(type) == "lus"} then {
		set SelectLusVars(_nodelist) [GetNodesInLustre "$SelectLusVars(file)"]
	} else {
		ErrorBox "$STRING(unknown_ft):\n$$SelectLusVars(file)"
		set SelectLusVars(_nodelist) {}
		return
	}
}
proc SelectLusFillNodeList { } {
	global LUVARS SelectLusVars
# DOIT etre appelee apres SelectLusUpdateNodeList
	if {$SelectLusVars(_nodelist) == {} } then {
		SelectLusUpdateNodes
	}
	.selectlus.nodefr.items delete 0 end
	foreach item $SelectLusVars(_nodelist) {
		.selectlus.nodefr.items insert end $item
		if {$SelectLusVars(node) == $item } {
			.selectlus.nodefr.items selection set end 
		} 
	}
	if { [.selectlus.nodefr.items size] == 1 } {
		.selectlus.nodefr.items selection set end
	}
#puts [lindex $SelectLusVars(_nodelist) [.selectlus.nodefr.items curselection]]
}
proc SelectLusTraceFile {nm1 nm2 op} {
	SelectLusUpdateNodes
	SelectLusFillNodeList
}
#==========================================
#SOUS-PROCEDURE SelectLusDestroy
#=>Ferme la fenetre sans modifier les 
#parametres.
#==========================================
proc SelectLusDestroy { } {
	global SelectLusVars
	trace vdelete SelectLusVars(file) w SelectLusTraceFile 
	catch {destroy .selectlus}
}
#==========================================
#SOUS-PROCEDURE SelectLusOut
#=>Verifie les resultats, puis (si tout va bien)
#positionne les parametres et ferme la fenetre.
#==========================================
proc SelectLusOut { tabRes fileField nodeField typeField givenNode} {
	global SelectLusVars
	global $tabRes
	if { $SelectLusVars(file) == "" } {
		ErrorBox "You must select a source file"
		return
	}
	set SelectLusVars(node) $givenNode
	if { $SelectLusVars(node) == "" } {
	# si le noeud est pas donne, il doit
	# etre selectionne dans la liste
		if { [.selectlus.nodefr.items curselection] == {} } {
			ErrorBox "You must select a node"
			return
		}
		set SelectLusVars(node) \
			[lindex $SelectLusVars(_nodelist) [.selectlus.nodefr.items curselection]]
	}

	if { $SelectLusVars(static_check) != "" } {
		if { [$SelectLusVars(static_check) \
			$SelectLusVars(file) \
			$SelectLusVars(node)	]
		} {
			return
		}
	}

	set $tabRes\($fileField\) $SelectLusVars(file)
	set $tabRes\($nodeField\) $SelectLusVars(node)
	set $tabRes\($typeField\) $SelectLusVars(type)

	SelectLusDestroy
}
#==========================================
#SOUS-PROCEDURE SelectLusBrowseFile
#==========================================
proc SelectLusBrowseFile { titre } {
	global SelectLusVars
	global SelectLusStrings
	set rep ""

#ICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICI
# PAS DE SAO POUR L'INSTANT
#	if {$SelectLusVars(type) == "sao"} then {
#		set rep [tk_getOpenFile \
#			-title "$titre" \
#			-defaultextension ".saofdm" \
#			-filetypes {\
#				{{SAO description Files}    {*.saofdm}}\
#				{{Academic Lustre Files}    {*.lus *.ec}}\
#			}
#		]
#	} elseif {$SelectLusVars(type) == "lus"} then {
#ICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICI
		set ftypes [list "$SelectLusStrings(lustre_files)" {*.lus *.ec}] 
		set rep [tk_getOpenFile \
			-title "$titre" \
			-defaultextension ".lus" \
			-defaultextension ".ec" \
			-filetypes [list $ftypes ]

			#-filetypes {{"$SelectLusStrings(lustre_files)"    {*.lus *.ec}}}
#ICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICI
#			-filetypes {\
#				{{Academic Lustre Files}    {*.lus *.ec}}\
#				{{SAO description Files}    {*.saofdm}}\
#			}
#ICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICI
		]
#ICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICI
#	} else {
#		ErrorBox "Unknown File Type:\n\"$SelectLusVars(type)\""
#		return
#	}
#ICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICI
	if {$rep != ""} {
		set ext [file extension $rep]
		if {$ext == ".saofdm"} then {
			set SelectLusVars(type) "sao"
		} elseif {$ext == ".lus"} then {
			set SelectLusVars(type) "lus"
		} elseif {$ext == ".ec"} then {
			set SelectLusVars(type) "lus"
		} else {
			ErrorBox "$SelectLusStrings(unknown_ft):\n\"$ext\""
			return
		}
		set SelectLusVars(file) $rep
	}	
}
#==========================================
# RECUPERATION DES NOMS DE NOEUDS DANS UN FICHIER LUSTRE
#==========================================
proc GetNodesInLustre { lusFile } {
	global LUVARS SelectLusVars
   global COMMANDS 

  	set res {}
  	if {[catch {
     	set res [exec $COMMANDS(lusinfo) $lusFile nodes]}]
  	} {
    	ErrorBox "lusinfo:\nUnable to parse \"$lusFile\""
  	}
  	return $res
}
#==========================================
#PROCEDURE SelectLusBrowswNode
#==========================================
#=>Les entrees sont des noms de variables
#globales (parametre in/out)
#  Les traitements se font sur des variables
#privees, initialisees avec les valeurs des
#parametres.
#SORTIE : En cas de ``cancel'', rien. Sinon,
#les valeurs des variables privees sont recopiees
#dans les parametres.
#N.B.: Recherche en priorite le nom du fichier
#==========================================
proc SelectLusBrowseNode { titre tabRes fileField nodeField typeField } {
	global SelectLusVars
	global SelectLusStrings
	global $tabRes

	#FENETRE PRINCIPALE
	toplevel .selectlus

# ON COMMENCE PAR CHERCHER LA LISTE DES NOEUDS
	SelectLusUpdateNodes

#SI ON A 1 SEUL NOEUD : fini

   if { [llength $SelectLusVars(_nodelist)] == 1 } {
		set givenNode [lindex $SelectLusVars(_nodelist) 0]
		SelectLusOut $tabRes $fileField $nodeField $typeField $givenNode 
		return
   }



#TYPE DE FICHIER
	frame .selectlus.typefr 

#ICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICI
# PAS DE SAO POUR L'INSTANT
#	radiobutton .selectlus.typefr.sao \
#		-borderwidth {2} -relief {raised} \
#		-text "Modele SAO" \
#		-variable SelectLusVars(type) \
#		-value "sao" \
#		-command "SelectLusChType"
#	radiobutton .selectlus.typefr.lus \
#		-borderwidth {2} -relief {raised} \
#		-text "Fichier Lustre" \
#		-variable SelectLusVars(type) \
#		-value "lus" \
#		-command "SelectLusChType"
#
#	pack append .selectlus.typefr \
#		.selectlus.typefr.sao {left frame center expand fillx} \
#		.selectlus.typefr.lus {left frame center expand fillx}
#ICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICIICI

#NOM DU FICHIER
	frame .selectlus.filefr
	label .selectlus.filefr.titre \
		-text {Source} \
		-anchor {w}
	label .selectlus.filefr.var \
		-width 50 \
		-borderwidth {2} -relief {sunken} -anchor {w} \
		-textvariable SelectLusVars(file)
	button .selectlus.filefr.select \
		-borderwidth {2} -anchor {w} -relief {raised} \
		-text $SelectLusStrings(browse) \
		-command "SelectLusBrowseFile \"$titre\""
	pack append .selectlus.filefr \
		.selectlus.filefr.titre {left frame center } \
		.selectlus.filefr.var {left frame center expand fillx} \
		.selectlus.filefr.select {left frame center }

#LISTE DES NOEUDS
	frame .selectlus.nodefr \
		-borderwidth 2 -relief sunken
	listbox .selectlus.nodefr.items \
		-exportselection false \
		-selectmode single \
		-relief sunken
	bind .selectlus.nodefr.items <Double-Button-1> \
		"SelectLusOut $tabRes $fileField $nodeField $typeField {}"
	BuildScrolls .selectlus.nodefr .selectlus.nodefr.items

#COMMANDES
	frame .selectlus.commfr
	button .selectlus.commfr.ok \
		-text $SelectLusStrings(ok) \
		-command "SelectLusOut $tabRes $fileField $nodeField $typeField {}"
	button .selectlus.commfr.cancel \
		-text $SelectLusStrings(cancel) \
		-command "SelectLusDestroy"
	pack append .selectlus.commfr \
		.selectlus.commfr.ok {left fill expand} \
		.selectlus.commfr.cancel {left fill expand}

#PACK GENERAL
	pack append .selectlus \
		.selectlus.typefr {top frame center fillx} \
		.selectlus.filefr {top frame center fillx} \
		.selectlus.nodefr {top frame center expand fill} \
		.selectlus.commfr {top frame center fillx}

#OUVERTURE DU TOPLEVEL
	#wm positionfrom .selectlus "user"
	#wm minsize .selectlus 500 200
	wm title .selectlus "$titre"
	OpenTopLevel .selectlus midscreen

#INITIALISATION
	SelectLusFillNodeList
	trace variable SelectLusVars(file) w SelectLusTraceFile 

#BOUCLE PRINCIPALE (ATTENT LA MORT DE LA FENETRE)
	update idletask
	grab .selectlus
	tkwait window .selectlus
}
#==========================================
#PROCEDURES PRINCIPALE
#==========================================
proc SelectLus { titre tabRes fileField nodeField typeField checkProc } {
   global SelectLusVars
   global $tabRes

#INITIALISATION DES VARIABLES PRIVEES
   #trace variable SelectLusVars(file) w SelectLusTraceFile
   set SelectLusVars(type) [set $tabRes\($typeField\)]
   set SelectLusVars(node) [set $tabRes\($nodeField\)]
   set SelectLusVars(file) [set $tabRes\($fileField\)]
	set SelectLusVars(static_check) $checkProc
   set SelectLusVars(_lasttype) $SelectLusVars(type)

   #if { $SelectLusVars(file) == "" } {
      SelectLusBrowseFile "$titre"
   #}
   if { $SelectLusVars(file) != "" } {
      SelectLusBrowseNode \
         "$titre" "$tabRes" "$fileField" "$nodeField" "$typeField"
   }
}
