package com.example.dd.testcontainers.controller;

import com.example.dd.testcontainers.AbstractIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
class PersonControllerIT extends AbstractIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getPersonsTest() throws Exception {
        var expectedBody = "[{\"id\":1,\"name\":\"Name1\",\"age\":20},{\"id\":2,\"name\":\"Name2\",\"age\":30}]";
        this.mockMvc.perform(get("/persons")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(expectedBody)));
    }

}
