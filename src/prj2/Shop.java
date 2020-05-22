package prj2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JComponent;

public class Shop extends JComponent{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image background;
    private Image muiten;
    public static int SGX=220;
	public Shop(Player player, Image background, Image muiten) {
		super();
		this.background = background;
		this.muiten = muiten;
	}
    @Override
    protected void paintComponent(Graphics g) {
    	// TODO Auto-generated method stub
    	super.paintComponent(g);
    	g.drawImage(background, 0, 50, this);
    	g.drawImage(muiten, 400, SGX, this);
    }
}
