package com.mclin.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class EncodingFilter
 */
public class EncodingFilter implements Filter {

	private String charEncoding = null;
    /**
     * Default constructor. 
     */
    public EncodingFilter() {
    }
    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
    	charEncoding = fConfig.getInitParameter("encoding");//获取过滤器的初始编码
    	if(charEncoding == null){
    		throw new ServletException("======EncodingFilter中的编码设置为空======");
    	}
    }
    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	if(!charEncoding.equals(request.getCharacterEncoding())){
    		request.setCharacterEncoding(charEncoding);
    	}
    	response.setCharacterEncoding(charEncoding);
    	chain.doFilter(request, response);
    }
    

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}


}
