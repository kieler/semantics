/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { inject, injectable } from "inversify";
import { CommandContribution, CommandRegistry, ResourceProvider, MessageService, Command } from '@theia/core/lib/common';
import { EditorCommands, EditorManager } from "@theia/editor/lib/browser";
import { WorkspaceEdit, Workspace } from "@theia/languages/lib/common";
import { FrontendApplication, OpenerService} from "@theia/core/lib/browser";
import { FileSystem } from "@theia/filesystem/lib/common";
import { SCChartsLanguageClientContribution } from "./sccharts-language-client-contribution";
import { SHOW_SCCHARTS_REFERENCES, APPLY_WORKSPACE_EDIT, navigationCommands, compilationCommands, CodeContainer, SHOW_PREVIOUS, SHOW_NEXT, SHOW_FIRST, SHOW_LAST, CommandStruct, SHOW_THIS, SHOW_THIS_STRUCT, COMPILE_NETLIST_STRUCT, COMPILE_NETLIST_JAVA_STRUCT, COMPILE_PRIORITY_JAVA_STRUCT } from "./sccharts-menu-contribution";
import URI from "@theia/core/lib/common/uri";
import { OutputChannelManager } from "@theia/output/lib/common/output-channel";
import { CompileWidget } from "../widgets/compile-widget";
import { Constants } from "../../common/constants";
import { TextWidget } from "../widgets/text-widget";


const TESTCOMMAND : Command =  {
    id: "test stuff", label: "do all the stuff"
}
@injectable()
export class SCChartsCommandContribution implements CommandContribution {

    isCompiled: Map<string, Boolean> = new Map
    sourceURI: Map<string, string> = new Map
    resultMap: Map<string, CodeContainer> = new Map
    indexMap: Map<string, number> = new Map
    lengthMap: Map<string, number> = new Map
    // registerKeybindings(keybindings: KeybindingRegistry): void {
    //      [
    //          {
    //              command: SHOW_PREVIOUS.id,
    //              context: this.keybindingContext.id,
    //              keybinding: "alt+shift+down"
    //          },
    //          {
    //              command: SHOW_NEXT.id,                 
    //              context: this.keybindingContext.id,
    //              keybinding: "alt+shift+up"
    //          }
    //      ].forEach(binding => {
    //          keybindings.registerKeybinding(binding);
    //      });
    // }
    constructor(
        @inject(Workspace) protected readonly workspace: Workspace,
        @inject(FileSystem) protected readonly fileSystem: FileSystem,
        @inject(ResourceProvider) protected readonly resourceProvider: ResourceProvider,
        @inject(MessageService) protected readonly messageService: MessageService,
        @inject(FrontendApplication) public readonly front: FrontendApplication,
        @inject(SCChartsLanguageClientContribution) protected readonly client: SCChartsLanguageClientContribution,
        @inject(OpenerService) protected readonly openerService: OpenerService,
        @inject(EditorManager) public readonly editorManager: EditorManager,
        @inject(OutputChannelManager) protected readonly outputManager: OutputChannelManager
        // @inject(SCChartsKeybindingContext) protected readonly keybindingContext: SCChartsKeybindingContext
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
        commands.registerCommand(TESTCOMMAND, {
            execute: () => {
                var textWidget = new CompileWidget(this)
                this.front.shell.addWidget(textWidget, {area: "bottom"})
                this.front.shell.activateWidget(textWidget.id)
            }
        })
        navigationCommands.forEach(commandStruct => {

            commands.registerCommand(commandStruct.command, {
                execute: () => {
                    this.executeShow(commandStruct)
                }
            });
        });
        compilationCommands.forEach(commandStruct => {
            commands.registerCommand(commandStruct.command, {
                execute: () => {
                    this.executeCompile(commandStruct)
                }
            })
        });
    }
    createSubFiles(baseString : string, text : CodeContainer) {
        this.message("Begin to write compilation results", "info")
        var index = 0
        text.files.forEach(text => {
            var prefix = index.toString()
            if (index < 10) {
                prefix = "0" + prefix
            }
            prefix.concat("_")
            this.fileSystem.createFile(baseString + prefix + text.key.replace(" ", "_").replace("/", ""), {content : text.value})
            index++
        });
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
    public show(url : string, index : number) {
        this.indexMap.set(url, index)
        this.executeShow(SHOW_THIS_STRUCT)
    }


    public compile(command : string) : Promise<boolean> {
        var commandStruct : CommandStruct;
        switch (command) {
            case Constants.netlist:
                commandStruct = COMPILE_NETLIST_STRUCT
                break;
            case Constants.netlistJava:
                commandStruct = COMPILE_NETLIST_JAVA_STRUCT
                break;
            case Constants.priorityJava:
                commandStruct = COMPILE_PRIORITY_JAVA_STRUCT
                break;

            default:
                commandStruct = COMPILE_NETLIST_STRUCT
                break;
        }
        this.message("Compiling with " + command, "info")
        return new Promise(() => this.executeCompile(commandStruct))
    }

    executeShow(commandStruct: CommandStruct) {
        const editor = this.editorManager.currentEditor;
        if (!editor) {
            this.message("Editor is undefined", "error")
            return false;
        }
        const uri = editor.editor.uri.toString();
        if (!(uri.endsWith('sctx') || uri.endsWith('view'))) {
            this.message("URI is different from '.sctx'", "error")
            return false
        }
        // uri checking an creation TODO remove hack
        var subURI = new URI(uri)
        var dir = subURI.path.toString();
        dir = dir.replace((this.workspace.rootUri as string).substring(7), "");
        dir = dir.replace(subURI.path.base, "");
        var srcGen = ""
        if (!uri.endsWith(".view")) {
            dir = dir.concat(subURI.path.base.replace(".", "") + "/")
            srcGen = "/src-gen"
        }
        var modelUriString = this.workspace.rootUri + srcGen + dir + "model.view"

        var checkUri = uri // will hold uri of original file (key for maps)
        if (!checkUri.endsWith('sctx')) {
            // for .view files check whether source file was compiled
            if (this.sourceURI.has(modelUriString)) {
                var foundSourceUri = this.sourceURI.get(modelUriString)
                if (!foundSourceUri) {
                    this.message("SourceUri undefined, aborting...", "error")
                    return false
                }
                checkUri = foundSourceUri
            } else {
                this.message("No sourceUri for " + modelUriString + " found, aborting...", "error")
                return false
            }
        }
        console.log("Checking whether " + checkUri + " was already compiled")
        // abort if uri was not compiled first, doesn't work, since model.view is not deleted
        if (!this.isCompiled.get(checkUri)) {
            this.message("Aborting since " + checkUri + " was not compiled " + this.isCompiled.get(checkUri), "error")
            return false
        }
        var nextIndex = 17
        // calculate next index
        const currentIndex = this.indexMap.get(checkUri)
        const result = this.resultMap.get(checkUri)
        if (currentIndex === undefined) {
            this.message("currentIndex not set for " + checkUri, "error")
            // TODO error handling
            return false
        }
        if (!result) {
            this.message("result not set for " + checkUri, "error")
            // TODO error handling
            return false
        }
        console.log("Current index = " + currentIndex)
        switch (commandStruct.command.id) {
            case SHOW_NEXT.id:
                nextIndex = Math.min(currentIndex + 1, result.files.length - 1)
                break;
            case SHOW_PREVIOUS.id:
                nextIndex = Math.max(currentIndex - 1, 0)
                break;
            case SHOW_FIRST.id:
                nextIndex = 0
                break;
            case SHOW_LAST.id:
                nextIndex = result.files.length - 1
                break;
            case SHOW_THIS.id:
                nextIndex = currentIndex
                break;
            default:
                this.message("No known command found", "error")
                break;
        }
        console.log("Next index = " + nextIndex)
        this.indexMap.set(checkUri, nextIndex)
        var textDocument = result.files[nextIndex]
        this.front.shell
        this.front.shell.addWidget(new TextWidget(textDocument.key, textDocument.value, uri), {area : "main"})
        this.front.shell.activateWidget(uri)
    }

    executeCompile(commandStruct: CommandStruct) : boolean {
        const editor = this.editorManager.currentEditor;

        if (!editor) {
            this.message("Editor is undefined", "error")
            return false;
        }

        const uri = editor.editor.uri.toString();
        if (!uri.endsWith('sctx')) {
            this.message("No .sctx file", "error")
            return false
        }
        console.log("Compiling " + uri)
        this.client.languageClient.then(lclient => {// TODO make own requesttype ExecuteCommandRequest.type
            lclient.sendRequest(commandStruct.commandLSPName, {
                command: commandStruct.command.id,
                arguments: [
                    uri,
                    commandStruct.compilationSystemId
                ]
            }).then((text: CodeContainer) => {
                this.message("Got compilation result for " + uri, "info")
                if (uri.startsWith("\"")) {
                    this.message("Found error in " + uri, "error")
                }
                this.isCompiled.set(uri as string, true)
                this.resultMap.set(uri as string, text)
                this.indexMap.set(uri as string, -1)
                this.lengthMap.set(uri as string, text.files.length)
                return true
            });
            return false
        })
        return false
    }
}
