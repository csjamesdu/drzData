package com.mvcconsulting.datatransfer.core.services.impl;

import com.mvcconsulting.datatransfer.core.models.Token;
import com.mvcconsulting.datatransfer.core.services.MonoRestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class MonoRestServiceImpl implements MonoRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MonoRestServiceImpl.class);

    @Override
    public void getProduct(){
        WebClient client = WebClient.builder()
                .baseUrl("https://api.dropshipzone.com.au")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = client.method(HttpMethod.GET);

        WebClient.RequestBodySpec bodySpec = uriSpec.uri("/auth");


        WebClient.RequestHeadersSpec<?> headersSpec = bodySpec.body(
                BodyInserters.fromFormData("email","csjamesdu@gmail.com")
                        .with("password", "he1dtwYGI_JN"));

        Mono<Token> token = headersSpec.retrieve().bodyToMono(Token.class);


//        Mono<String> myMono = headersSpec.exchangeToMono(response -> {
//            if (response.statusCode()
//                    .equals(HttpStatus.OK)) {
//                return response.bodyToMono(String.class);
//            } else if (response.statusCode()
//                    .is4xxClientError()) {
//                return Mono.just("Error response");
//            } else {
//                return response.createException()
//                        .flatMap(Mono::error);
//            }
//        });

        token.subscribe(
                value->LOGGER.info(value.toString()),
                error->LOGGER.info(error.toString())
        );
    }
}
