package com.cvs.specialty.lookup.cgrefcodes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the CG_REF_CODES database table.
 * 
 */
@Entity
@Table(name = "CG_REF_CODES")
public class CgRefCodeEO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "CG_REF_CODES_ID_GENERATOR", sequenceName = "CG_REF_CODES_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CG_REF_CODES_ID_GENERATOR")
	private long id;

	@Column(name = "ACTIVE_INDICATOR")
	private String activeIndicator;

	@Column(name = "CREATE_BY")
	private String createBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_DATE")
	private Date createDate;

	@Column(name = "PHARMACY_INDICATOR")
	private String pharmacyIndicator;

	@Column(name = "RV_ABBREVIATION")
	private String rvAbbreviation;

	@Column(name = "RV_DOMAIN")
	private String rvDomain;

	@Column(name = "RV_HIGH_VALUE")
	private String rvHighValue;

	@Column(name = "RV_LOW_VALUE")
	private String rvLowValue;

	@Column(name = "RV_MEANING")
	private String rvMeaning;

	@Column(name = "TEXT_1")
	private String text1;

	@Column(name = "TEXT_2")
	private String text2;

	@Column(name = "TEXT_3")
	private String text3;

	@Column(name = "TEXT_4")
	private String text4;

	@Column(name = "UPDATE_BY")
	private String updateBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_DATE")
	private Date updateDate;


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getActiveIndicator() {
		return activeIndicator;
	}



	public void setActiveIndicator(String activeIndicator) {
		this.activeIndicator = activeIndicator;
	}



	public String getCreateBy() {
		return createBy;
	}



	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}



	public Date getCreateDate() {
		return createDate;
	}



	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	public String getPharmacyIndicator() {
		return pharmacyIndicator;
	}



	public void setPharmacyIndicator(String pharmacyIndicator) {
		this.pharmacyIndicator = pharmacyIndicator;
	}



	public String getRvAbbreviation() {
		return rvAbbreviation;
	}



	public void setRvAbbreviation(String rvAbbreviation) {
		this.rvAbbreviation = rvAbbreviation;
	}



	public String getRvDomain() {
		return rvDomain;
	}



	public void setRvDomain(String rvDomain) {
		this.rvDomain = rvDomain;
	}



	public String getRvHighValue() {
		return rvHighValue;
	}



	public void setRvHighValue(String rvHighValue) {
		this.rvHighValue = rvHighValue;
	}



	public String getRvLowValue() {
		return rvLowValue;
	}



	public void setRvLowValue(String rvLowValue) {
		this.rvLowValue = rvLowValue;
	}



	public String getRvMeaning() {
		return rvMeaning;
	}



	public void setRvMeaning(String rvMeaning) {
		this.rvMeaning = rvMeaning;
	}



	public String getText1() {
		return text1;
	}



	public void setText1(String text1) {
		this.text1 = text1;
	}



	public String getText2() {
		return text2;
	}



	public void setText2(String text2) {
		this.text2 = text2;
	}



	public String getText3() {
		return text3;
	}



	public void setText3(String text3) {
		this.text3 = text3;
	}



	public String getText4() {
		return text4;
	}



	public void setText4(String text4) {
		this.text4 = text4;
	}



	public String getUpdateBy() {
		return updateBy;
	}



	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}



	public Date getUpdateDate() {
		return updateDate;
	}



	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	
	
	
}