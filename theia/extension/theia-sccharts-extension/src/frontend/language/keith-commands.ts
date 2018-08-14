/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { inject, injectable } from "inversify";
import { CommandContribution, CommandRegistry, ResourceProvider, MessageService } from '@theia/core/lib/common';
import { EditorCommands, EditorManager } from "@theia/editor/lib/browser";
import { FrontendApplication, OpenerService} from "@theia/core/lib/browser";
import { FileSystem } from "@theia/filesystem/lib/common";
import { KeithLanguageClientContribution } from "./keith-language-client-contribution";
import { SHOW_SCCHARTS_REFERENCES, APPLY_WORKSPACE_EDIT, COMPILER, SHOW_NEXT, SHOW_PREVIOUS} from "./keith-menu-contribution";
import { OutputChannelManager } from "@theia/output/lib/common/output-channel";
import { TextWidget } from "../widgets/text-widget";
import { CompilerWidget } from "../widgets/compiler-widget";
import { Workspace, WorkspaceEdit, ILanguageClient } from "@theia/languages/lib/browser";
import { Constants, Compilation, CodeContainer } from "../../common/constants";
@injectable()
export class SCChartsCommandContribution implements CommandContribution {

    systems: Compilation[];
    isCompiled: Map<string, Boolean> = new Map
    sourceURI: Map<string, string> = new Map
    resultMap: Map<string, CodeContainer> = new Map
    indexMap: Map<string, number> = new Map
    lengthMap: Map<string, number> = new Map

    constructor(
        @inject(Workspace) protected readonly workspace: Workspace,
        @inject(FileSystem) protected readonly fileSystem: FileSystem,
        @inject(ResourceProvider) protected readonly resourceProvider: ResourceProvider,
        @inject(MessageService) protected readonly messageService: MessageService,
        @inject(FrontendApplication) public readonly front: FrontendApplication,
        @inject(KeithLanguageClientContribution) public readonly client: KeithLanguageClientContribution,
        @inject(OpenerService) protected readonly openerService: OpenerService,
        @inject(EditorManager) public readonly editorManager: EditorManager,
        @inject(OutputChannelManager) protected readonly outputManager: OutputChannelManager
    ) {
    }

    registerCommands(commands: CommandRegistry): void {
        commands.registerCommand(SHOW_SCCHARTS_REFERENCES, {
            execute: (uri: string, position: Position, locations: Location[]) =>
                commands.executeCommand(EditorCommands.SHOW_REFERENCES.id, uri, position, locations)
        });
        commands.registerCommand(APPLY_WORKSPACE_EDIT, {
            execute: (changes: WorkspaceEdit) =>
                !!this.workspace.applyEdit && this.workspace.applyEdit(changes)
        });
        commands.registerCommand(COMPILER, {
            execute: () => {
                if (this.front.shell.getWidgets("bottom").find((value, index) => {
                    return value.id == Constants.compilerWidgetId
                })) {
                    this.front.shell.activateWidget(Constants.compilerWidgetId)
                } else {
                    var compileWidget = new CompilerWidget(this)
                    this.front.shell.addWidget(compileWidget, {area: "bottom"})
                    this.front.shell.activateWidget(compileWidget.id)
                }
            }
        })
        commands.registerCommand(SHOW_NEXT, {
            execute: () => {
                const editor = this.editorManager.currentEditor
                if (!editor) {
                    this.message(Constants.EDITOR_UNDEFINED_MESSAGE, "error")
                    return false;
                }
                const uri = editor.editor.uri.toString();
                var index = this.indexMap.get(uri)
                if (index != 0 && !index) {
                    this.message("Index is undefined", "error")
                    return false
                }
                var length = this.lengthMap.get(uri)
                if (length != 0 && !length) {
                    this.message("Length is undefined", "error")
                    return false
                }
                this.show(uri, Math.min(index + 1, length - 1))
            }
        })
        commands.registerCommand(SHOW_PREVIOUS, {
            execute: () => {
                const editor = this.editorManager.currentEditor
                if (!editor) {
                    this.message(Constants.EDITOR_UNDEFINED_MESSAGE, "error")
                    return false;
                }
                const uri = editor.editor.uri.toString();
                var index = this.indexMap.get(uri)
                if (index != 0 && !index) {
                    this.message("Index is undefined", "error")
                    return false
                }
                this.show(uri, Math.max(index - 1, 0))
            }
        })
    }
    public message(message : string, type : string) {
        switch (type) {
            case "error":
                this.messageService.error(message)
                this.outputManager.getChannel("SCTX").appendLine("ERROR: " +  message)
                break;
            case "warn":
                this.messageService.warn(message)
                this.outputManager.getChannel("SCTX").appendLine("WARN: " + message)
                break;
            case "info":
                this.messageService.info(message)
                this.outputManager.getChannel("SCTX").appendLine("INFO: " + message)
                break;
            default :
                this.messageService.log(message)
                this.outputManager.getChannel("SCTX").appendLine("LOG: " + message)
                break;
            
        }
    }

    /**
     * 
     * @param id id of snapshot e.g. Signal
     * @param index index of snapshot
     */
    public show(uri : string, index : number) {
        this.client.languageClient.then(lclient => {
            lclient.sendRequest(Constants.SHOW, [uri, index]).then((svg: string) => {
                var result = this.resultMap.get(uri)
                if (result) {

                    var snapshotDescription = result.files[index];
                    if (this.front.shell.getWidgets("main").find((value, index) => {
                        if (value.id == uri) {
                            (value as TextWidget).updateContent("Diagram: " + snapshotDescription.groupId + ": " + snapshotDescription.name + " " +
                            snapshotDescription.snapshotIndex, svg)
                            return true
                        }
                        return false
                    })) {
                        this.front.shell.activateWidget(uri)
                    } else {
                        this.front.shell.addWidget(new TextWidget("Diagram: " + snapshotDescription.groupId + ": " + snapshotDescription.name + " " +
                        snapshotDescription.snapshotIndex, svg, uri), { area: "main" })
                        this.front.shell.activateWidget(uri)
                    }
                } else {
                    this.message("File not compiled yet", "error")
                }
            });
        })
        this.indexMap.set(uri, index)
    }


    public compile(command : string){
        this.message("Compiling with " + command, "info")
        this.executeCompile(command)
    }

    executeCompile(command: string) : boolean {
        const editor = this.editorManager.currentEditor;

        if (!editor) {
            this.message(Constants.EDITOR_UNDEFINED_MESSAGE, "error")
            return false;
        }

        const uri = editor.editor.uri.toString();
        console.log("Compiling " + uri)
        this.client.languageClient.then(lclient => {
            lclient.sendRequest(Constants.COMPILE, [uri,command]).then((snapshotsDescriptions: CodeContainer) => {
                this.message("Got compilation result for " + uri, "info")
                if (uri.startsWith("\"")) {
                    this.message("Found error in " + uri, "error")
                }
                this.isCompiled.set(uri as string, true)
                this.resultMap.set(uri as string, snapshotsDescriptions)
                this.indexMap.set(uri as string, -1)
                this.lengthMap.set(uri as string, snapshotsDescriptions.files.length)
                this.front.shell.activateWidget(Constants.compilerWidgetId)
                return true
            });
            return false
        })
        return false
    }



    async requestSystemDescribtions() : Promise<boolean> {
        const editor = this.editorManager.currentEditor
        if (!editor) {
            this.message(Constants.EDITOR_UNDEFINED_MESSAGE, "error")
            return Promise.reject(Constants.EDITOR_UNDEFINED_MESSAGE)
        }
        const uri = editor.editor.uri.toString();
        try {
            const lclient : ILanguageClient = await this.client.languageClient
            const systems : Compilation[] =  await lclient.sendRequest(Constants.GET_SYSTEMS, [uri, true]) as Compilation[]
            this.systems = systems
            this.front.shell.getWidgets("bottom").forEach(widget => {
                if (widget.id == Constants.compilerWidgetId) {
                    (widget as CompilerWidget).render()
                }
            })
            return Promise.resolve(true)
        } catch(error) {
            return Promise.reject("Communication with LS failed")
        }
    }
}
