/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { inject, injectable } from "inversify";
import { CommandContribution, CommandRegistry, ResourceProvider, MessageService } from '@theia/core/lib/common';
import { EditorCommands, EditorManager } from "@theia/editor/lib/browser";
import { WorkspaceEdit, Workspace } from "@theia/languages/lib/common";
import { FrontendApplication, OpenerService} from "@theia/core/lib/browser";
import { FileSystem } from "@theia/filesystem/lib/common";
import { SCChartsLanguageClientContribution } from "./sccharts-language-client-contribution";
// import { Constants } from "../../common/constants";
import { TextWidget } from "../widgets/text-widget";
import { SHOW_SCCHARTS_REFERENCES, APPLY_WORKSPACE_EDIT, navigationCommands, compilationCommands, CodeContainer, SHOW_PREVIOUS, SHOW_NEXT, SHOW_FIRST, SHOW_LAST } from "./sccharts-menu-contribution";
import URI from "@theia/core/lib/common/uri";
import { OutputChannelManager } from "@theia/output/lib/common/output-channel";
// import { SCChartsKeybindingContext } from "./sccharts-keybinding-context";

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
        @inject(FrontendApplication) protected readonly front: FrontendApplication,
        @inject(SCChartsLanguageClientContribution) protected readonly client: SCChartsLanguageClientContribution,
        @inject(OpenerService) protected readonly openerService: OpenerService,
        @inject(EditorManager) protected readonly editorManager: EditorManager,
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
        navigationCommands.forEach(commandStruct => {

            commands.registerCommand(commandStruct.command, {
                execute: () => {
                    const editor = this.editorManager.currentEditor;
                    if (!editor) {
                        this.message("Editor is undefined", "error")
                        // this.front.shell.addWidget(new TextWidget("Error", "Editor is undefined", "error"), { area: 'bottom' })
                        // this.front.shell.activateWidget("error")
                        return false;
                    }
                    const uri = editor.editor.uri.toString();
                    if (!(uri.endsWith('sctx') || uri.endsWith('view'))) {
                        this.message("URI is different from '.sctx'", "error")
                        // this.front.shell.addWidget(new TextWidget("Error", "URI is different from '.sctx'", "error"), { area: 'bottom' })
                        // this.front.shell.activateWidget("error")
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
                    // if (!uri.endsWith('sctx')) {
                    //     modelUriString = this.workspace.rootUri + srcGen + dir + "model.view"
                    // }
                    var modelUri = new URI(modelUriString)
                    
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
                    console.log("Checking whether " + checkUri +  " was already compiled")
                    // abort if uri was not compiled first, doesn't work, since model.view is not deleted
                    if (!this.isCompiled.get(checkUri)) {
                        this.message("Aborting since " + checkUri + " was not compiled " + this.isCompiled.get(checkUri), "error")
                        return false
                    }
                    var nextIndex = 17
                    // calculate next index
                    const currentIndex = this.indexMap.get(checkUri)
                    const resultMap = this.resultMap.get(checkUri)
                    if (currentIndex === undefined) {
                        this.message("currentIndex not set for " + checkUri, "error")
                        // TODO error handling
                        return false
                    }
                    if (!resultMap) {
                        this.message("resultMap not set for " + checkUri, "error")
                        // TODO error handling
                        return false
                    }
                    console.log("Current index = " + currentIndex)
                    switch (commandStruct.command.id) {
                        case SHOW_NEXT.id:
                            nextIndex = Math.min(currentIndex + 1, resultMap.files.length - 1)
                            break;
                        case SHOW_PREVIOUS.id:
                            nextIndex = Math.max(currentIndex - 1, 0)
                            break;
                        case SHOW_FIRST.id:
                            nextIndex = 0
                            break;
                        case SHOW_LAST.id:
                            nextIndex = resultMap.files.length - 1
                            break;
                    
                        default:
                            this.message("No known command found", "error")
                            break;
                    }
                    console.log("Next index = " + nextIndex)
                    this.indexMap.set(checkUri, nextIndex)

                    // create or open model.view

                    this.fileSystem.exists(modelUriString).then(
                        (bool) => {
                            this.sourceURI.set(modelUriString, checkUri)
                            if (bool) {
                                console.log("Model.view already exist in file system")
                                this.fileSystem.getFileStat(modelUriString).then( (fileStat) => {
                                    // set content of already created model.view
                                    if (!fileStat) {
                                        return false
                                    }
                                    this.fileSystem.setContent(fileStat, resultMap.files[nextIndex].value).then( () => {
                                        this.editorManager.open(modelUri).then(
                                            () => {
                                                this.front.shell.activateWidget(modelUri.toString())
                                                var modelEditor = this.editorManager.currentEditor
                                                if (!modelEditor) {
                                                    return false
                                                }
                                                // var navigationURI = (editor.editor.getTargetUri() as URI)
                                                if (!modelEditor.editor.document.uri.endsWith('sctx')) {
                                                    modelEditor.title.label = "Navigate: " + resultMap.files[nextIndex].key
                                                }
                                            }
                                        )
                                    })
                                })
                                // open model.view if not already openend
                                
                            } else {
                                console.log("Model.view does not exist in file system")
                                // create model.view
                                this.fileSystem.createFile(modelUriString, { content: resultMap.files[nextIndex].value}).then( () => {

                                    this.editorManager.open(modelUri).then(
                                        () => {
                                            this.front.shell.activateWidget(modelUri.toString())
                                            var modelEditor = this.editorManager.currentEditor
                                            if (!modelEditor) {
                                                return false
                                            }
                                            // var navigationURI = (editor.editor.getTargetUri() as URI)
                                            if (!modelEditor.editor.document.uri.endsWith('sctx')) {
                                                modelEditor.title.label = "Navigate: " + resultMap.files[nextIndex].key
                                            }
                                        }
                                    )
                                })
                            }
                        }
                    )
                    // send resquest to ls
                    // try {
                    //     this.client.languageClient.then(lclient => {
                    //         lclient.sendRequest(commandStruct.commandLSPName, {
                    //             command: commandStruct.command.id,
                    //             arguments: [
                    //                 checkUri
                    //             ]
                    //         }).then((text: TextDocument) => {
    
                    //             this.fileSystem.exists(uri).then(
                    //                 (bool) => {
                    //                     if (bool) {
                    //                         // open model.view if not already openend
                    //                         if (!uri.endsWith(".view")) {
                    //                             // after model.view was first opened set title label of EditorWidget
                    //                             this.editorManager.open(modelUri).then(
                    //                                 () => {
                    //                                     this.front.shell.activateWidget(modelUri.toString())
                    //                                     var modelEditor = this.editorManager.currentEditor
                    //                                     if (!modelEditor) {
                    //                                         return false
                    //                                     }
                    //                                     console.log(modelEditor.getTargetUri())
                    //                                     // var navigationURI = (editor.editor.getTargetUri() as URI)
                    //                                     if (!modelEditor.editor.document.uri.endsWith('sctx')) {
                    //                                         modelEditor.title.label = "Navigate: " + text.key
                    //                                     }
                    //                                 }
                    //                             )
                    //                         }
                    //                         // if model.view was already opened just change content
                    //                         this.fileSystem.getFileStat(modelUriString).then(
                    //                             (fileStat) => {
                    //                                 this.front.shell.activateWidget(modelUri.toString())
                    //                                 this.fileSystem.setContent(fileStat, text.value).then(
                    //                                     () => {
                    //                                         var modelEditor = this.editorManager.currentEditor
                    //                                         if (!modelEditor) {
                    //                                             return false
                    //                                         }
                    //                                         console.log(modelEditor.getTargetUri())
                    //                                         // var navigationURI = (editor.editor.getTargetUri() as URI)
                    //                                         if (!modelEditor.editor.document.uri.endsWith('sctx')) {
                    //                                             modelEditor.title.label = "Navigate: " + text.key
                    //                                         }
                    //                                     }
                    //                                 )
                    //                             }
                    //                         )
                    //                     }
                    //                 }
                    //             )
                    //         });
                    //     });    
                    // } catch (error) {
                    //     this.front.shell.addWidget(new TextWidget("Error", "Request failed" + error, "error"), { area: 'bottom' })
                    //     this.front.shell.activateWidget("error")
                    //     return false
                    // }
                }
            });
        });
        compilationCommands.forEach(commandStruct => {
            commands.registerCommand(commandStruct.command, {
                execute: () => {

                    const editor = this.editorManager.currentEditor;

                    if (!editor) {
                        this.front.shell.addWidget(new TextWidget("Error", "Editor is undefined", "error"), { area: 'bottom' })
                        this.front.shell.activateWidget("error")
                        
                        return false;
                    }

                    const uri = editor.editor.uri.toString();
                    if (!uri.endsWith('sctx')) {
                        this.front.shell.addWidget(new TextWidget("Error", "URI is different from '.sctx'", "error"), { area: 'bottom' })
                        this.front.shell.activateWidget("error")
                        return false
                    }
                    var subURI = new URI(uri)
                    // add file unique directory in src-gen to write CompilationContexts to
                    var dir = subURI.path.toString();
                    dir = dir.replace((this.workspace.rootUri as string).substring(7), "");
                    dir = dir.replace(subURI.path.base, "");
                    dir = dir.concat(subURI.path.base.replace(".", "") + "/")

                    const srcGen = "/src-gen"
                    const baseString = this.workspace.rootUri + srcGen + dir

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
                            // create files in fileSystem (in src-gen)
                            // delete current src-gen  folder
                            var existUri = this.fileSystem.exists(baseString + "subresults/").catch(error => {
                                console.log(error)
                            })
                            existUri.then( (exists) => {
                                if (exists) {
                                    this.fileSystem.delete(baseString + "subresults/", {moveToTrash: false}).catch( error =>
                                        console.log("Deletion of folder failed " + error)
                                    ).then( () => {
                                        this.createSubFiles(baseString + "subresults/", text)
                                    })
                                } else {
                                    console.log( baseString + "subresults/" + " does not exist")
                                    this.createSubFiles(baseString + "subresults/", text)
                                }
                            })
                            // this.fileSystem.delete(baseString, {moveToTrash: false}).catch( error =>
                            //     console.log("Deletion of foler failed " + error)
                            // )

                            // var code: TextDocument[] = text.files
                            // try {
                            //     // delete directory on new compile
                            //     var allreadyExistsDir = this.fileSystem.exists(this.workspace.rootUri + "/src-gen" + dir).then(
                            //         (bool => {
                            //             if (bool) {
                            //                 // delete directory and wait for delete until new files are written
                            //                 this.fileSystem.delete(this.workspace.rootUri + "/src-gen" + dir, { moveToTrash: false }).then(
                            //                     () => {
                            //                         code.map((textDocument) => {
                            //                             this.fileSystem.createFile(this.workspace.rootUri + "/src-gen" + dir + textDocument.key, { content: textDocument.value })
                            //                         })
                            //                         this.fileSystem.createFile(this.workspace.rootUri + "/src-gen" + dir + "model.view", { content: "" })
                            //                         console.log("adding sourceUri for " + this.workspace.rootUri + "/src-gen" + dir + "model.view")
                            //                         this.sourceURI.set(this.workspace.rootUri + "/src-gen" + dir + "model.view", uri)
                            //                     }
                            //                 )
                            //             } else {
                            //                 code.map((textDocument) => {
                            //                     this.fileSystem.createFile(this.workspace.rootUri + "/src-gen" + dir + textDocument.key, { content: textDocument.value })
                            //                 })
                            //                 this.fileSystem.createFile(this.workspace.rootUri + "/src-gen" + dir + "model.view", { content: "" })
                            //                 console.log("adding sourceUri for " + this.workspace.rootUri + "/src-gen" + dir + "model.view")
                            //                 this.sourceURI.set(this.workspace.rootUri + "/src-gen" + dir + "model.view", uri)
                            //             }
                            //         })
                            //     )
                            //     allreadyExistsDir.catch((error) => {
                            //         this.front.shell.addWidget(new TextWidget("Error", "Dir is undefined " + error, "error"), { area: 'bottom' })
                            //         this.front.shell.activateWidget("error")

                            //     })
                            // } catch (error) {
                            //     this.front.shell.addWidget(new TextWidget("Error", error as string, "error"), { area: 'bottom' })
                            //     this.front.shell.activateWidget("error")
                            // }
                        });
                    })
                }
            });
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

    // deleteFolder(uri : string, toTrash : boolean) : PromiseLike<boolean> {
    //     var existUri = this.fileSystem.exists(uri).catch(error => {
    //         console.log( uri + " could not be deleted " + error)
    //         return new Promise(() => true)
    //     })
    //     existUri.then( (exists) => {
    //         if (exists) {
    //             this.fileSystem.delete(uri, {moveToTrash: toTrash}).catch( error =>
    //                 console.log("Deletion of foler failed " + error)
    //             )
    //         } else {
    //             console.log( uri + " does not exist")
    //         }
    //         return new Promise(() => true)
    //     })
    //     return new Promise(() => true)
    // }
    message(message : string, type : string) {
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
}
