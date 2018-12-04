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
// import { isWindows } from '@theia/core/lib/common/os'
import { createSocketConnection } from 'vscode-ws-jsonrpc/lib/server'
import * as net from 'net'
import * as path from 'path'
import { isWindows, isOSX } from "@theia/core";
import { Constants } from '../common/util';

const osExtension = isWindows ? '/kieler.exe' : (isOSX ? '.app/Contents/MacOs/kieler' : '/kieler')

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
        let socketPort = getPort();
        if (socketPort) {
            const socket = new net.Socket()
            const serverConnection = createSocketConnection(socket, socket, () => {
                socket.destroy()
            });
            this.forward(clientConnection, serverConnection)
            socket.connect(socketPort)
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