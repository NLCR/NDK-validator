package com.logica.ndk.tm.utilities.integration.wf.ws.client.wf;

/**
 * http://hastest:9090/ndk-wf-api/cb?cbType=NDKCBActivity&code=
 * 
 * @author krchnacekm
 */
public enum Activity {
    
    NAHRANI_DAVKY_DO_CDM("IDUPLOAD"), VYTVORENI_INTELEKTUALNICH_ENTIT("IDCREATEPACKAGES"), CEKANI_NA_ZPRACOVANI_ENTIT("IDWAITFORPACKAGES"), UKONCOVANI_ID("IDFINALIZE"),
    USPESNE_UKONCENO_ID("IDOK"), NEUSPESNE_UKONCENO_ID("IDNOOK"), DOKONCENI_PRI_CHYBE("IDFINALIZENOOK"), PRIPRAVA("PREPARE"), ZALOZENI_ADRESARE("CREATEDIR"),
    SKENOVANI_NA_PRIPRAVE("COVERSCAN"), NAHRAVANI_SOUBORU("UPLOAD"), ROZREZANI("RIPPING"), SKENOVANI("SCAN"), IMPORT_DAT_DO_CDM("CDMIMPORT"), 
    PRIPRAVA_DAT_DO_PP("PREPAREPP"), ZPRACOVANI_OBRAZU("PP"), PRIJETI_DAT_Z_PP("PROCESSPP"), GENEROVANI_UZIVATELSKE_KOPIE("USERCOPY"), OCR("OCR"),
    MANUALNI_OCR("MANUALOCR"), AUTOMATICKA_KOMPLETACE("COMPLETION"), ZPRACOVANI_VYSTUPU_EM("PROCESSEM"), NAHRANI_SOUBORU_PRIPRAVY("COVERUPLOAD"),
    VALIDACE_OBRAZU("PICTUREVALIDATION"), EDITACNI_MODUL("EM"), EXPORT_DO_LTP("IEEXPORTLTP"), EXPORT_DO_KRAMERIA_NKCR("IEEXPORTKRAMERIUSNKCR"),
    USPESNE_UKONCENO("OK"), NEUSPESNE_UKONCENO("NOOK"), VYRAZENI_Z_DIGITALIZACE("FINALIZENOOK"), KONTROLA("CONTROL"), ZISKANI_URNNBN("IEURNNBN"), 
    AKTUALIZACE_URNNBN("IEUPDATEURNNBN"), UKONCOVANI_IE("IEFINALIZE"), PRIPRAVA_IE("IEPREPARE"), USPESNE_UKONCENO_IE("IEOK"), UKONCENO_S_CHYBOU("IEFINALIZENOOK"),
    NEUSPESNE_UKONCENO_IE("IENOOK"), CEKANI_NA_DOKONCENI_IE("WAITFORIE"), ROZDELENI_NA_INTELEKTUALNI_ENTITY("SPLIT"), VALIDACE("VALIDATE"), UKONCOVANI("FINALIZE"),
    VALIDACE_IE("IEVALIDATE"), EDITACNI_MODUL_IE("IEEM"), ZPRACOVANI_VYSTUPU_IE("IEPROCESSEM"), PRIPRAVA_ID("IDPREPARE"), PROCES_MANUALNIHO_OCR("PROCESSMANUALOCR"),
    EXPORT_DO_KRAMERIA_MZK("IEEXPORTKRAMERIUSMZK"), PRIPRAVA_DAT_PRO_K4("IEPREPAREKRAMERIUS"), REDUKCE_DAT("REDUCTION"), REDUKCE_DAT_IE("IEREDUCTION");
    
    private String value;
    
    private Activity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
