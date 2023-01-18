package be.technobel.bart.demoSpring.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

 @Data
 @AllArgsConstructor
public class Plat {
    private long id;
    private String nom;
    private double prix;
    private List<String> ingredient;
}
