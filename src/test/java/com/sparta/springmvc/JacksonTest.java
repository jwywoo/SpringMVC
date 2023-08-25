package com.sparta.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.springmvc.response.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JacksonTest {
    @Test
    @DisplayName("OBJ to Json: get method")
    void test1() throws JsonProcessingException {
        Star star = new Star("Robbie", 95);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(star);

        System.out.println("Json : " + json);
    }

    @Test
    @DisplayName("JSON to Object: get and constructor (or setter)required")
    void test2() throws JsonProcessingException {
        String json = "{\"name\": \"Robbie\", \"age\": 95}";

        ObjectMapper objectMapper = new ObjectMapper();
        Star star = objectMapper.readValue(json, Star.class);
        System.out.println("star.getName():  " + star.getName());
        System.out.println("star.getAge(): " + star.getAge());
    }
}
