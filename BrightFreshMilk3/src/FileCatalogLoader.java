import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.zip.DataFormatException;
import java.math.BigDecimal;

/**
 * 
 */

/**
 * @author
 *
 */
public class FileCatalogLoader implements CatalogLoader {

	private static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter stdOut = new PrintWriter(System.out, true);
	private static PrintWriter stdErr = new PrintWriter(System.err, true);

	public Catalog loadCatalog(String filename) throws FileNotFoundException, IOException, DataFormatException, ParseException {
		try{ 
	            BufferedReader bufReader = new BufferedReader(new FileReader(filename));
	            Catalog catalog=new Catalog();
	            List<Product> productList = new ArrayList<Product>();
	            String line = null;  
	            while((line = bufReader.readLine()) != null){   
	                String array[] = line.split("_");
	                if(array[1].contains("A")){
	                	productList.add(readPureMilk(line));
	                }
	                else if(array[1].contains("B")){
	                	productList.add(readJelly(line));
	                }
	                else if(array[1].contains("C")){
	                	productList.add(readYogurt(line));
	                }
	                else if(array[1].contains("D")){
	                	productList.add(readMilkDrink(line));
	                }
	            }  
	            bufReader.close();  
	            catalog.setProductList(productList);
	    		return (Catalog) catalog;
		}catch(Exception e){
			e.printStackTrace(); 
			stdErr.println("wrong");
			return null;
		}
	}

	private PureMilk readPureMilk(String line) throws DataFormatException, ParseException, IOException {
		do {
			final String delim = "_";
//			System.out.println(
//					"please input PureMilk_Code_Description_Price_ProductionDate_ShelfLife_CountryOfOrigin_Butterfat_Protein");
//			String input = stdIn.readLine();
			String array[] = line.split("_");
			StringTokenizer tokenizer = new StringTokenizer(line, delim);
			try {
				if (tokenizer.countTokens() != 9) {
					throw new DataFormatException();
				}
				BigDecimal price = new BigDecimal(array[3]);
				java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
				java.util.Date date = sdf.parse(array[4]);
				PureMilk pureMilk = new PureMilk(array[1], array[2], price, date, array[5], array[6],array[7],array[8]);
				return (PureMilk) pureMilk;
			} catch (DataFormatException e) {
				stdOut.println("请重新输入");
			}
		} while (true);

	}
	
	private Jelly readJelly(String line)throws DataFormatException, ParseException, IOException {
		do{
			final String delim = "_";
//			System.out.println(
//					"please input Jelly_Code_Description_Price_ProductionDate_ShelfLife_Type_DiluteConcentration");
//			String input = stdIn.readLine();
			String array[] = line.split("_");
			StringTokenizer tokenizer = new StringTokenizer(line, delim);
			try {
				if (tokenizer.countTokens() != 8) {
					throw new DataFormatException();
				}
				BigDecimal price = new BigDecimal(array[3]);
				java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
				java.util.Date date = sdf.parse(array[4]);
				Jelly jelly=new Jelly(array[1],array[2],price,date,array[5],array[6],array[7]);
				return (Jelly) jelly;
			} catch (DataFormatException e) {
				stdOut.println("请重新输入");
			}
		}while(true);
	}
	
	private Yogurt readYogurt(String line)throws DataFormatException, ParseException, IOException {
		do{
			final String delim = "_";
//			System.out.println(
//					"please input Yogurt_Code_Description_Price_ProductionDate_ShelfLife_Flavor");
//			String input = stdIn.readLine();
			String array[] = line.split("_");
			StringTokenizer tokenizer = new StringTokenizer(line, delim);
			try {
				if (tokenizer.countTokens() != 7) {
					throw new DataFormatException();
				}
				BigDecimal price = new BigDecimal(array[3]);
				java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
				java.util.Date date = sdf.parse(array[4]);
				Yogurt yogurt=new Yogurt(array[1],array[2],price,date,array[5],array[6]);
				return (Yogurt) yogurt;
			} catch (DataFormatException e) {
				stdOut.println("请重新输入");
			}
		}while(true);
	}
	
	private MilkDrink readMilkDrink(String line)throws DataFormatException, ParseException, IOException {
		do{
			final String delim = "_";
//			System.out.println(
//					"please input MilkDrink_Code_Description_Price_ProductionDate_ShelfLife_Flavor_Sugar");
//			String input = stdIn.readLine();
			String array[] = line.split("_");
			StringTokenizer tokenizer = new StringTokenizer(line, delim);
			try {
				if (tokenizer.countTokens() != 8) {
					throw new DataFormatException();
				}
				BigDecimal price = new BigDecimal(array[3]);
				java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
				java.util.Date date = sdf.parse(array[4]);
				MilkDrink milkDrink=new MilkDrink(array[1],array[2],price,date,array[5],array[6],array[7]);
				return (MilkDrink) milkDrink;
			} catch (DataFormatException e) {
				stdOut.println("请重新输入");
			}
		}while(true);
	}

	/**
	 * 
	 */
	public FileCatalogLoader() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
