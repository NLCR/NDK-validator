package com.logica.ndk.tm.utilities.transformation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.drools.runtime.process.WorkItem;

import com.google.common.base.Preconditions;
import com.logica.ndk.tm.jbpm.handler.AbstractAsyncHandler;
import com.logica.ndk.tm.process.util.ParamUtility;

public class CreateCdmFromSkenAsyncHandler extends AbstractAsyncHandler {
  @Override
  public String executeAsyncWorkItem(WorkItem workItem, List<ParamUtility> paramUtility) throws Exception {

    final String cdmId = (String) workItem.getParameter("cdmId");
    Preconditions.checkNotNull(cdmId, "cdmId must not be null");

    final AsyncCallInfo<CreateCdmFromSken> aci = new AsyncCallInfo<CreateCdmFromSken>("createCdmFromSkenEndpoint", CreateCdmFromSken.class, paramUtility);
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
