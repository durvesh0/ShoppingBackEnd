package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Table(name = "PRODUCT")
@Component
public class Product {
	
	@Id
	@NotNull
	@Column
	private String id;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotNull
	@Column(name="price")
	private int price;
	
	@Column
	private String category_id;
	
	@Column
	private String supplier_id;
	
	private String fpath;
	
	
	public String getFpath() {
		return fpath;
	}
	public void setFpath(String fpath) {
		this.fpath = fpath;
	}
	
	
	/*transient private MultipartFile file1;
	
	public MultipartFile getFile1() {
		return file1;
	}
	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}*/
	
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	/*public String getFilePath(String path1,String contextpath)
	{	
		String fileName = null;
		if (!file1.isEmpty()) 
		{
	try
	        {       	
		
	fileName = file1.getOriginalFilename();
	byte[] bytes = file1.getBytes();
		String npath=path1+"\\resources\\images\\"+ fileName;
	
					BufferedOutputStream buffStream = 
	new BufferedOutputStream(new FileOutputStream(new java.io.File(npath)));
	buffStream.write(bytes);
	buffStream.close();
	           String dbfilename=contextpath+"/resources/images/"+fileName;
	
	this.setFpath(dbfilename);
	return dbfilename;
	        }
	catch (Exception e) 
	        {
	return"You failed to upload " + fileName + ": " + e.getMessage();
	        }
	    } 
		else
		{
			return"Unable to upload. File is empty.";
		}
	}	
*/
	
	
}
