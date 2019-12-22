package de.msz.kickerapp.web.rest;

import de.msz.kickerapp.KickerappApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the DashboardResource REST controller.
 *
 * @see DashboardResource
 */
@SpringBootTest(classes = KickerappApp.class)
public class DashboardResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        DashboardResource dashboardResource = new DashboardResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(dashboardResource)
            .build();
    }

    /**
     * Test lastGames
     */
    @Test
    public void testLastGames() throws Exception {
        restMockMvc.perform(get("/api/dashboard/last-games"))
            .andExpect(status().isOk());
    }
}
