import java.io.*;
import java.util.*;
public class CSVFileUtil {
	public static String line;
	public static String[] a=new String[100000];
	public static String Date;
	public static String Open;
	public static String High;
	public static String Low;
	public static String Close;
	public static String Volume;
	public static String Adj;
	public static int counter=0;
public static void main(String[] args) throws IOException {
LinkedList<DataManager> list=new LinkedList<DataManager>();

BufferedReader br = new BufferedReader(
   new InputStreamReader(
    new FileInputStream("Sample data.xlsx")
   )
);


while ( (line = br.readLine()) != null ) {
   //System.out.println(line); 
    String[] info = line.split(",");
   Date = info[0].trim();
   Open= info[1].trim();
   High= info[2].trim();
   Low= info[3].trim();
   Close= info[4].trim();
   Volume= info[5].trim();
   Adj= info[6].trim();
   counter++;
   DataManager dm=new DataManager( Date, Open, High, Low, Close, Volume, Adj);
   list.add(dm);
   System.out.println(dm.getHigh());
//  // double b=Double.parseDouble(a);
double d=Double.valueOf(High);
 // System.out.print(High);
   a[counter]=High;
 }
for(int i=1;i<counter;i++){
	System.out.println(a[i]);
	
}

//double d=Double.parseDouble(a[1]);
//System.out.println(d);

}
}