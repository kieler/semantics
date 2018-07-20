/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { inject, injectable} from 'inversify'
import { FrontendApplication } from '@theia/core/lib/browser'
import {
    BaseLanguageClientContribution,
    LanguageClientFactory,
    Languages,
    Workspace,
} from '@theia/languages/lib/browser'
import { Disposable} from '@theia/core/lib/common';
import { ContextMenuCommands } from './dynamic-commands';
import { Constants} from './../../common/constants'

@injectable()
export class SCChartsLanguageClientContribution extends BaseLanguageClientContribution {

    readonly id = Constants.sctxId
    readonly name = Constants.sctxName

    constructor(
        @inject(Workspace) workspace: Workspace,
        @inject(Languages) languages: Languages,
        @inject(LanguageClientFactory) languageClientFactory: LanguageClientFactory,
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
            '**/*.' + Constants.sctxId,
            '**/*.' + Constants.lang2Id,
            '**/*.' + Constants.lang3Id,
            '**/*.' + Constants.annoId
        ]
    }

    /**
     * Define id for pattern seen in globPatterns()
     */
    protected get documentSelector(): string[] {
        return [
            Constants.sctxId,
            Constants.lang2Id,
            Constants.lang3Id,
            Constants.annoId

        ];
}

    waitForActivation(app: FrontendApplication): Promise<any> {
        return Promise.race([
            super.waitForActivation(app)
        ])
    }

    registerCommand(id: string, callback: (...args: any[]) => any, thisArg?: any): Disposable {
        return this.commands.registerCommand(id, callback, thisArg)
    }
}
