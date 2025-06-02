package model.dao;

import db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new model.dao.impl.SellerDaoJDBC(DB.getConnection());
    }

}
