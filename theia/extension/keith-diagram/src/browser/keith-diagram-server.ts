import { injectable } from "inversify";
import { TheiaDiagramServer } from "theia-sprotty/lib";
import { Action, ActionHandlerRegistry, ComputedBoundsAction, ActionMessage, SetModelCommand } from "sprotty/lib";
import { ComputedTextBoundsAction, RequestTextBoundsCommand } from "keith-sprotty/lib/actions";
import { Emitter, Event } from "@theia/core";

/**
 * This class extends the Theia diagram Server to also handle the Request- and ComputedTextBoundsAction
 */
@injectable()
export class KeithDiagramServer extends TheiaDiagramServer {

    protected readonly onModelUpdatedEmitter = new Emitter<string>()

    public readonly onModelUpdated: Event<string> = this.onModelUpdatedEmitter.event

    messageReceived(message: ActionMessage) {
        super.messageReceived(message)
        if (message.action.kind === SetModelCommand.KIND) {
            this.onModelUpdatedEmitter.fire(message.clientId)
        }
    }

    handleLocally(action: Action): boolean {
        switch (action.kind) {
            case ComputedTextBoundsAction.KIND:
                return true
            case RequestTextBoundsCommand.KIND:
                return false
            case ComputedBoundsAction.KIND: // remove sending of a computedBoundsAction as well
                return false
        }
        return super.handleLocally(action)
    }

    initialize(registry: ActionHandlerRegistry): void {
        super.initialize(registry)

        registry.register(RequestTextBoundsCommand.KIND, this)
        registry.register(ComputedTextBoundsAction.KIND, this)
    }

    handleComputedBounds(action: ComputedBoundsAction): boolean {
        // ComputedBounds actions should not be generated and forwarded anymore, since only the computedTextBounds action is used by kgraph diagrams
        if (this.viewerOptions.needsServerLayout) {
            return true;
        } else {
            return false
        }
    }
}
