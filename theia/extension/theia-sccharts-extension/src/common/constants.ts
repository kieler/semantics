
export class Constants {
    // editor configuration
    static autoSave : "off" | "on" = "off"
    static dragAndDrop = true
    static autoIndent = true
    static formatOnPaste = true

    static readonly sctxId = 'sctx'
    static readonly sctxName = 'SCTX'
    static readonly lang2Id = 'scl'
    static readonly lang2Name = 'SCL'
    static readonly lang3Id = 'kext'
    static readonly lang3Name = 'KExt'
    static readonly annoId = 'anno'
    static readonly annoName = 'Annotations'
    static readonly netlist : string = 'de.cau.cs.kieler.sccharts.netlist'
    static readonly netlistJava : string = 'de.cau.cs.kieler.sccharts.netlist.java'
    static readonly priorityJava : string = 'de.cau.cs.kieler.sccharts.priority.java'
    static readonly extendedCore : string = 'de.cau.cs.kieler.sccharts.extended.core'
    static readonly netlistIndex : number = 0
    static readonly netlistJavaIndex : number = 1
    static readonly priorityJavaIndex : number = 2

    static readonly netlistCompilation : Compilation = {name : "Netlist", id : Constants.netlist}
    static readonly netlistJavaCompilation = {name : "Netlist Java", id : Constants.netlistJava}
    static readonly priorityJavaCompilation = {name : "Priorities Java", id : Constants.priorityJava}


    static readonly compilations : Compilation[] = [ Constants.netlistCompilation, Constants.netlistJavaCompilation, Constants.priorityJavaCompilation]
}

export class Compilation {
    name : string
    id : string
}