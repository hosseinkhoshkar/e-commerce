package com.springbootProject.inventoryService.controller;

import com.springbootProject.inventoryService.dto.InventoryResponse;
import com.springbootProject.inventoryService.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> findBySkuCodeIn(@RequestParam List<String> skuCodeList){
        System.out.println("skuCodeList: " + skuCodeList);
        return inventoryService.findBySkuCodeIn(skuCodeList);
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public List<InventoryResponse> findBySkuCodeInTest(@RequestParam List<String> skuCodeList){
//        System.out.println("skuCodeList: " + skuCodeList);
//        return null;
//    }
//
//    @GetMapping("/test")
//    @ResponseStatus(HttpStatus.OK)
//    public String testGET(@RequestParam String name){
//        return "hello " + name;
//    }

}
