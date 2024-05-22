package myfloristapp.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPRODUCT;
    private double price;
    private String name;

    @Enumerated(EnumType.STRING)
    private ProductType type;

    private String color;
    private double height;

    @Enumerated(EnumType.STRING)
    private MaterialType materialType;

    // Getters and Setters

    public int getIdPRODUCT() {
        return idPRODUCT;
    }

    public void setIdPRODUCT(int idPRODUCT) {
        this.idPRODUCT = idPRODUCT;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }
}

enum ProductType {
    TREE, FLOWER, DECORATION
}

enum MaterialType {
    WOOD, PLASTIC
}
