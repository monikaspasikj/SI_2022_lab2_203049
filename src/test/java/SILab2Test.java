import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> newList (String...elements){
        return  new ArrayList<String>(Arrays.asList(elements));
    }
    @Test
    void everyStateFunction() {
        IllegalArgumentException ex;

        //Case 1:empty list;
        ex=assertThrows(IllegalArgumentException.class, ()->SILab2.function(newList()));
        assertEquals("List length should be greater than 0", ex.getMessage());

        //Case 2: list=["0" "#" "#" "0" "#"];
        ex=assertThrows(IllegalArgumentException.class, ()->SILab2.function(newList("0","#","#", "0", "#")));
        assertEquals("List length should be a perfect square",ex.getMessage());

        //Case 3: list=["0" "#" "0" "#" "#" "#" "0" "0" "#"];
        List<String> list3values=newList("0","#","0","#","#","#","0","0","#");
        List<String> list3prints=newList("2","#","2","#","#","#","1","2","#");
        assertEquals(list3prints, SILab2.function(list3values));

        //Case 4: list=["#" "0" "#" "0" "#" "0" "#" "0" "#"];
        List<String> list4values=newList("#","0","#","0","#","0","#","0","#");
        List<String> list4prints=newList("#","3","#","3","#","3","#","3","#");
    }

    @Test
    void EveryBranchFunction(){
        //I za dvata testovi ima isti primeri i zatoa mozhe vo edna fukcija

        IllegalArgumentException ex;

        //Case 1:empty list;
        ex=assertThrows(IllegalArgumentException.class, ()->SILab2.function(newList()));
        assertEquals("List length should be greater than 0", ex.getMessage());

        //Case 2: list=["0" "#" "#" "0" "#"];
        ex=assertThrows(IllegalArgumentException.class, ()->SILab2.function(newList("0","#","#", "0", "#")));
        assertEquals("List length should be a perfect square",ex.getMessage());

        //Case 3: list=["0" "#" "0" "#" "#" "#" "0" "0" "#"];
        List<String> list3values=newList("0","#","0","#","#","#","0","0","#");
        List<String> list3prints=newList("2","#","2","#","#","#","1","2","#");
        assertEquals(list3prints, SILab2.function(list3values));

        //Case 4: list=["#" "0" "#" "0" "#" "0" "#" "0" "#"];
        List<String> list4values=newList("#","0","#","0","#","0","#","0","#");
        List<String> list4prints=newList("#","3","#","3","#","3","#","3","#");
    }
}