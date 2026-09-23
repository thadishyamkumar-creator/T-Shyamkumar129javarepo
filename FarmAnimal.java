class FarmAnimal
{
    String name;
    String stay;
    String food;
    String sound;

    FarmAnimal(String name, String stay, String food, String sound)
    {
        this.name = name;
        this.stay = stay;
        this.food = food;
        this.sound = sound;
    }
    void display()
    {
        System.out.println("Animal  : " + name);
        System.out.println("Stays   : " + stay);
        System.out.println("Eats    : " + food);
        System.out.println("Sound   : " + sound);
        System.out.println();
    }
}
class Farm
{
    public static void main(String[] args)
    {
        FarmAnimal cow = new FarmAnimal("Cow", "Cowshed", "Grass", "Moo");
        FarmAnimal hen = new FarmAnimal("Hen", "Henhouse", "Grains", "Cluck");
        FarmAnimal horse = new FarmAnimal("Horse", "Stable", "Grass", "Neigh");
        FarmAnimal sheep = new FarmAnimal("Sheep", "Sheepfold", "Grass", "Baa");
        FarmAnimal pig = new FarmAnimal("Pig", "Pigsty", "Vegetables", "Oink");

        cow.display();
        hen.display();
        horse.display();
        sheep.display();
        pig.display();
    }
}