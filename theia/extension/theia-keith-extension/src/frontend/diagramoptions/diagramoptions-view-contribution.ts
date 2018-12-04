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

// import { injectable } from 'inversify'
// import { AbstractViewContribution } from '@theia/core/lib/browser/shell/view-contribution'
// import { DiagramOptionsViewWidget } from './diagramoptions-view-widget'
// import { FrontendApplicationContribution, FrontendApplication } from '@theia/core/lib/browser/frontend-application'

// export const DIAGRAM_OPTIONS_WIDGET_FACTORY_ID = 'diagramoptions-view'

// @injectable()
// export class DiagramOptionsViewContribution extends AbstractViewContribution<DiagramOptionsViewWidget> implements FrontendApplicationContribution {

//     constructor() {
//         super({
//             widgetId: DIAGRAM_OPTIONS_WIDGET_FACTORY_ID,
//             widgetName: 'Diagram Options',
//             defaultWidgetOptions: {
//                 area: 'right',
//                 rank: 500
//             },
//             toggleCommandId: 'diagramOptionsView:toggle'
//         })
//     }

//     async initializeLayout(app: FrontendApplication): Promise<void> {
//         await this.openView()
//     }
// }