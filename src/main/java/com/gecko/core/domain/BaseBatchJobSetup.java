package com.gecko.core.domain;

abstract class BaseBatchJobSetup extends DataObject {
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		
		if( !(obj instanceof BatchJobSetup) ) return false;
		
		if (this == obj)  return true;
		
		BatchJobSetup that = (BatchJobSetup) obj;
		
		return getJobType().equals(that.getJobType());
	}
	
	public int hashCode() {
		return getJobType().hashCode();
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
