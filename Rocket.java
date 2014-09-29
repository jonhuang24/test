import zen.core.Zen;



public class Rocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zen.create(500,500);
		
		int x = 200;
		int y = 360;
		
		int dy = 2;
		
		while(true) {
			
			Zen.setBackground("purple");
			
			Zen.setColor("white");
			Zen.fillOval(400, 50, 75, 75);
			
			Zen.setColor("Blue");
			Zen.fillRect(x, y+40, 50, 100);
			Zen.fillRect(x+15, y, 20, 40);
			
			Zen.setColor("Red");
			Zen.fillOval(x+15, y+60, 20, 20);
			
			//fire butt
			Zen.fillRect(x, y + 140, 17, 45);
			Zen.fillRect(x+10, y + 140, 17, 25);
			Zen.fillRect(x+20, y + 140, 17, 65);
			Zen.fillRect(x+30, y + 140, 17, 25);
			Zen.fillRect(x+40, y + 140, 17, 45);
			
			Zen.buffer(30);
			
			y += dy;
			
			if(Zen.isKeyPressed("up")) {
				y = y - 4;
			}
			
			if(Zen.isKeyPressed("right")){
				x = x + 4;
			}
			
			if(Zen.isKeyPressed("left")) {
				x = x - 4;
			}
			
		}
		
	}

}
