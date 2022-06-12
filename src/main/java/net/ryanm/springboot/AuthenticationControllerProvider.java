package net.ryanm.springboot;

import javax.servlet.http.HttpServlet;

import com.auth0.AuthenticationController;
import com.auth0.jwk.JwkProvider;
import com.auth0.jwk.JwkProviderBuilder;

public class AuthenticationControllerProvider extends HttpServlet {
String domain = getServletConfig().getServletContext().getInitParameter("com.auth0.domain");
String clientId = getServletConfig().getServletContext().getInitParameter("com.auth0.clientId");
String clientSecret = getServletConfig().getServletContext().getInitParameter("com.auth0.clientSecret");

JwkProvider jwkProvider = new JwkProviderBuilder(domain).build();
AuthenticationController controller = AuthenticationController.newBuilder(domain, clientId, clientSecret)
                .withJwkProvider(jwkProvider)
                .build();
}
