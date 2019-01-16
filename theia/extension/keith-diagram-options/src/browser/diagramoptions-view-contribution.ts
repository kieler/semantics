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

import { injectable, inject } from 'inversify'
import { AbstractViewContribution } from '@theia/core/lib/browser/shell/view-contribution'
import { DiagramOptionsViewWidget } from './diagramoptions-view-widget'
import { FrontendApplicationContribution, FrontendApplication } from '@theia/core/lib/browser/frontend-application'
import { EditorManager, EditorWidget } from '@theia/editor/lib/browser';
import { WidgetManager, Widget, DidCreateWidgetEvent } from '@theia/core/lib/browser';
import { KeithLanguageClientContribution } from 'keith-language-pragmatics/lib/browser/keith-language-client-contribution'
import { KeithDiagramManager } from 'keith-diagram/lib/keith-diagram-manager';
import URI from "@theia/core/lib/common/uri";
import { SynthesisOption } from '../common/option-models';
import { GET_OPTIONS, SET_OPTIONS } from '../common'
import { KeithDiagramWidgetRegistry } from 'keith-diagram/lib/keith-diagram-widget-registry';
import { DiagramWidgetRegistry } from 'theia-sprotty/lib'
import { KeithDiagramWidget } from 'keith-diagram/lib/keith-diagram-widget';
import { KeithDiagramServer } from 'keith-diagram/lib/keith-diagram-server';

export const DIAGRAM_OPTIONS_WIDGET_FACTORY_ID = 'diagramoptions-view'

@injectable()
export class DiagramOptionsViewContribution extends AbstractViewContribution<DiagramOptionsViewWidget> implements FrontendApplicationContribution {
    editorWidget: EditorWidget
    diagramOptionsViewWidget: DiagramOptionsViewWidget
    protected boundDiagramServer: KeithDiagramServer

    constructor(
        @inject(EditorManager) protected readonly editorManager: EditorManager,
        @inject(WidgetManager) protected readonly widgetManager: WidgetManager,
        @inject(KeithLanguageClientContribution) protected readonly client: KeithLanguageClientContribution,
        @inject(KeithDiagramManager) protected readonly diagramManager: KeithDiagramManager,
        @inject(DiagramWidgetRegistry) protected readonly diagramWidgetRegistry: DiagramWidgetRegistry
    ) {
        super({
            widgetId: DIAGRAM_OPTIONS_WIDGET_FACTORY_ID,
            widgetName: 'Diagram Options',
            defaultWidgetOptions: {
                area: 'right',
                rank: 500
            },
            toggleCommandId: 'diagramOptionsView:toggle'
        })

        editorManager.onCurrentEditorChanged(this.currentEditorChanged.bind(this))
        if (editorManager.activeEditor) {
            // if there is already an active editor, use that to initialize
            this.editorWidget = editorManager.activeEditor
            this.currentEditorChanged(this.editorWidget)
        }
        diagramManager.onDiagramOpened(this.onDiagramOpened.bind(this))
        widgetManager.onDidCreateWidget(this.onDidCreateWidget.bind(this))
        // TODO: when the diagram closes, also update the view to the default one
        const widgetPromise = this.widgetManager.getWidget('diagramoptions-view')
        widgetPromise.then(widget => {
            this.initializeDiagramOptionsViewWidget(widget)
        })
    }

    async initializeLayout(app: FrontendApplication): Promise<void> {
        await this.openView()
    }

    private initializeDiagramOptionsViewWidget(widget: Widget | undefined) {
        if (widget) {
            this.diagramOptionsViewWidget = widget as DiagramOptionsViewWidget
            this.diagramOptionsViewWidget.onSendNewOptions(this.sendNewOptions.bind(this))
            this.diagramOptionsViewWidget.onActivateRequest(this.updateContent.bind(this))
            if (this.editorWidget) {
                this.diagramOptionsViewWidget.sourceModelPath = this.editorWidget.editor.uri.toString()
            }
        }
     }

    async sendNewOptions() {
        const synthesisOptions = this.diagramOptionsViewWidget.getDiagramOptions()
        const lClient = await this.client.languageClient
        const param = {
            uri: this.editorWidget.editor.uri.toString(),
            synthesisOptions: synthesisOptions
        }
        await lClient.sendRequest(SET_OPTIONS, param)
    }

    onDidCreateWidget(e: DidCreateWidgetEvent): void {
        if (e.factoryId === DiagramOptionsViewWidget.widgetId) {
            this.initializeDiagramOptionsViewWidget(e.widget)
            this.updateContent()
        }
    }

    async onDiagramOpened(uri: URI) {
        if (this.diagramWidgetRegistry instanceof KeithDiagramWidgetRegistry) {
            const diagramWidget = this.diagramWidgetRegistry.getWidgetById(this.diagramWidgetRegistry.id())
            if (diagramWidget instanceof KeithDiagramWidget
                && diagramWidget.currentModelSource instanceof KeithDiagramServer
                && this.boundDiagramServer !== diagramWidget.currentModelSource) {
                    // Binds the diagram server to call this onModelUpdated function when its model gets updated.
                this.boundDiagramServer = diagramWidget.currentModelSource
                diagramWidget.currentModelSource.onModelUpdated(this.onModelUpdated.bind(this))
            }
        }
    }

    async onModelUpdated(uri: string) {
        if (this.diagramOptionsViewWidget) {
            this.updateContent()
        }
    }

    currentEditorChanged(eWidget: EditorWidget | undefined): void {
        if (eWidget) {
            this.editorWidget = eWidget
        }
        if (!this.diagramOptionsViewWidget || this.diagramOptionsViewWidget.isDisposed) {
            const widgetPromise = this.widgetManager.getWidget('diagramoptions-view')
            widgetPromise.then(widget => {
                this.initializeDiagramOptionsViewWidget(widget)
            })
        }
    }

    async updateContent() {
        if (this.editorWidget) {
            const lClient = await this.client.languageClient
            const param = {
                uri: this.editorWidget.editor.uri.toString()
            }
            const options: SynthesisOption[] = await lClient.sendRequest(GET_OPTIONS, param) as SynthesisOption[]
            if (options) {
                options.forEach(option => option.currentValue = option.initialValue)
            }
            this.diagramOptionsViewWidget.setDiagramOptions(options)
            this.diagramOptionsViewWidget.sourceModelPath = this.editorWidget.editor.uri.toString()
            this.diagramOptionsViewWidget.update()
        }
    }
}