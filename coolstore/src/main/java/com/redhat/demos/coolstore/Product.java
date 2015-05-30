package com.redhat.demos.coolstore;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Product")
public class Product implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Description")
   private java.lang.String desc;
   @org.kie.api.definition.type.Label("Item ID")
   private java.lang.String itemId;
   @org.kie.api.definition.type.Label("Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label("Price")
   private java.lang.Double price;

   public Product()
   {
   }

   public java.lang.String getDesc()
   {
      return this.desc;
   }

   public void setDesc(java.lang.String desc)
   {
      this.desc = desc;
   }

   public java.lang.String getItemId()
   {
      return this.itemId;
   }

   public void setItemId(java.lang.String itemId)
   {
      this.itemId = itemId;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.Double getPrice()
   {
      return this.price;
   }

   public void setPrice(java.lang.Double price)
   {
      this.price = price;
   }

   public Product(java.lang.String desc, java.lang.String itemId,
         java.lang.String name, java.lang.Double price)
   {
      this.desc = desc;
      this.itemId = itemId;
      this.name = name;
      this.price = price;
   }

}