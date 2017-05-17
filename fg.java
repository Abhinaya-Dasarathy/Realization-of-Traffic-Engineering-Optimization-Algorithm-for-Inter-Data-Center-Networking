

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
//import Tunnel.Graph;
public class fg
{
	int size = 37;
	int[][] fglatency = new int[size][size];
	double demand_f;
	double demand_r;
	int valid = 1;
	
	ArrayList<String> tunnelListSorted = new ArrayList<String>();
	fg(GraphGeneration graph)
	{
		demand_f = 0;
		System.out.println("Enter the Bandwidth Demand for the FG:");
		Scanner sc2 = new Scanner(System.in);
		demand_r = sc2.nextInt();
		ArrayList<String> tunnellist = new ArrayList<String>();
		tunnelInFg a = new tunnelInFg();
		a.breadthFirst(graph);
		tunnellist = a.gettunnellist();

		fglatency = graph.getlatency();

		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		for (int i = 0; i< tunnellist.size();i++)
		{
			unsortMap.put(tunnellist.get(i), getlatency(tunnellist.get(i)));			
		}

        Map<String, Integer> sortedMapAsc = sortByComparator(unsortMap,true);

        for (String key : sortedMapAsc.keySet())
        {
        	tunnelListSorted.add(key);      	
        }
        
       
System.out.println("Number of tunnels: " + tunnelListSortedsize());
 //System.out.println(tunnelListSorted);
	}
	
	public int getlatency(String s)
	{
		int latency = 0;
		String[] array = s.split("-");
		
		for(int i = 0; i<=array.length-2; i++)
		{
			int row = Integer.parseInt(array[i]);
			int column = Integer.parseInt(array[i+1]);
			latency = latency + fglatency[row][column];
		}
		return latency;
	}

	private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order)
    {

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2)
            {
                if (order)
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

	public double bottleneck(double[][] totalcapacity)
	{
			double bottleneck = 999;
			double[][] fgcapacity = new double[size][size];
			fgcapacity = totalcapacity;
			String temp_path = tunnelListSorted.get(0);
			String[] btarray = temp_path.split("-");
			for(int i = 0; i<=btarray.length-2; i++)
			{
				int btrow = Integer.parseInt(btarray[i]);
				int btcolumn = Integer.parseInt(btarray[i+1]);
				double edge_cap = fgcapacity[btrow][btcolumn];
				//Finding the least capacity (bottleneck) edge
				if (edge_cap < bottleneck)
				{
					bottleneck = edge_cap;
				}
			}
			return bottleneck;
	}
	
	public double getfairshare(int fg_id, double limit)
	{
		double x = 0.0;
		double y = limit;
		if (fg_id == 0)
		{
			x = (y/11);
		}
		else if (fg_id == 1)
		{
			x = (y/0.5);
		}
		else
		{
			System.out.println("Fair Share Function Not Defined");
		}
		return x;
	}
	
	public double getlimit(int fg_id, double fairshare)
	{
		double x = fairshare;
		double y = 0.0;
		if (fg_id == 0)
		{

			
			if (x<=1)
			{
				y = (12*x);				
			}
			else if(x>1 && x<=5)
			{
				y = 10+(2*x);
			}
			else
			{
				y = 20;
			}

		}
		else if (fg_id == 1)
		{

	
			if (x < 2)
			{
				y = (5*x);								
			}
			else
			{
				y = 10;
			}

		}
		else
		{
			System.out.println("Fair Share Function Not Defined");
		}
		return y;
	}
	
	public double[][] updatepath(double flow,double[][] totalcapacity)
	{
		double[][] fgcapacity = new double[size][size];
		fgcapacity = totalcapacity;
		String s = tunnelListSorted.get(0);
		String[] array = s.split("-");
		for(int i = 0; i<=array.length-2; i++)
		{
			int row = Integer.parseInt(array[i]);
			int column = Integer.parseInt(array[i+1]);
			if(fgcapacity[row][column] - flow <= 0.1)
			{
				fgcapacity[row][column] = 0;
			}
			else
			{
				fgcapacity[row][column] = fgcapacity[row][column] - flow;				
			}
			fgcapacity[row][column] = Math.round(fgcapacity[row][column] * 100);
			fgcapacity[row][column] = fgcapacity[row][column]/100;
		}
		return fgcapacity;
	}
	
	public void updatetunnelListSorted()
	{
		tunnelListSorted.remove(0);
	}
	
	public int tunnelListSortedsize()
	{
		return tunnelListSorted.size();
	}


}
