/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.MerchantResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantsApi
 */
@Ignore
public class MerchantsApiTest {

    private final MerchantsApi api = new MerchantsApi();

    
    /**
     * Read merchant
     *
     * Returns information about a particular merchant, such as a logo, name, and website.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readMerchantTest() throws ApiException {
        String merchantGuid = null;
        MerchantResponseBody response = api.readMerchant(merchantGuid);

        // TODO: test validations
    }
    
}
