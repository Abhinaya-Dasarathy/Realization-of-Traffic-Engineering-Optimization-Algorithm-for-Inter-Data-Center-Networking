import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;


public class GraphGeneration 
{
	int size = 37; //maximum number of nodes required is for topology Fat Tree (37)
    private Map<String, LinkedHashSet<String>> map = new HashMap<String, LinkedHashSet<String>>();
    double[][] capacity = new double[size][size];
    int[][] latency = new int[size][size];

    GraphGeneration()
    {
    	//System.out.println("Graph of Nodes Created");
       //Initialise the capacity and latency for the edges.
    	for (int i = 0; i<size; i++)
    	{
    		for(int j = 0; j<size; j++)
    		{
    			capacity[i][j] = 0.0;
    			latency[i][j] = 999;
    		}
    	}
    }
    public void addBiDirectedEdge(String node1, String node2, String c, String l) 
    {
  int n1 = Integer.parseInt(node1);
        int n2 = Integer.parseInt(node2);        
int a1 = Integer.parseInt(c);
        int a2 = Integer.parseInt(l);
        LinkedHashSet<String> adjacent = map.get(node1);
        //if the node is not already present in the graph, then create it and add the node
        if(adjacent==null) 
        {
            adjacent = new LinkedHashSet<String>();
            map.put(node1, adjacent);
        }
        //creating an edge
        adjacent.add(node2);
        //do it for other edge
       LinkedHashSet<String> adjacent1 = map.get(node2);
          if(adjacent1==null) 
        {
            adjacent1 = new LinkedHashSet<String>();
            map.put(node2, adjacent1);
        }
        //creating an edge
        adjacent1.add(node1);

      //assign the given capacity and latency
        capacity[n1][n2] = a1;
        latency[n1][n2] = a2;
	capacity[n2][n1] = a1;
        latency[n2][n1] = a2;
    }

    public boolean isConnected(String node1, String node2) 
    {
        Set<String> adjacent = map.get(node1);
        if(adjacent==null) 
        {
            return false;
        }
        return adjacent.contains(node2);
    }

    public LinkedList<String> adjacentNodes(String last) 
    {
        LinkedHashSet<String> adjacent = map.get(last);
        if(adjacent==null) 
        {
            return new LinkedList<String>();
        }
        return new LinkedList<String>(adjacent);
    }
    public double[][] getcapacity()
    {
    	return capacity;
    }
    
    public int[][] getlatency()
    {
    	return latency;
    }
}
