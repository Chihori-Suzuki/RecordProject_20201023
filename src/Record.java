
public class Record {
	
	
	
	private int id = (int)(Math.random() * 1000) + 100; //id --> random number from 100 to 10000
	private String recordTitle; //recordTitle ---> Null or empty
	private String singerName;	//singerName ----> Null or empty
	private double recordLength;	//recordLength ---> more than zero
	private int recordRanking;	//recordRanking ---> more than zero less than 6
		
	//constructor
	public Record(String recordTitle, String singerName, double recordLength, int recordRanking) {
		setId();
		setRecordLength(recordLength);
		setRecordRankin(recordRanking);
		setRecordTitle(recordTitle);
		setSingerName(singerName);
	}
		
	//getter setters
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * 
	 * @param recordTitle
	 * @return
	 */
	public String getRecordTitle() {
		
		if(this.recordTitle == null || this.recordTitle == "") {
			 return "";
		} else {
			 return this.recordTitle;
		}
	}
	/**
	 * 
	 * @param recordTitle
	 * @return
	 */
	public String getSingerName() {
		if(this.singerName == null || this.singerName == "") {
			 return "";
		} else {
			 return this.singerName;
		}
	}
	/**
	 * 
	 * @param recordLength
	 * @return
	 */
	public double getRecordLength() {
		if (this.recordLength <= 0) {
			return 1;
		} else {
			return this.recordLength;
		}
	}
	/**
	 * 
	 * @param recordRanking
	 * @return
	 */
	public int getRecordRanking() {
		if (this.recordRanking <= 0) {
			return 1;
		} else if(this.recordRanking > 6) {
			return 6;
		} else {
			return this.recordRanking;
		}
	}
	
	
	/**
	 * 
	 * @param id
	 */
	public void setId() {
		this.id = (int)(Math.random() * 900) + 100;
	}
	/**
	 * 
	 * @param recordTitle
	 */
	public void setRecordTitle(String recordTitle) {
		this.recordTitle = recordTitle;
	}
	/**
	 * 
	 * @param singerName
	 */
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	/**
	 * 
	 * @param recordLength
	 */
	public void setRecordLength(double recordLength) {
		this.recordLength = recordLength;
	}
	/**
	 * 
	 * @param recordRanking
	 */
	public void setRecordRankin(int recordRanking) {
		this.recordRanking = recordRanking;
	}
	
	
}
