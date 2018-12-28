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

import { inject, injectable } from 'inversify'
import { LanguageClientContribution } from '@theia/languages/lib/browser'
import { EditorManager, EditorWidget } from '@theia/editor/lib/browser'
import { KeithLanguageClientContribution } from 'keith-language/lib/browser/keith-language-client-contribution'
import { TheiaFileSaver, DiagramManagerImpl, DiagramWidgetRegistry, TheiaDiagramServer, TheiaSprottyConnector } from 'theia-sprotty/lib'
import { ThemeManager } from './theme-manager';
import URI from '@theia/core/lib/common/uri';
import { ApplicationShell } from '@theia/core/lib/browser';
import { ModelSource, DiagramServer, IActionDispatcher, TYPES, RequestModelAction } from 'sprotty/lib';
import { KeithDiagramWidgetRegistry } from './keith-diagram-widget-registry';
import { KeithDiagramWidget, KeithDiagramWidgetFactory } from './keith-diagram-widget';

@injectable()
export class KeithDiagramManager extends DiagramManagerImpl {

    readonly diagramType = 'keith-diagram'
    readonly iconClass = 'fa fa-square-o'

    _diagramConnector: TheiaSprottyConnector

    constructor(@inject(KeithLanguageClientContribution) languageClientContribution: LanguageClientContribution,
                @inject(TheiaFileSaver) theiaFileSaver: TheiaFileSaver,
                @inject(EditorManager) editorManager: EditorManager,
                @inject(DiagramWidgetRegistry) diagramWidgetRegistry: DiagramWidgetRegistry,
                @inject(ThemeManager) themeManager: ThemeManager,
                @inject(KeithDiagramWidgetRegistry) protected readonly widgetRegistry: KeithDiagramWidgetRegistry) {
        super()
        themeManager.initialize()
        this._diagramConnector = new TheiaSprottyConnector(languageClientContribution, theiaFileSaver, editorManager, diagramWidgetRegistry)
        editorManager.onCurrentEditorChanged(this.onCurrentEditorChanged.bind(this))
    }

    /**
     * Opens the diagram widget automatically if the current editor has changed.
     *
     * @param editorWidget The editor that is now active.
     */
    onCurrentEditorChanged(editorWidget: EditorWidget | undefined): void {
        if (editorWidget) {
            const uri = editorWidget.getResourceUri()
            if (uri instanceof URI) {
                this.open(editorWidget.getResourceUri() as URI)
            }
        }
    }

    async getOrCreateDiagramWidget(uri: URI): Promise<KeithDiagramWidget> {
        const widget = await this.widgetRegistry.getWidget(uri, this.diagramType)
        if (widget !== undefined && widget instanceof KeithDiagramWidget) {
            // reconfigure the diagram server to watch the new file by sending a new RequestModelAction with the new uri to the server.
            if (widget.currentModelSource instanceof TheiaDiagramServer && this.diagramConnector) {
                widget.currentModelSource.handle(new RequestModelAction({
                    sourceUri: uri.toString(true),
                    diagramType: this.diagramType
                }))
            }

            // TODO:
            // clear the widget's content
            // (dispatch a new RequestDiagramAction)
            return widget
        }
        const newWidget = this.createDiagramWidget(uri)
        this.addToShell(newWidget)
        return Promise.resolve(newWidget)
    }

    createDiagramWidget(uri: URI): KeithDiagramWidget {
        const widgetId = this.widgetRegistry.id()
        const svgContainerId = widgetId + '_sprotty'
        const diagramConfiguration = this.diagramConfigurationRegistry.get(this.diagramType)
        const diContainer = diagramConfiguration.createContainer(svgContainerId)
        const modelSource = diContainer.get<ModelSource>(TYPES.ModelSource)
        if (modelSource instanceof DiagramServer)
            modelSource.clientId = widgetId
        if (modelSource instanceof TheiaDiagramServer && this.diagramConnector)
            this.diagramConnector.connect(modelSource)
        const newWidget = this.diagramWidgetFactory({
            id: widgetId, svgContainerId, uri, diagramType: this.diagramType, modelSource,
            actionDispatcher: diContainer.get<IActionDispatcher>(TYPES.IActionDispatcher)
        })
        newWidget.title.closable = true
        newWidget.title.label = 'Diagram'
        newWidget.title.icon = this.iconClass
        this.widgetRegistry.addWidget(uri, this.diagramType, newWidget)
        newWidget.disposed.connect(() => {
            this.widgetRegistry.removeWidget(uri, this.diagramType)
            if (modelSource instanceof TheiaDiagramServer && this.diagramConnector)
                this.diagramConnector.disconnect(modelSource)
        })
        newWidget.currentUri = uri
        newWidget.currentModelSource = modelSource
        return newWidget
    }

    addToShell(widget: KeithDiagramWidget): void {
        const currentEditor = this.editorManager.currentEditor
        const options: ApplicationShell.WidgetOptions = {
            area: 'main'
        }
        if (!!currentEditor && currentEditor.editor.uri.toString(true) === widget.uri.toString(true)) {
            options.ref = currentEditor
            options.mode = 'split-right'
        }
        this.shell.addWidget(widget, options)
    }

    get diagramWidgetFactory(): KeithDiagramWidgetFactory {
        return options => new KeithDiagramWidget(options)
    }

    get diagramConnector() {
        return this._diagramConnector
    }

    get label() {
        return 'Keith diagram'
    }
}