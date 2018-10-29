public class Example4 {
    private int age;
    private String name;
    private EyeColour eyeColour;
    private HairColour hairColour;

    public Example4(int age, String name, EyeColour eyeColour, HairColour hairColour){
        this.age = age;
        this.name = name;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public EyeColour getEyeColour(){
        return eyeColour;
    }
    public HairColour getHairColour(){
        return hairColour;
    }
    public static void main(String[] args){
        Example4 human = new Example4(25,"Roman",EyeColour.BLUE,HairColour.BLACK);
        System.out.println(human.getAge());
        System.out.println(human.getName());
        System.out.println(human.getEyeColour());
        System.out.println(human.getHairColour());
    }

}
