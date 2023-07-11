package com.capitole.test;


import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTests {
    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    /**
     * Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
     * 
     * @throws JSONException
     */
    @Test
    public void testRetrievePricesAt2020_06_14_10_00_00() throws JSONException {

        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/capitole/prices/brands/1/products/35455/price?currentDate=2020-06-14 10:00:00"),
                HttpMethod.GET, entity, String.class);
        String expected = "{\"productId\":35455,\"brandId\":1,\"priceList\":1,\"startDate\":\"2020-06-14T00:00:00.000+00:00\",\"endDate\":\"2020-12-31T23:59:59.000+00:00\",\"price\":35.5,\"currency\":\"EUR\"}";

        JSONAssert.assertEquals(expected, response.getBody(), true);
    }
    /**
     *  Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
     * 
     * @throws JSONException
     */
     @Test
    public void testRetrievePricesAt2020_06_14_16_00_00() throws JSONException {

        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/capitole/prices/brands/1/products/35455/price?currentDate=2020-06-14 16:00:00"),
                HttpMethod.GET, entity, String.class);
        String expected = "{\"productId\":35455,\"brandId\":1,\"priceList\":2,\"startDate\":\"2020-06-14T15:00:00.000+00:00\",\"endDate\":\"2020-06-14T18:30:00.000+00:00\",\"price\":25.45,\"currency\":\"EUR\"}";

        JSONAssert.assertEquals(expected, response.getBody(), true);
    }

    /**
     *  Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
     * 
     * @throws JSONException
     */

     @Test
    public void testRetrievePricesAt2020_06_14_21_00_00() throws JSONException {

        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/capitole/prices/brands/1/products/35455/price?currentDate=2020-06-14 21:00:00"),
                HttpMethod.GET, entity, String.class);
        String expected = "{\"productId\":35455,\"brandId\":1,\"priceList\":1,\"startDate\":\"2020-06-14T00:00:00.000+00:00\",\"endDate\":\"2020-12-31T23:59:59.000+00:00\",\"price\":35.5,\"currency\":\"EUR\"}";

        JSONAssert.assertEquals(expected, response.getBody(), true);
    }
    /**
     *  Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
     * 
     * @throws JSONException
     */
     @Test
    public void testRetrievePricesAt2020_06_15_10_00_00() throws JSONException {

        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/capitole/prices/brands/1/products/35455/price?currentDate=2020-06-15 10:00:00"),
                HttpMethod.GET, entity, String.class);
        String expected = "{\"productId\":35455,\"brandId\":1,\"priceList\":3,\"startDate\":\"2020-06-15T00:00:00.000+00:00\",\"endDate\":\"2020-06-15T11:00:00.000+00:00\",\"price\":30.5,\"currency\":\"EUR\"}";

        JSONAssert.assertEquals(expected, response.getBody(), true);
    }
    /**
     *  Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
     * 
     * @throws JSONException
     */
      @Test
    public void testRetrievePricesAt2020_06_16_21_00_00() throws JSONException {

        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/capitole/prices/brands/1/products/35455/price?currentDate=2020-06-16 21:00:00"),
                HttpMethod.GET, entity, String.class);
        String expected = "{\"productId\":35455,\"brandId\":1,\"priceList\":4,\"startDate\":\"2020-06-15T16:00:00.000+00:00\",\"endDate\":\"2020-12-31T23:59:59.000+00:00\",\"price\":38.95,\"currency\":\"EUR\"}";

        JSONAssert.assertEquals(expected, response.getBody(), true);
    }


    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}