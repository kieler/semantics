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
// import { KeithLanguageClientContribution } from 'keith-language/lib/frontend/keith-language-client-contribution';
import { KeithDiagramLanguageClientContribution } from 'keith-diagram/lib/keith-diagram-language-client-contribution'
import { KeithDiagramManager } from 'keith-diagram/lib/keith-diagram-manager';
import URI from "@theia/core/lib/common/uri";
import { SynthesisOption } from '../common/option-models';
import { GET_OPTIONS, SET_OPTIONS } from '../common'

export const DIAGRAM_OPTIONS_WIDGET_FACTORY_ID = 'diagramoptions-view'

@injectable()
export class DiagramOptionsViewContribution extends AbstractViewContribution<DiagramOptionsViewWidget> implements FrontendApplicationContribution {
    editorWidget: EditorWidget
    diagramOptionsViewWidget: DiagramOptionsViewWidget

    constructor(
        @inject(EditorManager) protected readonly editorManager: EditorManager,
        @inject(WidgetManager) protected readonly widgetManager: WidgetManager,
        @inject(KeithDiagramLanguageClientContribution) protected readonly client: KeithDiagramLanguageClientContribution,
        @inject(KeithDiagramManager) protected readonly diagramManager: KeithDiagramManager
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
                this.updateContent()
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
        }
    }

    async onDiagramOpened(uri: URI) {
        if (this.diagramOptionsViewWidget && this.diagramOptionsViewWidget.sourceModelPath === uri.toString()) {
            this.updateContent(true)
        }
    }

    async delay(milliseconds: number) {
        return new Promise<void>(resolve => {
            setTimeout(resolve, milliseconds)
        })
    }

    currentEditorChanged(eWidget: EditorWidget | undefined): void {
        if (eWidget) {
            this.editorWidget = eWidget
        }
        if (!this.diagramOptionsViewWidget || this.diagramOptionsViewWidget.isDisposed) {
            const widgetPromise = this.widgetManager.getWidget('diagramoptions-view')
            widgetPromise.then(widget => {
                this.initializeDiagramOptionsViewWidget(widget)
                // if (widget) {
                //     this.updateContent()
                // }
            })
        } else {
            this.updateContent()
        }
    }

    async updateContent(waitForDiagram = false) {
        if (this.diagramOptionsViewWidget.sourceModelPath !== this.editorWidget.editor.uri.toString() || !this.diagramOptionsViewWidget.hasContent) {
            const lClient = await this.client.languageClient
            const param = {
                uri: this.editorWidget.editor.uri.toString(),
                waitForDiagram : waitForDiagram
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