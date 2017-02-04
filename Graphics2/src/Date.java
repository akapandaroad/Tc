
public class Date {
	

	public Date() {
		
		
	}

	@Override
	public String toString() {
	
		
	return Date+"\n"+Open+"\n"+High+"\n"+Low+"\n"+Close+"\n"+Volume+"\n"+Adj+"\n";
	}

	public  String Date;
	public  String Open;
	public  String High;
	public  String Low;
	public  String Close;
	public  String Volume;
	public  String Adj;
	
	public Date(String Date,String Open,String High,String Low, String Close, String Volume, String Adj){
		this.Date=Date;
		this.Open=Open;
		this.High=High;
		this.Low=Low;
		this.Close=Close;
		this.Volume=Volume;
		this.Adj=Adj;
		
	}
	
	
	

}
