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

import { inject, injectable } from 'inversify';
import { CommandRegistry, MenuModelRegistry, Disposable } from '@theia/core/lib/common';
import { EDITOR_CONTEXT_MENU, EditorManager, EditorWidget } from '@theia/editor/lib/browser';

@injectable()
export class ContextMenuCommands {

    constructor(@inject(MenuModelRegistry) protected menuRegistry: MenuModelRegistry,
                @inject(CommandRegistry) protected registry: CommandRegistry,
                @inject(EditorManager) protected editorManager: EditorManager) {
    }

    registerCommand(id: string, callback: (...args: any[]) => any, thisArg?: any): Disposable {
        const execute = callback.bind(thisArg);
        const removeCommand = this.registry.registerCommand({ id: id }, {
            execute: () => {
                const currentEditor = this.editorManager.currentEditor
                if (this.isKGraphEditor(currentEditor)) {
                    execute(currentEditor.editor.document.uri)
                }
            },
            isVisible: () => this.isKGraphEditor(this.editorManager.currentEditor)
        });
        const removeMenu = this.menuRegistry.registerMenuAction(EDITOR_CONTEXT_MENU.concat("2_kgt"), {
            commandId: id,
            label: id
        });
        return {
            dispose : () => {
                removeCommand.dispose()
                removeMenu.dispose()
            }
        }
    }

    private isKGraphEditor(widget: EditorWidget | undefined): widget is EditorWidget {
        if (widget)
            return widget.editor.document.languageId === 'kgt';
        else
            return false;
    }
}