package com.smartdevicelink.rpc.responses;

import java.util.Hashtable;

import com.smartdevicelink.protocol.enums.FunctionId;
import com.smartdevicelink.proxy.RpcResponse;

/**
 * Perform Audio Pass Thru Response is sent, when PerformAudioPassThru has been called
 * 
 * @since SmartDeviceLink 2.0
 */
public class PerformAudioPassThruResponse extends RpcResponse {

	/**
	 * Constructs a new PerformAudioPassThruResponse object
	 */
    public PerformAudioPassThruResponse() {
        super(FunctionId.PERFORM_AUDIO_PASS_THRU.toString());
    }

	/**
	 * Constructs a new PerformAudioPassThruResponse object indicated by the Hashtable
	 * parameter
	 * <p>
	 * 
	 * @param hash
	 *            The Hashtable to use
	 */
    public PerformAudioPassThruResponse(Hashtable<String, Object> hash) {
        super(hash);
    }
}