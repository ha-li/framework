package com.gecko.core.batch;

public class SimpleBatchJobProcessor extends ManagedBatchJobProcessor {

   @Override
   public void execute () {
      executeJob ( new InitiateJobStep () );
      executeJob ( new PostToExternalWebService () );
      executeJob ( new TerminateJobStep () );
   }

   private class PostToExternalWebService extends BatchJobStep {
      public void execute () {
         System.out.println ("Calling an external web service.");
      }
   }

   private class InitiateJobStep extends BatchJobStep {
      public void execute () {
         System.out.println ("Running initate job step.");
      }
   }

   private class TerminateJobStep extends BatchJobStep {
      public void execute () {
         System.out.println ("Terminating job step.");
      }
   }
}
