package com.logica.ndk.tm.utilities.transformation.tei;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class TeiToModsTest {

  private TeiToModsImpl teiToMods = new TeiToModsImpl();
  private File testDir = new File(FileUtils.getTempDirectory(), getClass().getSimpleName());

  @Before
  public void setUp() throws Exception {
    FileUtils.copyDirectory(new File("test-data/tei"), testDir);
  }

  @After
  public void tearDown() throws Exception {
    FileUtils.deleteDirectory(testDir);
  }

  @Ignore
  public void testExecute() throws IOException {

    String inputPath = new File(testDir, "NAK___KNIH_VALD_A_75_2GKH/MISC/KNIH_VALD_A_75_2GKH_CZ.XML").getAbsolutePath();
    String outputPath = new File(testDir, "OutTei.XML").getAbsolutePath();;
    teiToMods.execute(inputPath);

    File tempOut = new File(outputPath);
    assertTrue(tempOut.exists());
    assertTrue(readFileAsString(outputPath).length() > 0);
  }

  private String readFileAsString(String filePath)
      throws java.io.IOException {
    StringBuffer fileData = new StringBuffer(1000);
    BufferedReader reader = new BufferedReader(
        new FileReader(filePath));
    char[] buf = new char[1024];
    int numRead = 0;
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
    return fileData.toString();
  }

}