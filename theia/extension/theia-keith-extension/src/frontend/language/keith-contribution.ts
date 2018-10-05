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

import { inject, injectable } from "inversify";
import { CommandRegistry, MessageService, Command, MenuModelRegistry } from '@theia/core/lib/common';
import { EditorManager, EditorWidget } from "@theia/editor/lib/browser";
import { FrontendApplication, AbstractViewContribution, KeybindingRegistry, CommonMenus } from "@theia/core/lib/browser";
import { KeithLanguageClientContribution } from "./keith-language-client-contribution";
import { OutputChannelManager } from "@theia/output/lib/common/output-channel";
import { TextWidget } from "../widgets/text-widget";
import { CompilerWidget } from "../widgets/compiler-widget";
import { Workspace, ILanguageClient } from "@theia/languages/lib/browser";
import { Constants, CompilationSystems, CodeContainer } from "../../common/util";
import { KeithKeybindingContext } from "./keith-keybinding-context";
import { FileSystemWatcher, FileChange } from "@theia/filesystem/lib/browser";

/**
 * Contribution for CompilerWidget to add functionality to it and link with the current editor.
 */
@injectable()
export class KeithContribution extends AbstractViewContribution<CompilerWidget> {

    isCompiled: Map<string, boolean> = new Map
    sourceURI: Map<string, string> = new Map
    resultMap: Map<string, CodeContainer> = new Map
    indexMap: Map<string, number> = new Map
    lengthMap: Map<string, number> = new Map
    infoMap: Map<string, string[]> = new Map

    editor: EditorWidget
    compilerWidget: CompilerWidget

    constructor(
        @inject(Workspace) protected readonly workspace: Workspace,
        @inject(MessageService) protected readonly messageService: MessageService,
        @inject(FrontendApplication) public readonly front: FrontendApplication,
        @inject(KeithLanguageClientContribution) public readonly client: KeithLanguageClientContribution,
        @inject(EditorManager) public readonly editorManager: EditorManager,
        @inject(OutputChannelManager) protected readonly outputManager: OutputChannelManager,
        @inject(KeithKeybindingContext) protected readonly keithKeybindingContext: KeithKeybindingContext,
        @inject(FileSystemWatcher) protected readonly fileSystemWatcher: FileSystemWatcher
    ) {
        super({
            widgetId: Constants.compilerWidgetId,
            widgetName: 'Compiler',
            defaultWidgetOptions: {
                area: 'bottom'
            },
            toggleCommandId: COMPILER.id,
            toggleKeybinding: Constants.OPEN_COMPILER_WIDGET_KEYBINDING
        });
        this.editorManager.onCurrentEditorChanged(this.onCurrentEditorChanged.bind(this))
        this.fileSystemWatcher.onFilesChanged(this.onFilesChanged.bind(this))
    }

    onFilesChanged(fileChange: FileChange) {
        // TODO receives two event if file is saved
        if (this.compilerWidget.autoCompile) {
            this.compilerWidget.compileSelectedCompilationSystem()
        }
    }

    onCurrentEditorChanged(editorWidget: EditorWidget | undefined): void {
        if (editorWidget) {
            this.editor = editorWidget
        }
        if (this.compilerWidget) {
            this.compilerWidget.update()
        }
    }

    registerKeybindings(keybindings: KeybindingRegistry): void {
        [
            {
                command: SHOW_PREVIOUS.id,
                context: this.keithKeybindingContext.id,
                keybinding: Constants.SHOW_PREVIOUS_KEYBINDING
            },
            {
                command: SHOW_NEXT.id,
                context: this.keithKeybindingContext.id,
                keybinding: Constants.SHOW_NEXT_KEYBINDING
            },
            {
                command: COMPILER.id,
                context: this.keithKeybindingContext.id,
                keybinding: Constants.OPEN_COMPILER_WIDGET_KEYBINDING
            }
        ].forEach(binding => {
            keybindings.registerKeybinding(binding);
        });
    }

    registerMenus(menus: MenuModelRegistry): void {
        menus.registerMenuAction(CommonMenus.VIEW_VIEWS, {
            commandId: COMPILER.id
        });
    }

    registerCommands(commands: CommandRegistry): void {
        commands.registerCommand(COMPILER, {
            execute: async () => {
                this.compilerWidget = await this.widgetManager.tryGetWidget(Constants.compilerWidgetId) as CompilerWidget
                if (!this.compilerWidget) {
                    this.compilerWidget = await this.widgetManager.getOrCreateWidget(Constants.compilerWidgetId) as CompilerWidget
                    this.front.shell.addWidget(this.compilerWidget, {area: "bottom"})
                }
                this.compilerWidget.activate()
                this.compilerWidget.node.focus()
            }
        })
        commands.registerCommand(SHOW_NEXT, {
            execute: () => {
                if (!this.editor) {
                    this.message(Constants.EDITOR_UNDEFINED_MESSAGE, "error")
                    return false;
                }
                const uri = this.getStringUriOfCurrentEditor()
                if (!this.isCompiled.get(uri)) {
                    this.message(uri + " was not compiled", "error")
                    return false
                }
                const index = this.indexMap.get(uri)
                if (index !== 0 && !index) {
                    this.message("Index is undefined", "error")
                    return false
                }
                const length = this.lengthMap.get(uri)
                if (length !== 0 && !length) {
                    this.message("Length is undefined", "error")
                    return false
                }
                this.show(uri, Math.min(index + 1, length - 1))
            }
        })
        commands.registerCommand(SHOW_PREVIOUS, {
            execute: () => {
                if (!this.editor) {
                    this.message(Constants.EDITOR_UNDEFINED_MESSAGE, "error")
                    return false;
                }
                const uri = this.getStringUriOfCurrentEditor()
                if (!this.isCompiled.get(uri)) {
                    this.message(uri + " was not compiled", "error")
                    return false
                }
                const index = this.indexMap.get(uri)
                if (index !== 0 && !index) {
                    this.message("Index is undefined", "error")
                    return false
                }
                this.show(uri, Math.max(index - 1, 0))
            }
        })
    }
    public message(message: string, type: string) {
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
            default:
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
    public async show(uri: string, index: number) {
        const lclient = await this.client.languageClient
        const svg = await lclient.sendRequest(Constants.SHOW, [uri, index])
        const result = this.resultMap.get(uri)
        const infoList = this.infoMap.get(uri)
        let info = ""
        if (infoList) {
            info = infoList[index]
        }
        if (result) {
            const snapshotDescription = result.files[index];
            const textWidget = await this.front.shell.getWidgets("main").find((widget, index) => {
                return widget.id === uri
            }) as TextWidget
            if (textWidget) {
                textWidget.updateContent("Diagram: " + snapshotDescription.name + " " +
                        snapshotDescription.snapshotIndex, info  + svg)
            } else {
                console.log("Adding new widget since old was not found")

                this.front.shell.addWidget(new TextWidget("Diagram:" + snapshotDescription.name + " " +
                snapshotDescription.snapshotIndex, info + svg, uri), { area: "main", mode: "split-right"})
            }
            this.front.shell.activateWidget(uri)
        } else {
            this.message("File not compiled yet", "error")
        }
        this.indexMap.set(uri, index)
    }


    public compile(command: string) {
        if (!this.compilerWidget.autoCompile) {
            this.message("Compiling with " + command, "info")
        }
        this.executeCompile(command)
    }

    async executeCompile(command: string): Promise<void> {
        if (!this.editor) {
            this.message(Constants.EDITOR_UNDEFINED_MESSAGE, "error")
            return;
        }

        const uri = this.getStringUriOfCurrentEditor()
        console.log("Compiling " + uri)
        const lclient = await this.client.languageClient
        const snapshotsDescriptions: CodeContainer = await lclient.sendRequest(Constants.COMPILE, [uri, command, this.compilerWidget.compileInplace]) as CodeContainer
        if (!this.compilerWidget.autoCompile) {
            this.message("Got compilation result for " + uri, "info")
        }
        let infoList: string[] = []
        snapshotsDescriptions.files.forEach(snapshot => {
            let error, warning, info
            if (snapshot.errors.length > 0) {
                error = "ERROR: " +  snapshot.errors.reduce( (s1, s2) => s1 + " " + s2, snapshot.name + snapshot.snapshotIndex)
                this.outputManager.getChannel("SCTX").appendLine(error)
            }

            if (snapshot.warnings.length > 0) {
                warning = "WARN: " +  snapshot.warnings.reduce( (s1, s2) => s1 + " " + s2, snapshot.name + snapshot.snapshotIndex)
                this.outputManager.getChannel("SCTX").appendLine("WARN: " +  snapshot.warnings.reduce( (s1, s2) => s1 + " " + s2, snapshot.name + snapshot.snapshotIndex))

            }

            if (snapshot.infos.length > 0) {
                info = "INFO: " +  snapshot.infos.reduce( (s1, s2) => s1 + " " + s2, snapshot.name + snapshot.snapshotIndex)
                this.outputManager.getChannel("SCTX").appendLine("INFO: " +  snapshot.infos.reduce( (s1, s2) => s1 + " " + s2, snapshot.name + snapshot.snapshotIndex))

            }
            infoList.push(((error) ? error + "<br>" : "") + ((warning) ? warning + "<br>" : "") + ((info) ? info + "<br>" : ""))
        });
        this.infoMap.set(uri as string, infoList)
        if (uri.startsWith("\"")) {
            this.message("Found error in " + uri, "error")
        }
        this.isCompiled.set(uri as string, true)
        this.resultMap.set(uri as string, snapshotsDescriptions)
        this.indexMap.set(uri as string, -1)
        this.lengthMap.set(uri as string, snapshotsDescriptions.files.length)
        this.front.shell.activateWidget(Constants.compilerWidgetId)
    }



    async requestSystemDescriptions(): Promise<boolean> {
        if (!this.editor) {
            // this.message(Constants.EDITOR_UNDEFINED_MESSAGE, "error")
            return Promise.reject(Constants.EDITOR_UNDEFINED_MESSAGE)
        }
        const uri = this.getStringUriOfCurrentEditor()
        try {
            const lclient: ILanguageClient = await this.client.languageClient
            const systems: CompilationSystems[] =  await lclient.sendRequest(Constants.GET_SYSTEMS, [uri, true]) as CompilationSystems[]
            this.compilerWidget.systems = systems,
            this.compilerWidget.render()
            return Promise.resolve(true)
        } catch (error) {
            return Promise.reject("Communication with LS failed")
        }
    }

    getStringUriOfCurrentEditor(): string {
        const uri = this.editor.getResourceUri()
        if (uri) {
            return uri.toString()
        } else {
            return ""
        }
    }
}

export const SAVE: Command = {
    id: 'core.save',
    label: 'Save'
};

export const SHOW_NEXT: Command = {
    id: 'show_next',
    label: 'Show next'
}
export const SHOW_PREVIOUS: Command = {
    id: 'show_previous',
    label: 'Show previous'
}
export const COMPILER: Command = {
    id: 'compiler:toggle',
    label: 'Compiler'
}

