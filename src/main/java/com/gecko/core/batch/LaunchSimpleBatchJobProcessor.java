package com.gecko.core.batch;

public class LaunchSimpleBatchJobProcessor {

   public void runSimpleBatchJob () {
      ManagedBatchJobProcessor sbjp = new SimpleBatchJobProcessor ();
      sbjp.executeJob ();
   }

   public static void main (String[] args) {
      LaunchSimpleBatchJobProcessor launchSimpleBatchJobProcessor =
              new LaunchSimpleBatchJobProcessor ();
      launchSimpleBatchJobProcessor.runSimpleBatchJob ();
   }
}
