package com.zendesk.app;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.apache.log4j.Logger;


/**
 * This is a generic REST Client based on Apache HTTP client.
 *
 * @author vyuen
 */
public class RestClient  {
	final static Logger logger = Logger.getLogger(RestClient.class);
  
    // This type of httpClient is needed to support multithreading tests.
    private CloseableHttpClient httpClient;
    private String token;

    /**
     * Constructor
     * @param token  the api token which needs use to authenticate.
     * @throws Exception 
     */
    public RestClient(String token) throws Exception {
    	this.token = token;
    	 
    	// A pooling connection manager is needed to support multithreading tests.        
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        // Set max total connection to 200 to support tests with 200 threads possible, please don't change without checking.
        cm.setMaxTotal(200);
        // Set default max connection per route to 30, please don't change it without checking.
        cm.setDefaultMaxPerRoute(30);
        
        // set up the basic authentication header
        String encodedtoken = Base64.getEncoder().encodeToString(this.token.getBytes());
        Header authorizationHeader = new BasicHeader("Authorization", "Basic " + encodedtoken);
  
        Header contentTypeHeader = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
             
        // set up the header
        List<Header> headers = new ArrayList<Header>();
        headers.add(authorizationHeader);
        headers.add(contentTypeHeader);
        
        httpClient = HttpClients.custom()
                .setConnectionManager(cm)
                .setDefaultHeaders(headers)
                .build();
    }


    /**
     * Close the httpclient
     */
	public void destroy()  {
    	if (httpClient != null)
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
    
    /**
     * Get the http response based on a post request.
     * @param endpoint the String URI of the web service.
     * @param postEntity a post request in String format.
     * @return HttpResponse
     * @throws Exception 
     */
    public HttpResponse getHttpPostResponseWithToken(String endpoint, String postEntity) throws Exception {
        HttpResponse response = null;

        try {        
        	URI url = new URI(endpoint);
            HttpPost httpPost = new HttpPost(url);
            StringEntity se = new StringEntity(postEntity);
            se.setContentType(ContentType.APPLICATION_JSON.toString());
            httpPost.setEntity(se);    
            response = httpClient.execute(httpPost);
        } catch (Exception e) {            
            throw new Exception("There is an exception " + e.getMessage());
        }

        return response;        
    }
    
    /**
     * Get the http response based on a get request.
     *
     * @param endpoint the String URI of the web service.
     * @return HttpResponse
     * @throws Exception 
     */
    public HttpResponse getHttpGetResponse(String endpoint) throws Exception {
        HttpResponse response = null;       

        try {              
        	URI url = new URI(endpoint);
            HttpGet httpGet = new HttpGet(url);
            response = httpClient.execute(httpGet);
        } catch (Exception e) {            
            throw new Exception("There is an exception " + e.getMessage());
        }

        return response;        
    }

    
    /**
     * Get the http response based on a delete request.
     *
     * @param endpoint the String URI of the web service.
     * @return HttpResponse
     * @throws Exception 
     */
    public HttpResponse getHttpDeleteResponse(String endpoint) throws Exception {
        HttpResponse response = null;       

        try {              
        	URI url = new URI(endpoint);
            HttpDelete httpDelete = new HttpDelete(url);
            response = httpClient.execute(httpDelete);
        } catch (Exception e) {            
            throw new Exception("There is an exception " + e.getMessage());
        }

        return response;        
    }
}

