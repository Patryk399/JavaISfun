import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bear has to go to eat pizza.
 * 
 * @Patty93 (your name) 
 * @0.0.1 (a version number or a date)
 */
public class Bear extends Actor
{
    public void act() 
    {
        // Znajdź najbliższą pizzę
        pizza pizza = (pizza) getOneObjectAtOffset(0, 0, pizza.class);
        
        if (pizza != null) {
            // Oblicz kierunek do pizzy
            int dx = pizza.getX() - getX();
            int dy = pizza.getY() - getY();
            
            // Oblicz odległość do pizzy
            double distance = Math.sqrt(dx * dx + dy * dy);
            
            // Sprawdź, czy niedźwiedź jest wystarczająco blisko pizzy
            if (distance <= 50) {
                // Zjedz pizzę
                getWorld().removeObject(pizza);
            } else {
                // Przesuń się w kierunku pizzy
                int speed = 2; // Prędkość poruszania się
                setLocation(getX() + (int)(dx / distance * speed), getY() + (int)(dy / distance * speed));
            }
        }
        
        // Sprawdź, czy niedźwiedź koliduje z drzewem
        if (isTouching(Tree.class)) {
            // Odbij się od drzewa
            int turnAngle = 90; // Kąt obrotu w stopniach
            turn(turnAngle);
        }
    }
}

