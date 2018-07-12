import { Command, MenuContribution, MenuModelRegistry } from '@theia/core/lib/common';
import { injectable } from 'inversify';
import { EDITOR_CONTEXT_MENU } from '@theia/editor/lib/browser';
import { Constants } from '../../common/constants';


/**
 * Show SCCharts references
 */
export const SHOW_SCCHARTS_REFERENCES: Command = {
    id: 'sccharts.show.references'
};

/**
 * Apply Workspace Edit
 */
export const APPLY_WORKSPACE_EDIT: Command = {
    id: 'sccharts.apply.workspaceEdit'
};
export const COMPILE_NETLIST: Command = {
    id: 'compile_netlist',
    label: 'Compile netlist'
}

export const COMPILE_NETLIST_JAVA: Command = {
    id: 'compile_netlist_java',
    label: 'Compile netlist java'
}
export const COMPILE_PRIORITY_JAVA: Command = {
    id: 'compile_priority_java',
    label: 'Compile priority java'
}
export const COMPILE_EXTENDED_CORE: Command = {
    id: 'compile_extended_core',
    label: 'Compile extended core'
}

export const SHOW_NEXT: Command = {
    id: 'show_next',
    label: 'Show next'
}
export const SHOW_PREVIOUS: Command = {
    id: 'show_previous',
    label: 'Show previous'
}
export const SHOW_FIRST: Command = {
    id: 'show_first',
    label: 'Show first'
}
export const SHOW_LAST: Command = {
    id: 'show_last',
    label: 'Show last'
}

export const COMPILE: string = 'sccharts/compile'

export const COMPILE_NETLIST_STRUCT: CommandStruct = {
    command: COMPILE_NETLIST,
    compilationSystemId: Constants.netlist,
    commandLSPName: COMPILE
}
export const COMPILE_NETLIST_JAVA_STRUCT: CommandStruct = {
    command: COMPILE_NETLIST_JAVA,
    compilationSystemId: Constants.netlistJava,
    commandLSPName: COMPILE
}
export const COMPILE_PRIORITY_JAVA_STRUCT: CommandStruct = {
    command: COMPILE_PRIORITY_JAVA,
    compilationSystemId: Constants.priorityJava,
    commandLSPName: COMPILE
}

export const SHOW_LAST_STRUCT: CommandStruct = {
    command: SHOW_LAST,
    compilationSystemId: ' ',
    commandLSPName: ' '
}

export const SHOW_NEXT_STRUCT: CommandStruct = {
    command: SHOW_NEXT,
    compilationSystemId: ' ',
    commandLSPName: ' '
}

export const SHOW_PREVIOUS_STRUCT: CommandStruct = {
    command: SHOW_PREVIOUS,
    compilationSystemId: ' ',
    commandLSPName: ' '
}

export const SHOW_ORIGINAL_STRUCT: CommandStruct = {
    command: SHOW_FIRST,
    compilationSystemId: ' ',
    commandLSPName: ' '
}

export const compilationCommands: Array<CommandStruct> =
    [
        COMPILE_NETLIST_STRUCT, COMPILE_NETLIST_JAVA_STRUCT, COMPILE_PRIORITY_JAVA_STRUCT
    ]

export const navigationCommands: Array<CommandStruct> =
    [
        SHOW_LAST_STRUCT, SHOW_NEXT_STRUCT, SHOW_PREVIOUS_STRUCT, SHOW_ORIGINAL_STRUCT
    ]

export interface CommandStruct {
    command: Command;
    compilationSystemId: string;
    commandLSPName: string;
}


export namespace NavigationMainMenu {

    export const NAVIGATE = [...EDITOR_CONTEXT_MENU, '8_nav'];


    export const NAVIGATION_GROUP = [...NAVIGATE, '1_navigation_group'];

}

export namespace CompileMenu {

    export const COMPILATION = [...EDITOR_CONTEXT_MENU, '7_compile'];


    export const COMPILATION_GROUP = [...COMPILATION, '1_compilation_group'];
}

@injectable()
export class SCChartsMenuContribution implements MenuContribution {

    registerMenus(menus: MenuModelRegistry): void {
        menus.registerSubmenu(NavigationMainMenu.NAVIGATE, 'Navigate');
        menus.registerMenuAction(NavigationMainMenu.NAVIGATION_GROUP, {
            commandId: SHOW_NEXT.id,
            label: "show next"
        });
        menus.registerMenuAction(NavigationMainMenu.NAVIGATION_GROUP, {
            commandId: SHOW_PREVIOUS.id,
            label: "show previous"
        });
        menus.registerMenuAction(NavigationMainMenu.NAVIGATION_GROUP, {
            commandId: SHOW_LAST.id,
            label: "show last"
        });
        menus.registerMenuAction(NavigationMainMenu.NAVIGATION_GROUP, {
            commandId: SHOW_FIRST.id,
            label: "show first"
        });


        menus.registerSubmenu(CompileMenu.COMPILATION, 'Compile');
        menus.registerMenuAction(CompileMenu.COMPILATION_GROUP, {
            commandId: COMPILE_NETLIST.id,
            label: COMPILE_NETLIST.label
        });
        menus.registerMenuAction(CompileMenu.COMPILATION_GROUP, {
            commandId: COMPILE_NETLIST_JAVA.id,
            label: COMPILE_NETLIST_JAVA.label
        });
        menus.registerMenuAction(CompileMenu.COMPILATION_GROUP, {
            commandId: COMPILE_PRIORITY_JAVA.id,
            label: COMPILE_PRIORITY_JAVA.label
        });
    }
}

export interface CodeContainer {
    files: TextDocument[]
}

export class TextDocument {
    key: string;
    value: string
    constructor(key: string, value: string) {
        this.key = key,
            this.value = value
    }
}