package com.tacos;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccCVV;
    private String ccExpiration;
    private List<Tacos> tacos = new ArrayList<>();

    public void addTacos(Tacos taco) {
        this.tacos.add(taco);
    }
}
