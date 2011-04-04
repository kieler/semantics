<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	
	<xsl:variable name="svn">http://rtsys.informatik.uni-kiel.de/svn/kieler/trunk/plugins/</xsl:variable>	
	<xsl:variable name="version">1.0.1</xsl:variable>
	<xsl:variable name="magic1">a0a47d54a3f0001f1e08a6bcea8bff31</xsl:variable>
	<xsl:variable name="magic2">6debc4e9-3993-48f0-b640-80cb21cd30b6</xsl:variable>
	
	<xsl:template match="/"><xsl:text>
	</xsl:text>
	<psf version="2.0"><xsl:text>
	</xsl:text>
		<provider id="org.eclipse.team.svn.core.svnnature"><xsl:text>
			</xsl:text>
			<xsl:for-each select="feature/plugin">
				<xsl:element name="project">
					<xsl:attribute name="reference">
						<xsl:value-of select="$version"/>,<xsl:value-of select="$svn"/><xsl:value-of select="@id"/>,<xsl:value-of select="@id"/>,<xsl:value-of select="$magic1"/>;<xsl:value-of select="$svn"/>;<xsl:value-of select="$svn"/>;branches;tags;trunk;true;<xsl:value-of select="$magic2"/>;<xsl:value-of select="$svn"/>;;false;;;0
					</xsl:attribute>
				</xsl:element><xsl:text>
			</xsl:text>		
			</xsl:for-each>
		</provider>
	</psf>	
	</xsl:template>
</xsl:stylesheet>