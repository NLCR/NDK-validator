package com.logica.ndk.tm.repair;

import java.io.File;

import com.logica.ndk.tm.cdm.CDM;
import com.logica.ndk.tm.utilities.file.FileCharacterizationImpl;

public class RepairPSMixsImpl {

  public void repair(String cdmId) {
    CDM cdm = new CDM();
    FileCharacterizationImpl characterizationImpl = new FileCharacterizationImpl();
    System.out.println("Updating mix in:" + cdm.getMixDir(cdmId) + File.separator + "flatData");
    characterizationImpl.updateMixsForPS(cdmId);
  }

}
