package com.smartdevicelink.security;

import java.util.ArrayList;
import java.util.List;
import com.smartdevicelink.SdlConnection.SdlSession;
import com.smartdevicelink.protocol.enums.SessionType;

public abstract class SdlSecurityBase {
	
	private SdlSession session = null;	
	private String appId = null;
	private String make = null;
	private boolean isInitSuccess = false;
	private byte sessionId = 0;
	private List<SessionType> startServiceList = new ArrayList<SessionType>();	
	
    public SdlSecurityBase() {
	}
	
	public abstract void initialize();
	
    public abstract Integer runHandshake(byte[] inputData,byte[] outputData);
    
	public abstract Integer encryptData(byte[] inputData,byte[] outputData);
	
    public abstract Integer decryptData(byte[] inputData,byte[] outputData);
    
    public abstract void shutDown();
    
    public void resetParams() {
    	session = null;
    	appId = null;
    	isInitSuccess = false;
    	startServiceList.clear();
    }
    
    public List<SessionType> getServiceList() {
    	return startServiceList;
    }
    
    public void handleInitResult(boolean val) {
    	setInitSuccess(val);
    	session.onSecurityInitialized();
    }
    
    public void handleSdlSession(SdlSession val) {
    	if (val == null) return;
    	
    	setSessionId(val.getSessionId());
    	setSdlSession(val);
    }
	
    private void setInitSuccess(boolean val) {
    	isInitSuccess = val;
    }
    
    public boolean getInitSuccess() {
    	return isInitSuccess;
    }
    
    private void setSessionId(byte val) {
    	sessionId = val;
    }
    
    public byte getSessionId() {
    	return sessionId;
    }

    private void setSdlSession(SdlSession val) {
    	session = val;
    }
    
    public String getAppId() {
    	return appId;
    }
    
    public void setAppId(String val) {
    	appId = val;
    }

    public String getMake() {
    	return make;
    }
    
    public void setMake(String val) {
    	make = val;
    }
}