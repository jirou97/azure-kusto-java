// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

package com.microsoft.azure.kusto.data.auth;

import java.net.URISyntaxException;

import org.jetbrains.annotations.NotNull;
import reactor.core.publisher.Mono;

public class AccessTokenTokenProvider extends TokenProviderBase {
    public static final String ACCESS_TOKEN_TOKEN_PROVIDER = "AccessTokenTokenProvider";
    private final String accessToken;

    AccessTokenTokenProvider(@NotNull String clusterUrl, @NotNull String accessToken) throws URISyntaxException {
        super(clusterUrl, null);
        this.accessToken = accessToken;
    }

    @Override
    protected Mono<String> acquireAccessTokenImpl() {
        return Mono.just(accessToken);
    }

    @Override
    protected String getAuthMethod() {
        return ACCESS_TOKEN_TOKEN_PROVIDER;
    }
}
