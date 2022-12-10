/**
 * Prints data reports about daily mail deliveries
 * Delivery data held in data test cases from main method
 *
 * @author (Iris Carrigg)
 * @version (9/16/2022)
 */

public class Project2 {
    //DATE AND TIME YOU FIRST START WORKING ON THIS ASSIGNMENT (date AND time): <--------------------
    //ANSWER:  9/16/2022 10:45AM                <--------------------

    /**
     * checks for valid delivery
     * takes in a String from the input data
     * returns boolean
     */
    public static boolean checkForValidDelivery(String dataAboutReceiver)
    {
        if (dataAboutReceiver.equals( "" ))
            return false;
        else
            return true;
    }

    /**
     * prints information about the delivery
     * takes a Delivery object, checks for empty String
     * returns void
     */
    public static void printDeliveryOrder(Delivery deliveryObject)
    {
        if (!deliveryObject.getReceiver().equals( "" ))
            System.out.printf("Delivery to %s from %s today: %s (collect $%,.2f on delivery)%n",deliveryObject.getReceiver().toUpperCase(), deliveryObject.getOrigin(), deliveryObject.getItem(), deliveryObject.getFee());
    }

    /**
     * prints information about the hazardous delivery
     * takes a Delivery object, checks for empty String
     * returns void
     */
    public static void printHazardousDeliveryOrder(Delivery hazardDeliveryObject)
    {
        if (!hazardDeliveryObject.getReceiver().equals( "" ))
            System.out.printf("Delivery (-HAZARD-) to %s from %s today: %s (collect $%,.2f on delivery)%n",hazardDeliveryObject.getReceiver().toUpperCase(), hazardDeliveryObject.getOrigin(), hazardDeliveryObject.getItem(), hazardDeliveryObject.getFee());
    }

    /**
     * totals up the fees to be collected
     * takes all 3 Delivery objects
     * returns double
     */
    public static double feeTotal(Delivery fromAnkhMorpork, Delivery fromPseudopolis, Delivery fromUeberwald)
    {
        double feeTotal = fromAnkhMorpork.getFee() + fromPseudopolis.getFee() + fromUeberwald.getFee();
        return feeTotal;
    }

    //DO NOT CHANGE THIS METHOD EXCEPT TO COMMENT TEST CASES IN AND OUT
    public static void main( String[] args ) {
        //ONLY COMMENT IN ONE TEST CASE AT A TIME
        //Test case 1:
        args = new String[]{ "Unseen University library", "book chains", "16", "141", "no", "City Watch", "uniforms", "17", "95", "no", "Seamstresses Guild", "ribbon", "1100", "3", "no" };
        //Test case 2: 
        //args = new String[]{ "Lady Ramkin's Dragon Sanctuary", "almost cheese", "400", "5", "yes", "", "", "", "", "", "Assassin's Guild", "black capes", "21", "19", "no" };
        //Test case 3: 
        //args = new String[]{ "Unseen University", "pointy hats", "14", "66", "no", "Post Office", "stamp books", "200", "1", "no", "", "", "", "", "" };
        //Test case 4: 
        //args = new String[]{ "CMOT Dibbler", "frozen rats", "80", "8", "no", "", "", "", "", "", "Patrician's Office", "dissident", "1", "2560", "yes" };        
        
        Delivery fromAnkhMorpork, fromPseudopolis, fromUeberwald;

        //check if there is a shipment from Ankh-Morpork for delivery
        if ( checkForValidDelivery( args[ 0 ] ) ) //if there is, create a Delivery object with the data from the test case
            fromAnkhMorpork = new Delivery( args[ 0 ], "Ankh-Morpork", args[ 1 ], Integer.parseInt( args[ 2 ] ), Integer.parseInt( args[ 3 ] ), args[ 4 ] );
        else //if there isn't, create a dummy Delivery object
            fromAnkhMorpork = new Delivery();
        //check if there is a shipment from Pseudopolis for delivery
        if ( checkForValidDelivery( args[ 5 ] ) ) //if there is, create a Delivery object with the data from the test case   
            fromPseudopolis = new Delivery( args[ 5 ], "Pseudopolis", args[ 6 ], Integer.parseInt( args[ 7 ] ), Integer.parseInt( args[ 8 ] ), args[ 9 ] );
        else //if there isn't, create a dummy Delivery object
            fromPseudopolis = new Delivery();
        //check if there is a shipment from Ueberwald for delivery
        if ( checkForValidDelivery( args[ 10 ] ) ) //if there is, create a Delivery object with the data from the test case
            fromUeberwald   = new Delivery( args[ 10 ], "Ueberwald", args[ 11 ], Integer.parseInt( args[ 12 ] ), Integer.parseInt( args[ 13 ] ), args[ 14 ] );
        else //if there isn't, create a dummy Delivery object
            fromUeberwald   = new Delivery();

        //print out delivery order
        if ( !fromAnkhMorpork.getHazardous() )  printDeliveryOrder( fromAnkhMorpork );          //delivery from Ankh-Morpork today
        else                                    printHazardousDeliveryOrder( fromAnkhMorpork ); //hazardous delivery from Ankh-Morpork today
        if ( !fromPseudopolis.getHazardous() )  printDeliveryOrder( fromPseudopolis );          //delivery from Pseudopolis today
        else                                    printHazardousDeliveryOrder( fromPseudopolis ); //hazardous delivery from Pseudopolis today
        if ( !fromUeberwald.getHazardous() )    printDeliveryOrder( fromUeberwald );            //delivery from Ueerwald today
        else                                    printHazardousDeliveryOrder( fromUeberwald );   //hazardous delivery from Ueerwald today        

        //print the total money to collect today from all 3 deliveries
        System.out.printf( "Today's total $%,.2f%n%n", feeTotal( fromAnkhMorpork, fromPseudopolis, fromUeberwald ) );
    }

}
