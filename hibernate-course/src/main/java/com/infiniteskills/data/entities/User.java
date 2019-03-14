package com.infiniteskills.data.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "FINANCES_USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "BIRTH_DATE")
	private Date birthDate;

	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name = "LAST_UPDATE_DATE")
	private Date lastUpdatedDate;

	@Column(name = "LAST_UPDATE_BY")
	private String lastUpdatedBy;

	@Column(name = "CREATED_DATE", updatable=false)
	private Date createdDate;

	@Column(name = "CREATED_BY", updatable=false)
	private String createdBy;
	
	@Transient
	private boolean valid;
	
	@Column(name="SQL_DATETIME_COLUMN")
	private java.sql.Timestamp sqlDateColumn;
	
    @Column(name="SQL_TIMESTAMP_COLUMN")
	private java.sql.Timestamp sqlTimestampColumn;
    
    @Column(name="SQL_DATETIME_COLUMN")
    private java.sql.Date sqlDateTimeColumn;
    
    @Column(name="SQL_TIME_COLUMN")
    private java.sql.Time sqlTimeColumn;
    

	public java.sql.Date getSqlDateTimeColumn() {
		return sqlDateTimeColumn;
	}

	public void setSqlDateTimeColumn(java.sql.Date sqlDateTimeColumn) {
		this.sqlDateTimeColumn = sqlDateTimeColumn;
	}

	public java.sql.Time getSqlTimeColumn() {
		return sqlTimeColumn;
	}

	public void setSqlTimeColumn(java.sql.Time sqlTimeColumn) {
		this.sqlTimeColumn = sqlTimeColumn;
	}

	public java.sql.Timestamp getSqlDateColumn() {
		return sqlDateColumn;
	}

	public void setSqlDateColumn(java.sql.Timestamp sqlDateColumn) {
		this.sqlDateColumn = sqlDateColumn;
	}

	public java.sql.Timestamp getSqlTimestampColumn() {
		return sqlTimestampColumn;
	}

	public void setSqlTimestampColumn(java.sql.Timestamp sqlTimestampColumn) {
		this.sqlTimestampColumn = sqlTimestampColumn;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
