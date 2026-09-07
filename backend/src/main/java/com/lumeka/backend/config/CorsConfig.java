package com.lumeka.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * CORS Configuration
 * Purpose: Allow frontend applications to access the API.
 * WHY: The SvelteKit frontend runs on a different origin (localhost:5173 dev,
 *      app.lumeka.co.za prod). Without CORS, browsers block all API requests.
 * TODO: Configure allowed origins (frontend URLs)
 * TODO: Configure allowed HTTP methods (GET, POST, PUT, DELETE, PATCH, OPTIONS)
 * TODO: Configure allowed headers (Authorization, Content-Type, Accept)
 * TODO: Configure credentials support (set to true if using cookies)
 * TODO: Set max age for preflight requests (cache preflight responses)
 * TODO: Use environment variables for origins in production
 * TDD: Write CorsConfigTest first
 *       - shouldReturnCorsHeaders_WhenRequestFromAllowedOrigin()
 *       - shouldReturn403_WhenRequestFromDisallowedOrigin()
 *       - shouldReturnCorsHeaders_ForPreflightRequest()
 *
 * @author Lumeka Team
 * @version 1.0
 * @since 2026
 */
@Configuration
public class CorsConfig {

    /**
     * Option 1: CorsFilter Bean
     * Provides explicit, fine-grained CORS configuration.
     * Recommended for most Spring Boot applications.
     * TODO: Create CorsFilter bean
     * TODO: Configure allowed origins (use environment variables)
     * TODO: Configure allowed methods (GET, POST, PUT, DELETE, PATCH, OPTIONS)
     * TODO: Configure allowed headers (Authorization, Content-Type, Accept)
     * TODO: Set allowCredentials (false for localStorage JWT, true for cookies)
     * TODO: Set maxAge (3600 seconds for caching preflight)
     * TODO: Register with UrlBasedCorsConfigurationSource
     */
    @Bean
    public CorsFilter corsFilter() {
        // TODO: Create CorsConfiguration object
        // TODO: Configure all settings
        // TODO: Register with UrlBasedCorsConfigurationSource
        // TODO: Return CorsFilter
        return null;
    }

    /**
     * TODO: Configuration via application.properties
     * Use @Value to inject allowed origins from properties:
     *   @Value("${cors.allowed-origins}")
     *   private String[] allowedOrigins;
     * This allows different origins for dev/prod environments.
     * application-dev.properties:
     *   cors.allowed-origins=http://localhost:5173
     * application-prod.properties:
     *   cors.allowed-origins=https://app.lumeka.co.za,https://lumeka.co.za
     */
}