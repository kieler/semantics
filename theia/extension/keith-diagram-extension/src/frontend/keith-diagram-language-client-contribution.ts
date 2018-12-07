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

import { inject, injectable, named } from 'inversify'
import { FrontendApplication, KeybindingRegistry } from '@theia/core/lib/browser'
import URI from '@theia/core/lib/common/uri'
import { DiagramManagerProvider, DiagramManager } from 'theia-sprotty/lib'
import { ContextMenuCommands } from './dynamic-commands'
import { KeithLanguageClientContribution } from 'keith-language-extension/lib/frontend/keith-language-client-contribution'
import { Disposable } from '@theia/core/lib/common'
import { LanguageClientFactory, Languages, Workspace } from '@theia/languages/lib/browser'
import { CommandRegistry } from '@theia/core/lib/common'

@injectable()
export class KeithDiagramLanguageClientContribution extends KeithLanguageClientContribution {

    constructor(
        @inject(DiagramManagerProvider)@named('keith-diagram') protected keithDiagramManagerProvider: DiagramManagerProvider,
        @inject(ContextMenuCommands) protected commands: ContextMenuCommands,
        @inject(Workspace) workspace: Workspace,
        @inject(Languages) languages: Languages,
        @inject(LanguageClientFactory) languageClientFactory: LanguageClientFactory,
        @inject(KeybindingRegistry) keybindingRegistry: KeybindingRegistry,
        @inject(CommandRegistry) commandRegistry: CommandRegistry
    ) {
        super(workspace, languages, languageClientFactory, keybindingRegistry, commandRegistry)
    }

    waitForActivation(app: FrontendApplication): Promise<any> {
        return Promise.race([
            super.waitForActivation(app),
            this.waitForOpenDiagrams(this.keithDiagramManagerProvider())
        ])
    }

    protected waitForOpenDiagrams(diagramManagerProvider: Promise<DiagramManager>): Promise<any> {
        return diagramManagerProvider.then(diagramManager => {
            return new Promise<URI>((resolve) => {
                const disposable = diagramManager.onDiagramOpened(uri => {
                    disposable.dispose()
                    resolve(uri)
                })
            })
        })
    }

    registerCommand(id: string, callback: (...args: any[]) => any, thisArg?: any): Disposable {
        return this.commands.registerCommand(id, callback, thisArg)
    }
}
