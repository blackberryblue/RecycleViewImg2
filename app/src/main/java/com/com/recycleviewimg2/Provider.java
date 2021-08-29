package com.com.recycleviewimg2;

import java.util.ArrayList;
import java.util.List;

public class Provider {

    public List<Item> findAll(){
        List<Item> items = new ArrayList<>();
        for(int i = 1; i<20; i++){
            items.add(new Item(i,R.drawable.haeundae,R.string.app_name));
        }
        return items;
    }

}
