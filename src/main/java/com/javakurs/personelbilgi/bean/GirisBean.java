 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javakurs.personelbilgi.bean;

import com.javakurs.personelbilgi.entity.Giris;
import com.javakurs.personelbilgi.service.girisService;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author CAN
 */
@ManagedBean(name = "girisBean")
@SessionScoped
public class GirisBean implements Serializable {

    @EJB
    private girisService girisService;

//   private  Giris giris ;
    private String ad;
    private String sifre;

    public GirisBean() {
    }

    public String girisKontrol() {
        boolean sonuc = girisService.girisKontrol(ad, sifre);
        if (sonuc) {
            return "kayit.jsf";
        } else {
            return "giris.jsf";
        }
    }

//    public String giris(){
//        giris= new Giris();
//        girisService.girisKontrol(giris.getAd(), giris.getSifre());
//        return "kayit.xhtml";
//    }
//
//    public Giris getGiris() {
//        return giris;
//    }
//
//    public void setGiris(Giris giris) {
//        this.giris = giris;
//    }
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

}
