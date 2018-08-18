package com.mrjoke.example.scservicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * project：sc-demo
 * class：MyFilter
 * description：
 * <p>
 *
 * @author joker
 * @version 1.0
 * @since 2018/8/17 16:08
 */
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(String.format("%s >>>>> %s",request.getMethod(),request.getRequestURL().toString()));
        String token = request.getParameter("token");
        if(StringUtils.isEmpty(token)){
            HttpServletResponse response = ctx.getResponse();
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try (ServletOutputStream outputStream = response.getOutputStream()){
                outputStream.write("token is not exists".getBytes());
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
