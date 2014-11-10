package com.logica.ndk.tm.utilities.transformation.djvu;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.logica.ndk.tm.utilities.BusinessException;
import com.logica.ndk.tm.utilities.SystemException;
import com.logica.ndk.tm.utilities.transformation.TransformationException;

/**
 * Utilita na konverziu DjVu image formatu do TIFF.
 * 
 * @author Rudolf Daco
 */
@WebService(targetNamespace = "http://wwww.logica.com/ndk/tm/process")
public interface ConvertDjVuToTiff {

  /**
   * @param cdmId
   *          - can be null
   * @param source
   *          - source target to get source files
   * @param target
   *          - target folder
   * @param sourceExt
   *          - can be null. commna sepparated list of extensions
   * @return
   * @throws TransformationException
   */
  @WebMethod
  public Integer executeSync(@WebParam(name = "cdmId") String cdmId,
      @WebParam(name = "source") String source,
      @WebParam(name = "target") String target,
      @WebParam(name = "sourceExt") String sourceExt) throws TransformationException, BusinessException, SystemException;

  @WebMethod
  public void executeAsync(@WebParam(name = "cdmId") String cdmId,
      @WebParam(name = "source") String source,
      @WebParam(name = "target") String target,
      @WebParam(name = "sourceExt") String sourceExt) throws TransformationException, BusinessException, SystemException;
}
