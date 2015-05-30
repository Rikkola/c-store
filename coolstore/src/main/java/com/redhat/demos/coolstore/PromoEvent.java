package com.redhat.demos.coolstore;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Role(org.kie.api.definition.type.Role.Type.EVENT)
@org.kie.api.definition.type.Label("Promo Event")
public class PromoEvent implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Item ID")
   private java.lang.String itemId;
   @org.kie.api.definition.type.Label("Percentage Off")
   private java.lang.Double percentOff;

   public PromoEvent()
   {
   }

   public java.lang.String getItemId()
   {
      return this.itemId;
   }

   public void setItemId(java.lang.String itemId)
   {
      this.itemId = itemId;
   }

   public java.lang.Double getPercentOff()
   {
      return this.percentOff;
   }

   public void setPercentOff(java.lang.Double percentOff)
   {
      this.percentOff = percentOff;
   }

   public PromoEvent(java.lang.String itemId, java.lang.Double percentOff)
   {
      this.itemId = itemId;
      this.percentOff = percentOff;
   }

}