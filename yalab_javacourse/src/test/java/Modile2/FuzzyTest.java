package Module2;


import org.junit.Assert;

import static Module2.Fuzzy.fuzzySearch;


public class FuzzyTest {
    @org.junit.jupiter.api.Test
    void fuzzySearchTest() {
        Assert.assertEquals(true, fuzzySearch("car", "ca6$$#_rtwheel")); // true
        Assert.assertEquals(true,    fuzzySearch("cwhl", "cartwheel")); // true
        Assert.assertEquals(true,   fuzzySearch("cwhee", "cartwheel")); // true
        Assert.assertEquals(true,   fuzzySearch("cartwheel", "cartwheel")); // true
        Assert.assertEquals(false,   fuzzySearch("cwheeel", "cartwheel")); // false
        Assert.assertEquals(false,    fuzzySearch("lw", "cartwheel")); // false
    }
}
 /*   @Test
    void fuzzySearchTest() {


        Assert.assertEquals(true,  fuzzySearch("car", "ca6$$#_rtwheel") );
        Assert.assertEquals(true,  fuzzySearch("cwhl", "cartwheel") );
        Assert.assertEquals(true,  fuzzySearch("cwhee", "cartwheel") );
        Assert.assertEquals(false,  fuzzySearch("cartwheel", "cartwheel") );
        Assert.assertEquals(false,  fuzzySearch("lw", "cartwheel") );

    }
}

  */
