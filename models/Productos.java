package com.cursojava.curso.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "productos")
@ToString @EqualsAndHashCode
public class Productos {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Getter @Setter @Column(name = "referencia")
    private String referencia;

    @Getter @Setter @Column(name = "color")
    private String color;

    @Getter @Setter @Column(name = "precio")
    private String precio;

    @Getter @Setter @Column(name = "marca")
    private String marca;

    @Getter @Setter @Column(name = "tipo_producto")
    private String tipo_producto;
}
