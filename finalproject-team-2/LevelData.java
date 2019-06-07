 
/**
 * Creates and returns and array of Strings where each String represents a row in the game and has different values ranging from
 *0 to 5. Each value, except 0, signifies an action: 1 means build a block, 2 means build a lift, 3 means build a ladder, 4 
 *means build a portal, and 5 means build a charge station. 
 *
 * @author Manjari Senthilkumar
 * @version 05/31/2019
 */
public class LevelData
{
    private static final String[] LEVEL1 = new String[] {
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000011",
        "000000000030",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "000000111111",
        "500000000000",
        "000000000000",
        "000000000000",
        "000000000000",
        "111100000000",
        "000000000000",
        "001100000000",
        "000000200000",
        "000000000000",
        "001110000000",
        "000011100000",
        "100000111004",
        "110000111111",
        "000001000000",
        "011111000000",
        "000000001100",
        "111100000000",
        "000001111000",
        "000000001110",
        "111000000000",
        "000001000000",
        "111111110011",
        "000000000000",
        "000000001100",
        "000000000000",
        "111111111111"
    };
    /**
     * returns array of Strings containing information on what to build in each row of the game
     *
     * @return            array of Strings containing information on what to build in each row of the game
     */
    public static String[] getLevel1(){return LEVEL1;}
}
