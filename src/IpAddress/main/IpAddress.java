package IpAddress.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IpAddress {
	public static void main(String[] args) {
		
		File file = new File("./resource/ipaddress.txt");
		int aCount = 0,bCount=0,cCount=0,dCount=0,eCount=0;
		
		try (InputStream in = new FileInputStream(file)) {
			
			BufferedReader br =new BufferedReader(new InputStreamReader(in));
			String temp = br.readLine();
			String[] inputArray = null;

			while(temp !=null) {
				inputArray = temp.split("\\.",-1);
				
		        temp = br.readLine();
		        if (temp.equalsIgnoreCase("END")) {
		        	break;
		        }
		        
		        int ip=Integer.parseInt(inputArray[0],2);
		        
		        if (ip>=0 && ip<=127) {
		        	aCount++;
		        }else if(ip>=128 && ip<=191) {
		        	bCount++;
		        }else if(ip>=192 && ip<=223) {
		        	cCount++;
		        }else if(ip>=224 && ip<=239) {
		        	dCount++;
		        }else if(ip>=240 && ip<=255) {
		        	eCount++;
		        }
			}
			
			System.out.println("A="+aCount);
			System.out.println("B="+bCount);
			System.out.println("C="+cCount);
			System.out.println("D="+dCount);
			System.out.println("E="+eCount);
		
			

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
