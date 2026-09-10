package com.lumeka.backend.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
/**
 * Test class for {@link SwaggerConfig}
 *
 * <p>Tests the Swagger/OpenAPI documentation configuration following BDD principles.
 * These tests verify that API documentation is properly generated and accessible.</p>
 *
 * TODO: Add tests for custom OpenAPI bean configuration (optional)
 * TODO: Add tests for operation customizer (optional)
 * TODO: Add tests for server configuration (optional)
 * TODO: Add tests for grouped APIs (optional)
 *
 * @author Lumeka Team
 * @version 1.0
 * @since 2026
 */


@SpringBootTest
@AutoConfigureMockMvc
public class SwaggerConfigTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * TODO: Test that Swagger UI page loads.
     */
    @Test
    void shouldLoadSwaggerUiPage() throws Exception {
        // TODO: Perform GET request to /swagger-ui/index.html
        // TODO: Expect status 200 OK
    }

    /**
     * TODO: Test that API documentation JSON loads.
     */
    @Test
    void shouldLoadApiDocs() throws Exception {
        // TODO: Perform GET request to /v3/api-docs
        // TODO: Expect status 200 OK
        // TODO: Verify response is JSON
    }

    /**
     * TODO: Test that API info is correct.
     */
    @Test
    void shouldContainApiInfoInDocs() throws Exception {
        // TODO: Perform GET request to /v3/api-docs
        // TODO: Verify title = "Lumeka API"
        // TODO: Verify version = "1.0"
        // TODO: Verify contact info present
    }

    /**
     * TODO: Test that security scheme is documented.
     */
    @Test
    void shouldContainSecurityScheme() throws Exception {
        // TODO: Perform GET request to /v3/api-docs
        // TODO: Verify securitySchemes contains bearerAuth
        // TODO: Verify type = http
        // TODO: Verify scheme = bearer
        // TODO: Verify bearerFormat = JWT
    }

    /**
     * TODO: Test that controllers are tagged.
     */
    @Test
    void shouldContainTaggedControllers() throws Exception {
        // TODO: Perform GET request to /v3/api-docs
        // TODO: Verify tags exist
        // TODO: Verify each expected tag is present
    }
}