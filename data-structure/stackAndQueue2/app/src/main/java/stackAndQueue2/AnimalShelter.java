package stackAndQueue2;

public class AnimalShelter {

    Queue cats =new Queue();
    Queue dogs =new Queue();

    public void enqueue(Animal animal){
        if (animal instanceof Cat){
            cats.enqueue(animal.getPref());

        }else if(animal instanceof Dog) {
            dogs.enqueue(animal.getPref());
        }else {
            System.out.println("Shelter for cats and dogs");
        }

    }

    public String dequeue(String pref){
        if(pref.equals("cat")&& !cats.isEmpty()){
            return cats.dequeue();
        }
        else if (pref.equals("dog") && !dogs.isEmpty()){
            return dogs.dequeue();
        }
        else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "cat=" + cats +
                ", dog=" + dogs +
                '}';
    }
}
