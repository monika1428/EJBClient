package com.example.ejbclient;

import com.example.remote.services.TimeBean;
import com.example.remote.services.TimeBeanImpl;

import javax.naming.InitialContext;
import java.util.Properties;

public class EJBClientApplication {


    public static void main(String[] args) {
        RunEjb customer=new RunEjb();
        customer.business();
    }


}
