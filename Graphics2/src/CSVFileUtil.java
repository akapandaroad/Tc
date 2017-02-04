import java.io.*;
import java.util.*;
public class CSVFileUtil {
	public static String line;
	public static String Date;
	public static String Open;
	public static String High;
	public static String Low;
	public static String Close;
	public static String Volume;
	public static String Adj;
	public static int counter;
public static void main(String[] args) throws IOException {
LinkedList<Date> list=new LinkedList<Date>();

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
   list.add(new Date(Date, Open, High, Low, Close, Volume, Adj));
   
   counter++;

   
   //System.out.print(Date + "\t" + Open + "\t" + High + "\t"+ Low + "\t" + Close + "\t"+ Volume + "\t"+ Adj + "\n"); 
  }
	System.out.println(counter);
	//System.out.print(list);
	Object[] obj=list.toArray();
	String[] str=new String[obj.length];
	for(int i=0;i<obj.length;i++){
		str[i]=obj[i].toString();
		
	}
	System.out.println(str[1]);
	System.out.print(str[2]);
 }
}