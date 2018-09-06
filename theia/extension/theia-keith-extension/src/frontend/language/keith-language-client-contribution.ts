/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { inject, injectable, named } from 'inversify'
import { FrontendApplication, KeybindingRegistry } from '@theia/core/lib/browser'
import URI from '@theia/core/lib/common/uri'
import {
    BaseLanguageClientContribution,
    LanguageClientFactory,
    Languages,
    Workspace,
} from '@theia/languages/lib/browser'
import { DiagramManagerProvider, DiagramManager } from 'theia-sprotty/lib'
import { CommandRegistry, Disposable } from '@theia/core/lib/common';
import { ContextMenuCommands } from './dynamic-commands';
import { Constants } from '../../common/util';

@injectable()
export class KeithLanguageClientContribution extends BaseLanguageClientContribution {

    readonly id = 'kgt'
    readonly name = 'KGraph'

    constructor(
        @inject(Workspace) workspace: Workspace,
        @inject(Languages) languages: Languages,
        @inject(LanguageClientFactory) languageClientFactory: LanguageClientFactory,
        @inject(DiagramManagerProvider)@named('keith-diagram') protected keithDiagramManagerProvider: DiagramManagerProvider,
        @inject(KeybindingRegistry) protected keybindingRegistry: KeybindingRegistry,
        @inject(CommandRegistry) protected commandRegistry: CommandRegistry,
        @inject(ContextMenuCommands) protected commands: ContextMenuCommands
    ) {
        super(workspace, languages, languageClientFactory)
    }

    /**
     * Define pattern of supported languages from language server registered in backend with id and name of class.
     * Name for extension defined by mapping via monaco registration in frotend
     */
    protected get globPatterns() {
        return [
            '**/*.' + Constants.kgtId,
            '**/*.' + Constants.sctxId,
            '**/*.' + Constants.sclId,
            '**/*.' + Constants.kextId,
            '**/*.' + Constants.annoId,
            '**/*.' + Constants.esterelId,
            '**/*.' + Constants.lustreId
        ]
    }

    /**
     * Define id for pattern seen in globPatterns()
     */
    protected get documentSelector(): string[] {
        return [
            Constants.kgtId,
            Constants.sctxId,
            Constants.sclId,
            Constants.kextId,
            Constants.annoId,
            Constants.esterelId,
            Constants.lustreId

        ];
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
