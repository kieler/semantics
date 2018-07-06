Hints for splash screen adjustments:

Taken from: https://wiki.eclipse.org/Platform-releng/Updating_Branding

If your image program offers a choice, such as GIMP 2.8.10 does, it is important to save the bmp WITHOUT color space information saved or, else, the splash screen will not be displayed on Windows .... apparently a silent failure to read a "modern" BMP file (watch bug 439573). And use care, since in Gimp anyway, the choice is a negative check-off: Do not write color space information is unchecked by default, but must be checked to save the bmp WITHOUT color space information -- just like it says, but as I repeatedly misread.

Also, The bitmap should be saved in 24-bit format (8R, 8G, 8B) for else "funny colors" (such as red instead of blue, or green instead of blue) will sometimes appear if the 32-bit format is used, with 8 bits of "transparency". 