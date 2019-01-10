import { KLineCap, LineCap, KLineJoin, LineJoin, KLineStyle, LineStyle, HorizontalAlignment,
    VerticalAlignment, KHorizontalAlignment, KVerticalAlignment, KPosition, KRenderingLibrary } from "./kgraph-models"
import { Bounds, Point, toDegrees, ModelRenderer } from "sprotty/lib"
import { isNullOrUndefined } from "util"

// ------------- Util Class names ------------- //
const K_LEFT_POSITION = 'KLeftPositionImpl'
const K_RIGHT_POSITION = 'KRightPositionImpl'
const K_TOP_POSITION = 'KTopPositionImpl'
const K_BOTTOM_POSITION = 'KBottomPositionImpl'

// ------------- constants for string building --------------- //
const ID_SEPARATOR = '$'
const BACKGROUND = 'background'
const FOREGROUND = 'foreground'
const SHADOW = 'shadow'
const URL_START = 'url(#'
const URL_END = ')'

export class KGraphRenderingContext extends ModelRenderer {
    boundsMap: any
    decorationMap: any
    kRenderingLibrary: KRenderingLibrary
}

export function lineCapText(lineCap: KLineCap): 'butt' | 'round' | 'square' {
    switch (lineCap.lineCap) {
        case LineCap.CAP_FLAT: { // the flat LineCap option is actually called 'butt' in svg and most other usages.
            return 'butt'
        }
        case LineCap.CAP_ROUND: {
            return 'round'
        }
        case LineCap.CAP_SQUARE: {
            return 'square'
        }
    }
}

export function lineJoinText(lineJoin: KLineJoin): 'bevel' | 'miter' | 'round' {
    switch (lineJoin.lineJoin) {
        case LineJoin.JOIN_BEVEL: {
            return 'bevel'
        }
        case LineJoin.JOIN_MITER: {
            return 'miter'
        }
        case LineJoin.JOIN_ROUND: {
            return 'round'
        }
    }
}

/**
 * calculates the formatting string to define the given lineStyle
 * @param lineStyle The line style to format
 * @param lineWidth The width of the drawn line
 */
export function lineStyleText(lineStyle: KLineStyle, lineWidth: number): string { // TODO: implement dashOffset
    const one: string = (1 * lineWidth).toString()
    const three: string = (3 * lineWidth).toString()
    switch (lineStyle.lineStyle) {
        case LineStyle.CUSTOM: {
            return lineStyle.dashPattern.join(' ')
        }
        case LineStyle.DASH: {
            return [three, one].join(' ')
        }
        case LineStyle.DASHDOT: {
            return [three, one, one, one].join(' ')
        }
        case LineStyle.DASHDOTDOT: {
            return [three, one, one, one, one, one].join(' ')
        }
        case LineStyle.DOT: {
            return one
        }
        case LineStyle.SOLID: {
            return '0'
        }
    }
}

export function horizontalAlignmentText(horizontalAlignment: HorizontalAlignment): string {
    switch (horizontalAlignment) {
        case HorizontalAlignment.CENTER: {
            return 'middle'
        }
        case HorizontalAlignment.LEFT: {
            return 'start'
        }
        case HorizontalAlignment.RIGHT: {
            return 'end'
        }
    }
}

export function verticalAlignmentText(verticalAlignment: VerticalAlignment): string {
    switch (verticalAlignment) {
        case VerticalAlignment.CENTER: {
            return 'middle'
        }
        case VerticalAlignment.BOTTOM: {
            return 'baseline'
        }
        case VerticalAlignment.TOP: {
            return 'hanging'
        }
    }
}
// This will now always return the left coordinate of the text's bounding box.
export function calculateX(x: number, width: number, horizontalAlignment: KHorizontalAlignment, textWidth: number | undefined): number {
    if (textWidth === undefined) {
        switch (horizontalAlignment.horizontalAlignment) {
            case HorizontalAlignment.CENTER: {
                return x + width / 2
            }
            case HorizontalAlignment.LEFT: {
                return x
            }
            case HorizontalAlignment.RIGHT: {
                return x + width
            }
        }
    } else {
        switch (horizontalAlignment.horizontalAlignment) {
            case HorizontalAlignment.CENTER: {
                return x + width / 2 - textWidth / 2
            }
            case HorizontalAlignment.LEFT: {
                return x
            }
            case HorizontalAlignment.RIGHT: {
                return x + width - textWidth
            }
        }
    }
    console.error("horizontalAlignment is not defined.")
    return 0
}

export function calculateY(y: number, height: number, verticalAlignment: KVerticalAlignment, numberOfLines: number): number {
    let lineHeight = height / numberOfLines
    if (numberOfLines === 0) {
        lineHeight = height
    }
    switch (verticalAlignment.verticalAlignment) {
        case VerticalAlignment.CENTER: {
            return y + lineHeight / 2
        }
        case VerticalAlignment.BOTTOM: {
            return y + lineHeight
        }
        case VerticalAlignment.TOP: {
            return y
        }
    }
}

/**
 * Evaluates a position inside given parent bounds. Inspired by the java method PlacementUtil.evaluateKPosition
 * @param position the position
 * @param parentBounds the parent bounds
 * @param topLeft in case position equals null assume a topLeft KPosition, and a bottomRight KPosition otherwise
 * @returns the evaluated position
 */
export function evaluateKPosition(position: KPosition, parentBounds: Bounds, topLeft: boolean): Point {
    const width = parentBounds.width
    const height = parentBounds.height
    let point = {x: 0, y: 0}

    let xPos = position.x
    let yPos = position.y

    if (isNullOrUndefined(xPos)) {
        xPos = {
            absolute: 0,
            relative: 0,
            type: topLeft ? K_LEFT_POSITION : K_RIGHT_POSITION
        }
    }
    if (isNullOrUndefined(yPos)) {
        yPos = {
            absolute: 0,
            relative: 0,
            type: topLeft ? K_TOP_POSITION : K_BOTTOM_POSITION
        }
    }

    if (xPos.type === K_LEFT_POSITION) {
        point.x = xPos.relative * width + xPos.absolute
    } else {
        point.x = width - xPos.relative * width - xPos.absolute
    }
    if (yPos.type === K_TOP_POSITION) {
        point.y = yPos.relative * height + yPos.absolute
    } else {
        point.y = height - yPos.relative * height - yPos.absolute
    }

    return point
}

export function findById(map: any, idString: string): any {
    if (isNullOrUndefined(map)) {
        return
    }
    return map[idString]
    // TODO: why did I first implement this variant? Can there be renderings not on top level of the boundsMap?
    // const ids = idString.split(ID_SEPARATOR)
    // let obj = boundsMap
    // for (let id of ids) {
    //     obj = obj[id]
    //     if (isNullOrUndefined(obj)) {
    //         return
    //     }
    // }
    // return obj
}

export function fillBackground(id: string): string {
    return URL_START + backgroundId(id) + URL_END
}

export function fillForeground(id: string): string {
    return URL_START + foregroundId(id) + URL_END
}

export function shadowFilter(id: string): string {
    return URL_START + shadowId(id) + URL_END
}

export function backgroundId(id: string): string {
    return id + ID_SEPARATOR + BACKGROUND
}

export function foregroundId(id: string): string {
    return id + ID_SEPARATOR + FOREGROUND
}

export function shadowId(id: string): string {
    return id + ID_SEPARATOR + SHADOW
}

export function angle(x0: Point, x1: Point): number {
    return toDegrees(Math.atan2(x1.y - x0.y, x1.x - x0.x))
}

/**
 * transforms any string in 'CamelCaseFormat' to a string in 'kebab-case-format'.
 * @param string the string to transform
 */
export function camelToKebab(string: string): string {
    return string.replace(/([a-z0-9])([A-Z])/g, '$1-$2').toLowerCase();
}