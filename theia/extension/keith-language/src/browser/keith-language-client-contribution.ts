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

import { inject, injectable } from 'inversify'
import { KeybindingRegistry, FrontendApplication } from '@theia/core/lib/browser'
import {
    BaseLanguageClientContribution,
    LanguageClientFactory,
    Languages,
    Workspace,
} from '@theia/languages/lib/browser'
import { CommandRegistry } from '@theia/core/lib/common';
import { LanguageRegister } from '../common';

@injectable()
export class KeithLanguageClientContribution extends BaseLanguageClientContribution {

    readonly id = 'sctx'
    readonly name = 'SCTX'

    constructor(
        @inject(Workspace) workspace: Workspace,
        @inject(Languages) languages: Languages,
        @inject(LanguageClientFactory) languageClientFactory: LanguageClientFactory,
        @inject(KeybindingRegistry) protected keybindingRegistry: KeybindingRegistry,
        @inject(CommandRegistry) protected commandRegistry: CommandRegistry
    ) {
        super(workspace, languages, languageClientFactory)
    }

    /**
     * Define pattern of supported languages from language server registered in backend with id and name of class.
     * Name for extension defined by mapping via monaco registration in frotend
     */
    protected get globPatterns() {
        return [
            '**/*.' + LanguageRegister.kgtId,
            '**/*.' + LanguageRegister.sctxId,
            '**/*.' + LanguageRegister.sclId,
            '**/*.' + LanguageRegister.kextId,
            '**/*.' + LanguageRegister.annoId,
            '**/*.' + LanguageRegister.esterelId,
            '**/*.' + LanguageRegister.lustreId
        ]
    }

    /**
     * Define id for pattern seen in globPatterns()
     */
    protected get documentSelector(): string[] {
        return [
            LanguageRegister.kgtId,
            LanguageRegister.sctxId,
            LanguageRegister.sclId,
            LanguageRegister.kextId,
            LanguageRegister.annoId,
            LanguageRegister.esterelId,
            LanguageRegister.lustreId

        ];
    }

    waitForActivation(app: FrontendApplication): Promise<any> {
        return Promise.race([
            super.waitForActivation(app),
            // this.waitForOpenDiagrams(this.keithDiagramManagerProvider())
        ])
    }
}
