package com.gecko.core.batch;

import java.util.Map;

public abstract class BatchJobProcessor {
	
	public BatchJobProcessor () {}

	public BatchJobProcessor (RunMode pRunMode, String pJobType, String pJobId, String pInstanceParameters) {
		runMode = pRunMode;
		instanceParameters = pInstanceParameters;
		jobId = pJobId;
		jobType = pJobType;
		
		// loadParameters();
	}
	
	/* private void loadParameters() {
		parameters = new HashMap<String, String>();
		
		// validate that jobType exists in the db
		//Criterion<BatchJobParameter> jobTypeWhere = BatchJobParameter.BatchJobSetup().JobType().equal(jobType);

		// read parameters in db,
		//DomainEntitySet<BatchJobParameter> paramEntries = Application.find(BatchJobParameter.class, jobTypeWhere);
		List<BatchJobParameter> paramEntries = new ArrayList<BatchJobParameter>();
		for(BatchJobParameter param: paramEntries) {
			String keyname = param.getParamName();
			parameters.put(keyname, param.getParamValue());
		}
	} */

	protected abstract void execute ();

	protected void executeJob (BatchJobStep batchJobStep) {
		batchJobStep.executeBatchJobStep ();
	}

	public void executeJob () {
		// log info start
		try {
			execute ();
		} catch (Throwable t) {
			System.out.println ("Error in executing job " + this.getClass().getSimpleName ());
		}

		// log info end
	}

	protected abstract class BatchJobStep {
		public BatchJobStep () {}

		public void executeBatchJobStep () {
			// log start
			try {
				execute ();
			} catch (Throwable t) {
				throw new RuntimeException ("Execption executing batch job step " + this.getClass().getSimpleName (), t);
			}
			// log end
		}

		protected abstract void execute ();
	}


	
	private RunMode runMode;
	public RunMode getRunMode() { return runMode; }
	
	private String instanceParameters;
	public String getInstanceParameters() { return instanceParameters; }
	
	
	private String jobId;
	public String getJobId() { return jobId; }
	public void setJobId(String pJobId) { jobId = pJobId; }

	private String jobType;
	public String getJobType() { return jobType; }
	public void setJobType(String pJobType) { jobType = pJobType; }
	
	protected Map<String, String> parameters;
	public Map<String, String> getParameters() { return parameters; }
	
	public enum RunMode {
		ScheduledTask,
		UnScheduledTask
	}
}
