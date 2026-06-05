package com.netflix.sim;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class AppIntegrationTest {
    @Test
    void appMainRunsWithoutExceptions() {
        assertDoesNotThrow(() -> App.main(new String[0]));
    }
}
