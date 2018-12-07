/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { inject, injectable } from "inversify"
import { VNode } from "snabbdom/vnode"
import { Bounds, IVNodeDecorator, TYPES, IActionDispatcher, isExportable, ElementAndBounds,
     almostEquals, BoundsAware, isSizeable, SModelElement, SModelRoot } from "sprotty/lib"
import { ComputedTextBoundsAction } from "./actions"

export class TextBoundsData {
    vnode?: VNode
    bounds?: Bounds
    boundsChanged: boolean
}

/**
 * Grabs the bounds from hidden SVG DOM elements and fires ComputedTextBoundsActions.
 *
 * The actual bounds of text elements can usually not be determined from the SModel
 * as they depend on the view implementation, CSS stylings and the browser, how texts are rendered.
 * So the best way is to grab them from a live (but hidden) SVG using getBBox().
 */
@injectable()
export class HiddenTextBoundsUpdater implements IVNodeDecorator {

    constructor(@inject(TYPES.IActionDispatcher) protected actionDispatcher: IActionDispatcher) {
    }

    private readonly element2boundsData: Map<SModelElement, TextBoundsData> = new Map

    root: SModelRoot | undefined

    decorate(vnode: VNode, element: SModelElement): VNode {
        if (isSizeable(element)) {
            this.element2boundsData.set(element, {
                vnode: vnode,
                bounds: element.bounds,
                boundsChanged: false,
            })
        }
        if (element instanceof SModelRoot)
            this.root = element
        return vnode
    }

    postUpdate() {
        if (this.root !== undefined && isExportable(this.root) && this.root.export)
            return;
        this.getBoundsFromDOM()
        const resizes: ElementAndBounds[] = []
        this.element2boundsData.forEach(
            (boundsData, element) => {
                if (boundsData.boundsChanged && boundsData.bounds !== undefined)
                    resizes.push({
                        elementId: element.id,
                        newBounds: boundsData.bounds
                    })
            })
        this.actionDispatcher.dispatch(new ComputedTextBoundsAction(resizes))
        this.element2boundsData.clear()
    }

    protected getBoundsFromDOM() {
        this.element2boundsData.forEach(
            (boundsData, element) => {
                if (boundsData.bounds && isSizeable(element)) {
                    const vnode = boundsData.vnode
                    if (vnode && vnode.elm) {
                        const boundingBox = this.getBounds(vnode.elm, element)
                        const newBounds = {
                            x: element.bounds.x,
                            y: element.bounds.y,
                            width: boundingBox.width,
                            height: boundingBox.height
                        };
                        if (!(almostEquals(newBounds.x, element.bounds.x)
                            && almostEquals(newBounds.y, element.bounds.y)
                            && almostEquals(newBounds.width, element.bounds.width)
                            && almostEquals(newBounds.height, element.bounds.height))) {
                            boundsData.bounds = newBounds;
                            boundsData.boundsChanged = true;
                        }
                    }
                }
            }
        );
    }

    protected getBounds(elm: any, element: BoundsAware): Bounds {
        const bounds = elm.getBBox();
        return {
            x: bounds.x,
            y: bounds.y,
            width: bounds.width,
            height: bounds.height
        };
    }
}
