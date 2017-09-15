package com.gecko.core.batch.domain;

public class CorInstanceNode {
   private String name;
   private String zone;
   private Boolean activeZone;

   public String getName () {
      return name;
   }

   public void setName (String name) {
      this.name = name;
   }

   public String getZone () {
      return zone;
   }

   public void setZone (String zone) {
      this.zone = zone;
   }

   public Boolean getActiveZone () {
      return activeZone;
   }

   public void setActiveZone (Boolean activeZone) {
      this.activeZone = activeZone;
   }
}
