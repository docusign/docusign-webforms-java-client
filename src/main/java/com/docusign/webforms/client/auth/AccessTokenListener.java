package com.docusign.webforms.client.auth;

import com.docusign.webforms.client.auth.OAuth.OAuthToken;

public interface AccessTokenListener {
  void notify(OAuthToken token);
}