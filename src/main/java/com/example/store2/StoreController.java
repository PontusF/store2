package com.example.store2;

import org.springframework.web.bind.annotation.*;

import java.util.List;
//@Author Pontus Fredriksson
@RestController
public class StoreController {
    private static final String template = "Hello, &s!";
    private StoreRepository storeRepository;

    public StoreController(StoreRepository storeRepository){
        this.storeRepository = storeRepository;
        storeRepository.save(new Store("Ica","Björnbärsvägen 18, Alingsås"));
        storeRepository.save(new Store("Coop","Olskroken 30, Göteborg"));
    }
    //get a list of all stores
    @GetMapping("/store")
    public List<Store> store() {
        return storeRepository.findAll();
    }

    @PostMapping("/store/new")
    public Store postStore(@RequestBody Store store){
            return storeRepository.save(store);
    }


    @GetMapping("/store/{id}")
    public Store getOne(@PathVariable Long id)
    {
        return  storeRepository.findById(id).get();
    }
}
