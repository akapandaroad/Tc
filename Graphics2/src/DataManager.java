
public class DataManager {
	


	public  String Date;
	public String Open;
	public  String High;
	public  String Low;
	public  String Close;
	public  String Volume;
	public  String Adj;
	
	
	public DataManager( String date, String open, String high,
			String low, String close, String volume, String adj) {
		
		Date = date;
		Open = open;
		High = high;
		Low = low;
		Close = close;
		Volume = volume;
		Adj = adj;
		
	}
	
	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getOpen() {
		return Open;
	}

	public void setOpen(String open) {
		Open = open;
	}

	public String getHigh() {
		return High;
	}

	public void setHigh(String high) {
		High = high;
	}

	public String getLow() {
		return Low;
	}

	public void setLow(String low) {
		Low = low;
	}

	public String getClose() {
		return Close;
	}

	public void setClose(String close) {
		Close = close;
	}

	public String getVolume() {
		return Volume;
	}

	public void setVolume(String volume) {
		Volume = volume;
	}

	public String getAdj() {
		return Adj;
	}

	public void setAdj(String adj) {
		Adj = adj;
	}
}
