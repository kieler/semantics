/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License") you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { injectable, ContainerModule } from 'inversify'
import { BaseLanguageServerContribution, IConnection, LanguageServerContribution } from '@theia/languages/lib/node'
// import { isWindows } from '@theia/core/lib/common/os'
import { createSocketConnection } from 'vscode-ws-jsonrpc/lib/server'
import * as net from 'net'
import * as path from 'path'
import { isWindows, isOSX } from "@theia/core";
import { Constants } from '../common/util';

const osExtension = isWindows ? '/kieler.exe' : (isOSX ? '.app' : '/kieler')

// path to language server for product for the different operating systems
export const productLsPath:  string = './../../../../kieler' + osExtension;
// path to language server for local debugging (could also be read from global.process.argv)
export const debugLsPath: string = "./../../../../../../../../Documents/theia-sprotty-test/language-server-archive/semantics2_9_keybindings/kieler/" + osExtension;


function getPort(): number | undefined {
    let arg = process.argv.filter(arg => arg.startsWith('--LSP_PORT='))[0]
    if (!arg) {
        return undefined
    } else {
        return Number.parseInt(arg.substring('--LSP_PORT='.length), 10)
    }
}

function getLsPath(): string | undefined {
    let arg = process.argv.filter(arg => arg.startsWith('--LS_PATH='))[0]
    if (!arg) {
        return undefined
    } else {
        return arg.substring('--LS_PATH='.length)
    }
}

function startAsSocket(): boolean {
    let arg = process.argv.filter(arg => arg.startsWith('--socket'))[0]
    if (!arg) {
        return false
    } else {
        return true
    }
}

@injectable()
class KeithLanguageServerContribution extends BaseLanguageServerContribution {

    readonly id = Constants.sctxId
    readonly name = Constants.sctxName

    readonly description = {
        id: 'sctx',
        name: 'SCTX',
        documentSelector: [Constants.annoId, Constants.esterelId, Constants.kextId, Constants.lustreId, Constants.sclId, Constants.sctxId],
        fileEvents: [
            // '**/*.' + Constants.kgtId,
            '**/*.' + Constants.sctxId,
            '**/*.' + Constants.sclId,
            '**/*.' + Constants.kextId,
            '**/*.' + Constants.annoId,
            '**/*.' + Constants.esterelId,
            '**/*.' + Constants.lustreId
        ]
    }

    start(clientConnection: IConnection): void {
        let socket = startAsSocket()
        console.log("Starting with socket is: " + socket)
        if (socket) {
            let socketPort = getPort();
            const socket = new net.Socket()
            const serverConnection = createSocketConnection(socket, socket, () => {
                socket.destroy()
            });
            this.forward(clientConnection, serverConnection)
            if (socketPort) {
                socket.connect(socketPort)
            } else {
                console.log("Socketport not defined, LSP_PORT=XXXX is required if --socket is used")
            }
        } else {
            let lsPath = getLsPath()
            if (!lsPath) {
                let arg = process.argv.filter(arg => arg.startsWith('--root-dir='))[0]
                if (!arg) {
                    lsPath = productLsPath
                    console.log("Starting with product path")
                } else {
                    lsPath = debugLsPath
                    console.log("Starting with debug path")
                }
            } else {
                console.log("Starting with LS_PATH as argument")
            }
            console.log("Starting LS with path: " + lsPath)
            const command = path.resolve(__dirname, lsPath);
            const serverConnection = this.createProcessStreamConnection(command, []);
            this.forward(clientConnection, serverConnection);
            serverConnection.onClose(() => console.log("Connection closed"))
        }
    }

}

export default new ContainerModule(bind => {
    bind(LanguageServerContribution).to(KeithLanguageServerContribution).inSingletonScope()
})