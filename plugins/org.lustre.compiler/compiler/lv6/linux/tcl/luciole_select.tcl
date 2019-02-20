wm withdraw .

source "$env(LUSTRE_INSTALL)/tcl/utiles.tcl"
source "$env(LUSTRE_INSTALL)/tcl/select-lus.tcl"

set COMMANDS(lusinfo) "lusinfo"

set PROJECT(main_type) "lus"
set PROJECT(main_file) ""
set PROJECT(main_node) ""

set version [exec simec -version]

######
proc SelectLucioleArg { titre } {
   global SelectLusVars
   global SelectLusStrings
   set rep ""
   set ftypes [list "$SelectLusStrings(lustre_files)" {*.lus *.ec}]
   set rep [tk_getOpenFile \
      -title "$titre" \
      -defaultextension ".lus" \
      -defaultextension ".ec" \
      -defaultextension ".dro" \
      -filetypes { { "All recognized files"  {*.lus *.ec *.dro} } } \
   ]
   return $rep
}
######

set PROJECT(main_file) [ SelectLucioleArg "Luciole launcher $version" ]

set ext [file extension $PROJECT(main_file)]


if { $ext == ".ec"  || $ext == ".dro" } {
   puts -nonewline "$PROJECT(main_file)"
} elseif { $ext == ".lus" } {
   global SelectLusVars
   set SelectLusVars(type) "lus"
   set SelectLusVars(node) ""
   set SelectLusVars(file) "$PROJECT(main_file)"

   SelectLusBrowseNode "Luciole launcher $version" \
      {PROJECT} {main_file} {main_node} {main_type}
   puts -nonewline "$PROJECT(main_file) $PROJECT(main_node)"
} else {
   exit 1
}
exit
