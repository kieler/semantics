import { injectable, inject } from "inversify";
import { EditorManager } from "@theia/editor/lib/browser";
import { KeybindingContext, Keybinding, KeybindingContribution, KeybindingRegistry } from "@theia/core/lib/browser";
import { SHOW_PREVIOUS, SHOW_NEXT, COMPILER } from "./keith-menu-contribution";
import { Constants } from "../../common/constants";

/**
 * Defines in which context keybindings for keith can be used
 */
@injectable()
export class KeithKeybindingContext implements KeybindingContext {
    constructor(
        @inject(EditorManager) protected readonly editorService: EditorManager
    ) { }

    readonly id = 'keith.keybinding.context';

    /**
     * Checks whether a keybining of this context can be used in the current situtation.
     * @param arg keybinding to check
     */
    isEnabled(arg: Keybinding): boolean {
        if (!this.editorService.currentEditor) {
            return false
        }
        return true
    }
}

/**
 * Registers keybindings for different contexts for Keith
 */
@injectable()
export class KeithKeybindingContribution implements KeybindingContribution {

    constructor(
        @inject(KeithKeybindingContext) protected readonly keithKeybindingContext: KeithKeybindingContext
    ) { }

    registerKeybindings(keybindings: KeybindingRegistry): void {
         [
             {
                 command: SHOW_PREVIOUS.id,
                 context: this.keithKeybindingContext.id,
                 keybinding: Constants.SHOW_PREVIOUS_KEYBINDING
             },
             {
                 command: SHOW_NEXT.id,                 
                 context: this.keithKeybindingContext.id,
                 keybinding: Constants.SHOW_NEXT_KEYBINDING
             },
             {
                 command: COMPILER.id,                 
                 context: this.keithKeybindingContext.id,
                 keybinding: Constants.OPEN_COMPILER_WIDGET_KEYBINDING
             }
         ].forEach(binding => {
             keybindings.registerKeybinding(binding);
         });
    }

}