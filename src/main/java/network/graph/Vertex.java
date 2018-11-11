package network.graph;

public class Vertex {

	public char label;
	public boolean visited;
	
	public Vertex( char label ) {
		this.label = label;
	}

	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	
}
