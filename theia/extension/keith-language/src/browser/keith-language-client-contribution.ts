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

import { inject, injectable, named } from 'inversify';
import { FrontendApplication } from '@theia/core/lib/browser';
import {
    BaseLanguageClientContribution,
    LanguageClientFactory,
    Languages,
    Workspace,
} from '@theia/languages/lib/browser';
import { Disposable } from '@theia/core/lib/common';
import { LanguageRegister } from '../common';
import { DiagramManagerProvider, DiagramManager } from 'theia-sprotty/lib';
import { ContextMenuCommands } from './dynamic-commands';
import URI from '@theia/core/lib/common/uri';
@injectable()
export class KeithLanguageClientContribution extends BaseLanguageClientContribution {

    readonly id = 'keith'
    readonly name = 'Keith'

    patterns: string[];
    documentSelectors: string[]

    constructor(
        @inject(DiagramManagerProvider)@named('keith-diagram') protected keithDiagramManagerProvider: DiagramManagerProvider,
        @inject(ContextMenuCommands) protected commands: ContextMenuCommands,
        @inject(Workspace) workspace: Workspace,
        @inject(Languages) languages: Languages,
        @inject(LanguageClientFactory) languageClientFactory: LanguageClientFactory
    ) {
        super(workspace, languages, languageClientFactory)
        this.patterns = []
        this.documentSelectors = []
    }

    /**
     * Define pattern of supported languages from language server registered in backend with id and name of class.
     * Name for extension defined by mapping via monaco registration in frotend
     */
    protected get globPatterns() {
        return this.patterns
    }

    /**
     * Define id for pattern seen in globPatterns()
     */
    protected get documentSelector(): string[] {
        return[
            LanguageRegister.kgtId,
            LanguageRegister.sctxId,
            LanguageRegister.sclId,
            LanguageRegister.kextId,
            LanguageRegister.annoId,
            LanguageRegister.esterelId,
            LanguageRegister.lustreId
        ].concat(this.documentSelectors)
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
