package com.js.foodpoint.service;

import com.js.foodpoint.domain.FoodMenu;
import com.js.foodpoint.entity.Biriyani;
import com.js.foodpoint.entity.Cake;
import com.js.foodpoint.entity.Desert;
import com.js.foodpoint.repository.BiriyaniRepository;
import com.js.foodpoint.repository.CakeRepository;
import com.js.foodpoint.repository.DesertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodPointService {

    private final CakeRepository cakeRepository;

    private final BiriyaniRepository biriyaniRepository;

    private final DesertRepository desertRepository;

    @Autowired
    public FoodPointService(CakeRepository cakeRepository, BiriyaniRepository biriyaniRepository, DesertRepository desertRepository) {
        this.cakeRepository = cakeRepository;
        this.biriyaniRepository = biriyaniRepository;
        this.desertRepository = desertRepository;
    }

    public List<FoodMenu> getAllFoods(){
        List<FoodMenu> allFoods  = new ArrayList<>();
        cakeRepository.findAll().forEach(cake -> allFoods.add(new FoodMenu(cake.getCakeName() , cake.getCakeType(), cake.getServings())));
        biriyaniRepository.findAll().forEach(biriyani -> allFoods.add(new FoodMenu(biriyani.getCakeName() , biriyani.getCakeType(), biriyani.getServings())));
        desertRepository.findAll().forEach(desert -> allFoods.add(new FoodMenu(desert.getCakeName() , desert.getCakeType(), desert.getServings())));
        return allFoods;
    }


}
