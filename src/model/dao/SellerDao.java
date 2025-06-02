package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(int id, String name, int quantity, double price);
    void update(int id, String name, int quantity, double price);
    void deleteById(int id);
    Seller findById(int id);
    List<Seller> findAll();

}
