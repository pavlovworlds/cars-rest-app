package com.cars.app.carsrestapp.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Getter
@Setter
@Table(name = "cars")
public class Car implements Serializable {
    private static final long serialVersionUID = 7207404265770942925L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long vin;
    String color;
    String brand;
    Date issueDate;
}
