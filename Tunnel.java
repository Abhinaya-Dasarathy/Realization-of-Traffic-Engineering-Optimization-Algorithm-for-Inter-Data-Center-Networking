

import java.util.ArrayList;
import java.util.Scanner;

public class Tunnel 
{

    public static void main(String[] args) 
    {
    	int size = 37;
    	ArrayList<Double> fairsharelist = new ArrayList<Double>();
    	int numberOfFgs = 2; //Number of flow groups
    	fg[] fg = new fg[numberOfFgs];
    	GraphGeneration graph = new GraphGeneration();
        System.out.println("Topology : Select the number 1.FatTree 2.DCell ");
        Scanner sc = new Scanner(System.in);
        String top = sc.nextLine();
      switch(top){
		case "1":{


//--------------------Fat Tree-----------------------------------------------------    	
       graph.addBiDirectedEdge("1","17", "5", "1");
        graph.addBiDirectedEdge("2", "17", "5", "1");
        graph.addBiDirectedEdge("3", "18", "5", "1");
        graph.addBiDirectedEdge("4", "18", "5", "1");
        graph.addBiDirectedEdge("5", "19", "5", "1");    
        graph.addBiDirectedEdge("6", "19", "5", "1");
        graph.addBiDirectedEdge("7", "20", "5", "1");
        graph.addBiDirectedEdge("8", "20", "5", "1");
        graph.addBiDirectedEdge("9", "21", "5", "1");
        graph.addBiDirectedEdge("10", "21", "5", "1");
        graph.addBiDirectedEdge("11", "22", "5", "1");
        graph.addBiDirectedEdge("12", "22", "5", "1");
        graph.addBiDirectedEdge("13", "23", "5", "1");
        graph.addBiDirectedEdge("14", "23", "5", "1");
        graph.addBiDirectedEdge("15", "24", "5", "1");
        graph.addBiDirectedEdge("16", "24", "5", "1");
        graph.addBiDirectedEdge("17", "25", "5", "1");
        graph.addBiDirectedEdge("17", "26", "5", "1");
        graph.addBiDirectedEdge("18", "25", "5", "1");
      graph.addBiDirectedEdge("18", "26", "5", "1");
        graph.addBiDirectedEdge("19", "27", "5", "1");
        graph.addBiDirectedEdge("19", "28", "5", "1");
        graph.addBiDirectedEdge("20", "27", "5", "1");
        graph.addBiDirectedEdge("20", "28", "5", "1");
        graph.addBiDirectedEdge("21", "29", "5", "1");
        graph.addBiDirectedEdge("21", "30", "5", "1");
        graph.addBiDirectedEdge("22", "29", "5", "1");
        graph.addBiDirectedEdge("22", "30", "5", "1");
        graph.addBiDirectedEdge("23", "31", "5", "1");
        graph.addBiDirectedEdge("23", "32", "5", "1");
        graph.addBiDirectedEdge("24", "31", "5", "1");
       graph.addBiDirectedEdge("24", "32", "5", "1");
        graph.addBiDirectedEdge("25", "33", "5", "1");
        graph.addBiDirectedEdge("25", "34", "5", "1");
        graph.addBiDirectedEdge("26", "35", "5", "1");
        graph.addBiDirectedEdge("26", "36", "5", "1");
        graph.addBiDirectedEdge("27", "33", "5", "1");
        graph.addBiDirectedEdge("27", "34", "5", "1");
        graph.addBiDirectedEdge("28", "35", "5", "1");
        graph.addBiDirectedEdge("28", "36", "5", "1");
        graph.addBiDirectedEdge("29", "33", "5", "1");
        graph.addBiDirectedEdge("29", "34", "5", "1");
        graph.addBiDirectedEdge("30", "35", "5", "1");
        graph.addBiDirectedEdge("30", "36", "5", "1");
        graph.addBiDirectedEdge("31", "33", "5", "1");
        graph.addBiDirectedEdge("31", "34", "5", "1");
        graph.addBiDirectedEdge("32", "35", "5", "1");
        graph.addBiDirectedEdge("32", "36", "5", "1");
}break;
case "2":{
//---------------------------------Dcell----------------------------------------    	
    	graph.addBiDirectedEdge("1", "21", "5", "1");
    	graph.addBiDirectedEdge("2", "21", "5", "1");
    	graph.addBiDirectedEdge("3", "21", "5", "1");
    	graph.addBiDirectedEdge("4", "21", "5", "1");
    	graph.addBiDirectedEdge("5", "22", "5", "1");
    	graph.addBiDirectedEdge("6", "22", "5", "1");
    	graph.addBiDirectedEdge("7", "22", "5", "1");
    	graph.addBiDirectedEdge("8", "22", "5", "1");
    	graph.addBiDirectedEdge("9", "23", "5", "1");
    	graph.addBiDirectedEdge("10", "23", "5", "1");
    	graph.addBiDirectedEdge("11", "23", "5", "1");
    	graph.addBiDirectedEdge("12", "23", "5", "1");
    	graph.addBiDirectedEdge("13", "24", "5", "1");
    	graph.addBiDirectedEdge("14", "24", "5", "1");
    	graph.addBiDirectedEdge("15", "24", "5", "1");
    	graph.addBiDirectedEdge("16", "24", "5", "1");
    	graph.addBiDirectedEdge("17", "25", "5", "1");
    	graph.addBiDirectedEdge("18", "25", "5", "1");
    	graph.addBiDirectedEdge("19", "25", "5", "1");
    	graph.addBiDirectedEdge("20", "25", "5", "1");
    	graph.addBiDirectedEdge("1", "5", "5", "1");
    	graph.addBiDirectedEdge("2", "9", "5", "1");
    	graph.addBiDirectedEdge("3", "13", "5", "1");
    	graph.addBiDirectedEdge("4", "17", "5", "1");
    	graph.addBiDirectedEdge("6", "10", "5", "1");
    	graph.addBiDirectedEdge("7", "14", "5", "1");
    	graph.addBiDirectedEdge("8", "18", "5", "1");
    	graph.addBiDirectedEdge("11", "15", "5", "1");
    	graph.addBiDirectedEdge("12", "19", "5", "1");
    	graph.addBiDirectedEdge("16", "20", "5", "1");
}break;
}
		
		double[][] totalcapacity = new double[size][size];
		totalcapacity = graph.getcapacity();
		
		for (int i = 0; i< numberOfFgs; i++)
		{
			fg[i] = new fg(graph);	
		}

		double fairshare = 0.001;
		double y0,y1;
		double y2,y3;
		boolean cont = true;
		

		while(cont)
		{
			
			if(fg[0].tunnelListSortedsize() == 0)
			{
				fg[0].valid = 0;
			}
			
			if(fg[1].tunnelListSortedsize() == 0)
			{
				fg[1].valid = 0;
			}
			
			y0 = fg[0].getlimit(0, fairshare) - fg[0].demand_f;
			y0 = Math.round(y0 * 100);
			y0 = y0/100;
			y1 = fg[1].getlimit(1, fairshare) - fg[1].demand_f;
			y1 = Math.round(y1 * 100);
			y1 = y1/100;

			
			//--------------------------------------------------------------

			while(fg[0].tunnelListSortedsize()>0 && fg[0].bottleneck(totalcapacity)== 0 && fg[0].valid == 1)
			{
					fg[0].tunnelListSorted.remove(0);
					if(fg[0].tunnelListSortedsize()==0)
					{
						fg[0].valid=0;
					}
			}

			while(fg[1].tunnelListSortedsize()>0 && fg[1].bottleneck(totalcapacity)== 0 && fg[1].valid == 1)
			{
					fg[1].tunnelListSorted.remove(0);
					if(fg[1].tunnelListSortedsize()==0)
					{
						fg[1].valid=0;
					}
			}
			//--------------------------------------------------
			
			
			if(fg[0].valid == 1 && fg[1].valid == 1)
			{
				
				double x = fg[0].bottleneck(totalcapacity);
				x= Math.round(x * 100);
				x = x/100;
				double y = fg[1].bottleneck(totalcapacity);
				y = Math.round(y * 100);
				y = y/100;
				double z = fg[0].demand_r - fg[0].demand_f;
				z = Math.round(z * 100);
				z = z/100;
				double h = fg[1].demand_r - fg[1].demand_f;
				h = Math.round(h * 100);
				h = h/100;
				
				if(comparetunnels(fg[0].tunnelListSorted.get(0),fg[1].tunnelListSorted.get(0)) == true)
				{
					
					if(((y0 + y1)>= Math.max(x, y))||(y0 >= z)||(y1 >= h)||(y0 >= x)||(y1 >= y))
					{
						//common tunnel present 
						
						fairshare = fairshare - 0.001;
						
						y2 = fg[0].getlimit(0, fairshare) - fg[0].demand_f;
						y2 = Math.round(y2 * 100);
						y2 = y2/100;
						y3 = fg[1].getlimit(1, fairshare) - fg[1].demand_f;
						y3 = Math.round(y3 * 100);
						y3 = y3/100;
						totalcapacity = fg[0].updatepath(y2, totalcapacity);
						fg[0].demand_f = fg[0].demand_f + y2;
						
						totalcapacity = fg[1].updatepath(y3, totalcapacity);
						fg[1].demand_f = fg[1].demand_f + y3;
						
						fairsharelist.add(fairshare);
						
						System.out.println("\t" + fg[0].tunnelListSorted.get(0) +"\t\t" + "FG0" + "\t" + y2 + "\t" + fairshare );
						System.out.println("\t" + fg[1].tunnelListSorted.get(0) +"\t\t" + "FG1" + "\t" + y3 + "\t" + fairshare );
						
						if(y0+y1 > Math.max(x, y))
						{
							fg[0].tunnelListSorted.remove(0);
							fg[1].tunnelListSorted.remove(0);
						}
						else if (y0 >= x)
						{
							
							fg[0].tunnelListSorted.remove(0);
							if (fg[0].tunnelListSortedsize()== 0)
							{
								fg[0].valid = 0;
							}
						}
						else if (y1 >= y)
						{
							fg[1].tunnelListSorted.remove(0);
							if (fg[1].tunnelListSortedsize()== 0)
							{
								fg[1].valid = 0;
							}
						}

						if(y0 >= z)
						{
							fg[0].valid = 0;
						}
						if(y1 >= h)
						{
							fg[1].valid = 0;
						}

						fairshare = fairshare + 0.001;
					}
				}
				else
				{
					//Different paths
					
					if((y0 > x)||(y1 > y)||(y0 > z)||(y1>h))
					{
						fairshare = fairshare - 0.001;
						y2 = fg[0].getlimit(0, fairshare) - fg[0].demand_f;
						y2 = Math.round(y2 * 100);
						y2 = y2/100;
						y3 = fg[1].getlimit(1, fairshare) - fg[1].demand_f;
						y3 = Math.round(y3 * 100);
						y3 = y3/100;
						totalcapacity = fg[0].updatepath(y2, totalcapacity);
						fg[0].demand_f = fg[0].demand_f + y2;
						totalcapacity = fg[1].updatepath(y3, totalcapacity);
						fg[1].demand_f = fg[1].demand_f + y3;
						
						fairsharelist.add(fairshare);
						
						System.out.println("\t" + fg[0].tunnelListSorted.get(0) + "\t\t" + "FG0" + "\t" + y2 + "\t" + fairshare );
						System.out.println("\t" + fg[1].tunnelListSorted.get(0) +"\t\t" + "FG1" + "\t" + y3 + "\t" + fairshare );
						

						
						if(y0 > x)
						{
							fg[0].tunnelListSorted.remove(0);
						}
						else if(y1 > y)
						{
							fg[1].tunnelListSorted.remove(0);
						}
						else if(y0 >= z)
						{
							fg[0].valid = 0;
						}
						else if(y1 >= h)
						{
							fg[1].valid = 0;
						}
					
						fairshare = fairshare + 0.001;
						
					}
				}
			}
			//--------------------------------------------------------------------------
			
			else if(fg[0].valid == 1 || fg[1].valid == 1)
			{
				if(fg[0].valid == 1)
				{
					
					double c = fg[0].bottleneck(totalcapacity);
					double g = fg[0].demand_r - fg[0].demand_f;
					if((y0 > c)||(y0 > g))
					{
						fairshare = fairshare - 0.001;
						y2 = fg[0].getlimit(0, fairshare) - fg[0].demand_f;
						y2 = Math.round(y2 * 100);
						y2 = y2/100;

						totalcapacity = fg[0].updatepath(y2, totalcapacity);
						fg[0].demand_f = fg[0].demand_f + y2;
						fairsharelist.add(fairshare);
						
						System.out.println("\t" + fg[0].tunnelListSorted.get(0) +"\t\t" + "FG0" + "\t" + y2 + "\t" + fairshare );
						
						if(y0 >= c)
						{
							fg[0].tunnelListSorted.remove(0);
						}
						if(y0 >= g)
						{
							fg[0].valid = 0;
						}
						fairshare += 0.001;
					}
				}
				else if(fg[1].valid == 1)
				{
					
					double d = fg[1].bottleneck(totalcapacity);
					double h = fg[1].demand_r - fg[1].demand_f;

					if((y1 >= d)||(y1 >= h))
					{
						fairshare = fairshare - 0.001;
						y3 = fg[1].getlimit(1, fairshare) - fg[1].demand_f;
						y3 = Math.round(y3 * 100);
						y3 = y3/100;
						totalcapacity = fg[1].updatepath(y3, totalcapacity);
						fairsharelist.add(fairshare);
						System.out.println("\t" + fg[1].tunnelListSorted.get(0) + "\t\t" + "FG1" + "\t" + y3 + "\t" + fairshare );
						
						if(y1 >= d)
						{
							fg[1].tunnelListSorted.remove(0);
							if(fg[1].tunnelListSortedsize() == 0)
							{
								fg[1].valid = 0;
							}
						}
						if(y1 >= h)
						{
							fg[1].valid = 0;
						}
						fairshare = fairshare + 0.001;
						fg[1].demand_f = fg[1].demand_f + y3;
					}
					
				}
				else
				{
					System.out.println("Error");
				}

				
			}
			
			
			else
			{
//				
				cont = false;
			}

			
			
			fairshare = fairshare + 0.001;
			
		}
		
		
	System.out.println();		
	System.out.println(fairsharelist);
   
    
    }
    
    
    
    public static boolean comparetunnels(String arg0, String arg1)
    {
    	String s0 = arg0;
    	String s1 = arg1;
    	int count = 0;
    	String[] s0array = s0.split("-");
    	String[] s1array = s1.split("-");
    	if (s1array.length > s0array.length)
    	{
    		
    		for(int i = 0; i<=s0array.length-2; i++)
    		{
    			String seq = "(.*)"+s0array[i]+"-"+s0array[i+1]+"(.*)";
    			if (s1.matches(seq) == true)
    			{
    				count++;
    			}
    		}
    	}
    	else
    	{
    		
    		for(int i = 0; i<=s1array.length-2; i++)
    		{
    			String seq = "(.*)"+s1array[i]+"-"+s1array[i+1]+"(.*)";
    			if (s0.matches(seq) == true)
    			{
    				count++;
    			}
    		}				
    	}
    	
    	if (count == 0)
    	{
    		return false;
    	}
    	else
    	{
    		return true;
    	}
    }

}
