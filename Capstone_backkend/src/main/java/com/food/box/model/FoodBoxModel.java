package com.food.box.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FoodBoxModel {
	
	@Id
	@GeneratedValue
	private int id;
	private String foodName;
	private String description;
	private int qty;
	private int price;
	
	@Lob
	@Column(columnDefinition = "CLOB" )
	private String avatar;

}
