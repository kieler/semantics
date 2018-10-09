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