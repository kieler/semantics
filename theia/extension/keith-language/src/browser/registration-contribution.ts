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
import { KeithLanguageClientContribution } from './keith-language-client-contribution';
import { configuration as kgtConfiguration, monarchLanguage as kgtMonarchLanguage} from './kgt-monaco-language'
import { configuration as kextConfiguration, monarchLanguage as kextMonarchLanguage} from './kext-monaco-language'
import { configuration as annoConfiguration, monarchLanguage as annoMonarchLanguage} from './anno-monaco-language'
import { configuration as strlConfiguration, monarchLanguage as strlMonarchLanguage} from './strl-monaco-language'
import { configuration as lusConfiguration, monarchLanguage as lusMonarchLanguage} from './lus-monaco-language'
import { configuration as sclConfiguration, monarchLanguage as sclMonarchLanguage} from './scl-monaco-language';
import { CommandContribution, CommandRegistry } from '@theia/core';

@injectable()
export class RegistrationContribution implements CommandContribution {

    constructor(@inject(KeithLanguageClientContribution) protected client: KeithLanguageClientContribution) {
        console.log("Is the construvtor called?")
    }

    registerCommands(commands: CommandRegistry): void {
        commands.registerCommand({id: "register", label: "Register Languages"}, {
            execute: () => {
                this.registerLanguages()
            }
        })
    }

    async registerLanguages() {
        const lClient = await this.client.languageClient
        const languages = await lClient.sendRequest("registration/get-languages") as LanguageDescription[]
        console.log(languages)
        languages.forEach(language => {
            monaco.languages.register({
                id: language.id,
                aliases: [language.name, language.id],
                extensions: ['.' + language.id],
                mimetypes: ['text/' + language.id]
            })
            monaco.languages.onLanguage(language.id, () => {
                switch (language.id) {
                    case "scl":
                        monaco.languages.setLanguageConfiguration(language.id, sclConfiguration)
                        monaco.languages.setMonarchTokensProvider(language.id, sclMonarchLanguage)
                        break
                    case "anno":
                        monaco.languages.setLanguageConfiguration(language.id, annoConfiguration)
                        monaco.languages.setMonarchTokensProvider(language.id, annoMonarchLanguage)
                        break
                    case "kgt":
                        monaco.languages.setLanguageConfiguration(language.id, kgtConfiguration)
                        monaco.languages.setMonarchTokensProvider(language.id, kgtMonarchLanguage)
                        break
                    case "kext":
                        monaco.languages.setLanguageConfiguration(language.id, kextConfiguration)
                        monaco.languages.setMonarchTokensProvider(language.id, kextMonarchLanguage)
                        break
                    case "lus":
                        monaco.languages.setLanguageConfiguration(language.id, lusConfiguration)
                        monaco.languages.setMonarchTokensProvider(language.id, lusMonarchLanguage)
                        break
                    case "strl":
                        monaco.languages.setLanguageConfiguration(language.id, strlConfiguration)
                        monaco.languages.setMonarchTokensProvider(language.id, strlMonarchLanguage)
                        break
                }
            });
            this.client.patterns.push("**/*." + language.id)
            this.client.documentSelectors.push(language.id)
        });
        return
    }
}

export class LanguageDescription {
    id: string
    name: string
}