package co.develhope.Interceptor.configuration;

import co.develhope.Interceptor.interceptors.APILoggingInterceptor;
import co.develhope.Interceptor.interceptors.ErrorMaskInterceptor;
import co.develhope.Interceptor.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;

    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Autowired
    private ErrorMaskInterceptor errorMaskInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyInterceptor).addPathPatterns("/legacy/**");
        registry.addInterceptor(errorMaskInterceptor);
    }
}