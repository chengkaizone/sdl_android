package com.smartdevicelink.rpc.responses;

import java.util.Hashtable;

import com.smartdevicelink.protocol.enums.FunctionId;
import com.smartdevicelink.proxy.RpcResponse;

/**
 * Speak Response is sent, when Speak has been called
 * 
 * @since SmartDeviceLink 1.0
 */
public class SpeakResponse extends RpcResponse {

	/**
	 * Constructs a new SpeakResponse object
	 */
    public SpeakResponse() {
        super(FunctionId.SPEAK.toString());
    }

	/**
	 * Constructs a new SpeakResponse object indicated by the Hashtable
	 * parameter
	 * <p>
	 * 
	 * @param hash
	 *            The Hashtable to use
	 */
    public SpeakResponse(Hashtable<String, Object> hash) {
        super(hash);
    }
}