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
        @inject(ContextMenuCommands) protected commands: ContextMenuCommands/*, TODO why can I remove these here? Why are they in yangster?
        @inject(KeybindingRegistry) protected keybindingRegistry: KeybindingRegistry,
        @inject(CommandRegistry) protected commandRegistry: CommandRegistry,
        @inject(CommandService) protected readonly commandService: CommandService,
        @inject(MessageService) protected readonly messageService: MessageService*/
    ) {
        super(workspace, languages, languageClientFactory)
    }

    protected get globPatterns() {
        return [
            '**/*.' + Constants.sctxId
        ]
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
