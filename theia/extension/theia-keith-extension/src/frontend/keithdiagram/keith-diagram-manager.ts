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

// import { inject, injectable } from 'inversify'
// import { LanguageClientContribution } from '@theia/languages/lib/browser'
// import { EditorManager } from '@theia/editor/lib/browser'
// import { KeithLanguageClientContribution } from '../language/keith-language-client-contribution'
// import { TheiaSprottyConnector, TheiaFileSaver, DiagramManagerImpl, DiagramWidgetRegistry } from 'theia-sprotty/lib'
// import { ThemeManager } from './theme-manager';

// @injectable()
// export class KeithDiagramManager extends DiagramManagerImpl {

//     readonly diagramType = 'keith-diagram'
//     readonly iconClass = 'fa fa-square-o'

//     _diagramConnector: TheiaSprottyConnector
//     diagramWidgetRegistry: DiagramWidgetRegistry

//     constructor(@inject(KeithLanguageClientContribution) languageClientContribution: LanguageClientContribution,
//                 @inject(TheiaFileSaver) theiaFileSaver: TheiaFileSaver,
//                 @inject(EditorManager) editorManager: EditorManager,
//                 @inject(DiagramWidgetRegistry) diagramWidgetRegistry: DiagramWidgetRegistry,
//                 @inject(ThemeManager) themeManager: ThemeManager) {
//         super()
//         themeManager.initialize()
//         this._diagramConnector = new TheiaSprottyConnector(languageClientContribution, theiaFileSaver, editorManager, diagramWidgetRegistry)
//         this.diagramWidgetRegistry = diagramWidgetRegistry
//     }

//     get diagramConnector() {
//         return this._diagramConnector
//     }

//     get label() {
//         return 'Keith diagram'
//     }
// }