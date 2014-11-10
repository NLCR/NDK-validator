package com.logica.ndk.tm.utilities.transformation.sip2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.logica.ndk.tm.utilities.BusinessException;
import com.logica.ndk.tm.utilities.SystemException;

/**
 * @author korvasm
 */
@WebService(targetNamespace = "http://wwww.logica.com/ndk/tm/process")
public interface CheckExistenceOfUuid {

  /**String uuid, String locality, Boolean throwExceptionOnExist
   * Async execution
   * 
   * @param processId
   *          id of process to be checked
   * @param typeOfProcess
   *          type of checked
   */
  @WebMethod
  public String executeSync(
      @WebParam(name = "uuid") String uuid,
      @WebParam(name = "locality") String locality,
      @WebParam(name = "throwExceptionOnExist") Boolean throwExceptionOnExist) throws BusinessException, SystemException;

  /**
   * Async execution
   * 
   * @param processId
   *          id of process to be checked
   * @param typeOfProcess
   *          type of checked
   */
  @WebMethod
  public void executeAsync(
      @WebParam(name = "uuid") String uuid,
      @WebParam(name = "locality") String locality,
      @WebParam(name = "throwExceptionOnExist") Boolean throwExceptionOnExist) throws BusinessException, SystemException;

}