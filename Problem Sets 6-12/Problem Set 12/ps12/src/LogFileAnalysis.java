import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class LogFileAnalysis 
{
	private static int most_common_ip_address_value = 0;
	private static int second_most_common_value = 0;
	private static int third_most_common_value = 0;
	private static String third_ipaddress;
	private static String second_ipaddress;
	private static String common_ipaddress;
	private static int unique_counter = 0;
	
	public static void main(String[] args) throws FileNotFoundException
	{
		HashMap<String, Integer> ip_count = new HashMap<String, Integer>();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a log file to be analyzed");
		String filename = in.next();
		
		File file = new File(filename);
		
		//try to open the file (if failure, go below)
		Scanner log = new Scanner(file);
		
		//while there's more stuff to read
		while (log.hasNext())
		{
			String line = log.nextLine();	
			int begin = line.indexOf("[client ") + 8;	
			int end = line.indexOf("]", begin);
			//System.out.println("being: " + begin + " end: " + end + " line #: " + line);
			String ip_address = line.substring(begin, end);
			//System.out.println("result: " + ip_address);
			
			if(ip_count.containsKey(ip_address))
			{
				int temp = ip_count.get(ip_address) + 1;
				ip_count.put(ip_address, temp);
			}
			else
			{
				ip_count.put(ip_address, 1);
			}
		}
		
		Set<String> ipaddresses = ip_count.keySet();
		
		for(String ipaddress : ipaddresses)
		{
			if(most_common_ip_address_value < ip_count.get(ipaddress))
			{
				third_most_common_value = second_most_common_value;
				
				//second most common value gets the old most common value
				second_most_common_value = most_common_ip_address_value;
				
				//the most common value gets the updated most frequent ip_address occurrences
				most_common_ip_address_value = ip_count.get(ipaddress);
				
				third_ipaddress = second_ipaddress;
				second_ipaddress = common_ipaddress;
				
				//most common ip_address gets updated ip_address hits
				common_ipaddress = ipaddress;	
			}
			else if(second_most_common_value < ip_count.get(ipaddress))
			{
				third_most_common_value = second_most_common_value;
				
				//second most common value gets the old most common value
				second_most_common_value = ip_count.get(ipaddress);
				
				//second most ip_address gets old ip_address
				third_ipaddress = second_ipaddress;
				
				second_ipaddress = ipaddress;
			}
			else if(third_most_common_value < ip_count.get(ipaddress))
			{
				third_most_common_value = ip_count.get(ipaddress);
				third_ipaddress = ipaddress;
			}
			
			unique_counter++;
		}
		
		System.out.println("Found " + unique_counter + " unique IP addresses.");
		System.out.println("The most suspicious are: ");
		System.out.println(common_ipaddress + " (" + most_common_ip_address_value + " erroneous accesses)" );
		System.out.println(second_ipaddress + " (" + second_most_common_value + " erroneous accesses)" );
		System.out.println(third_ipaddress + " (" + third_most_common_value + " erroneous accesses)" );
		
		//close the file because, you know, we're responsible programmers
		log.close();
	}
}
