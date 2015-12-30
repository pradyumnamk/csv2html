public class CSV2HTML
{
	
	private String csvData;
	
	public CSV2HTML()
	{
		System.out.println("CSV2HTML instantiated!!!");
		csvData = "This is an empty CSV2HTML object";
	}
	
	public CSV2HTML(String csvData)
	{
		this.csvData = csvData;
	}
	
	public String toString()
	{
		return csvData; 
	}
}