package datasource;

import domain.*;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Thomas Kragsberger
 */
public class DBFacade
{

    private TheMapper tm;
    private Connection con;
//    private static DBFacade instance;

    public DBFacade()
    {
        tm = new TheMapper();
        con = new DBConnector().getConnection();

    }

//    public static DBFacade getInstance()
//    {
//        if (instance == null)
//        {
//            instance = new DBFacade();
//        }
//        return instance;
//    }

    public Order getOrder(int ono)
    {
        return tm.getOrders(ono, con);
    }

    public ArrayList getCustomer()
    {
//        System.out.println("dbfacade her");
        return tm.getCustomer(con);
    }

    public ArrayList getVare()
    {
//        System.out.println("DBFacade");
        return tm.getItems(con);
    }

    public boolean saveOrder(ArrayList<Order> o)
    {
        return tm.saveOrder(o, con);
    }

    public boolean saveItem(ArrayList<Item> i)
    {
        return tm.saveItem(i, con);
    }
}
