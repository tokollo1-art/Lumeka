package com.lumeka.backend.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger / OpenAPI Configuration
 * Purpose: Enable API documentation and testing interface for Lumeka.
 * WHY Lumeka needs Swagger:
 *   - API Documentation: Frontend developers can see all available endpoints
 *   - API Testing: Developers can test endpoints directly from the browser
 *   - Onboarding: New team members can understand the API quickly
 *   - Client Integration: External developers can integrate with Lumeka
 * TODO: Configure OpenAPI info (title, description, version, contact)
 * TODO: Add JWT security scheme to Swagger (bearerAuth)
 * TODO: Tag controllers for grouping (Auth, Users, Tasks, etc.)
 * TODO: Configure API endpoints to show
 * TODO: Add server URL for different environments
 * TODO: Configure examples for request/response DTOs
 * TDD: Test with Swagger UI manually after implementation
 *       - Visit: <a href="http://localhost:8080/swagger-ui.html">...</a>
 *       - Verify all endpoints are documented
 *       - Test JWT authentication in Swagger
 *
 * @author Lumeka Team
 * @version 1.0
 * @since 2026
 */
@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Lumeka API",
                version = "1.0",
                description = "Lumeka Youth Economic Participation Platform API",
                contact = @Contact(
                        name = "Lumeka Team",
                        email = "info@lumeka.co.za",
                        url = "https://lumeka.co.za"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        security = @SecurityRequirement(name = "bearerAuth")
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        bearerFormat = "JWT"
)
public class SwaggerConfig {
    // No implementation needed - annotations do all the work
    //
    // This file exists to centralize Swagger/OpenAPI configuration.
    // The @OpenAPIDefinition and @SecurityScheme annotations are enough
    // to generate the API documentation.
    //
    // We can add additional configuration here if needed:
    // - Custom OpenAPI bean
    // - Grouped APIs (e.g., public vs authenticated)
    // - Custom examples
    // - Operation customizer
    //
    // TODO: Add OpenAPI bean for custom configuration (optional)
    // TODO: Add OperationCustomizer for adding default responses (optional)
    // TODO: Add Server bean for different environments (optional)
}