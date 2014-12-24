/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javakurs.personelbilgi.service;

import com.javakurs.personelbilgi.facade.GirisFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author CAN
 */
@Stateless
public class girisService {
    
    @EJB
     private GirisFacade girisFacade;
    
    public boolean girisKontrol(String p_ad, String p_siftre){
    return girisFacade.girisKontrol(p_ad, p_siftre);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
