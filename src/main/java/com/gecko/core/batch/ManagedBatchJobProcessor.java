package com.gecko.core.batch;

import com.gecko.core.batch.domain.CorInstanceNode;
import com.gecko.core.batch.internal.mock.CorInstanceNodeProvider;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class ManagedBatchJobProcessor extends BatchJobProcessor {

   public ManagedBatchJobProcessor(){}

   public void executeJob() {
      try {
         java.net.InetAddress host = java.net.InetAddress.getLocalHost ();

         // retrieve all host from cor-instance-node table
         // but for now just mock it out with a static provider
         List<CorInstanceNode> corInstanceList = CorInstanceNodeProvider.instanceNodeList ();

         List<CorInstanceNode> matchingList = new ArrayList<>();
         for (CorInstanceNode node : corInstanceList) {
            if (Pattern.matches (node.getName (), host.getHostName ())) {
               matchingList.add (node);
            }
         }

         // if match size == 1 and is active zone
         if (matchingList.size () == 1 && matchingList.get(0).getActiveZone ()) {
            super.executeJob ();
         } else {
            System.out.println (host.getHostName () + " does not match an active zone. Skipping job.");
         }

      } catch (UnknownHostException uhe) {
         throw new RuntimeException ("Failed to get InetAddress object in " + this.getClass ().getSimpleName () );
      } catch (RuntimeException e) {
        throw e;
      } catch (Exception e) {
         throw e;
      }
   }
}
