package com.example.itemlist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itemlist.entity.Item;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    @GetMapping("/items")
    public List<Item> getAllItems() {
        System.out.println("Fetching all items");
        return Arrays.asList(
            new Item(1L, "Item 1"),
            new Item(2L, "Item 2"),
            new Item(3L, "Item 3"),
            new Item(4L, "Item 4"),
            new Item(5L, "Item 5")
        );
    }

    @GetMapping("/hello")
    public GreetingResponse hello() {
        return new GreetingResponse("Hello World from Spring Boot!");
    }
}