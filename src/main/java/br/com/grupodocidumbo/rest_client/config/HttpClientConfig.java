package br.com.grupodocidumbo.rest_client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.support.RestClientHttpServiceGroupConfigurer;
import org.springframework.web.service.registry.ImportHttpServices;

import br.com.grupodocidumbo.rest_client.config.interceptor.TokenInterceptor;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
@ImportHttpServices(group = "park",basePackages = "br.com.grupodocidumbo.rest_client.rest")
public class HttpClientConfig {

   private final TokenInterceptor tokenInterceptor;

    @Bean
    public RestClientHttpServiceGroupConfigurer groupConfigurer() {
        return groups ->  {
            groups.filterByName("park")
                    .forEachClient((group, builder) ->
                           builder.baseUrl("https://hgnusnokkqfvasrkualk.supabase.co")
                                 .requestInterceptor(tokenInterceptor)
                    );
        };
    }

}
