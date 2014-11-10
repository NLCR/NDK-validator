/**
 * 
 */
package com.logica.ndk.tm.jbpm.handler.transformation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.drools.runtime.process.WorkItem;

import com.google.common.base.Preconditions;
import com.logica.ndk.tm.jbpm.handler.AbstractAsyncHandler;
import com.logica.ndk.tm.process.util.ParamUtility;
import com.logica.ndk.tm.utilities.transformation.ConvertMCToPPTif;


/**
 * @author brizat
 *
 */
public class ConvertMCToPPTifAsyncHandler extends AbstractAsyncHandler {

  @Override
  public String executeAsyncWorkItem(WorkItem workItem, List<ParamUtility> paramUtility) throws Exception {
    String cdmId = (String) workItem.getParameter("cdmId");
    Preconditions.checkNotNull(cdmId);
    
    final AsyncCallInfo<ConvertMCToPPTif> aci = new AsyncCallInfo<ConvertMCToPPTif>("convertMCToPPTifEndpoint", ConvertMCToPPTif.class, paramUtility);
    aci.getClient().executeAsync(cdmId);
    return aci.getCorrelationId();
  }

  @Override
  public Map<String, Object> processResponse(Object response) throws Exception {
    final Map<String, Object> results = new HashMap<String, Object>();
    results.put("result", response);
    return results;
  }
}