package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the abstract_donor database table.
 *
 */
@Entity
@Table(name = "abstract_donor")
@NamedQuery(name = "AbstractDonor.findAll", query = "SELECT a FROM AbstractDonor a")
public class AbstractDonor implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @Column(name = "date_created")
    private Timestamp dateCreated;

    @Column(name = "date_modified")
    private Timestamp dateModified;

    @Column(name = "default_image")
    private BigDecimal defaultImage;

    @Column(name = "display_name")
    private BigDecimal displayName;

    private String guid;

    @Column(name = "is_company")
    private BigDecimal isCompany;

    private String name;

    @Column(name = "name_fr")
    private String nameFr;

    private String url;

    public AbstractDonor() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }

    public BigDecimal getDefaultImage() {
        return defaultImage;
    }

    public void setDefaultImage(BigDecimal defaultImage) {
        this.defaultImage = defaultImage;
    }

    public BigDecimal getDisplayName() {
        return displayName;
    }

    public void setDisplayName(BigDecimal displayName) {
        this.displayName = displayName;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public BigDecimal getIsCompany() {
        return isCompany;
    }

    public void setIsCompany(BigDecimal isCompany) {
        this.isCompany = isCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}