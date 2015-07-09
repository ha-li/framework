package com.gecko.core.domain;

public class BaseBatchJobSetup extends DataObject {
	
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof BatchJobSetup)) 
		{
			return false;
		}
		else if ( this == obj) 
		{ 
			return true;
		}
		else 
		{
			return getJobType() == null ? false : getJobType().equals(((BatchJobSetup)obj).getJobType());
		}
	}
	
	public int hashCode() {
		return getJobType() == null ? super.hashCode() : getJobType().hashCode();
	}
	
	private String jobProcessorClassName;
	public String getJobProcessorClassName() {
		return jobProcessorClassName;
	}
	
	private String jobType;
	public String getJobType() {
		return jobType;
	}
	
	private int maxRetries = 0;
	public int getMaxRetries() {
		return maxRetries;
	}
	
	private String jobTimerExpression;
	public String getJobTimerExpression() {
		return jobTimerExpression;
	}
	
	private String jobNameSpace;
	public String getJobNameSpace() {
		return jobNameSpace;
	}
}
