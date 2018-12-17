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

import { injectable, ContainerModule } from 'inversify'
import { BaseLanguageServerContribution, IConnection, LanguageServerContribution } from '@theia/languages/lib/node'
import { createSocketConnection } from 'vscode-ws-jsonrpc/lib/server'
import * as net from 'net'
import * as path from 'path'
import { isWindows, isOSX } from "@theia/core";
import { LanguageRegister } from '../common';

const osExtension = isWindows ? '/kieler.exe' : (isOSX ? '.app/Contents/MacOs/kieler' : '/kieler')

// path to language server for product version of KEITH for the different operating systems
export const productLsPath:  string = './../../../../kieler' + osExtension;

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

@injectable()
class KeithLanguageServerContribution extends BaseLanguageServerContribution {

    readonly id = LanguageRegister.sctxId
    readonly name = LanguageRegister.sctxName

    readonly description = {
        id: LanguageRegister.sctxId,
        name: LanguageRegister.sctxName,
        documentSelector: [LanguageRegister.kgtId, LanguageRegister.annoId, LanguageRegister.esterelId, LanguageRegister.kextId,
            LanguageRegister.lustreId, LanguageRegister.sclId, LanguageRegister.sctxId],
        fileEvents: [
            '**/*.' + LanguageRegister.kgtId,
            '**/*.' + LanguageRegister.sctxId,
            '**/*.' + LanguageRegister.sclId,
            '**/*.' + LanguageRegister.kextId,
            '**/*.' + LanguageRegister.annoId,
            '**/*.' + LanguageRegister.esterelId,
            '**/*.' + LanguageRegister.lustreId
        ]
    }

    start(clientConnection: IConnection): void {
        let socketPort = getPort();
        if (socketPort) {
            console.log("Starting LS over socket.")
            const socket = new net.Socket()
            const serverConnection = createSocketConnection(socket, socket, () => {
                socket.destroy()
            });
            this.forward(clientConnection, serverConnection)
            socket.connect(socketPort)
        } else {
            let lsPath = getLsPath()
            // check whether the path to the LS was specified
            if (!lsPath) {
                // --root-dir is only present in the arguments if KEITH is started in its development setup
                let arg = process.argv.filter(arg => arg.startsWith('--root-dir='))[0]
                if (!arg) {
                    lsPath = productLsPath
                    console.log("Starting with product path")
                } else {
                    throw new Error("No path to LS was specified. Use '--LS_PATH=' to specify one.");
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