package com.userAuthentication.model;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


@Entity
@Table(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "account/com/hellokoding/account/model", name = "User")
public class User {
	
	@Id
	@Column(name = "USER_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlElement
	Integer id;
	
	@Column(name = "USER_FIRST_NAME", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String username;
    
	@Column(name = "USER_PASSWORD", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String password;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "USER_UT_ID", referencedColumnName = "UT_ID", nullable = false) })
	@XmlTransient
	UserType roles;
    
    @Transient
    private String passwordConfirm;

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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the roles
	 */
	public UserType getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(UserType roles) {
		this.roles = roles;
	}

	/**
	 * @return the passwordConfirm
	 */
	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	/**
	 * @param passwordConfirm the passwordConfirm to set
	 */
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
    


}
