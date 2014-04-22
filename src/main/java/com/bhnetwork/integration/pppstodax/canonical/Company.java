package com.bhnetwork.integration.pppstodax.canonical;

import java.util.Date;

public class Company {
	// spec 3.1 company tab, DAX column
	private String code;
	private String dataAreaId;
	private String name;
	private String country;
	private Integer contractComplete;
	private Date contractExpDate;
	private Integer bhnSetupComplete;
	private String corporateName;
	private String bhnGUID;
	private String LegalEntityCode;
	private Date modifiedDateTime;
	private String modifiedBy;
	private Date createdDateTime;
	private String createdBy;
	private Integer recVersion;
	private String RecId;
	// spec 3.1 company tab, 3PS column
	private String companyPrimaryContactFirstName;
	private String companyPrimaryContactLastName;
	private String companyPrimaryContactBusinessTitle;
	private String companyPrimaryPhoneNumber;
	private String companyPrimaryPhoneNumberExt;
	private String companyPrimaryContactEmail;
	private String companyAddressLine1;
	private String companyAddressLine2;
	private String companyCity;
	private String companyState;
	private String companyZipPostalCode;
	private String companyWebSiteURL;
	private String companyMerchantCategoryCode;
	private String companyContractTerm;
	private String legalEntityStateOfIncorporation;
}
