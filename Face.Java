
public class Face {

	char[][] face; //face
	
	public Face(){ //make empty face
		face = new char[2][2];
	}
	
	public Face(char s){ //make face with color
		face = new char[2][2];
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				face[i][j] = s;
			}
		}	
	}
	
	public char getColor(int x, int y){
		return face[x][y];
	}
}
