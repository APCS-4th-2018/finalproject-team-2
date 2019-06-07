
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * Contains all returns all the graphics used in the game.
 *
 * @Megha Koshy
 * @6/3/19
 */
public class Graphics
{
    private static ImageView man = convertImageView("https://drive.google.com/uc?id=1myW3UWhQDgABQOIDNStdpgK0o6HbH0pE");
    private static ImageView backgroundGradient = convertImageView("https://drive.google.com/uc?id=1bmxuxPDvALQrUw3bH0ZmGNS8VYA0BpAH"); 
    private static ImageView stoneTexture1 = convertImageView("https://drive.google.com/uc?id=11M76ToBu5flOVFFZ0SisDyVV6LyL6Mqa");
    private static ImageView stoneTexture2 = convertImageView("https://drive.google.com/uc?id=1x7Uo3o4bPEGgbSsT7h8-yxoFEWypFusd");
    private static ImageView stoneTexture3 = convertImageView("https://drive.google.com/uc?id=12KdsuEGNPtjMyD25iDUjNdloCcxNatLJ");
    private static ImageView stoneTexture4 = convertImageView("https://drive.google.com/uc?id=1DJbhQwFR6bxv3fBlOdJZ6vhudywLVRsN");
    private static ImageView horseMotion = convertImageView("https://drive.google.com/uc?id=1rLJQzi0A_knah0Yy-3Q6nsljegCvttS4");
    private static ImageView right = convertImageView("https://drive.google.com/uc?id=1rrp4iSVY4pWjNYWt0szHeHkK0tZzPPua");
    private static ImageView left = convertImageView("https://drive.google.com/uc?id=17dxQcBDdTLHPRyxvov2dVMTdYdvpPufs");
    private static ImageView front = convertImageView("https://drive.google.com/uc?id=1o6miKtypkfgdzFXDP_5XiW8i4fAztC0F");
    private static ImageView back = convertImageView("https://drive.google.com/uc?id=1nZ_g6DPs2rTBSO-W9lpFB6lTy_FY5YAt");
    private static ImageView healthBar = convertImageView("https://drive.google.com/uc?id=1VJcORulJUzwbYQhx1mLF2YDSMQWQtrul");
    private static ImageView cloudGif = convertImageView("https://drive.google.com/uc?id=1pNUMpqVdCc_VSNXnvb8XVGuQ3l8O7ae6");
    private static ImageView dogFight = convertImageView("https://drive.google.com/uc?id=1wr04-MJYMznWEF1f_fNnUnOuAYPHAdai");
    private static ImageView cloudPlatform = convertImageView("https://drive.google.com/uc?id=1NzP22nUt1tnzD53YWMB5s3YF0ME52twa");
    private static ImageView cloud = convertImageView("https://drive.google.com/uc?id=1umvZ2MXoS68aDCI-X7limzXOpptpr-iY");
    private static ImageView grayGradient = convertImageView("https://drive.google.com/uc?id=1VXAGr9ii6XY0TmpRL4t9OiQEfEgo6XJ3");
    private static ImageView images1 = convertImageView("https://drive.google.com/uc?id=1R8joSMc7DYA-nyFsTnBwzVM89CD-HrSl");
    private static ImageView images2 = convertImageView("https://drive.google.com/uc?id=1Lu-Ef_fd7pBo1pzdv2yMTSKt3DP_bfWl");
    private static ImageView ladder2 = convertImageView("https://drive.google.com/uc?id=13VAggdc3mImT5tHxLV6GIGpv4ZyIVqWz");
    private static ImageView deathScreen = convertImageView("https://drive.google.com/uc?id=1i8F4jEB5aOMUKp0CbBT_fqHGVguFVRSE");
    private static ImageView block = convertImageView("https://drive.google.com/uc?id=1HTRoh_DYxFBaJkusR_IH7j8R9Rm9cYVT");
    private static ImageView chargingStation= convertImageView("https://drive.google.com/uc?id=1KlnIgG-TAukFuvAqCdacJtceDkTnPJcn");
    private static ImageView cloudBg = convertImageView("https://drive.google.com/uc?id=15JzqvXSeXP0fjDEBnBdD_AShLi2lsf7m");
    private static ImageView devilSS = convertImageView("https://drive.google.com/uc?id=15Mcs2eHUnU9mr9UQ96tIlxE7llicgWyz");
    private static ImageView gvzpano = convertImageView("https://drive.google.com/uc?id=19bilBuKUSh6yBGtIMVVlJRfcg4OCe9P8");
    private static ImageView healthBar2 = convertImageView("https://drive.google.com/uc?id=1-RLNo10mVjK4wDlh-NEWswl7KbLYea3I");
    private static ImageView riddleScreen = convertImageView("https://drive.google.com/uc?id=1DLrSJDaO8_uisCkgbts1bkWYQ-QLvXsZ");
    private static ImageView startScreen = convertImageView("https://drive.google.com/uc?id=15p6RY6aOJN47GeXAfZqG7BBUP1V4F23Y");
    private static ImageView mainSS = convertImageView("https://drive.google.com/uc?id=1s6AItxVRmCXVuDRp8KhrsOFHpsKGa46M");
    
    /**
     * creates and returns an ImageView of image with String link
     * 
     * @param         link          String url of image to make into ImageView
     *
     * @return        ImageView of image with String link
     */
    public static ImageView convertImageView(String link)
    {
        Image image = new Image(link);
        return new ImageView(image);
    }
    
    /**
     * returns running man sprite sheet ImageView
     * 
     * @return    ImageView of running man sprite sheet
     */
    public static ImageView getMan(){ return man; }
    /**
     * returns background ImageView
     * 
     * @return    ImageView of background
     */
    public static ImageView getBackgroundGradient(){ return backgroundGradient; }
    /**
     * returns stoneTexture1 ImageView
     * 
     * @return     ImageView of stoneTexture1
     */
    public static ImageView getStoneTexture1(){ return stoneTexture1; }
    /**
     * returns stoneTexture2 ImageView
     * 
     * @return     ImageView of stoneTexture2
     */
    public static ImageView getStoneTexture2(){ return stoneTexture2; }
    /**
     * returns stoneTexture3 ImageView
     * 
     * @return     ImageView of stoneTexture3
     */
    public static ImageView getStoneTexture3(){ return stoneTexture3; }
    /**
     * returns stoneTexture4 ImageView
     * 
     * @return     ImageView of stoneTexture4
     */
    public static ImageView getStoneTexture4(){ return stoneTexture4; }
    /**
     * returns horse running sprite sheet ImageView
     * 
     * @return     ImageView of horse running sprite sheet
     */
    public static ImageView getHorseMotion(){ return horseMotion; }
    /**
     * returns ImageView of a character facing right
     * 
     * @return   ImageView of a character facing right
     */
    public static ImageView getRight(){ return right; }
    /**
     * returns ImageView of a character facing left
     * 
     * @return   ImageView of a character facing left
     */
    public static ImageView getLeft(){ return left; }
    /**
     * returns ImageView of a character facing forward
     * 
     * @return   ImageView of a character facing forward
     */
    public static ImageView getFront(){ return front; }
    /**
     * returns ImageView of a character's back
     * 
     * @return   ImageView of a character's back
     */
    public static ImageView getBack(){ return back; }
    /**
     * returns ImageView of a health bar
     * 
     * @return   ImageView of a health bar
     */
    public static ImageView getHealthBar(){ return healthBar; }
    /**
     * returns ImageView of a cloud crying gif
     * 
     * @return   ImageView of a cloud crying gif
     */
    public static ImageView getCloudGif(){ return cloudGif; }
    /**
     * returns ImageView of a dog fight sprite sheet
     * 
     * @return   ImageView of a dog fight sprite sheet
     */
    public static ImageView getDogFight(){ return dogFight; }
    /**
     * returns ImageView of cloud platform image
     * 
     * @return   ImageView of cloud platform 
     */
        public static ImageView getCloudPlatform(){ return cloudPlatform; }
    /**
     * returns ImageView of a cloud
     * 
     * @return   ImageView of a cloud
     */
    public static ImageView getCloud(){ return cloud; }
    /**
     * returns ImageView of a gray fading background
     * 
     * @return   ImageView of a gray fading background
     */
    public static ImageView getGrayGradient(){ return grayGradient; }
    /**
     * returns ImageView of a type of block
     * 
     * @return   ImageView of a type of block
     */
    public static ImageView getImages1(){ return images1; }
    /**
     * returns ImageView of a two types of blocks
     * 
     * @return   ImageView of a two types of blocks
     */
    public static ImageView getImages2(){ return images2; }
    /**
     * returns ImageView of a ladder
     * 
     * @return   ImageView of a ladder
     */
    public static ImageView getLadder(){ return ladder2; }
    /**
     * returns ImageView of background when player dies
     * 
     * @return   ImageView of background when player dies
     */
    public static ImageView getDeathScreen(){ return deathScreen; }
    /**
     * returns ImageView of a block
     * 
     * @return   ImageView of a block
     */
    public static ImageView getBlock(){ return block; }
    /**
     * returns ImageView of a chargingStation character
     * 
     * @return   ImageView of a charging Station character
     */
    public static ImageView getChargingStation(){ return chargingStation; }
    /**
     * returns ImageView of a big cloud
     * 
     * @return   ImageView of a big cloud
     */
    public static ImageView getCloudBg(){ return cloudBg; }
    /**
     * returns ImageView of a devil sprite sheet
     * 
     * @return   ImageView of a devil sprite sheet
     */
    public static ImageView getDevilSS(){ return devilSS; }
    /**
     * returns ImageView of a version of background gradient
     * @return   ImageView of a version of background gradient
     */
    public static ImageView getGvzpano(){ return gvzpano; }
    /**
     * returns ImageView of health bar 2
     * 
     * @return ImageView of health bar2
     */
    public static ImageView getHealthBar2(){ return healthBar2; }
    /**
     * returns ImageView of background when asked a riddle
     * 
     * @return   ImageView of a background when asked a riddle
     */
    public static ImageView getRiddleScreen(){ return riddleScreen; }
    /**
     * returns ImageView of a background of home page
     * 
     * @return   ImageView of a background of home page
     */
    public static ImageView getStartScreen(){ return startScreen; }
    /**
     * returns ImageView of a main character sprite sheet
     * 
     * @return   ImageView of a main character sprite sheet
     */
    public static ImageView getMainSS(){ return mainSS; }
}

