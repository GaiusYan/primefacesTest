/* import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.faces.webapp.FacesServlet;

@Configuration
public class JsfConfig {

    /**
     * Enregistre la servlet JSF pour traiter les requêtes `.xhtml`.
     */
   /*  @Bean
    public ServletRegistrationBean<FacesServlet> facesServletRegistration() {
        ServletRegistrationBean<FacesServlet> registration = 
                new ServletRegistrationBean<>(new FacesServlet(), "*.xhtml");
        registration.setLoadOnStartup(1);
        return registration;
    } */

    /**
     * Configure des paramètres spécifiques pour JSF, si nécessaire.
     * Cela peut inclure des paramètres pour Mojarra, PrimeFaces, etc.
     */
   /*  @Bean
    public javax.servlet.FilterRegistrationBean<?> configureJsfFilter() {
        javax.servlet.FilterRegistrationBean<?> filterRegistrationBean = 
                new javax.servlet.FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new com.sun.faces.config.ConfigureListener());
        return filterRegistrationBean;
    }
}
 */