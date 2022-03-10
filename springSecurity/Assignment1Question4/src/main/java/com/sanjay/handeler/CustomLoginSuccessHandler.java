package com.sanjay.handeler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.sanjay.user.ShopmeUserDetails;
import com.sanjay.user.User;
import com.sanjay.userservice.UserServices;
 
@Component
public class CustomLoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
 
    @Autowired
    private UserServices userService;
     
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {
        ShopmeUserDetails userDetails =  (ShopmeUserDetails) authentication.getPrincipal();
        User user = userDetails.getUser();
        if (user.getFailedAttempt() > 0) {
            userService.resetFailedAttempts(user.getEmail());
        }
         
        super.onAuthenticationSuccess(request, response, authentication);
    }
     
}