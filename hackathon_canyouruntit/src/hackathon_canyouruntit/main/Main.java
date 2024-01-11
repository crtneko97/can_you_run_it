package hackathon_canyouruntit.main;
import java.io.IOException;

import hackathon_canyouruntit.main.data.CPU;
import hackathon_canyouruntit.main.data.Computer;
import hackathon_canyouruntit.main.data.Disk;
import hackathon_canyouruntit.main.data.RAM;

public class Main {

	public static void main(String[] args) throws Exception {

		  try {
	            // Get CPU information
	            CPU cpu = CPU.getRAMinfo();

	            // Get RAM information
	            RAM ram = RAM.getRAMinfo();

	            // Get Disk information
	            Disk disk = Disk.getDiskInfo();

	            // Create an instance of Computer
	            Computer myComputer = new Computer(disk, cpu, ram);

	            // Access and print information
	            System.out.println("CPU Frequency: " + myComputer.getCpu().getFrequency() + " GHz, Cores: " + myComputer.getCpu().getCores());
	            System.out.println("RAM Memory: " + myComputer.getRam().getMemory() + " GB");
	            System.out.println("Disk Free Space: " + myComputer.getDisk().getFree() + " GB, Used Space: " + myComputer.getDisk().getUsed() + " GB, Total Space: " + myComputer.getDisk().getTotal()+ " GB");


	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
		

		}

}


/*
 * 
*/
