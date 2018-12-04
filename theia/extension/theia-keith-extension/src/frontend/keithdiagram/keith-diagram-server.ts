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

// import { injectable } from "inversify";
// import { TheiaDiagramServer } from "theia-sprotty/lib";
// import { Action, ActionHandlerRegistry, ComputedBoundsAction } from "sprotty/lib";
// import { ComputedTextBoundsAction, RequestTextBoundsCommand } from "keith-sprotty/lib/actions";

// /**
//  * This class extends the Theia diagram Server to also handle the Request- and ComputedTextBoundsAction
//  */
// @injectable()
// export class KeithDiagramServer extends TheiaDiagramServer {

//     handleLocally(action: Action): boolean {
//         switch (action.kind) {
//             case ComputedTextBoundsAction.KIND:
//                 return true
//             case RequestTextBoundsCommand.KIND:
//                 return false
//             case ComputedBoundsAction.KIND: // remove sending of a computedBoundsAction as well
//                 return false
//         }
//         return super.handleLocally(action)
//     }

//     initialize(registry: ActionHandlerRegistry): void {
//         super.initialize(registry)

//         registry.register(RequestTextBoundsCommand.KIND, this)
//         registry.register(ComputedTextBoundsAction.KIND, this)
//     }

//     handleComputedBounds(action: ComputedBoundsAction): boolean {
//         // ComputedBounds actions should not be generated and forwarded anymore, since only the computedTextBounds action is used by kgraph diagrams
//         if (this.viewerOptions.needsServerLayout) {
//             return true;
//         } else {
//             return false
//         }
//     }
// }
