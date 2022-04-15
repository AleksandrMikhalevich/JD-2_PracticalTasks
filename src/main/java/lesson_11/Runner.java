package lesson_11;

import lesson_11.dao.DAO;
import lesson_11.dao.DAOFactory;
import lesson_11.entity.Address;
import lesson_11.entity.People;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-14 12:40
 */
public class Runner {

    public static void main(String[] args) {
        Address address1 = Address.builder().city("Minsk").street("Kalinovskogo").house("55").build();
        Address address2 = Address.builder().city("Grodno").street("Stefana Batoria").house("10").build();
        Address address3 = Address.builder().city("Brest").street("Masherova").house("11").build();
        DAOFactory daoFactory = DAOFactory.getInstance();
        DAO<Object> daoAddress = daoFactory.getImplThroughDAO();
        daoAddress.save(address1);
        daoAddress.save(address2);
        daoAddress.save(address3);
        Address address4 = Address.builder().id(3).city("Brest").street("Masherova").house("80").build();
        daoAddress.update(address4);
        daoAddress.read(Address.class, 3);
        daoAddress.delete(Address.class, 1);

        People people1 = People.builder().firstName("Jack").surname("Black").secondName("Jackovich").build();
        People people2 = People.builder().firstName("John").surname("White").secondName("Johnovich").build();
        People people3 = People.builder().firstName("Tom").surname("Cat").secondName("Tomovich").build();
        DAO<Object> daoPeople = daoFactory.getImplThroughDAO();
        daoPeople.save(people1);
        daoPeople.save(people2);
        daoPeople.save(people3);
    }
}
