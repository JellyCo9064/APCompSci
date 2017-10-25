/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void keepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  Pixel[][] pixels = beach.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel obj : row)
		  {
			  obj.setRed(0);
			  obj.setGreen(0);
		  }
	  }
	  beach.explore();
  }
  
  public static void negate()
  {
	  Picture beach = new Picture("beach.jpg");
	  Pixel[][] pixels = beach.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel obj : row)
		  {
			  obj.setRed(255 - obj.getRed());
			  obj.setGreen(255 - obj.getGreen());
			  obj.setBlue(255 - obj.getBlue());
		  }
	  }
	  beach.explore();
  }
  public static void grayscale()
  {
	  Picture beach = new Picture("beach.jpg");
	  Pixel[][] pixels = beach.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel obj : row)
		  {
			  int avg = (obj.getRed() + obj.getGreen() + obj.getBlue()) / 3;
			  obj.setRed(avg);
			  obj.setGreen(avg);
			  obj.setBlue(avg);
		  }
	  }
	  beach.explore();
  }
  
  public static void fixUnderwater()
  {
	  Picture water = new Picture("water.jpg");
	  Pixel[][] pixels = water.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel obj : row)
		  {
			  int newBlue = obj.getBlue();
			  if (newBlue + 35 < 255)
			  {
				  newBlue += 35;
			  }
			  else
			  {
				  newBlue = 255;
			  }
			  obj.setBlue(newBlue);
		  }
	  }
	  water.explore();
  }
  public static void mirrorVerticalRightToLeft()
  {
	  Picture beach = new Picture("beach.jpg");
	  Pixel[][] pixels = beach.getPixels2D();
	  Pixel left = null;
	  Pixel right = null;
	  int width = pixels[0].length;
	  for(int row = 0; row < pixels.length; row++)
	  {
		  for(int col = 0; col < width / 2; col++)
		  {
			  left = pixels[row][col];
			  right = pixels[row][width - 1 - col];
			  left.setColor(right.getColor());
			  
		  }
	  }
	  beach.explore();
  }
  public static void mirrorHorizontal()
  {
	  Picture beach = new Picture("beach.jpg");
	  Pixel[][] pixels = beach.getPixels2D();
	  Pixel top = null;
	  Pixel bottom = null;
	  int height = pixels.length;
	  for(int row = 0; row < height / 2; row++)
	  {
		  for(int col = 0; col < pixels[0].length; col++)
		  {
			  top = pixels[row][col];
			  bottom = pixels[height - 1 - row][col];
			  bottom.setColor(top.getColor());
		  }
	  }
	  beach.explore();
  }
  public static void mirrorHorizontalBotToTop()
  {
	  Picture beach = new Picture("beach.jpg");
	  Pixel[][] pixels = beach.getPixels2D();
	  Pixel top = null;
	  Pixel bot = null;
	  int height = pixels.length;
	  for(int row = 0; row < height / 2; row++)
	  {
		  for(int col = 0; col < pixels[0].length; col++)
		  {
			  top = pixels[row][col];
			  bot = pixels[height - 1 - row][col];
			  top.setColor(bot.getColor());
		  }
	  }
	  beach.explore();
  }
  public static void mirrorDiagonal()
  {
	  Picture beach = new Picture("beach.jpg");
	  Pixel[][] pixels = beach.getPixels2D();
	  Pixel source = null;
	  Pixel dest = null;
	  int lesser = Math.min(pixels[0].length, pixels.length);
	  for(int row = 0; row < lesser; row++)
	  {
		  for(int col = row + 1; col < lesser; col++)
		  {
			  dest = pixels[row][col];
			  source = pixels[col][row];
			  dest.setColor(source.getColor());
		  }
	  }
	  beach.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  mirrorDiagonal();
	  //mirrorHorizontalBotToTop();
	  //mirrorHorizontal();
	  //mirrorVerticalRightToLeft();
	  //fixUnderwater();
	  //grayscale();
	  //negate();
	  //keepOnlyBlue();
    //testZeroBlue();
//testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}