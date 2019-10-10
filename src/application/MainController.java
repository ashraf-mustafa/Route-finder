package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

public class MainController {
	@FXML private ImageView imageView;
	@FXML private Slider zoomSlider;
	@FXML private Button minZoom;
	@FXML private Button maxZoom;
	@FXML private MenuItem pin_info;
	@FXML private MenuButton map_pin1,map_pin2;
	@FXML private ScrollPane mapScrollpane;
	//@FXML private ChoiceBox<Node<CityNode>> sourcelist = new ChoiceBox<Node<CityNode>>();
	@FXML private ChoiceBox<String> sourcelist = new ChoiceBox<String>();
	@FXML private ChoiceBox<String> destinationlist = new ChoiceBox<String>();
	Group zoomGroup;
	private CityNode [] city = new CityNode[30]; 
	@SuppressWarnings("unchecked")
	private Node<CityNode> [] nodeList = new Node[5];
	


	public void initialize() {

		zoomSlider.setMin(0.5);
		zoomSlider.setMax(1.5);
		zoomSlider.setValue(1.0);
		zoomSlider.valueProperty().addListener((o,oldValue,newValue) -> zoom((Double) newValue));

		Group contentGroup = new Group();
		zoomGroup = new Group();
		contentGroup.getChildren().add(zoomGroup);
		zoomGroup.getChildren().add(mapScrollpane.getContent());
		mapScrollpane.setContent(contentGroup);

		sourcelist.getItems().addAll("Bear Island","Winterfell","Pyke","The Crag","Riverrun","Gulltown"
				,"The Twins","Castle black","Lotus Port","Pentos","Braavos","Sunspear","Highgarden","Kings Landing",
				"Castle Rock","Borrowtown","Sarnath","Oros","Gogossos","Yeen","Vaes Leqse","Hesh","Lhazosh","Vaes Jini",
				"Vaes Qosar","Port Yhos","The Deadfort");
		
		//sourcelist.getItems().addAll(a1,b1,c1,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z);

		destinationlist.getItems().addAll("Bear Island","Winterfell","Pyke","The Crag","Riverrun","Gulltown"
				,"The Twins","Castle black","Lotus Port","Pentos","Braavos","Sunspear","Highgarden","Kings Landing",
				"Castle Rock","Borrowtown","Sarnath","Oros","Gogossos","Yeen","Vaes Leqse","Hesh","Lhazosh","Vaes Jini",
				"Vaes Qosar","Port Yhos","The Deadfort");

		main();

		sourcelist.getSelectionModel().selectedItemProperty().addListener((o,oldValue,newValue) -> {
			if(newValue != null) {
				for(int i = 0;i<city.length;i++) {
					if(city[i].getCityName().equals(newValue)) {
						map_pin1.setLayoutX(city[i].getX() -24); 
						map_pin1.setLayoutY(city[i].getY() -60); 
						System.out.println("Pin X : "+ map_pin1.getLayoutX() + "Pin Y : " + map_pin1.getLayoutY());
						break;
					}

				}
			}

		});


		destinationlist.getSelectionModel().selectedItemProperty().addListener((o,oldValue,newValue) -> {
			if(newValue != null) {
				for(int i = 0;i<city.length;i++) {
					if(city[i].getCityName().equals(newValue)) {
						map_pin2.setLayoutX(city[i].getX() -24);
						map_pin2.setLayoutY(city[i].getY() -60);
						break;
					}

				}
			}

		});


	}


	public void main() {
		CityNode a = new CityNode("Bear Island",640,640);
		CityNode b = new CityNode("Winterfell",820,850);
		CityNode c = new CityNode("White harbor",930,1050);
		CityNode d = new CityNode("The Crag",550,1510);
		CityNode e = new CityNode("Riverrun",750,1490);
		CityNode f = new CityNode("Gulltown",1210,1430);
		CityNode g = new CityNode("The Twins",790,1320);
		CityNode h = new CityNode("Castle black",960,530);
		CityNode i = new CityNode("Lotus Port",1330,2760);
		CityNode j = new CityNode("Pentos",1460,1690);
		CityNode k = new CityNode("Braavos",1450,1260);
		CityNode l = new CityNode("Sunspear",1210,2200);
		CityNode m = new CityNode("Highgarden",630,1940);
		CityNode n = new CityNode("Kings Landing",980,1710);
		CityNode o = new CityNode("Castle Rock",580,1590);
		CityNode p = new CityNode("Borrowtown",670,1040);
		CityNode q = new CityNode("Sarnath",2460,1730);
		CityNode r = new CityNode("Tyrosh",1350,1990);
		CityNode s = new CityNode("Gragonstone",110,1590);
		CityNode t = new CityNode("Yeen",2630,3130);
		CityNode u = new CityNode("Vaes Leqse",2720,1640);
		CityNode v = new CityNode("Hesh",2890,2090);
		CityNode w = new CityNode("Lhazosh",2960,2190);
		CityNode x = new CityNode("Vaes Jini",3430,1940);
		CityNode y = new CityNode("Vaes Qosar",3360,2410);
		CityNode z = new CityNode("Port Yhos",3070,2480);
		CityNode zz = new CityNode("The Deadfort",1030,810);

		city[0] = a;
		city[1] = b;
		city[2] = c;
		city[3] = d;
		city[4] = e;
		city[5] = f;
		city[6] = g;
		city[7] = h;
		city[8] = i;
		city[9] = j;
		city[10] = k;
		city[11] = l;
		city[12] = m;
		city[13] = n;
		city[14] = o;
		city[15] = p;
		city[16] = q;
		city[17] = r;
		city[18] = s;
		city[19] = t;
		city[20] = u;
		city[21] = v;
		city[22] = w;
		city[23] = x;
		city[24] = y;
		city[25] = z;
		city[26] = zz;


		Node<CityNode> a1 = new Node<>(a);
		Node<CityNode> b1 = new Node<>(b);
		Node<CityNode> c1 = new Node<>(c);
		Node<CityNode> d1 = new Node<>(d);
		Node<CityNode> e1 = new Node<>(e);
		Node<CityNode> f1 = new Node<>(f);
		Node<CityNode> g1 = new Node<>(g);
		Node<CityNode> h1 = new Node<>(h);
		Node<CityNode> i1 = new Node<>(i);
		Node<CityNode> j1 = new Node<>(j);
		Node<CityNode> k1 = new Node<>(k);
		Node<CityNode> l1 = new Node<>(l);
		Node<CityNode> m1 = new Node<>(m);
		Node<CityNode> n1 = new Node<>(n);
		Node<CityNode> o1 = new Node<>(o);
		Node<CityNode> p1 = new Node<>(p);
		Node<CityNode> q1 = new Node<>(q);
		Node<CityNode> r1 = new Node<>(r);
		Node<CityNode> s1 = new Node<>(s);
		Node<CityNode> t1 = new Node<>(t);
		Node<CityNode> u1 = new Node<>(u);
		Node<CityNode> v1 = new Node<>(v);
		Node<CityNode> w1 = new Node<>(w);
		Node<CityNode> x1 = new Node<>(x);
		Node<CityNode> y1 = new Node<>(y);
		Node<CityNode> z1 = new Node<>(z);
		Node<CityNode> zz1= new Node<>(zz);


		nodeList[0] = a1;
		nodeList[1] = b1;
		nodeList[2] = c1;
		nodeList[3] = d1;
		nodeList[4] = e1;


		h1.connectToNodeUndirected(b1, 5, "good");
		h1.connectToNodeUndirected(zz1, 10, "Easy");
		b1.connectToNodeUndirected(h1, 15, "great");
		zz1.connectToNodeUndirected(h1, 7, "bad");
		b1.connectToNodeUndirected(zz1, 9, "good");
		b1.connectToNodeUndirected(p1, 25, "good");
		p1.connectToNodeUndirected(g1, 20, "good");
		e1.connectToNodeUndirected(n1, 11, "good");
		g1.connectToNodeUndirected(e1, 15, "good");
		l1.connectToNodeUndirected(m1, 50, "very hard");
		l1.connectToNodeUndirected(i1, 100, "very hard");
		k1.connectToNodeUndirected(j1, 150, "hard");
		r1.connectToNodeUndirected(k1, 200, "very hard");
		n1.connectToNodeUndirected(r1, 300, "Very hard");
		g1.connectToNodeUndirected(k1, 500, "very hard");
		f1.connectToNodeUndirected(s1, 20, "good");
		j1.connectToNodeUndirected(f1, 100, "hard");
		f1.connectToNodeUndirected(g1, 20, "goods");
		f1.connectToNodeUndirected(c1, 50, "good");
		n1.connectToNodeUndirected(m1, 41, "good");
		c1.connectToNodeUndirected(p1, 5, "easy");


		System.out.println("Recursive depth first trans");
		System.out.println("-----------------------------");
		traverseGraphDepthFirst(b1,null,0);
		


	}
//	
//	public void whatever() {
//System.out.print("below is the path your looking for");
//		
//		
//		//findPathDepthFirst(b1,null,"Gragonstone");
//		List<Node<CityNode>> path = findPathDepthFirst(nodeList.b1,null,h1);
//		for(Node<CityNode> route : path) {
//			System.out.println(route.town);
//		}

	//}
	
	/**
	 * getting the source and destination nodes from the choiceboxd
	 *-
	 * @param event
	 */

//	public void findpath(String source,String destNode){
//		
//		for(int i = 0;i<nodeList.length;i++) {
//			if(nodeList[i].town.getCityName().equals(sourcelist.getSelectionModel().getSelectedItem())) {
//				source = nodeList[i].town.getCityName();
//			}
//			for(int k=0;i<nodeList.length;k++) {
//				if(nodeList[k].town.getCityName().equals(destinationlist.getSelectionModel().getSelectedItem())) {
//					destNode = nodeList[k].town.getCityName();
//				}
//			}
//			
//			findPathDepthFirst(source, null, destNode);
//		}
//
//
//	}
	
	
//	public void findPathFunction() {
//		List<Node<CityNode>> encountered = new ArrayList<Node<CityNode>>();
//		for(int i=0;i<nodeList.length;i++) {
//			for(int k = 0;k<nodeList.length;k++) {
//				Node<CityNode> source =sourcelist.getSelectionModel().getSelectedItem().equals(nodeList[i].town.getCityName();
//			}
//				if((sourcelist.getSelectionModel().getSelectedItem().equals(nodeList[i].town.getCityName())) 
//						&& destinationlist.getSelectionModel().getSelectedItem().equals(nodeList[k].town.getCityName())) {
//					
//				}
//				
//				findPathDepthFirst(nodeList[i],encountered.add(nodeList[i]),nodeList[k]);
//			}
//			
//				
//			}
//		}
		
//	public void soureli() {
//		for(int i=0;i<nodeList.length;i++) {
//			sourcelist.getItems().add(nodeList[i].town.getCityName());
//		}
//	}
	
	
	
	
	public void routes() {
		
	}



	public void zoomIn(ActionEvent event) {
		double SliderVal = zoomSlider.getValue();
		zoomSlider.setValue(SliderVal += 0.1);
	}


	public void zoomOut(ActionEvent event) {
		double SliderVal = zoomSlider.getValue();
		zoomSlider.setValue(SliderVal + -0.1);
	}

	public void zoom(double ScaleValue) {
		double scrollH = mapScrollpane.getHvalue();
		double scrollV = mapScrollpane.getVvalue();
		zoomGroup.setScaleX(ScaleValue);
		zoomGroup.setScaleY(ScaleValue);
		mapScrollpane.setHvalue(scrollH);
		mapScrollpane.setVvalue(scrollV);
	}

	public void pinMove() {
		imageView.setOnMouseClicked(e ->{
			System.out.println("X : "+ e.getX() + "Y : " + e.getY());

			map_pin1.setLayoutX(e.getX()-24);
			map_pin1.setLayoutY(e.getY()-60);

			System.out.println("Pin X : "+ map_pin1.getLayoutX() + "Pin Y : " + map_pin1.getLayoutY());
		});

	}

	public void pinMove2() {
		imageView.setOnMouseClicked(e ->{
			System.out.println("X : "+ e.getX() + "Y : " + e.getY());

			map_pin2.setLayoutX(e.getX()-24);
			map_pin2.setLayoutY(e.getY()-60);
		});

	}


	public void traverseGraphDepthFirst(Node<CityNode> from,List<Node<CityNode>> encountered,int totalCost) {
		System.out.println(from.town.cityName);
		if(encountered==null) encountered = new ArrayList<>();
		encountered.add(from);

		Collections.sort(from.linklist,(h1,j1)->h1.cost-j1.cost);

		for(Edge a : from.linklist)
			if(!encountered.contains(a.destination)) traverseGraphDepthFirst(a.destination,encountered,totalCost+a.cost);
	}
	
	
	public static <T> List<Node<CityNode>> findPathDepthFirst(Node<CityNode> from, List<Node<CityNode>> encountered, T lookingfor){
		List<Node<CityNode>> result;
		if(from.town.equals(lookingfor)) { //Found it
			result=new ArrayList<>(); //Create new list to store the path info (any List implementation could be used)
			result.add(from); //Add the current node as the only/last entry in the path list
			return result; //Return the path list
		}
		if(encountered==null) encountered=new ArrayList<>(); //First node so create new (empty) encountered list
		encountered.add(from);
		for(Node<CityNode> adjNode : from.cityList)
			if(!encountered.contains(adjNode)) {
				result=findPathDepthFirst(adjNode,encountered,lookingfor);
				if(result!=null) { //Result of the last recursive call contains a path to the solution node
					result.add(0,from); //Add the current node to the front of the path list
					return result; //Return the path list
				}
			}
		return null;
	}


	public static <T> List<List<Node<CityNode>>> findAllPathsDepthFirst(Node<CityNode> from, List<Node<CityNode>> encountered, T lookingfor){
		List<List<Node<CityNode>>> result=null, temp2;
		if(from.town.equals(lookingfor)) { //Found it
			List<Node<CityNode>> temp=new ArrayList<>(); //Create new single solution path list
			temp.add(from); //Add current node to the new single path list
			result=new ArrayList<>(); //Create new "list of lists" to store path permutations
			result.add(temp); //Add the new single path list to the path permutations list
			return result; //Return the path permutations list
		}
		if(encountered==null) encountered=new ArrayList<>(); //First node so create new (empty) encountered list
		encountered.add(from); //Add current node to encountered list
		for(Node<CityNode> adjNode : from.cityList){
			if(!encountered.contains(adjNode)) {
				temp2=findAllPathsDepthFirst(adjNode,new ArrayList<>(encountered),lookingfor); //Use clone of encountered list
				//for recursive call!
				if(temp2!=null) { //Result of the recursive call contains one or more paths to the solution node
					for(List<Node<CityNode>> x : temp2) //For each partial path list returned
						x.add(0,from); //Add the current node to the front of each path list
					if(result==null) result=temp2; //If this is the first set of solution paths found use it as the result
					else result.addAll(temp2); //Otherwise append them to the previously found paths
				}
			}
		}
		return result;
	}
}
