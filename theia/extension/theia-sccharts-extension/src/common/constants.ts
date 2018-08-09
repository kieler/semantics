
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
    static readonly esterelId = 'strl'
    static readonly esterelName = 'Esterel'
    static readonly lustreId = 'lus'
    static readonly lustreName = 'Lustre'
    static readonly netlist : string = 'de.cau.cs.kieler.sccharts.netlist'
    static readonly netlistJava : string = 'de.cau.cs.kieler.sccharts.netlist.java'
    static readonly priorityJava : string = 'de.cau.cs.kieler.sccharts.priority.java'
    static readonly extendedCore : string = 'de.cau.cs.kieler.sccharts.extended.core'
    static readonly netlistIndex : number = 0
    static readonly netlistJavaIndex : number = 1
    static readonly priorityJavaIndex : number = 2

    static readonly netlistCompilation : Compilation = {label : "Netlist", id : Constants.netlist}
    static readonly netlistJavaCompilation = {label : "Netlist Java", id : Constants.netlistJava}
    static readonly priorityJavaCompilation = {label : "Priorities Java", id : Constants.priorityJava}
    static readonly compilerWidgetName = "compiler-widget"
    static readonly COMPILE: string = 'sccharts/compile'
    static readonly SHOW: string = 'sccharts/show'
    static readonly GET_SYSTEMS: string = 'sccharts/get_ssystems'


    static readonly compilations : Compilation[] = [ Constants.netlistCompilation, Constants.netlistJavaCompilation, Constants.priorityJavaCompilation]
}

export class Compilation {
    label : string
    id : string
}