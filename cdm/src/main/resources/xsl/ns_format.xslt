<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
<xsl:template match="/*">
    <xsl:copy>
      <xsl:copy-of select="@*, //namespace::*, child::node()"/>
    </xsl:copy>
  </xsl:template>
</xsl:stylesheet>