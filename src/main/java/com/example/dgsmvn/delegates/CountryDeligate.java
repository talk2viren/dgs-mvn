package com.example.dgsmvn.delegates;

import com.netflix.graphql.dgs.client.CustomMonoGraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import com.netflix.graphql.dgs.client.MonoGraphQLClient;
import com.netflix.graphql.dgs.client.WebClientGraphQLClient;

public class CountryDeligate {

    public CustomMonoGraphQLClient createGraphQLClient(String strData){
//        MonoGraphQLClient.createCustomReactive("endpoint",)

//                /Configure a WebClient for your needs, e.g. including authentication headers and TLS.
//        WebClient webClient = WebClient.create("http://localhost:8080/graphql");
//        WebClientGraphQLClient client = MonoGraphQLClient.createWithWebClient(webClient);
////
////        //The GraphQLResponse contains data and errors.
//        Mono<GraphQLResponse> graphQLResponseMono = graphQLClient.reactiveExecuteQuery(query);
////
//        //GraphQLResponse has convenience methods to extract fields using JsonPath.
//        Mono<String> somefield = graphQLResponseMono.map(r -> r.extractValue("somefield"));

        //Don't forget to subscribe! The request won't be executed otherwise.
//        somefield.subscribe();

        return null;
    }
}
