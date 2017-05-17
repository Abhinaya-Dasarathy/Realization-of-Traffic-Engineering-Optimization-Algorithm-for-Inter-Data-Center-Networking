//package Tunnel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class tunnelInFg
{

	String START;
	String END;
	LinkedList<String> visited = new LinkedList<String>();
	ArrayList<String> tunnellist = new ArrayList<String>();
	
	tunnelInFg()
	{
    System.out.println("Enter the Source Node - ");
    Scanner sc = new Scanner(System.in);
    START = sc.nextLine();
    System.out.println("Enter the Sink Node - ");
    END = sc.nextLine();
    //sc.close();
    visited.add(START);
	}
	
    public void breadthFirst(GraphGeneration graph) 
    {
        LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());
  
        for (String node : nodes) 
        {
            if (visited.contains(node)) 
            {
                continue;
            }
            if (node.equals(END)) 
            {
                visited.add(node);
                printPath(visited);
                visited.removeLast();
                break;
            }
        }
      
        for (String node : nodes) 
        {
            if (visited.contains(node) || node.equals(END)) 
            {
                continue;
            }
            visited.addLast(node);
            breadthFirst(graph);
            visited.removeLast();
        }
    }

    public void printPath(LinkedList<String> visited) 
    {
    	String path = "";
        for (String node : visited) 
        {
            path = path +node + "-";
        }
        int len = path.length();
        path = path.substring(0, len-1);
        tunnellist.add(path);
       // System.out.println(path);
    }
    
    public ArrayList<String> gettunnellist()
    {
    	return(tunnellist);
    }
}
