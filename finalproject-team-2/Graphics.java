
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
    private ImageView man;
    private ImageView backgroundGradient; 
    private ImageView stoneTexture1;
    private ImageView stoneTexture2;
    private ImageView stoneTexture3;
    private ImageView stoneTexture4;
    private ImageView horseMotion;
    private ImageView right;
    private ImageView left;
    private ImageView front;
    private ImageView back;
    private ImageView healthBar;
    private ImageView cloudGif;
    private ImageView dogFight;
    private ImageView cloudPlatform;
    private ImageView cloud;
    private ImageView grayGradient;
    private ImageView images1;
    private ImageView images2;
    private ImageView ladder2;
    /**
     * default constructor that instantiates all the ImageView objects
     */
    public Graphics()
    {
        man = convertImageView("https://drive.google.com/uc?id=1myW3UWhQDgABQOIDNStdpgK0o6HbH0pE");
        backgroundGradient = convertImageView("https://drive.google.com/uc?id=1EPXIFlbfh8mxET0PtYNq6dWdOKssyW7R");
        stoneTexture1 = convertImageView("https://drive.google.com/uc?id=11M76ToBu5flOVFFZ0SisDyVV6LyL6Mqa");
        stoneTexture2 = convertImageView("https://drive.google.com/uc?id=1x7Uo3o4bPEGgbSsT7h8-yxoFEWypFusd");
        stoneTexture3 = convertImageView("https://drive.google.com/uc?id=12KdsuEGNPtjMyD25iDUjNdloCcxNatLJ");
        stoneTexture4 = convertImageView("https://drive.google.com/uc?id=1DJbhQwFR6bxv3fBlOdJZ6vhudywLVRsN");
        horseMotion = convertImageView("https://drive.google.com/uc?id=1rLJQzi0A_knah0Yy-3Q6nsljegCvttS4");
        right = convertImageView("https://drive.google.com/uc?id=1rrp4iSVY4pWjNYWt0szHeHkK0tZzPPua");
        left = convertImageView("https://drive.google.com/uc?id=17dxQcBDdTLHPRyxvov2dVMTdYdvpPufs");
        front = convertImageView("https://drive.google.com/uc?id=1o6miKtypkfgdzFXDP_5XiW8i4fAztC0F");
        back = convertImageView("https://drive.google.com/uc?id=1nZ_g6DPs2rTBSO-W9lpFB6lTy_FY5YAt");
        healthBar = convertImageView("https://drive.google.com/uc?id=1VJcORulJUzwbYQhx1mLF2YDSMQWQtrul");
        cloudGif = convertImageView("https://drive.google.com/uc?id=1pNUMpqVdCc_VSNXnvb8XVGuQ3l8O7ae6");
        dogFight = convertImageView("https://drive.google.com/uc?id=1wr04-MJYMznWEF1f_fNnUnOuAYPHAdai");
        cloudPlatform = convertImageView("https://drive.google.com/uc?id=1NzP22nUt1tnzD53YWMB5s3YF0ME52twa");
        cloud = convertImageView("https://drive.google.com/uc?id=1umvZ2MXoS68aDCI-X7limzXOpptpr-iY");
        grayGradient = convertImageView("https://drive.google.com/uc?id=1VXAGr9ii6XY0TmpRL4t9OiQEfEgo6XJ3");
        images1 = convertImageView("https://drive.google.com/uc?id=1R8joSMc7DYA-nyFsTnBwzVM89CD-HrSl");
        images2 = convertImageView("https://drive.google.com/uc?id=1Lu-Ef_fd7pBo1pzdv2yMTSKt3DP_bfWl");
        ladder2 = convertImageView("https://drive.google.com/uc?id=13VAggdc3mImT5tHxLV6GIGpv4ZyIVqWz");
    }

    private ImageView convertImageView(String link)
    {
        Image image = new Image(link);
        return new ImageView(image);
    }
    
    public ImageView getMan(){ return man; }
    public ImageView getBackgroundGradient(){ return backgroundGradient; }
    public ImageView getStoneTexture1(){ return stoneTexture1; }
    public ImageView getStoneTexture2(){ return stoneTexture2; }
    public ImageView getStoneTexture3(){ return stoneTexture3; }
    public ImageView getStoneTexture4(){ return stoneTexture4; }
    public ImageView getHorseMotion(){ return horseMotion; }
    public ImageView getRight(){ return right; }
    public ImageView getLeft(){ return left; }
    public ImageView getFront(){ return front; }
    public ImageView getBack(){ return back; }
    public ImageView getHealthBar(){ return healthBar; }
    public ImageView getCloudGif(){ return cloudGif; }
    public ImageView getDogFight(){ return dogFight; }
    public ImageView getCloudPlatform(){ return cloudPlatform; }
    public ImageView getCloud(){ return cloud; }
    public ImageView getGrayGradient(){ return grayGradient; }
    public ImageView getImages1(){ return images1; }
    public ImageView getImages2(){ return images2; }
    public ImageView getLadder(){ return ladder2; }
}
