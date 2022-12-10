
/**
 * Manipulates data about deliveries from test cases held in Project2 class
 * 
 * @author (Iris Carrigg)
 * @version (9/16/2022)
 */
public class Delivery
{
    private String receiver;
    private String origin;
    private String item;
    private boolean hazardous;
    private double fee;

    /**
     * standard constructor for objects of class Delivery
     * creates dummy object with no data
     * initializes instance variables
     * constructor does not return any value
     */
    public Delivery()
    {
        this.receiver = "";
        this.origin = "";
        this.item = "";
        this.hazardous = false;
        this.fee = 0.0;

    }

    /**
     * constructor for objects of class Delivery
     * sets instance variables
     * manipulates arguments mathematically
     * constructor does not return any value
     */
    public Delivery(String receiver, String origin, String item, int numberOfItems, int weightPerItemInOz, String hazard)
    {

        this.receiver = receiver;
        this.origin = origin;
        this.item = item;
        this.hazardous = false;
        this.fee = 0.0;

        if (hazard.equals( "yes" ))
            this.hazardous = true;

        if (this.receiver.equals( "Patrician's Office" ) || this.receiver.equals( "Post Office" ))
            this.fee = 0.0;

        else if (this.origin.equals( "Ankh-Morpork" ))
        {
            if ((weightPerItemInOz * numberOfItems / 16.0) <=100)
                this.fee = 87.0; 

            if ((weightPerItemInOz * numberOfItems / 16.0) > 100)
                this.fee = Math.ceil(weightPerItemInOz * numberOfItems / 16.0 / 100.0) * 87;

            if (this.hazardous == true)
                this.fee += (this.fee * .65); 
        }

        else if (this.origin.equals( "Pseudopolis" ))
        {
            if ((weightPerItemInOz * numberOfItems / 16.0) <=100)
                this.fee = 165.0; 

            if ((weightPerItemInOz * numberOfItems / 16.0) > 100)
                this.fee = Math.ceil(weightPerItemInOz * numberOfItems / 16.0 / 100.0) * 165;

            if (this.hazardous == true)
                this.fee += (this.fee * .65);          
        }

        else if (this.origin.equals( "Ueberwald" ))
        {
            if ((weightPerItemInOz * numberOfItems / 16.0) <=100)
                this.fee = 997.0;

            if ((weightPerItemInOz * numberOfItems / 16.0) > 100)
                this.fee = Math.ceil(weightPerItemInOz * numberOfItems / 16.0 / 100.0) * 997;

            if (this.hazardous == true)
                this.fee += (this.fee * .65);
        }

    }

    /**
     * receiver getter
     * no parameters
     * returns String
     */
    public String getReceiver()
    {
        return this.receiver;
    }

    /**
     * origin getter
     * no parameters
     * returns String
     */
    public String getOrigin()
    {
        return this.origin;
    }

    /**
     * item getter
     * no parameters
     * returns String
     */
    public String getItem()
    {
        return this.item;
    }

    /**
     * hazardous getter
     * no parameters
     * returns boolean
     */
    public boolean getHazardous()
    {
        return this.hazardous;
    }

    /**
     * fee getter
     * no parameters
     * returns double
     */
    public double getFee()
    {
        return this.fee;
    }
}
