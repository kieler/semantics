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
import { FrontendApplication } from '@theia/core/lib/browser'
import { BaseLanguageClientContribution, LanguageClientFactory, Languages, Workspace } from '@theia/languages/lib/browser'
import { Constants } from './../../common/util'

/**
 * Language client contribution to bind languageIds and file extensions for languages supported by language server
 */
@injectable()
export class KeithLanguageClientContribution extends BaseLanguageClientContribution {

    readonly id = Constants.sctxId
    readonly name = Constants.sctxName

    constructor(
        @inject(Workspace) workspace: Workspace,
        @inject(Languages) languages: Languages,
        @inject(LanguageClientFactory) languageClientFactory: LanguageClientFactory
    ) {
        super(workspace, languages, languageClientFactory)
    }

    /**
     * Define pattern of supported languages from language server registered in backend with id and name of class.
     * Name for extension defined by mapping via monaco registration in frotend
     */
    protected get globPatterns() {
        return [
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
            super.waitForActivation(app)
        ])
    }
}
