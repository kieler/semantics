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

// import { Disposable } from "@theia/languages/lib/browser";
// import { ThemeService, Theme } from "@theia/core/lib/browser/theming";
// import { injectable } from "inversify";

// const darkTheme = require('keith-sprotty/css/dark/dark.useable.css')
// const lightTheme = require('keith-sprotty/css/light/light.useable.css')

// @injectable()
// export class ThemeManager implements Disposable {

//     private disposable: Disposable;

//     initialize() {
//         const themeService = ThemeService.get()
//         this.switchTheme(undefined, themeService.getCurrentTheme())
//         this.disposable = themeService.onThemeChange(event => this.switchTheme(event.oldTheme, event.newTheme))
//     }

//     private switchTheme(oldTheme: Theme | undefined , newTheme: Theme): void {
//         if (oldTheme) {
//             if (oldTheme.id === 'dark')
//                 darkTheme.unuse()
//             else
//                 lightTheme.unuse()
//         }
//         if (newTheme.id === 'dark')
//             darkTheme.use()
//         else
//             lightTheme.use()
//     }

//     dispose(): void {
//         this.disposable.dispose()
//     }
// }