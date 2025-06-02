package model.dao.impl;

import model.dao.SellerDao;
import model.entities.Seller;

import java.util.List;

public class SellerDaoJDBC implements SellerDao {

    @Override
    public void insert(int id, String name, int quantity, double price) {

    }

    @Override
    public void update(int id, String name, int quantity, double price) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Seller findById(int id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
