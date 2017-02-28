import java.io.*;
import java.util.*;
public class CSVFileUtil {
	public static String line;
	public static String Date;
	public static String Open;
	public static String High;
	static String high[]=null;
	public static String Low;
	public static String Close;
	public static String Volume;
	public static String Adj;
	public static int counter=0;
public static void main(String[] args) throws IOException {
LinkedList<String> list=new LinkedList<String>();

BufferedReader br = new BufferedReader(
   new InputStreamReader(
    new FileInputStream("Sample data.xlsx")
   )
);


while ( (line = br.readLine()) != null ) {
   //System.out.println(line); 
    String[] info = line.split(",");
    String sre="123";
   Date = info[0].trim();
   Open= info[1].trim();
   High= info[2].trim();
   Low= info[3].trim();
   Close= info[4].trim();
   Volume= info[5].trim();
   Adj= info[6].trim();
   counter++;
   //list.add(High);
   high[counter]=High.toString();
   
	
	}

for(int i=0;i<counter;i++){
	System.out.println(high[i]);
}
Object[] obj=list.toArray();
String[] str=new String[obj.length];
for(int i=0;i<obj.length;i++){
	str[i]=obj[i].toString();	
	//for(int i=0;i<obj.length;i++){
	System.out.println(Float.parseFloat(str[counter-1]));
	//}
 }
}
}