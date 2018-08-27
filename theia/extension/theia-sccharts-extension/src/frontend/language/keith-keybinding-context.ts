import { injectable, inject } from "inversify";
import { EditorManager } from "@theia/editor/lib/browser";
import { KeybindingContext, Keybinding } from "@theia/core/lib/browser";

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
     * Checks whether a keybinding of this context can be used in the current situation.
     * @param arg keybinding to check
     */
    isEnabled(arg: Keybinding): boolean {
        if (!this.editorService.currentEditor) {
            return false
        }
        return true
    }
}