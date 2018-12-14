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
import { EditorCommands } from "@theia/editor/lib/browser"
import { WorkspaceEdit, Workspace } from "@theia/languages/lib/browser"

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

@injectable()
export class KeithCommandContribution implements CommandContribution {

    constructor(
        @inject(Workspace) protected readonly workspace: Workspace,
    ) {
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