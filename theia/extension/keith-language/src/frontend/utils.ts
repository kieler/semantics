/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 *
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */

export namespace Constants {
    export const autoSave: "off" | "on" = "off"
    export const dragAndDrop = true
    export const autoIndent = true
    export const formatOnPaste = true

    export const kgtId = 'kgt'
    export const kgtName = 'KGraph'
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

    export const netlistJavaCompilation = { label: "Netlist Java", id: netlistJava }
    export const priorityJavaCompilation = { label: "Priorities Java", id: priorityJava }
    export const compilerWidgetId = "compiler-widget"
    export const COMPILE: string = 'sccharts/compile'
    export const SHOW: string = 'sccharts/show'
    export const GET_SYSTEMS: string = 'sccharts/get-systems'
    export const UPDATE_PREFERENCES: string = "sccharts/update-preferences"

    export const OPEN_COMPILER_WIDGET_KEYBINDING = "ctrlcmd+alt+c"
    export const SHOW_PREVIOUS_KEYBINDING = "alt+g"
    export const SHOW_NEXT_KEYBINDING = "alt+j"

    export const EDITOR_UNDEFINED_MESSAGE = "Editor is undefined"
}

/**
 * Description of a compilation system for selectbox in compiler widget
 */
export class CompilationSystems {
    label: string
    id: string
    isPublic: boolean
}

/**
 * Equivalent to CodeContainer send by LS
 */
export interface CodeContainer {
    files: Snapshots[]
}

/**
 * (name, snapshotId) should be unique. GroupId for bundling in phases
 */
export class Snapshots {
    name: string;
    snapshotIndex: number;
    errors: string[];
    warnings: string[];
    infos: string[];
    constructor(groupId: string, name: string, snapshotIndex: number) {
        this.name = name
        this.snapshotIndex = snapshotIndex
    }
}