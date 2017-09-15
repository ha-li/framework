package com.gecko.core.batch.internal.mock;

import com.gecko.core.batch.domain.CorInstanceNode;

import java.util.ArrayList;
import java.util.List;

public class CorInstanceNodeProvider {

   public static List<CorInstanceNode> instanceNodeList () {
      List<CorInstanceNode> allInstances = new ArrayList<CorInstanceNode> ();

      allInstances.add ( anInstance ("macer.lan", "us-west-1a", Boolean.FALSE) );
      allInstances.add ( anInstance ("winder.lan", "us-west-1b", Boolean.TRUE) );
      allInstances.add ( anInstance ("vmxer.lan", "us-west-1a", Boolean.FALSE) );

      return allInstances;
   }

   private static CorInstanceNode anInstance (String name, String zone, Boolean isActive) {
      CorInstanceNode anInstance = new CorInstanceNode();
      anInstance.setName(name);
      anInstance.setActiveZone (isActive);
      anInstance.setZone (zone);
      return anInstance;
   }
}
