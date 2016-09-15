
package eu.europa.esig.dss.jaxb.diagnostic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Certificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Certificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectDistinguishedName" type="{http://dss.esig.europa.eu/validation/diagnostic}DistinguishedName" maxOccurs="unbounded"/>
 *         &lt;element name="IssuerDistinguishedName" type="{http://dss.esig.europa.eu/validation/diagnostic}DistinguishedName" maxOccurs="unbounded"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CommonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationalUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pseudonym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DigestAlgoAndValues" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NotAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PublicKeySize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PublicKeyEncryptionAlgo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KeyUsageBits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KeyUsageBit" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IdKpOCSPSigning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IdPkixOcspNoCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BasicSignature" type="{http://dss.esig.europa.eu/validation/diagnostic}BasicSignature"/>
 *         &lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}SigningCertificate" minOccurs="0"/>
 *         &lt;element name="CertificateChain" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateChain" minOccurs="0"/>
 *         &lt;element name="Trusted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SelfSigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CertificatePolicyIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="oid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="QCStatementIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="oid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TrustedServiceProvider" type="{http://dss.esig.europa.eu/validation/diagnostic}TrustedServiceProvider" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Revocation" type="{http://dss.esig.europa.eu/validation/diagnostic}Revocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Info" type="{http://dss.esig.europa.eu/validation/diagnostic}InfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Certificate", propOrder = {
    "subjectDistinguishedName",
    "issuerDistinguishedName",
    "serialNumber",
    "commonName",
    "countryName",
    "organizationName",
    "givenName",
    "organizationalUnit",
    "surname",
    "pseudonym",
    "digestAlgoAndValues",
    "notAfter",
    "notBefore",
    "publicKeySize",
    "publicKeyEncryptionAlgo",
    "keyUsageBits",
    "idKpOCSPSigning",
    "idPkixOcspNoCheck",
    "basicSignature",
    "signingCertificate",
    "certificateChain",
    "trusted",
    "selfSigned",
    "certificatePolicyIds",
    "qcStatementIds",
    "trustedServiceProvider",
    "revocation",
    "info"
})
public class XmlCertificate {

    @XmlElement(name = "SubjectDistinguishedName", required = true)
    protected List<XmlDistinguishedName> subjectDistinguishedName;
    @XmlElement(name = "IssuerDistinguishedName", required = true)
    protected List<XmlDistinguishedName> issuerDistinguishedName;
    @XmlElement(name = "SerialNumber", required = true)
    protected BigInteger serialNumber;
    @XmlElement(name = "CommonName")
    protected String commonName;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "OrganizationalUnit")
    protected String organizationalUnit;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "Pseudonym")
    protected String pseudonym;
    @XmlElement(name = "DigestAlgoAndValues")
    protected List<XmlDigestAlgoAndValue> digestAlgoAndValues;
    @XmlElement(name = "NotAfter", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date notAfter;
    @XmlElement(name = "NotBefore", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date notBefore;
    @XmlElement(name = "PublicKeySize")
    protected int publicKeySize;
    @XmlElement(name = "PublicKeyEncryptionAlgo", required = true)
    protected String publicKeyEncryptionAlgo;
    @XmlElementWrapper(name = "KeyUsageBits")
    @XmlElement(name = "KeyUsageBit", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> keyUsageBits;
    @XmlElement(name = "IdKpOCSPSigning")
    protected Boolean idKpOCSPSigning;
    @XmlElement(name = "IdPkixOcspNoCheck")
    protected Boolean idPkixOcspNoCheck;
    @XmlElement(name = "BasicSignature", required = true)
    protected XmlBasicSignature basicSignature;
    @XmlElement(name = "SigningCertificate")
    protected XmlSigningCertificate signingCertificate;
    @XmlElementWrapper(name = "CertificateChain")
    @XmlElement(name = "ChainItem", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlChainItem> certificateChain;
    @XmlElement(name = "Trusted")
    protected boolean trusted;
    @XmlElement(name = "SelfSigned")
    protected boolean selfSigned;
    @XmlElementWrapper(name = "CertificatePolicyIds")
    @XmlElement(name = "oid", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> certificatePolicyIds;
    @XmlElementWrapper(name = "QCStatementIds")
    @XmlElement(name = "oid", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> qcStatementIds;
    @XmlElement(name = "TrustedServiceProvider")
    protected List<XmlTrustedServiceProvider> trustedServiceProvider;
    @XmlElement(name = "Revocation")
    protected List<XmlRevocation> revocation;
    @XmlElementWrapper(name = "Info")
    @XmlElement(name = "Message", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlMessage> info;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the subjectDistinguishedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectDistinguishedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectDistinguishedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlDistinguishedName }
     * 
     * 
     */
    public List<XmlDistinguishedName> getSubjectDistinguishedName() {
        if (subjectDistinguishedName == null) {
            subjectDistinguishedName = new ArrayList<XmlDistinguishedName>();
        }
        return this.subjectDistinguishedName;
    }

    /**
     * Gets the value of the issuerDistinguishedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuerDistinguishedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuerDistinguishedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlDistinguishedName }
     * 
     * 
     */
    public List<XmlDistinguishedName> getIssuerDistinguishedName() {
        if (issuerDistinguishedName == null) {
            issuerDistinguishedName = new ArrayList<XmlDistinguishedName>();
        }
        return this.issuerDistinguishedName;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSerialNumber(BigInteger value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonName(String value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the organizationalUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    /**
     * Sets the value of the organizationalUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationalUnit(String value) {
        this.organizationalUnit = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the pseudonym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudonym() {
        return pseudonym;
    }

    /**
     * Sets the value of the pseudonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudonym(String value) {
        this.pseudonym = value;
    }

    /**
     * Gets the value of the digestAlgoAndValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digestAlgoAndValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigestAlgoAndValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlDigestAlgoAndValue }
     * 
     * 
     */
    public List<XmlDigestAlgoAndValue> getDigestAlgoAndValues() {
        if (digestAlgoAndValues == null) {
            digestAlgoAndValues = new ArrayList<XmlDigestAlgoAndValue>();
        }
        return this.digestAlgoAndValues;
    }

    /**
     * Gets the value of the notAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getNotAfter() {
        return notAfter;
    }

    /**
     * Sets the value of the notAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAfter(Date value) {
        this.notAfter = value;
    }

    /**
     * Gets the value of the notBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getNotBefore() {
        return notBefore;
    }

    /**
     * Sets the value of the notBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotBefore(Date value) {
        this.notBefore = value;
    }

    /**
     * Gets the value of the publicKeySize property.
     * 
     */
    public int getPublicKeySize() {
        return publicKeySize;
    }

    /**
     * Sets the value of the publicKeySize property.
     * 
     */
    public void setPublicKeySize(int value) {
        this.publicKeySize = value;
    }

    /**
     * Gets the value of the publicKeyEncryptionAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicKeyEncryptionAlgo() {
        return publicKeyEncryptionAlgo;
    }

    /**
     * Sets the value of the publicKeyEncryptionAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicKeyEncryptionAlgo(String value) {
        this.publicKeyEncryptionAlgo = value;
    }

    /**
     * Gets the value of the idKpOCSPSigning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdKpOCSPSigning() {
        return idKpOCSPSigning;
    }

    /**
     * Sets the value of the idKpOCSPSigning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdKpOCSPSigning(Boolean value) {
        this.idKpOCSPSigning = value;
    }

    /**
     * Gets the value of the idPkixOcspNoCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdPkixOcspNoCheck() {
        return idPkixOcspNoCheck;
    }

    /**
     * Sets the value of the idPkixOcspNoCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdPkixOcspNoCheck(Boolean value) {
        this.idPkixOcspNoCheck = value;
    }

    /**
     * Gets the value of the basicSignature property.
     * 
     * @return
     *     possible object is
     *     {@link XmlBasicSignature }
     *     
     */
    public XmlBasicSignature getBasicSignature() {
        return basicSignature;
    }

    /**
     * Sets the value of the basicSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlBasicSignature }
     *     
     */
    public void setBasicSignature(XmlBasicSignature value) {
        this.basicSignature = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSigningCertificate }
     *     
     */
    public XmlSigningCertificate getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSigningCertificate }
     *     
     */
    public void setSigningCertificate(XmlSigningCertificate value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the trusted property.
     * 
     */
    public boolean isTrusted() {
        return trusted;
    }

    /**
     * Sets the value of the trusted property.
     * 
     */
    public void setTrusted(boolean value) {
        this.trusted = value;
    }

    /**
     * Gets the value of the selfSigned property.
     * 
     */
    public boolean isSelfSigned() {
        return selfSigned;
    }

    /**
     * Sets the value of the selfSigned property.
     * 
     */
    public void setSelfSigned(boolean value) {
        this.selfSigned = value;
    }

    /**
     * Gets the value of the trustedServiceProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustedServiceProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrustedServiceProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlTrustedServiceProvider }
     * 
     * 
     */
    public List<XmlTrustedServiceProvider> getTrustedServiceProvider() {
        if (trustedServiceProvider == null) {
            trustedServiceProvider = new ArrayList<XmlTrustedServiceProvider>();
        }
        return this.trustedServiceProvider;
    }

    /**
     * Gets the value of the revocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlRevocation }
     * 
     * 
     */
    public List<XmlRevocation> getRevocation() {
        if (revocation == null) {
            revocation = new ArrayList<XmlRevocation>();
        }
        return this.revocation;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public List<String> getKeyUsageBits() {
        if (keyUsageBits == null) {
            keyUsageBits = new ArrayList<String>();
        }
        return keyUsageBits;
    }

    public void setKeyUsageBits(List<String> keyUsageBits) {
        this.keyUsageBits = keyUsageBits;
    }

    public List<XmlChainItem> getCertificateChain() {
        if (certificateChain == null) {
            certificateChain = new ArrayList<XmlChainItem>();
        }
        return certificateChain;
    }

    public void setCertificateChain(List<XmlChainItem> certificateChain) {
        this.certificateChain = certificateChain;
    }

    public List<String> getCertificatePolicyIds() {
        if (certificatePolicyIds == null) {
            certificatePolicyIds = new ArrayList<String>();
        }
        return certificatePolicyIds;
    }

    public void setCertificatePolicyIds(List<String> certificatePolicyIds) {
        this.certificatePolicyIds = certificatePolicyIds;
    }

    public List<String> getQCStatementIds() {
        if (qcStatementIds == null) {
            qcStatementIds = new ArrayList<String>();
        }
        return qcStatementIds;
    }

    public void setQCStatementIds(List<String> qcStatementIds) {
        this.qcStatementIds = qcStatementIds;
    }

    public List<XmlMessage> getInfo() {
        if (info == null) {
            info = new ArrayList<XmlMessage>();
        }
        return info;
    }

    public void setInfo(List<XmlMessage> info) {
        this.info = info;
    }

}
