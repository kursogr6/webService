/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javakurs.personelbilgi.facade;

import com.javakurs.personelbilgi.entity.Giris;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author CAN
 */
@Stateless
public class GirisFacade extends AbstractFacade<Giris> {
    @PersistenceContext(unitName = "personelbilgiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GirisFacade() {
        super(Giris.class);
    }
    
    public  boolean girisKontrol(String p_ad , String p_sifre){
        
       Giris g  = em.createNamedQuery("Giris.girisKontrol", Giris.class).
                setParameter("ad", p_ad).setParameter("sifre", p_sifre).getSingleResult();
       if(g != null)
       {
           return true;
       }else{
       return false;
       }
    }
}
