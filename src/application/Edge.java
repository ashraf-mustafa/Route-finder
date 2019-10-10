package application;

public class Edge {
	public Node<CityNode> destination;
	int cost;
	String difficulty;
	
	public Edge(Node<CityNode> destination,int cost,String difficulty) {
		this.destination = destination;
		this.cost = cost;
		this.difficulty = difficulty;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}


	public String getDifficulty() {
		return difficulty;
	}
	
	

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public int getCost(int cost) {
		return cost;
	}
	
}
