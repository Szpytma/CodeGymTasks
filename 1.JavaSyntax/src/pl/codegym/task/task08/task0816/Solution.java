package pl.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/* 
Miła Emma i letnie wakacje
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.forLanguageTag("en"));
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("January 15 1999"));
        map.put("Szpytma", df.parse("July 11 2016"));
        map.put("Jopek", df.parse("February 5 1997"));
        map.put("Smith", df.parse("January 16 1991"));
        map.put("Dazly", df.parse("May 19 1985"));
        map.put("Stevens", df.parse("December 21 1975"));
        map.put("Rodgers", df.parse("February 11 2012"));
        map.put("Gibson", df.parse("January 15 2002"));
        map.put("Deer", df.parse("December 14 2000"));
        map.put("Jackson", df.parse("July 19 2001"));
      

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
    
        Iterator <Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry <String, Date> pair = iterator.next();
            
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                iterator.remove();

            }
        }
        /*mapa.entrySet()
            .removeIf(pair -> pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8);*/


    }

    public static void main(String[] args) throws ParseException {

    }
}
