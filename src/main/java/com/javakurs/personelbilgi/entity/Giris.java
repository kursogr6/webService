/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javakurs.personelbilgi.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CAN
 */
@Entity
@Table(catalog = "personelbilgi", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Giris.girisKontrol", query = "SELECT g FROM Giris g WHERE g.ad = :ad and g.sifre = :sifre"),
    @NamedQuery(name = "Giris.findAll", query = "SELECT g FROM Giris g"),
    @NamedQuery(name = "Giris.findById", query = "SELECT g FROM Giris g WHERE g.id = :id"),
    @NamedQuery(name = "Giris.findByAd", query = "SELECT g FROM Giris g WHERE g.ad = :ad"),
    @NamedQuery(name = "Giris.findBySifre", query = "SELECT g FROM Giris g WHERE g.sifre = :sifre")})
public class Giris implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String ad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String sifre;

    public Giris() {
    }


    public Giris(String ad, String sifre) {
        this.ad = ad;
        this.sifre = sifre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Giris)) {
            return false;
        }
        Giris other = (Giris) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + id ;
    }
    
}
