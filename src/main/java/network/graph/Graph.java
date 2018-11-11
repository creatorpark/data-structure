package network.graph;

import java.util.Stack;

public class Graph {
	private final int 				maxVertex = 20;
	
	private Vertex 				vertexList[];
	private int  					adjMatrix[][];
	
	private int 					vertexCount;
	private Stack<Integer> 	theStack;
	

	public Graph() {
		vertexList 	= new Vertex[ maxVertex];
		adjMatrix 	= new int[maxVertex][maxVertex];
		
		for(int x=0; x < maxVertex; x++ ) {
			for(int y=0; y < maxVertex; y++) {
				adjMatrix[x][y] = 0;
			}
		}
		
		theStack = new Stack();
	}
	
	public void addVertex(char label) {
		vertexList[vertexCount++] = new Vertex(label);
	}
	
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label );
	}

	public void dfs() {
		vertexList[0].visited = true;
		displayVertex(0);
		
		theStack.push(0);
		
		while( !theStack.isEmpty() ) {
			int v = getAdjUnvisitedVertex( theStack.peek() );
			
			if ( v == -1) {
				theStack.pop();
			} else {
				vertexList[v].visited = true;
				displayVertex(v);
				theStack.push(v);
			}
		}
	}
	
	public int getAdjUnvisitedVertex( int v) {
		for( int j=0; j < vertexCount; j++) {
			if ( adjMatrix[v][j] == 1 && vertexList[j].visited == false) return j;
		}
		return -1;
	}
	
}
