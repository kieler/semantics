import { injectable, inject } from "inversify";
import { EditorManager } from "@theia/editor/lib/browser";
import { KeybindingContext, Keybinding, KeybindingContribution, KeybindingRegistry } from "@theia/core/lib/browser";
import { SHOW_PREVIOUS, SHOW_NEXT } from "./sccharts-menu-contribution";


@injectable()
export class SCChartsKeybindingContext implements KeybindingContext {
    constructor( @inject(EditorManager) protected readonly editorService: EditorManager) { }

    readonly id = 'sccharts.keybinding.context';

    isEnabled(arg: Keybinding): boolean {
        var editor = this.editorService.activeEditor
        if (!editor) {
            return false
        }
        var uri = editor.editor.getTargetUri()
        if (!uri) {
            return false
        }
        return uri.toString().endsWith(".view") || uri.toString().endsWith(".sctx")
    }
}

@injectable()
export class SCChartsKeybindingContribution implements KeybindingContribution {

    constructor(
        @inject(SCChartsKeybindingContext) protected readonly keybindingContext: SCChartsKeybindingContext
    ) { }

    registerKeybindings(keybindings: KeybindingRegistry): void {
         [
             {
                 command: SHOW_PREVIOUS.id,
                 context: this.keybindingContext.id,
                 keybinding: "alt+g"
             },
             {
                 command: SHOW_NEXT.id,                 
                 context: this.keybindingContext.id,
                 keybinding: "alt+j"
             }
         ].forEach(binding => {
             keybindings.registerKeybinding(binding);
         });
    }

}

// export namespace SCChartsKeybindingContexts {
//     export const scchartsEditorTextFocus = 'scchartsEditorTextFocus';
// }

// @injectable()
// export class SCChartsEditorTextFocusContext extends EditorTextFocusContext {

//     readonly id: string = SCChartsKeybindingContexts.scchartsEditorTextFocus;

//     protected canHandle(widget: EditorWidget): boolean {
//         return true
//     }

// }