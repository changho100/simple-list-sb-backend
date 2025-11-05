package com.example.itemlist.service;

import com.example.itemlist.entity.Item;
import com.example.itemlist.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        System.out.println("Fetching all items from database");
        return itemRepository.findAll();
    }
}
