package com.prakhar.chefkart;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.prakhar.chefkart.controller.APIController;
import com.prakhar.chefkart.models.Post;
import com.prakhar.chefkart.service.serviceImpl.APIServiceImpl;

import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

// @RunWith(SpringRunner.class)
@WebMvcTest(value = APIController.class)
@WithMockUser
public class APIControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private APIServiceImpl apiServiceImpl;
    Post post = new Post(1, "Prakhar", "This is my name", 215, new String[] { "URL1", "URL2" });

}
