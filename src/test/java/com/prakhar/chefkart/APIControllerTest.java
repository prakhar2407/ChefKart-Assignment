package com.prakhar.chefkart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.prakhar.chefkart.controller.APIController;
import com.prakhar.chefkart.models.Post;
import com.prakhar.chefkart.service.serviceImpl.APIServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(value = APIController.class)
@WithMockUser
public class APIControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private APIServiceImpl apiServiceImpl;
    Post post = new Post(1, "Prakhar", "This is my name", 215, new String[] { "URL1", "URL2" });

    @Test
    public void retrieveCourse() throws Exception {
        Mockito.when(apiServiceImpl.getAllPost()).thenReturn((List<Post>) post);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/allPosts").accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        System.out.println(result.getResponse());

        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
    }

}
