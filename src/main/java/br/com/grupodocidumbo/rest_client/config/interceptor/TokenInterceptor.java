package br.com.grupodocidumbo.rest_client.config.interceptor;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import br.com.grupodocidumbo.rest_client.model.common.JwtToken;

@Component
public class TokenInterceptor implements ClientHttpRequestInterceptor{

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException{
          request.getHeaders().add("Authorization","Bearer "+JwtToken.token);
          return execution.execute(request, body);

}
}