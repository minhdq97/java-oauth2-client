package vn.tiki.openapi.javaoauth2client.service;

import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.OAuth2RefreshToken;
import org.springframework.stereotype.Service;

@Service
public class OAuthTokenServiceImpl implements OAuthTokenService {
    @Override
    public void storeTokens(String userId, String provider, OAuth2AccessToken accessToken, OAuth2RefreshToken refreshToken) {

    }

    @Override
    public String getAccessToken() {
        return "6_SKsbDyZBCSS4p-MvfjEG1HiZfwfrqleedkay-kWcs.YK1Qw3S0YZfwkvtIG1gEJj1SoXbMQ0QBCi-xxxxx";
    }

    @Override
    public String getRefreshToken() {
        return null;
    }
}
