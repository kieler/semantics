/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { inject, injectable } from "inversify"
import { CommandContribution, CommandRegistry, Command } from '@theia/core/lib/common'
import { EditorCommands, EditorManager, EditorWidget } from "@theia/editor/lib/browser"
import { WorkspaceEdit, Workspace } from "@theia/languages/lib/browser"
// import { DiagramOptionsViewWidget } from "../diagramoptions/diagramoptions-view-widget"
import { WidgetManager/*, Widget, DidCreateWidgetEvent */} from "@theia/core/lib/browser"
import { KeithLanguageClientContribution } from "./keith-language-client-contribution"
// import { SynthesisOption } from "../diagramoptions/synthesis-option"
// import { KeithDiagramManager } from "../keithdiagram/keith-diagram-manager"
// import URI from "@theia/core/lib/common/uri"
// import { TheiaSprottyConnector } from "theia-sprotty/lib"
// import { ActionMessage } from "sprotty/lib"

/**
 * Show references
 */
export const SHOW_REFERENCES: Command = {
    id: 'show.references'
};

/**
 * Apply Workspace Edit
 */
export const APPLY_WORKSPACE_EDIT: Command = {
    id: 'apply.workspaceEdit'
};

export const GET_OPTIONS = 'keith/getOptions'
export const SET_OPTIONS = 'keith/setOptions'

@injectable()
export class KeithCommandContribution implements CommandContribution {


    editorWidget: EditorWidget
    // diagramOptionsViewWidget: DiagramOptionsViewWidget

    constructor(
        @inject(Workspace) protected readonly workspace: Workspace,
        @inject(EditorManager) protected readonly editorManager: EditorManager,
        @inject(WidgetManager) protected readonly widgetManager: WidgetManager,
        @inject(KeithLanguageClientContribution) protected readonly client: KeithLanguageClientContribution,
        // @inject(KeithDiagramManager) protected readonly diagramManager: KeithDiagramManager
    ) {
        // editorManager.onCurrentEditorChanged(this.currentEditorChanged.bind(this))
        if (editorManager.activeEditor) {
            // if there is already an active editor, use that to initialize
            this.editorWidget = editorManager.activeEditor
            // this.currentEditorChanged(this.editorWidget)
        }
        // diagramManager.onDiagramOpened(this.onDiagramOpened.bind(this))
        // widgetManager.onDidCreateWidget(this.onDidCreateWidget.bind(this))
        // // TODO: when the diagram closes, also update the view to the default one
        // const widgetPromise = this.widgetManager.getWidget('diagramoptions-view')
        // widgetPromise.then(widget => {
        //     this.initializeDiagramOptionsViewWidget(widget)
        // })
     }

    //  private initializeDiagramOptionsViewWidget(widget: Widget | undefined) {
    //     if (widget) {
    //         this.diagramOptionsViewWidget = widget as DiagramOptionsViewWidget
    //         this.diagramOptionsViewWidget.onSendNewOptions(this.sendNewOptions.bind(this))
    //         this.diagramOptionsViewWidget.onActivateRequest(this.updateContent.bind(this))
    //         if (this.editorWidget) {
    //             this.diagramOptionsViewWidget.sourceModelPath = this.editorWidget.editor.uri.toString()
    //             this.updateContent()
    //         }
    //     }
    //  }

    registerCommands(commands: CommandRegistry): void {
        commands.registerCommand(SHOW_REFERENCES, {
            execute: (uri: string, position: Position, locations: Location[]) =>
                commands.executeCommand(EditorCommands.SHOW_REFERENCES.id, uri, position, locations)
        });
        commands.registerCommand(APPLY_WORKSPACE_EDIT, {
            execute: (changes: WorkspaceEdit) =>
                !!this.workspace.applyEdit && this.workspace.applyEdit(changes)
        });
    }

    // async sendNewOptions() {
    //     // TODO: request a new drawn diagram
    //     const synthesisOptions = this.diagramOptionsViewWidget.getDiagramOptions()
    //     const lClient = await this.client.languageClient
    //     const param = {
    //         uri: this.editorWidget.editor.uri.toString(),
    //         synthesisOptions: synthesisOptions
    //     }
    //     const msg: string = await lClient.sendRequest(SET_OPTIONS, param) as string
    //     // const updateDiagramMessage = {
    //     //     clientId: this.diagramManager.
    //     // } as ActionMessage
    //     // (this.diagramManager.diagramConnector as TheiaSprottyConnector).sendThroughLsp(updateDiagramMessage)
    //     console.log(msg)
    // }

    // onDidCreateWidget(e: DidCreateWidgetEvent): void {
    //     if (e.factoryId === DiagramOptionsViewWidget.widgetId) {
    //         this.initializeDiagramOptionsViewWidget(e.widget)
    //     }
    // }

    // async onDiagramOpened(uri: URI) {
    //     if (this.diagramOptionsViewWidget && this.diagramOptionsViewWidget.sourceModelPath === uri.toString()) {
    //         this.updateContent(true)
    //     }
    // }

    // async delay(milliseconds: number) {
    //     return new Promise<void>(resolve => {
    //         setTimeout(resolve, milliseconds)
    //     })
    // }

    // currentEditorChanged(eWidget: EditorWidget | undefined): void {
    //     if (eWidget) {
    //         this.editorWidget = eWidget
    //     }
    //     if (!this.diagramOptionsViewWidget || this.diagramOptionsViewWidget.isDisposed) {
    //         const widgetPromise = this.widgetManager.getWidget('diagramoptions-view')
    //         widgetPromise.then(widget => {
    //             this.initializeDiagramOptionsViewWidget(widget)
    //             // if (widget) {
    //             //     this.updateContent()
    //             // }
    //         })
    //     } else {
    //         this.updateContent()
    //     }
    // }

    // async updateContent(waitForDiagram = false) {
    //     if (this.diagramOptionsViewWidget.sourceModelPath !== this.editorWidget.editor.uri.toString() || !this.diagramOptionsViewWidget.hasContent) {
    //         const lClient = await this.client.languageClient
    //         const param = {
    //             uri: this.editorWidget.editor.uri.toString(),
    //             waitForDiagram : waitForDiagram
    //         }
    //         const options: SynthesisOption[] = await lClient.sendRequest(GET_OPTIONS, param) as SynthesisOption[]
    //         if (options) {
    //             options.forEach(option => option.currentValue = option.initialValue)
    //         }
    //         this.diagramOptionsViewWidget.setDiagramOptions(options)
    //         this.diagramOptionsViewWidget.sourceModelPath = this.editorWidget.editor.uri.toString()
    //         this.diagramOptionsViewWidget.update()
    //     }
    // }
}
