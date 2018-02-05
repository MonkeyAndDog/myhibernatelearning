package com.mrhu.hibernate.model;

import javax.persistence.Entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="_Project")
public class Project {
	private int Id;
	private String proName;
	private String description;
	private String wifeName;
	private Date dateTime;
	
	/**
	 * @return dateTime
	 */
	@Temporal(TemporalType.TIME)
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime 要设置的 dateTime
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @param id
	 * @param proName
	 * @param description 
	 */
	public Project(int id, String proName, String description) {
		Id = id;
		this.proName = proName;
		this.description = description;
	}
	
//	@Transient
	public String getWifeName() {
		return wifeName;
	}
	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}
	
	/**
	 * @return id
	 */
	@Id
	public int getId() {
		return Id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(int id) {
		Id = id;
	}
	/**
	 * @return proName
	 */
	@Column(name="pppppproname")
	public String getProName() {
		return proName;
	}
	/**
	 * @param proName 要设置的 proName
	 */
	public void setProName(String proName) {
		this.proName = proName;
	}
	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description 要设置的 description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
	

}
