package com.smartdevicelink.dispatch.interfaces;

public interface IDispatchingStrategy<T> {
	public void dispatch(T message);
	
	public void handleDispatchingError(String info, Exception ex);
	
	public void handleQueueingError(String info, Exception ex);
}