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

import { injectable, inject } from "inversify";
import { EditorManager } from "@theia/editor/lib/browser";
import { KeybindingContext, Keybinding } from "@theia/core/lib/browser";

/**
 * Defines in which context keybindings for the kicool extension can be used.
 */
@injectable()
export class KiCoolKeybindingContext implements KeybindingContext {
    constructor(
        @inject(EditorManager) protected readonly editorService: EditorManager
    ) { }

    readonly id = 'kicool.keybinding.context';

    /**
     * Checks whether a keybinding of this context can be used in the current situation.
     * @param arg keybinding to check
     */
    isEnabled(arg: Keybinding): boolean {
        if (!this.editorService.currentEditor) {
            return false
        }
        return true
    }
}