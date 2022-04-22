package vn.tiki.openapi.javaoauth2client.service;

import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.OAuth2RefreshToken;

public interface OAuthTokenService {
    void storeTokens(String userId, String provider, OAuth2AccessToken accessToken, OAuth2RefreshToken refreshToken);

    String getAccessToken();

    String getRefreshToken();
}
