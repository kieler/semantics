import { Action, HiddenCommand, CommandExecutionContext, ElementAndBounds, SModelRoot, SModelRootSchema } from "sprotty/lib"
// import { KNode } from "./kgraph-models";


/**
 * Sent from the model source to the client to request bounds for the given texts. The texts are
 * rendered invisibly so the bounds can derived from the DOM. The response is a ComputedTextBoundsAction.
 */
export class RequestTextBoundsAction implements Action {
    readonly kind = RequestTextBoundsCommand.KIND

    constructor(public readonly textDiagram: SModelRootSchema) {
    }
}

/**
 * Sent from the client to the model source (e.g. a DiagramServer) to transmit the result of text bounds
 * computation as a response to a RequestTextBoundsAction.
 */
export class ComputedTextBoundsAction implements Action {
    static readonly KIND = 'computedTextBounds'

    readonly kind = ComputedTextBoundsAction.KIND

    constructor(public readonly bounds: ElementAndBounds[]) {
    }
}



export class RequestTextBoundsCommand extends HiddenCommand {
    static readonly KIND: string  = 'requestTextBounds'

    constructor(protected action: RequestTextBoundsAction) {
        super()
    }

    execute(context: CommandExecutionContext): SModelRoot {        
        return context.modelFactory.createRoot(this.action.textDiagram)
    }

    get blockUntilActionKind() {
        return ComputedTextBoundsAction.KIND;
    }
}