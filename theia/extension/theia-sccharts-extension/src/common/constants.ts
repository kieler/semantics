// editor configuration

export namespace Constants {
    export const autoSave: "off" | "on" = "off"
    export const dragAndDrop = true
    export const autoIndent = true
    export const formatOnPaste = true

    export const sctxId = 'sctx'
    export const sctxName = 'SCTX'
    export const sclId = 'scl'
    export const sclName = 'SCL'
    export const kextId = 'kext'
    export const kextName = 'KExt'
    export const annoId = 'anno'
    export const annoName = 'Annotations'
    export const esterelId = 'strl'
    export const esterelName = 'Esterel'
    export const lustreId = 'lus'
    export const lustreName = 'Lustre'
    export const netlist: string = 'de.cau.cs.kieler.sccharts.netlist'
    export const netlistJava: string = 'de.cau.cs.kieler.sccharts.netlist.java'
    export const priorityJava: string = 'de.cau.cs.kieler.sccharts.priority.java'
    export const extendedCore: string = 'de.cau.cs.kieler.sccharts.extended.core'

    export const netlistCompilation: Compilation = { label: "Netlist", id: netlist }
    export const netlistJavaCompilation = { label: "Netlist Java", id: netlistJava }
    export const priorityJavaCompilation = { label: "Priorities Java", id: priorityJava }
    export const compilerWidgetId = "compiler-widget"
    export const COMPILE: string = 'sccharts/compile'
    export const SHOW: string = 'sccharts/show'
    export const GET_SYSTEMS: string = 'sccharts/get_systems'

    export const compilations: Compilation[] = [netlistCompilation, netlistJavaCompilation, priorityJavaCompilation]

    export const OPEN_COMPILER_WIDGET_KEYBINDING = "ctrl+alt+c"
    export const SHOW_PREVIOUS_KEYBINDING = "alt+g"
    export const SHOW_NEXT_KEYBINDING = "alt+j"

    export const EDITOR_UNDEFINED_MESSAGE = "Editor is undefined"
}


export class Compilation {
    label: string
    id: string
}

export interface CodeContainer {
    files: Snapshots[]
}

/**
 * (name, snapshotId) should be unique. GroupId for bundling in phases
 */
export class Snapshots {
    groupId: string
    name: string;
    snapshotIndex: number;
    errors : string[];
    warnings : string[];
    infos : string[];
    constructor(groupId: string, name: string, snapshotIndex: number) {
        this.groupId = groupId
        this.name = name
        this.snapshotIndex = snapshotIndex
    }
}