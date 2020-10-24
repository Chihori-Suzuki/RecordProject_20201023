import java.util.Scanner;

public class Driver {
	//method to print just one object which pass as an argument
	
	public static void printRecord(Record tempRecord) {
		System.out.println("Record Id : " + tempRecord.getId() +
							"\nRecord Title : " + tempRecord.getRecordTitle() + 
							"\nRecord Singer Name : " + tempRecord.getSingerName() +
							"\nRecord Length : " + tempRecord.getRecordLength() + 
							"\nRecord Ranking : " + tempRecord.getRecordRanking()  
							);
	}
	//method to iterate through the array and find the index of record for the title
	/*
	 * @return the index of record if we don`t have it --> return -1
	 */
	public static int findIndexOfRecord(String title, Record[] array) {
		for(int i = 0; i < array.length; i++) {
			if (title.compareToIgnoreCase(array[i].getRecordTitle()) == 0) return i;
		}
		return -1;
	}

	public static double averageOfLength;
	public static double averageOfRanking;
	
	/**
	 * 
	 * @param array Record[]
	 * @return average of lengthRecord
	 */
	public static double getAverageOfLength (Record[] array) {
		double ave = 0;
		for(int i = 0; i < array.length; i++) {
			ave = ave + array[i].getRecordLength();
		}
		averageOfLength = (Math.round(ave / array.length * 100)) / 100.00;
		return averageOfLength;
	}
	
	/**
	 * 
	 * @param array Record[]
	 * @return return average of ranking
	 */
	public static double getAverageOfRanking (Record[] array) {
		double ave = 0;
		for(int i = 0; i < array.length; i++) {
			ave = ave + array[i].getRecordRanking();
		}
		averageOfRanking = (Math.round(ave / array.length * 100)) / 100.00;
		return averageOfRanking;
	}

	public static void main(String[] args) {
		// at least create 7 objects
		//create array and add these objects to array 
		Record[] record	= new Record[7];
		record[0] = new Record("Gangnam Style", "PSY", 120.0, 6);
		record[1] = new Record("Dynamite", "BTS", 240.0, 3);
		record[2] = new Record("TT", "Twice", 300.0, 5);
		record[3] = new Record("Red", "Taylor Swift", 100.0, 7);
		record[4] = new Record("Marry You", "Bruno", 30.0, 2);
		record[5] = new Record("Drunk", "Edo Sheeran", 150.0, 1);
		record[6] = new Record("Witness", "Katy Perry", 900.0, 4);
		
		//Ask the user to enter the title of record
		System.out.print("please enter the title of record : ");
		//read the input of song title
		Scanner input = new Scanner(System.in);
		String title = input.nextLine();
		
		//findRecord 
		int index = findIndexOfRecord(title, record);
		
		if(index == -1) { // if song name doesn't exist in the record.
			System.out.println("This is out of record."); 
		} else { 
			printRecord(record[index]);; //print target record
		}

		System.out.print("the average of length is : ");
		System.out.println(getAverageOfLength(record));

		System.out.print("the average of ranking is : ");
		System.out.println(getAverageOfRanking(record));
		input.close();
	}

}
