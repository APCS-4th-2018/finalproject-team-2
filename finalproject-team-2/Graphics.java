
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * Write a description of class Graphics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Graphics
{
    private static ImageView man = convertImageView("https://drive.google.com/uc?id=1myW3UWhQDgABQOIDNStdpgK0o6HbH0pE");
    private static ImageView backgroundGradient = convertImageView("https://drive.google.com/uc?id=1EPXIFlbfh8mxET0PtYNq6dWdOKssyW7R"); 
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

    private static ImageView convertImageView(String link)
    {
        Image image = new Image(link);
        return new ImageView(image);
    }
    
    public static ImageView getMan(){ return man; }
    public static ImageView getBackgroundGradient(){ return backgroundGradient; }
    public static ImageView getStoneTexture1(){ return stoneTexture1; }
    public static ImageView getStoneTexture2(){ return stoneTexture2; }
    public static ImageView getStoneTexture3(){ return stoneTexture3; }
    public static ImageView getStoneTexture4(){ return stoneTexture4; }
    public static ImageView getHorseMotion(){ return horseMotion; }
    public static ImageView getRight(){ return right; }
    public static ImageView getLeft(){ return left; }
    public static ImageView getFront(){ return front; }
    public static ImageView getBack(){ return back; }
    public static ImageView getHealthBar(){ return healthBar; }
    public static ImageView getCloudGif(){ return cloudGif; }
    public static ImageView getDogFight(){ return dogFight; }
    public static ImageView getCloudPlatform(){ return cloudPlatform; }
    public static ImageView getCloud(){ return cloud; }
    public static ImageView getGrayGradient(){ return grayGradient; }
    public static ImageView getImages1(){ return images1; }
    public static ImageView getImages2(){ return images2; }
    public static ImageView getLadder(){ return ladder2; }
}
