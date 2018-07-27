import { injectable, inject } from "inversify";
import { EditorManager } from "@theia/editor/lib/browser";
import { KeybindingContext, Keybinding, KeybindingContribution, KeybindingRegistry } from "@theia/core/lib/browser";
import { SHOW_PREVIOUS, SHOW_NEXT, COMPILER} from "./sccharts-menu-contribution";

/**
 * Defines in which context keybindings for sccharts can be used
 */
@injectable()
export class SCChartsKeybindingContext implements KeybindingContext {
    constructor( @inject(EditorManager) protected readonly editorService: EditorManager) { }

    readonly id = 'sccharts.keybinding.context';

    /**
     * Checks whether a keybining of this context can be used in the current situtation.
     * Keybindings for SCCharts can only be used if current active widget (TODO currently active editor widget, change that)
     * is used for a .sctx file (TODO and navigation Widget)
     * @param arg keybinding to check
     */
    isEnabled(arg: Keybinding): boolean {
        // var editor = this.editorService.activeEditor
        // if (!editor) {
        //     return false
        // }
        // var uri = editor.editor.getTargetUri()
        // if (!uri) {
        //     return false
        // }
        // return uri.toString().endsWith(".view") || uri.toString().endsWith(".sctx")
        return true
    }
}

/**
 * Regisers keybindings for different contexts for Keith
 */
@injectable()
export class SCChartsKeybindingContribution implements KeybindingContribution { // TODO rename to KeithKeybindingContribution

    constructor(
        @inject(SCChartsKeybindingContext) protected readonly scchartsKeybindingContext: SCChartsKeybindingContext
    ) { }

    registerKeybindings(keybindings: KeybindingRegistry): void {
         [
             {
                 command: SHOW_PREVIOUS.id,
                 context: this.scchartsKeybindingContext.id,
                 keybinding: "alt+g"
             },
             {
                 command: SHOW_NEXT.id,                 
                 context: this.scchartsKeybindingContext.id,
                 keybinding: "alt+j"
             },
             {
                 command: COMPILER.id,                 
                 context: this.scchartsKeybindingContext.id,
                 keybinding: "ctrl+alt+c"
             }
         ].forEach(binding => {
             keybindings.registerKeybinding(binding);
         });
    }

}