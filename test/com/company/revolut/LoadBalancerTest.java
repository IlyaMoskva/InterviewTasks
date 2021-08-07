package com.company.revolut;

import com.company.revolut.exceptions.NullURLException;
import com.company.revolut.exceptions.URLAlreadyStoredException;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class LoadBalancerTest {

    @Test
    void registerURL() throws MalformedURLException, URLAlreadyStoredException, NullURLException {
        URL url = new URL("http://mycompany.com:8080");
        assertTrue(new LoadBalancer().registerURL(url));
    }

    @Test
    void overTenUrls() throws MalformedURLException, URLAlreadyStoredException, NullURLException {
        LoadBalancer lb = new LoadBalancer();
        for (int i=0; i< 10; i++) {
            URL url = new URL("http://mycompany.com:" + i);
            assertTrue(lb.registerURL(url));
        }
        assertFalse(lb.registerURL(new URL("http://too.much")));
    }

    @Test()
    void throwDuplicateException() throws MalformedURLException, URLAlreadyStoredException, NullURLException {
        LoadBalancer lb = new LoadBalancer();
        URL url = new URL("http://mycompany.com:8080");
        assertTrue(lb.registerURL(url));
        assertThrows(URLAlreadyStoredException.class, (() -> lb.registerURL(url)));
    }

    @Test
    void throwNullUrlException() {
        assertThrows(NullURLException.class, (() -> new LoadBalancer().registerURL(null)));

    }


}