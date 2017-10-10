/* ==========================================================================

    !!! DUMMY FOR ORGINAL SHO-FILE ONLY !!!

    nodelink.h

    Nodelinks are communication channels that link a controlling application
    to a hardware controller node. They can be implemented to use a variety
    of bus systems and to perform specific tasks like logging or even the
    simulation of a controller node. This file defines the interface common
    to all sorts of nodelinks (open, close, send, receive).

    Nodelinks must be opened by their specific nodelink_xxx_open function.
    Afterwards it is possible to continue with this function set or to use
    the generic nodelink_* functions defined in this file. This makes it
    possible to write programs that can operate on any nodelink type without
    modification.

    Copyright 2005 Stephan Höhrmann, stephan@hoehrmann.de

    This is free software, released under the terms of the GNU General
    Public License.

 ========================================================================== */
