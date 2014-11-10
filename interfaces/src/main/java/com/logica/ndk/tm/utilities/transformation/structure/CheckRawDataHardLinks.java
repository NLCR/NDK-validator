package com.logica.ndk.tm.utilities.transformation.structure;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.logica.ndk.tm.utilities.BusinessException;
import com.logica.ndk.tm.utilities.SystemException;

/**
 * @author brizat
 */
@WebService(targetNamespace = "http://wwww.logica.com/ndk/tm/process")
public interface CheckRawDataHardLinks {

  @WebMethod
  @WebResult(name = "result")
  public String executeSync(
      @WebParam(name = "cdmId") final String cdmId
  ) throws BusinessException, SystemException;

  @WebMethod
  public void executeAsync(
      @WebParam(name = "cdmId") final String cdmId
  ) throws BusinessException, SystemException;
}