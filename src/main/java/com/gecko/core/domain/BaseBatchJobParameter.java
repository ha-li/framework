package com.gecko.core.domain;

public class BaseBatchJobParameter extends DataObject {
	private String jobStep;
	public String getJobStep() {
		return jobStep;
	}
	
	private String paramName;
	public String getParamName() {
		return paramName;
	}
	
	private String paramValue;
	public String getParamValue() {
		return paramValue;
	}
	
	private String id;
	public String getId() {
		return id;
	}
	
	private BatchJobSetup batchJobSetup;
	public BatchJobSetup getBatchJobSetup() {
		return batchJobSetup;
	}
}
