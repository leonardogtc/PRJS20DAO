package model.dao;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new model.dao.impl.SellerDaoJDBC();
    }

}
