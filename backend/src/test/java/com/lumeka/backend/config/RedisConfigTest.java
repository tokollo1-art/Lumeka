package com.lumeka.backend.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD: RedisConfig Tests
 * Write these tests FIRST before implementing RedisConfig.
 * TODO: Test shouldConnectToRedis()
 *       - Verify Redis connection is established
 *       - Use RedisTemplate to ping Redis
 * TODO: Test shouldStoreAndRetrieveValue()
 *       - Store a value in Redis
 *       - Retrieve the same value
 *       - Verify values match
 * TODO: Test shouldCacheDataWithTTL()
 *       - Store value with TTL
 *       - Verify TTL is set
 *       - Wait for TTL expiration
 *       - Verify value is removed
 * TODO: Test shouldStoreAndRetrieveJavaObject()
 *       - Store a User object
 *       - Retrieve User object
 *       - Verify object fields match
 *
 * @author Lumeka Team
 * @version 1.0
 * @since 2026
 */
@SpringBootTest
public class RedisConfigTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * TODO: Test Redis connection is active.
     */
    @Test
    void shouldConnectToRedis() throws Exception {
        // TODO: Use redisTemplate.getConnectionFactory().getConnection().ping()
        // TODO: Expected: "PONG"
    }

    /**
     * TODO: Test storing and retrieving a string value.
     */
    @Test
    void shouldStoreAndRetrieveValue() throws Exception {
        // TODO: Store key: "test:key", value: "test-value"
        // TODO: Retrieve value
        // TODO: Verify value equals "test-value"
    }

    /**
     * TODO: Test storing and retrieving a Java object.
     */
    @Test
    void shouldStoreAndRetrieveJavaObject() throws Exception {
        // TODO: Create a test Java object (e.g., User)
        // TODO: Store in Redis
        // TODO: Retrieve from Redis
        // TODO: Verify object fields match
    }

    /**
     * TODO: Test cache TTL (Time-To-Live) works.
     */
    @Test
    void shouldCacheDataWithTTL() throws Exception {
        // TODO: Store value with TTL (e.g., 1 second)
        // TODO: Wait for TTL to expire
        // TODO: Verify value is no longer present
    }
}