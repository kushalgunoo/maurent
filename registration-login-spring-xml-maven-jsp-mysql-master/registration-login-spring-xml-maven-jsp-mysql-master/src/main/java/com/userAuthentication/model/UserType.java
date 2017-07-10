package com.userAuthentication.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "account/com/hellokoding/account/model", name = "UserType")
@Table(name = "user_type")
public class UserType {
	
	@Id
	@Column(name = "UT_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlElement
	Integer id;
	
	@Column(name = "UT_ROLE", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;

	@OneToMany(mappedBy = "roles", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<User> users;

	
	@Column(name = "CREATED_BY")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer createdBy;
	/**
	 */

	@Column(name = "MODIFIED_BY")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer modifiedBy;
	/**
	 */

	@Column(name = "DATE_CREATED")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer dateCreated;
	/**
	 */

	@Column(name = "DATE_MODIFIED")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer dateModified;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the users
	 */
	public java.util.Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(java.util.Set<User> users) {
		this.users = users;
	}

	/**
	 * @return the createdBy
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the modifiedBy
	 */
	public Integer getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the dateCreated
	 */
	public Integer getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Integer dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the dateModified
	 */
	public Integer getDateModified() {
		return dateModified;
	}

	/**
	 * @param dateModified the dateModified to set
	 */
	public void setDateModified(Integer dateModified) {
		this.dateModified = dateModified;
	}
	

}
