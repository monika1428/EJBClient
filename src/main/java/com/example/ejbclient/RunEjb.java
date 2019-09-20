package com.example.ejbclient;

import com.example.remote.services.TimeBean;

import javax.ejb.EJB;

public class RunEjb {

    @EJB(lookup = "ejb:EJBClient/")
    private TimeBean timeBean;
    public void business(){

        System.out.println(timeBean.getTimeZone());
    }
}
