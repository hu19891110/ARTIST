/*******************************************************************************
 * File generated from the petstore-app::org::agoncal::application::petstore::domain::OrderLine uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 17. Juni 2014 20:36:37 MESZ
 *******************************************************************************/
package org.agoncal.application.petstore.domain;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Entity;
import org.agoncal.application.petstore.domain.Item;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of OrderLine.
 * 
 * @author 
 */
@Entity
public class OrderLine {
	/**
	 * Description of the property id.
	 */
	@Id
	public Long id;
	/**
	  * Description of the property quantity.
	  */
	
	public int quantity;
	/**
	   * Description of the property item.
	   */
	
	public Ref<Item> item;
	// Start of user code (user defined attributes for OrderLine)
	
	// End of user code
	
	/**
	 * The default constructor.
	 */
	public OrderLine() {
	
	}
	
	// Start of user code (user defined methods for OrderLine)
	
	// End of user code
	/**
	 * Returns id.
	 * @return id 
	 */
	public long getId() {
		return this.id;
	}
	
	/**
	 * Sets a value to attribute id. 
	 * @param newId 
	 */
	public void setId(long newId) {
	    this.id = newId;
	}

	/**
	 * Returns quantity.
	 * @return quantity 
	 */
	public int getQuantity() {
		return this.quantity;
	}
	
	/**
	 * Sets a value to attribute quantity. 
	 * @param newQuantity 
	 */
	public void setQuantity(int newQuantity) {
	    this.quantity = newQuantity;
	}

	/** Returns item.
	 * @return item 
	 */
	public Item getItem() {
		return this.item.get();
	}
	
	/**
	 * Sets a value to attribute item. 
	 * @param newItem 
	 */
	public void setItem(Item referencedEntity) {
		this.item = Ref.create(referencedEntity);
	}




}