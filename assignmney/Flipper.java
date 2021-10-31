import java.util.*;

class Flipper {

   /* @param src -- the string to start from
    * @param dest -- the target string
    * @param flips -- a sequence of swaps to be performed on src
    * @return true iff flips is a sequence of valid flips that when applied
    *     to src results in dest
    */
    public static boolean flipsMatches(String src, String dest, List<List<Integer>> flips) {
    // Your code here...
        if(src.length() != dest.length())
        {
            return false;
        }
        if(src.equals(dest))
        {
            return true;
        }
        if(flips.size()<=0)
        {
            return false;
        }
        
        char [] srcCharArray = src.toCharArray();

        for(int i = 0 ; i < flips.size() ; i++)
        {
            List <Integer> swap = new ArrayList<>(flips.get(i));
  
            int a = swap.get(0);
            int b = swap.get(1);

            // return false case 
            if(a >= src.length() || b >= src.length()  )
            {
                return false ;
            }
            if(Math.abs(a-b)!=1)
            {
                return false ;
            }
          
            char temp = srcCharArray[a];
            srcCharArray[a] = srcCharArray[b]; 
            srcCharArray[b] = temp;
        }

        if(String.valueOf(srcCharArray).equals(dest))
        {
            return true;
        }
        return false ;
    }    
    
    
    /* @param src
    * @param dest
    * @return A list of flips, if any exist, that results in dest when applied
    *     to src
    * @throws NoFlipListException if there does not exist a sequence of flips
    *     that results in dest when applied to src
    */

    
    public static void recuriveFilpSequence( String src, String dest , List<List<Integer>> Currentflips ,int pos , List<List<Integer>> result){
        if(pos >= src.length())
        {
            return;
        }

        //System.out.println("position " + pos + "current flip " + Currentflips + " src " + src + " dest " + dest);


        if(flipsMatches( src , dest, Currentflips) )
        {
            result = new ArrayList<>(Currentflips);
            System.out.println(result);
            return;
        }
        for(int i = pos ; i < src.length()-1 ; i++)
        {
            List<Integer> swap = new ArrayList<>(Arrays.asList(i,i+1));
            Currentflips.add(swap);
            recuriveFilpSequence( src, dest, Currentflips, i+1 , result );
            Currentflips.remove(Currentflips.size()-1);
        }

        return ; 
        
    }

    public static List<List<Integer>> flipsSequence(String src, String dest  ) {
    // Your code here...
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> Currentflips = new ArrayList<>();

       recuriveFilpSequence(  src,  dest ,  Currentflips , 0 , result);

       if(result.size()>0)
       {
           return result;
       }
       return result;
    }



    public static void main( String args[]) {
        
        List<List<Integer>> flips = new ArrayList<>(); 
        List <Integer>  swap1 = new ArrayList<>(Arrays.asList(1,2));
        List <Integer>  swap4 = new ArrayList<>(Arrays.asList(3,4));

        flips.add(swap1);
        // if you include swap4 then will give valid 
        flips.add(swap4);
        System.out.println(flipsMatches("sagar","sgara",flips));


        System.out.println(flipsSequence("sagar","sgara"));

    }

}