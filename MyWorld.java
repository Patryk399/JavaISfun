import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * First game with Java.
 * 
 * @Patty93(your name) 
 * @0.0.1 (a version number or a date)
 */
public class MyWorld extends World
{
   public MyWorld()
    {    
        super(800, 600, 1); // Tworzenie świata o rozmiarze 800x600 pikseli
        
        // Tworzenie obiektów i umieszczanie ich w świecie
        Bear niedzwiedz = new Bear();
        pizza pizza = new pizza();
        Tree drzewo = new Tree();
        
        addObject(niedzwiedz, 100, 300); // Umieszczanie niedźwiedzia na pozycji (100, 300)
        addObject(pizza, 600, 100);     // Umieszczanie pizzy na pozycji (600, 100)
        addObject(drzewo, 400, 500);    // Umieszczanie drzewa na pozycji (400, 500)
    }
    
}
