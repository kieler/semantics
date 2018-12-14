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

import { inject, injectable } from "inversify"
import { CommandContribution, CommandRegistry, Command } from '@theia/core/lib/common'
import { EditorCommands, EditorManager, EditorWidget } from "@theia/editor/lib/browser"
import { WorkspaceEdit, Workspace } from "@theia/languages/lib/browser"
import { WidgetManager } from "@theia/core/lib/browser"
// import { KeithLanguageClientContribution } from "keith-language/lib/frontend/keith-language-client-contribution"
import { KeithDiagramLanguageClientContribution } from "keith-diagram/lib/keith-diagram-language-client-contribution"

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

    constructor(
        @inject(Workspace) protected readonly workspace: Workspace,
        @inject(EditorManager) protected readonly editorManager: EditorManager,
        @inject(WidgetManager) protected readonly widgetManager: WidgetManager,
        @inject(KeithDiagramLanguageClientContribution) protected readonly client: KeithDiagramLanguageClientContribution
    ) {
        if (editorManager.activeEditor) {
            // if there is already an active editor, use that to initialize
            this.editorWidget = editorManager.activeEditor
        }
     }

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
}