package com.smartdevicelink.rpc.responses;

import java.util.Hashtable;
import java.util.List;

import com.smartdevicelink.protocol.enums.FunctionId;
import com.smartdevicelink.proxy.RpcResponse;

/**
 * Get DTCs Response is sent, when GetDTCs has been called
 * 
 * @since SmartDeviceLink 2.0
 */
public class GetDtcsResponse extends RpcResponse{

    public static final String KEY_ECU_HEADER = "ecuHeader";
    public static final String KEY_DTC = "dtc";

    public GetDtcsResponse(){
        super(FunctionId.GET_DTCS.toString());
    }

    public GetDtcsResponse(Hashtable<String, Object> hash){
        super(hash);
    }

    @SuppressWarnings("unchecked")
    public List<String> getDtc(){
        if(parameters.get(KEY_DTC) instanceof List<?>){
            List<?> list = (List<?>) parameters.get(KEY_DTC);
            if(list != null && list.size() > 0){
                Object obj = list.get(0);
                if(obj instanceof String){
                    return (List<String>) list;
                }
            }
        }
        return null;
    }

    public void setDtc(List<String> dtc){
        if(dtc != null){
            parameters.put(KEY_DTC, dtc);
        }
        else{
            parameters.remove(KEY_DTC);
        }
    }
    
    public Integer getEcuHeader(){
        return (Integer) parameters.get(KEY_ECU_HEADER);
    }
    
    public void setEcuHeader(Integer ecuHeader){
        if(ecuHeader != null){
            parameters.put(KEY_ECU_HEADER, ecuHeader);
        }
        else{
            parameters.remove(KEY_ECU_HEADER);
        }
    }
}