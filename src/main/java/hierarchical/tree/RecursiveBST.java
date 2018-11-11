package hierarchical.tree;

public class RecursiveBST {	
	// 노드 중심으로 좌우를 생각한다.
	// 노드 중심으로 작은건 좌에 삽입 큰건 우에 삽입.
	
	public Node insert(Node node, int data) {
		if ( node == null ) {
			node = new Node();
			node.setData(data);
			node.setLeft( null );
			node.setRight( null );
			return node;
		}
		
		if ( node.getData() > data ) {
			node.setLeft( insert( node.getLeft(), data) );
		} else if ( node.getData() < data ) {
			node.setRight( insert( node.getRight(), data ) );
		}
		return node;
	}
	
	public Node search(Node node, int data) {
		if ( node == null ) return null;

		if ( node.getData() > data ) { 
			return search( node.getLeft(), data);
		} else if ( node.getData() < data) {
			return search( node.getRight(), data);
		} else {
			return node;
		}
	}
	
	public Node delete(Node node, int data) {
		if ( node == null) {
			System.out.println("Element not there in tree");
		} else if ( node.getData() > data ) {
			node.setLeft( delete( node.getLeft(), data) );
		} else if ( node.getData() < data ) {
			node.setRight( delete( node.getRight(), data ) );
		} else { // find
				
			if ( node.getLeft() != null && node.getRight() != null ) {
				node.setData( findMax( node.getLeft() ).getData() );
				node.setLeft( delete( node.getLeft(), node.getData()));
			} else {
				if ( node.getLeft() == null ) node = node.getRight();
				if ( node.getRight() == null )  node = node.getLeft();
			}
		}
		return node;
	}
	

	public Node findMax( Node node ) {
		if ( node == null ) {
			return null;
		}else {
			if ( node.getRight() == null ) return node;
			else return findMax(node.getRight() );
		}
	}
}
