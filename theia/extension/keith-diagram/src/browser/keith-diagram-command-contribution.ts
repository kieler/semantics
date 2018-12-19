import { DiagramCommandContribution, DiagramCommands, OpenInDiagramHandler } from "theia-sprotty/lib";
import { injectable, inject } from "inversify";
import { ApplicationShell, OpenerService } from "@theia/core/lib/browser";
import { EditorManager } from "@theia/editor/lib/browser";
import { CommandRegistry } from "@theia/core/lib/common";
import { KeithDiagramManager } from "./keith-diagram-manager";




export class KeithOpenInDiagramHandler extends OpenInDiagramHandler {
    constructor(editorManager: EditorManager, openerService: OpenerService) {
        super(editorManager, openerService)
    }
    execute(...args: any[]) {
        const editor = this.editorManager.currentEditor
        if (editor !== undefined) {
            const uri = editor.editor.uri
            const openers = this.openerService.getOpeners(uri)
            openers.then(openers => {
                const opener = openers.find(opener => opener instanceof KeithDiagramManager)
                if (opener !== undefined)
                    opener.open(uri)
            })
        }
    }

}

@injectable()
export class KeithDiagramCommandContribution extends DiagramCommandContribution {
    constructor(@inject(ApplicationShell) protected readonly shell: ApplicationShell,
                @inject(EditorManager) protected readonly editorManager: EditorManager,
                @inject(OpenerService) protected readonly openerService: OpenerService) {
        super(shell, editorManager, openerService)
    }

    registerCommands(registry: CommandRegistry): void {
        // re-register the open in diagram call to the more specific use case
        const oldHandler = registry.getActiveHandler(DiagramCommands.OPEN_IN_DIAGRAM)
        if (oldHandler) {
            oldHandler.isEnabled = () => false
        }
        registry.registerHandler(
            DiagramCommands.OPEN_IN_DIAGRAM,
            new KeithOpenInDiagramHandler(this.editorManager, this.openerService)
        )
    }
}