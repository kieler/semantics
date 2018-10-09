// /*
//  * Copyright (C) 2017 TypeFox and others.
//  *
//  * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
//  * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
//  */

// import { Container, injectable } from "inversify"
// import { KeyTool, TYPES } from 'sprotty/lib'
// import { DiagramConfiguration } from "theia-sprotty/lib"
// // import { TheiaDiagramServer } from "theia-sprotty/lib"
// import { TheiaKeyTool } from 'theia-sprotty/lib'
// import { createKeithDiagramContainer } from 'keith-sprotty/lib'
// import { KeithDiagramServer } from "./keith-diagram-server";

// @injectable()
// export class KeithDiagramConfiguration implements DiagramConfiguration {
//     diagramType: string = 'keith-diagram'

//     createContainer(widgetId: string): Container {
//         const container = createKeithDiagramContainer(widgetId)
//         container.bind(TYPES.ModelSource).to(KeithDiagramServer).inSingletonScope()
//         container.rebind(KeyTool).to(TheiaKeyTool).inSingletonScope()
//         return container
//     }
// }