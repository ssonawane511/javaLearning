
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
       
        Map<String,String> englishSpanDisctonary = new HashMap<String,String>();

        englishSpanDisctonary.put("monday","rasgulla");
        englishSpanDisctonary.put("tuseday","poha");
        englishSpanDisctonary.put("wednesday","matki");
        englishSpanDisctonary.put("thursday","databhel");
        englishSpanDisctonary.put("friday","creamynuts");

        // prints all pair
        System.out.println(englishSpanDisctonary.toString());
        // return string of all pairs 


        // get the value of particular key
        System.out.println(englishSpanDisctonary.get("monday"));
        //return the value of key monday


        //get all values
        System.out.println(englishSpanDisctonary.values());
        // return arrrya of all values

        // get all the keys
        System.out.println(englishSpanDisctonary.keySet());

        // get the size of dictionary

        System.out.println("size of disctonary " + englishSpanDisctonary.size());



        // shoping list

        Map<String,Boolean> shoping = new HashMap<String,Boolean>();

        shoping.put("soap",true);
        shoping.put("sugar",false);

        System.out.println(shoping.toString());

        String listSise = shoping.toString();
        System.out.println(listSise.length());
        // to clear the values 
        //         shoping.clear();
        //  System.out.println(shoping.toString());


        // check the disctonary is empty

        System.out.println(shoping.isEmpty()); 

        // remove a element 
        shoping.remove("soap");
        System.out.println(shoping.toString());

        // replace values the
        shoping.replace("sugar",true);

        System.out.println(shoping.toString());

        


    }
}