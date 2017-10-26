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
  
  public static void mirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  Pixel[][] pixels = snowman.getPixels2D();
	  
	  int pivot = 192;
	  Pixel top = null;
	  Pixel bot = null;
	  
	  
	  //left arm
	  //190, 169 Bottom right inclusive
	  //159, 105 Top left inclusive
	  
	  //right arm
	  //195, 293 Bottom right
	  //172, 239 top left
	  
	  //left arm mirror
	  for(int row = 159; row <= 190; row++)
	  {
		  for(int col = 105; col <= 169; col++)
		  {
			  top = pixels[row][col];
			  bot = pixels[pivot - row + pivot][col];
			  bot.setColor(top.getColor());
		  }
	  }
	  
	//right arm mirror
	  pivot = 195;
	  for(int row = 172; row <= 195; row++)
	  {
		  for(int col = 239; col <= 293; col++)
		  {
			  top = pixels[row][col];
			  bot = pixels[pivot - row + pivot][col];
			  bot.setColor(top.getColor());
		  }
	  }
	  
	  snowman.explore();
  }
  
  public static void mirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  //234, 238
	  //322, 344
	  //360
	  Pixel[][] pixels = gull.getPixels2D();
	  Pixel left = null;
	  Pixel right = null;
	  
	  int pivot = 360;
	  for(int row = 234; row <= 322; row++)
	  {
		  for(int col = 238; col <= 344; col++)
		  {
			  left = pixels[row][col];
			  right = pixels[row][pivot - col + pivot];
			  right.setColor(left.getColor());
		  }
	  }
	  
	  
	  gull.explore();
  }
  public static Picture copy(Picture toPic, Picture fromPic, int destRow, int destCol, int fromStartRow, int fromEndRow, int fromStartCol, int fromEndCol)
  {
	  Picture collage = toPic;
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = collage.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for(int fromRow = fromStartRow, toRow = destRow; 
			  (fromRow < fromEndRow && fromRow < fromPixels.length) && (toRow < toPixels.length); fromRow++, toRow++)
	  {
		  for(int fromCol = fromStartCol, toCol = destCol; 
				  fromCol < fromEndCol && fromCol < fromPixels.length && toCol < toPixels.length; fromCol++, toCol++)
		  {
			  fromPixel = fromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
		  }
	  }
	  return collage;
  }
  
  public static void myCollage()
  {
	  Picture collage = new Picture("640x480.jpg");
	  Picture flower1 = new Picture("flower1.jpg");
	  Pixel[][] fl1Pixels = flower1.getPixels2D();
	  int fl1NumRows = fl1Pixels.length;
	  int fl1NumCols = fl1Pixels[0].length;
	  collage = copy(collage, flower1, 10, 10, 0, fl1NumRows, 0, fl1NumCols);
	  
	  Picture flower2 = new Picture("flower2.jpg");
	  Pixel[][] fl2Pixels = flower2.getPixels2D();
	  int fl2NumRows = fl2Pixels.length;
	  int fl2NumCols = fl2Pixels[0].length;
	  collage = copy(collage, flower2, 30, 10, 0, fl2NumRows, 0, fl2NumCols);
	  
	  Picture arch = new Picture("arch.jpg");
	  Pixel[][] archPixels = arch.getPixels2D();
	  int archNumRows = archPixels.length;
	  int archNumCols = archPixels[0].length;
	  collage = copy(collage, arch, 50, 50, 0, archNumRows, 0, archNumCols);
	  
	  collage.mirrorVertical();
	  
	  collage.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  myCollage();
	  //copy(new Picture ("640x480.jpg"), new Picture("flower1.jpg"), 50, 75, 25, 50, 30, 75);
	  //mirrorGull();
	  //mirrorArms();
	  //mirrorDiagonal();
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