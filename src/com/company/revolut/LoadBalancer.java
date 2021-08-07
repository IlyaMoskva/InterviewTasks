/*
     Revolut tech interview.
     @Author Ilya Moskvitin
     @Copyright 2021
 */
package com.company.revolut;

import com.company.revolut.exceptions.URLAlreadyStoredException;
import com.company.revolut.exceptions.NullURLException;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/*
Register instances
Register a provider instances in the Load Balancer – the max number of accepted providers is 10.
Each provider should have a unique address.
 */
public class LoadBalancer {
    private Set<URL> store = new HashSet<>();

    public boolean registerURL(URL url) throws URLAlreadyStoredException, NullURLException {
        if (url == null)
            throw new NullURLException("URL is null.");
        if (store.contains(url))
            throw new URLAlreadyStoredException("URL is already exist in registry.");
        if (store.size() < 10) {
            store.add(url);
            return true;
        }
        return false;
    }


}
