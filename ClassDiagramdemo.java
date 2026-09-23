import java.util.ArrayList;
class Customer
{
    String name,location;
    ArrayList<Order> orders = new ArrayList<>();

    Customer(String name, String location)
    {
        this.name = name;
        this.location = location;
    }
    void randomize()
    {
        System.out.println("Customer details are randomized");
    }
    void reconnect()
    {
        System.out.println("Customer reconnected");
    }
    void addOrder(Order order)
    {
        orders.add(order);
    }
    void displayOrders()
    {
        System.out.println("Customer: " + name);
        System.out.println("Location: " + location);

        for (Order order : orders)
        {
            order.confirm();
        }
    }
}

class Order
{
    String date;
    String number;

    Order(String date, String number)
    {
        this.date = date;
        this.number = number;
    }
    void confirm()
    {
        System.out.println("Order " + number + " confirmed");
    }
    void close()
    {
        System.out.println("Order " + number + " closed");
    }
}
class SpecialOrder extends Order
{
    SpecialOrder(String date, String number)
    {
        super(date, number);
    }

    void dispatch()
    {
        System.out.println("Special order " + number + " dispatched");
    }
}
class NormalOrder extends Order
{
    NormalOrder(String date, String number)
    {
        super(date, number);
    }

    void dispatch()
    {
        System.out.println("Normal order " + number + " dispatched");
    }

    void receive()
    {
        System.out.println("Normal order " + number + " received");
    }
}
class ClassDiagramdemo
{
    public static void main(String[] args)
    {
        Customer c = new Customer("Rahul", "Hyderabad");

        SpecialOrder s = new SpecialOrder("23-09-2026", "S101");
        NormalOrder n = new NormalOrder("23-09-2026", "N101");

        c.addOrder(s);
        c.addOrder(n);

        c.randomize();
        c.reconnect();

        c.displayOrders();

        s.dispatch();
        s.close();

        n.dispatch();
        n.receive();
        n.close();
    }
}